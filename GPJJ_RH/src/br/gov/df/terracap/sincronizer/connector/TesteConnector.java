package br.gov.df.terracap.sincronizer.connector;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Jeysel e Kleber
 */
public class TesteConnector {

    public static void main(String args[]) throws SQLException {
        Connector connector = ConnectorOptions.ORACLE;
        Connection con = connector.getConnection();
        if (con != null) {
            System.out.println("Conexão realizada com sucesso!");
        } else {
            System.out.println("A conexão falhou!");
        }
    }
}
