package br.com.alura.bytebank.domain.conta;

import br.com.alura.bytebank.domain.cliente.Cliente;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaDAO {

    private Connection conn;

    ContaDAO(Connection connection){
        this.conn=connection;
    }

    public void Salvar(DadosAberturaConta dadosDaConta){ //recebe os dados da conta
        var cliente = new Cliente(dadosDaConta.dadosCliente());
        var conta = new Conta(dadosDaConta.numero(), cliente);

        // como era salvo antes, em uma hashlist
        //
        //    public void abrir(DadosAberturaConta dadosDaConta){
        //        var cliente = new Cliente(dadosDaConta.dadosCliente());
        //        var conta = new Conta(dadosDaConta.numero(), cliente);
        //        if (contas.contains(conta)) {
        //            throw new RegraDeNegocioException("Já existe outra conta aberta com o mesmo número!");
        //        }
        //
        //        contas.add(conta);
        //    }

        // agora, modificado para salvar no banco:

        //clausula sql para inserir dados no banco
        String sql = "INSERT INTO conta (numero, saldo, cliente_nome, cliente_cpf, cliente_email)" + "VALUES (?, ?, ?, ?, ?)";

        try{
            //o preparedStatemant vai ser responsável por setar os valores nos parâmetros a cima ("VALUES (?, ?, ?, ?, ?)") - ^^^
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            //resumo do que krl esta acontecendo aqui: basicamente estamos passando para o preparedStatement o index e depois o valor que ele deve receber, ou seja,
            //esse primeiro preparedStatement, receber o index 1 que seria o da primeira '?' e depois o valor que ele deve passar para esse parâmetro
            preparedStatement.setInt(1, conta.getNumero());
            preparedStatement.setBigDecimal(2, BigDecimal.ZERO);
            preparedStatement.setString(3, dadosDaConta.dadosCliente().nome());
            preparedStatement.setString(4,dadosDaConta.dadosCliente().cpf());
            preparedStatement.setString(5,dadosDaConta.dadosCliente().email());

            preparedStatement.execute(); //para executar a query

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
