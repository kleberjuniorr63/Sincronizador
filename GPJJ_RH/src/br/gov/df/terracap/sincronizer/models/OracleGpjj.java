package br.gov.df.terracap.sincronizer.models;

/**
 *
 * @author Jeysel e Kleber
 */
public class OracleGpjj {

    private int matricula;
    private int ativo;
    private String cpf;
    private String email;
    private String nome;
    private String ds_login;

    protected int getmatricula() {
        return matricula;
    }

    public void setmatricula(int matricula) {
        this.matricula = matricula;
    }

    protected int getativo() {
        return ativo;
    }

    public void setativo(int ativo) {
        this.ativo = ativo;
    }

    protected String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    protected String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    protected String getds_login() {
        return ds_login;
    }

    public void setds_login(String ds_login) {
        this.ds_login = ds_login;
    }

    public OracleGpjj() {

    }

    public OracleGpjj(int matricula, int ativo, String cpf, String email, String nome, String ds_login) {
        this.matricula = matricula;
        this.ativo = ativo;
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
        this.ds_login = ds_login;
    }

    @Override
    public String toString() {
        return "\n   --Dados Oracle-- "
                + "\n Matricula: " + getmatricula()
                + "\n Ativo: " + getativo()
                + "\n cpf: " + getcpf()
                + "\n E-mail: " + getemail()
                + "\n Nome: " + getnome()
                + "\n Login: " + getds_login()
                + "\n ";
    }

}
