package br.gov.df.terracap.sincronizer.test;

import br.gov.df.terracap.sincronizer.dao.GrupobDAO;
import br.gov.df.terracap.sincronizer.entities.GrupoB;
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

        List<GrupoB> objetosDoB = f.buscarTodosLadoB();
        List<GrupoB> objetosDoB2 = f.buscarTodosLadoB2();

        int cont = 0;
        for (GrupoB objetoDoB : objetosDoB) {
            if (objetosDoB2.contains(objetoDoB)) {
                GrupoB objetoDoLado2 = findByMatricula(objetoDoB.getMatricula(), objetosDoB2);
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

    public static GrupoB findByMatricula(BigDecimal matricula, List<GrupoB> objetosB) {
        for (GrupoB objetoDoB : objetosB) {
            if (objetoDoB.getMatricula() == matricula && !objetoDoB.getNome().contains("PESSOA")) {
                return objetoDoB;
            }

        }
        return null;
    }
}
