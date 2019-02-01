package br.gov.df.terracap.sincronizer.entities;

/**
 *
 * @author jeysel e Kleber
 */
public class GrupoA {

    private String matricula;
    private String ativo;
    private String codOrgao;
    private String cpf;
    private String email;
    private String emailChefe;
    private String matriculaChefe;
    private String nome;
    private String nomeChefe;
    private String nomeOrgao;
    private String siglaOrgao;
    private String telefone;

    @Override
    public boolean equals(Object obj) {
        GrupoA f = (GrupoA) obj;
        if (getMatricula().equalsIgnoreCase(f.getMatricula())) {
            return true;
        }
        return false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getCodOrgao() {
        return codOrgao;
    }

    public void setCodOrgao(String codOrgao) {
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
        if (matriculaChefe.equals("null")) {
            return null;
        }
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

    @Override
    public String toString() {
        return "\n    --Dados do colaborador TERRACAP--"
                + "\n Matricula: " + getMatricula()
                + "\n Ativo: " + getAtivo()
                + "\n Cod. Orgão: " + getCodOrgao()
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
