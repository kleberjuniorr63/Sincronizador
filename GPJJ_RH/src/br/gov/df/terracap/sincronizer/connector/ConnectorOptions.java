package br.gov.df.terracap.sincronizer.connector;

/**
 *
 * @author Jeysel e Kleber
 */
public class ConnectorOptions {

    public static final Connector ORACLE = new ConnectorOracle();//oracle
    public static final Connector SQL_SERVER_GPJJ = new ConnectorSqlServer(); //gpjj
    public static final Connector SQL_SERVER_SEGURANCA = new ConnectorSqlServer("jdbc:jtds:sqlserver://10.50.1.22:1433/seguranca", "us_gpj_desenv", "us_gpj_desenv123");//seguranca
}
