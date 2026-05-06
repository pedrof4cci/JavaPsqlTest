package br.com.alura.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB { //NOSSO ARQUIVO DE CONEXÃO COM O BANCO DE DADOS

    public static void main(String... x) {
        try {
            //Connection é uma interface do java
            Connection connection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/byte_bank?user=postgres&password=abacaxiHot");
            System.out.println("✅ Conexão estabelecida");

            connection.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
