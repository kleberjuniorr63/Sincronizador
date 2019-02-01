package br.gov.df.terracap.sincronizer.models;

public class SqlGpjDesenv {

    /**
     *
     * @author Jeysel e Kleber
     */
    protected int matricula;
    protected int ativo;
    protected int codOrgao;
    protected String cpf;
    protected String email;
    protected String emailChefe;
    protected String matriculaChefe;
    protected String nome;
    protected String nomeChefe;
    protected String nomeOrgao;
    protected String siglaOrgao;
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

    public int getCodOrgao() {
        return codOrgao;
    }

    public void setCodOrgao(int codOrgao) {
        this.codOrgao = codOrgao;
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

    public String getNomeOrgao() {
        return nomeOrgao;
    }

    public void setNomeOrgao(String nomeOrgao) {
        this.nomeOrgao = nomeOrgao;
    }

    public String getSiglaOrgao() {
        return siglaOrgao;
    }

    public void setSiglaOrgao(String siglaOrgao) {
        this.siglaOrgao = siglaOrgao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public SqlGpjDesenv() {
    }

    public SqlGpjDesenv(int matricula, int ativo, int codOrgao, String cpf, String email, String emailChefe, String matriculaChefe, String nome, String nomeChefe, String nomeOrgao, String siglaOrgao, String telefone) {
        this.matricula = matricula;
        this.ativo = ativo;
        this.codOrgao = codOrgao;
        this.cpf = cpf;
        this.email = email;
        this.emailChefe = emailChefe;
        this.matriculaChefe = matriculaChefe;
        this.nome = nome;
        this.nomeChefe = nomeChefe;
        this.nomeOrgao = nomeOrgao;
        this.siglaOrgao = siglaOrgao;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\n   --Dados n_GPJ_DESENV--"
                + "\n Matricula: " + getMatricula()
                + "\n Ativo: " + getAtivo()
                + "\n Codigo do orgão: " + getCodOrgao()
                + "\n CPF: " + getCpf()
                + "\n E-mail: " + getEmail()
                + "\n E-mail do chefe: " + getEmailChefe()
                + "\n Matrícula do chefe: " + getMatriculaChefe()
                + "\n nome: " + getNome()
                + "\n Nome do chefe: " + getNomeChefe()
                + "\n Nome do orgão: " + getNomeOrgao()
                + "\n Sígla do orgão: " + getSiglaOrgao()
                + "\n Telefone: " + getTelefone()
                + "\n ";
    }

}
