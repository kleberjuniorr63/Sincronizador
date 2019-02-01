package br.gov.df.terracap.sincronizer.dao;

import br.gov.df.terracap.sincronizer.connector.Connector;
import br.gov.df.terracap.sincronizer.connector.ConnectorOptions;
import br.gov.df.terracap.sincronizer.entities.GrupoB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GrupobDAO {

    public static Connector connector;
    public static Connector connectorOracle;
    public static Connection connSQL;
    public static Connection connOracle;

    public GrupobDAO() {
        connector = ConnectorOptions.SQL_SERVER_SEGURANCA;
        connSQL = connector.getConnection();
        connectorOracle = ConnectorOptions.ORACLE;
        connOracle = connectorOracle.getConnection();
    }

    public static List<GrupoB> buscarTodosLadoB() throws Exception {
        List<GrupoB> objetos = new ArrayList<GrupoB>();
        try {

            String sql = "SELECT * FROM GRH.VW_USUARIO_PESSOA_GPJ";

            PreparedStatement st = connOracle.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                GrupoB f = new GrupoB();

                f.setMatricula(rs.getBigDecimal("matricula"));
                f.setAtivo(rs.getInt("ativo"));
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setLogin(rs.getString("ds_login"));

                objetos.add(f);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        return objetos;
    }

    public static List<GrupoB> buscarTodosLadoB2() throws Exception {
        List<GrupoB> objetos = new ArrayList<GrupoB>();
        try {

            String sql = "SELECT * FROM [dbo].[usuario]";

            PreparedStatement st = connSQL.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                GrupoB f = new GrupoB();

                f.setMatricula(rs.getBigDecimal("matricula"));
                f.setAtivo(rs.getInt("ativo"));
                f.setCpf(rs.getString("cpf"));
                f.setNome(rs.getString("nome"));
                f.setLogin(rs.getString("matricula"));
                f.setLogin(rs.getString("login"));
                f.setRevisao_id(rs.getInt("revisao_id"));
                f.setTipoUsuario(rs.getInt("tipoUsuario"));

                objetos.add(f);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return objetos;
    }

    public int atualizaB2(GrupoB objetoDoB) {
        int ret = 0;
        try {

            String sql = "UPDATE [dbo].[usuario] SET matricula = ?, cpf = ?, nome = ?, login = ?, ativo = ?, revisao_id = ?, tipoUsuario = ? WHERE matricula = ?";
            PreparedStatement st = connSQL.prepareStatement(sql);

            st.setBigDecimal(1, objetoDoB.getMatricula());
            st.setString(2, objetoDoB.getCpf());
            st.setString(3, objetoDoB.getNome());
            st.setString(4, objetoDoB.getLogin());
            st.setInt(5, objetoDoB.getAtivo());
            st.setInt(6, 0);
            st.setInt(7, 1);
            st.setBigDecimal(8, objetoDoB.getMatricula());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        System.out.println("Atualizado: " + objetoDoB);
        return ret;
    }

    public int insereB2(GrupoB objetoDoB) {
        int ret = 0;
        try {

            String sql = "INSERT INTO [dbo].[usuario] (matricula, cpf, nome, login, ativo, revisao_id, tipoUsuario) values (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = connSQL.prepareStatement(sql);

            st = connSQL.prepareStatement(sql);

            st.setBigDecimal(1, objetoDoB.getMatricula());
            st.setString(2, objetoDoB.getCpf());
            st.setString(3, objetoDoB.getNome());
            st.setString(4, objetoDoB.getLogin());
            st.setInt(5, objetoDoB.getAtivo());
            st.setInt(6, 0);
            st.setInt(7, 1);

            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        System.out.println("Inserido: " + objetoDoB);
        return ret;
    }

    public void close() {
        try {
            connOracle.close();
            connSQL.close();
        } catch (SQLException ex) {
            Logger.getLogger(GrupobDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
