package br.gov.df.terracap.sincronizer.dao;

import br.gov.df.terracap.sincronizer.connector.Connector;
import br.gov.df.terracap.sincronizer.connector.ConnectorOptions;
import br.gov.df.terracap.sincronizer.entities.OracleColaboradorTerracap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeysel e Kleber
 * OBS: Caso a atualização/incerção apresente erros, descomentar o campo da
 *      classe OracleColaboradorTerracap
 */
public class GrupoaDAO {

    public static List<OracleColaboradorTerracap> buscarTodosLadoA() throws Exception {
        List<OracleColaboradorTerracap> objetos = new ArrayList<OracleColaboradorTerracap>();
        try {

            String sql = "SELECT * FROM GRH.VW_COLABORADOR";
            Connector connector = ConnectorOptions.ORACLE;

            Connection connection = connector.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                OracleColaboradorTerracap f = new OracleColaboradorTerracap();
                f.setMatricula(rs.getString("matricula"));
                f.setAtivo(rs.getString("ativo"));
                f.setCodOrgao(rs.getString("codOrgao"));
                f.setCpf(rs.getString("cpf"));
                f.setEmail(rs.getString("email"));
                f.setEmailChefe(rs.getString("emailchefe"));
                f.setMatriculaChefe(rs.getString("matriculachefe"));
                f.setNome(rs.getString("nome"));
                f.setNomeChefe(rs.getString("nomechefe"));
                f.setNomeOrgao(rs.getString("nomeOrgao"));
                f.setSiglaOrgao(rs.getString("siglaOrgao"));
                f.setTelefone(rs.getString("telefone"));
                objetos.add(f);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return objetos;
    }

    public static List<OracleColaboradorTerracap> buscarTodosLadoA2() throws Exception {
        List<OracleColaboradorTerracap> objetos = new ArrayList<OracleColaboradorTerracap>();
        try {

            String sql = "SELECT * FROM [dbo].[VW_Funcionario]";
            Connector connector = ConnectorOptions.SQL_SERVER_GPJJ;
            Connection connection = connector.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                OracleColaboradorTerracap f = new OracleColaboradorTerracap();
                f.setMatricula(rs.getString("matricula"));
                f.setAtivo(rs.getString("ativo"));
                f.setCodOrgao(rs.getString("codOrgao"));
                f.setCpf(rs.getString("cpf"));
                f.setEmail(rs.getString("email"));
                f.setEmailChefe(rs.getString("emailchefe"));
                f.setMatriculaChefe(rs.getString("matriculachefe"));
                f.setNome(rs.getString("nome"));
                f.setNomeChefe(rs.getString("nomechefe"));
                f.setNomeOrgao(rs.getString("nomeOrgao"));
                f.setSiglaOrgao(rs.getString("siglaOrgao"));
                f.setTelefone(rs.getString("telefone"));

                objetos.add(f);

            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return objetos;
    }

    public int atualizaA2(OracleColaboradorTerracap objetoDoA) {
        int ret = 0;
        try {

            String sql = "UPDATE dbo.VW_Funcionario SET matricula = ?, ativo = ?, codOrgao = ?, cpf = ?, email = ?, emailchefe = ?, matriculachefe = ?, nome =?, nomechefe=?, nomeorgao=?, siglaOrgao=?, telefone=? where matricula = ?";
            Connector connector = ConnectorOptions.SQL_SERVER_GPJJ;

            Connection connection = connector.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, objetoDoA.getMatricula());
            st.setString(2, objetoDoA.getAtivo());
            st.setString(3, objetoDoA.getCodOrgao());
            st.setString(4, objetoDoA.getCpf());
            st.setString(5, objetoDoA.getEmail());
            st.setString(6, objetoDoA.getEmailChefe());
            if (objetoDoA.getMatriculaChefe() == null) {
                st.setObject(7, null);
            } else {
                st.setInt(7, Integer.valueOf(objetoDoA.getMatriculaChefe()));
            }

            st.setString(8, objetoDoA.getNome());
            st.setString(9, objetoDoA.getNomeChefe());
            st.setString(10, objetoDoA.getNomeOrgao());
            st.setString(11, objetoDoA.getSiglaOrgao());
            st.setString(12, objetoDoA.getTelefone());
            st.setString(13, objetoDoA.getMatricula());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
        System.out.println("Atualizado: " + objetoDoA);
        return ret;
    }

    public int insereA2(OracleColaboradorTerracap objetoDoA) {
        int ret = 0;
        try {

            String sql = "INSERT INTO dbo.VW_Funcionario (matricula, ativo, codOrgao, cpf, email, emailchefe, matriculachefe, nome, nomechefe, nomeorgao, siglaOrgao, telefone) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            Connector connector = ConnectorOptions.SQL_SERVER_GPJJ;

            Connection connection = connector.getConnection();
            PreparedStatement st = connection.prepareStatement(sql);
            st = connection.prepareStatement(sql);
            st.setInt(1, Integer.valueOf(objetoDoA.getMatricula()));
            st.setString(2, objetoDoA.getAtivo());
            st.setString(3, objetoDoA.getCodOrgao());
            st.setString(4, objetoDoA.getCpf());
            st.setString(5, objetoDoA.getEmail());
            st.setString(6, objetoDoA.getEmailChefe());
            if (objetoDoA.getMatriculaChefe() == null) {
                st.setObject(7, null);
            } else {
                st.setInt(7, Integer.valueOf(objetoDoA.getMatriculaChefe()));
            }
            st.setString(8, objetoDoA.getNome());
            st.setString(9, objetoDoA.getNomeChefe());
            st.setString(10, objetoDoA.getNomeOrgao());
            st.setString(11, objetoDoA.getSiglaOrgao());
            st.setString(12, objetoDoA.getTelefone());
            ret = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }
        System.out.println("Inserido: " + objetoDoA);
        return ret;
    }

}
