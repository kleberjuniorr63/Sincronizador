package br.gov.df.terracap.sincronizer.models;

public class OracleColaboradorTerracap {

    /**
     *
     * @author jeysel e Kleber
     */
    protected int matricula;
    protected int ativo;
    protected String codorgao;
    protected String cpf;
    protected String email;
    protected String emailChefe;
    protected String matriculaChefe;
    protected String nome;
    protected String nomeChefe;
    protected String telefone;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public String getCodorgao() {
        return codorgao;
    }

    public void setCodorgao(String codorgao) {
        this.codorgao = codorgao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailChefe() {
        return emailChefe;
    }

    public void setEmailChefe(String emailChefe) {
        this.emailChefe = emailChefe;
    }

    public String getMatriculaChefe() {
        return matriculaChefe;
    }

    public void setMatriculaChefe(String matriculaChefe) {
        this.matriculaChefe = matriculaChefe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public OracleColaboradorTerracap() {

    }

    public OracleColaboradorTerracap(int matricula, int ativo, String codorgao, String cpf, String email, String emailChefe, String matriculaChefe, String nome, String nomeChefe, String telefone) {
        this.matricula = matricula;
        this.ativo = ativo;
        this.codorgao = codorgao;
        this.cpf = cpf;
        this.email = email;
        this.emailChefe = emailChefe;
        this.matriculaChefe = matriculaChefe;
        this.nome = nome;
        this.nomeChefe = nomeChefe;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n    --Dados do colaborador TERRACAP--"
                + "\n Matricula: " + getMatricula()
                + "\n Ativo: " + getAtivo()
                + "\n Cod. Orgão: " + getCodorgao()
                + "\n CPF: " + getCpf()
                + "\n E-mail: " + getEmail()
                + "\n E-mail chefe: " + getEmailChefe()
                + "\n Matricula chefe: " + getMatriculaChefe()
                + "\n Nome: " + getNome()
                + "\n Nome do chefe: " + getNomeChefe()
                + "\n Telefone: " + getTelefone()
                + "\n ";
    }

}
