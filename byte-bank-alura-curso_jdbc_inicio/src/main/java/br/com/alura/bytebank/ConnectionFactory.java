package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory { //NOSSO ARQUIVO DE CONEXÃO COM O BANCO DE DADOS

    public Connection recuperarConexao(){
        try {
            return DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=abacaxiHot");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
