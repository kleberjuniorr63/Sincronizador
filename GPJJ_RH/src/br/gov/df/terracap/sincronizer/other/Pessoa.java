package br.gov.df.terracap.sincronizer.other;

/**
 *
 * @author jeysel e Kleber
 */
public class Pessoa {

    private String nome;
    private String cpf;

    @Override
    public boolean equals(Object obj) {
        Pessoa p = (Pessoa) obj;
        if (getCpf().equals(p.getCpf())) {
            return true;
        } else {
            return false;
        }
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
