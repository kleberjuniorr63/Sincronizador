package br.gov.df.terracap.sincronizer.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeysel e Kleber
 */
public abstract class Connector {

    private String url;
    private String user;
    private String pass;

    public Connector(String url, String user, String pass) {
        setUrl(url);
        setUser(user);
        setPass(pass);
    }

    public Connection getConnection() {
        if (getUrl() != null && getUser() != null && getPass() != null) {
            try {
                return DriverManager.getConnection(getUrl(), getUser(), getPass());
            } catch (SQLException ex) {
                Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            throw new IllegalArgumentException("Parâmetros de conexão nulo!");
        }
        return null;
    }

    public void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
