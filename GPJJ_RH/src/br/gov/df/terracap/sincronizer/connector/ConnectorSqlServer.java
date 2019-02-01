package br.gov.df.terracap.sincronizer.connector;

/**
 *
 * @author Jeysel e Kleber
 */
public class ConnectorSqlServer extends Connector {

    public ConnectorSqlServer(String url, String user, String pass) {
        super(url, user, pass);
    }

    public ConnectorSqlServer() {
        super("jdbc:jtds:sqlserver://10.50.1.22:1433/n_gpj_desenv", "us_gpj_desenv", "us_gpj_desenv123");
    }
}
