package br.gov.df.terracap.sincronizer.other;

/**
 *
 * @author Jeysel
 */
public class TestePessoa {

    public static void main(String args[]) {

        Object o = new Object();

        Pessoa p1 = new Pessoa("Jeysel", "123");
        Pessoa p2 = new Pessoa("Joao", "123");

        if (p1.equals(p2)) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }

    }
}
