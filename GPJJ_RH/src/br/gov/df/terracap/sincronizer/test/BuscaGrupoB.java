package br.gov.df.terracap.sincronizer.test;

import br.gov.df.terracap.sincronizer.dao.GrupobDAO;
import br.gov.df.terracap.sincronizer.entities.SqlSeguranca;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jeysel e Kleber
 */
public class BuscaGrupoB {

    public static void main(String[] args) throws Exception {

        GrupobDAO f = new GrupobDAO();

//        System.out.println(f.buscarTodosLadoB());
//        System.out.println(f.buscarTodosLadoB2());
        List<SqlSeguranca> objetosDoB = f.buscarTodosLadoB();
        List<SqlSeguranca> objetosDoB2 = f.buscarTodosLadoB2();

        int cont = 0;
        for (SqlSeguranca objetoDoB : objetosDoB) {
            if (objetosDoB2.contains(objetoDoB)) {
                SqlSeguranca objetoDoLado2 = findByMatricula(objetoDoB.getMatricula(), objetosDoB2);
                if (objetoDoLado2 != null) {
                    if (objetoDoLado2.getAtivo() != objetoDoB.getAtivo()) {
                        f.atualizaB2(objetoDoB);
                    }
                }
            } else if (objetoDoB.getMatricula() != null && !objetoDoB.getNome().contains("PESSOA")) {
                f.insereB2(objetoDoB);
            }
            cont++;
        }

    }

    public static SqlSeguranca findByMatricula(BigDecimal matricula, List<SqlSeguranca> objetosB) {
        for (SqlSeguranca objetoDoB : objetosB) {
            if (objetoDoB.getMatricula() == matricula && !objetoDoB.getNome().contains("PESSOA")) {
                return objetoDoB;
            }

        }
        return null;
    }

}
