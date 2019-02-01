package br.gov.df.terracap.sincronizer.connector;

/**
 *
 * @author Jeysel e Kleber
 */

public class ConnectorOracle extends Connector {

    public ConnectorOracle(String url, String user, String pass) {
        super(url, user, pass);
    }

    public ConnectorOracle() {
        super("jdbc:oracle:thin:@//10.50.1.175:1521/devdif", "US_FGIU", "US_FGIU123");
    }
}
