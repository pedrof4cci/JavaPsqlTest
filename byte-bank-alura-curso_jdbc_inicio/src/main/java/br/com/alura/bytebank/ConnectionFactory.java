package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory { //NOSSO ARQUIVO DE CONEXÃO COM O BANCO DE DADOS


    //"jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=abacaxiHot"

    String url = "jdbc:postgresql://localhost:5432/byte_bank?";
    String user = "postgres";
    String password = "abacaxiHot";

    public Connection recuperarConexao(){
        try {
            return DriverManager
                    .getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
