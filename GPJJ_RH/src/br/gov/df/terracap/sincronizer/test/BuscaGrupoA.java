package br.gov.df.terracap.sincronizer.test;

import br.gov.df.terracap.sincronizer.dao.GrupoaDAO;
import br.gov.df.terracap.sincronizer.entities.GrupoA;
import java.util.List;

/**
 *
 * @author jeysel e Kleber
 */
public class BuscaGrupoA {

    public static void main(String[] args) throws Exception {

        GrupoaDAO f = new GrupoaDAO();

//        System.out.println(f.buscarTodosLadoA());
//        System.out.println(f.buscarTodosLadoA2());
        List<GrupoA> objetosDoA = f.buscarTodosLadoA();
        List<GrupoA> objetosDoA2 = f.buscarTodosLadoA2();

        for (GrupoA objetoDoA : objetosDoA) {
            if (objetosDoA2.contains(objetoDoA)) {//O0BJETO DO RH EXISTE NO GPJ
                f.atualizaA2(objetoDoA);//UPDATE NO GPJ

            } else {
                f.insereA2(objetoDoA); //INSERT no GPJ

            }
        }
    }

}
