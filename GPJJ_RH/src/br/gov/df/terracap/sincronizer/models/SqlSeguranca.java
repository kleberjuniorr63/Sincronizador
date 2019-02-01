package br.gov.df.terracap.sincronizer.models;

/**
 *
 * @author jeysel e Kleber
 */
public class SqlSeguranca {

    protected int matricula;
    protected String cpf;
    protected String nome;
    protected String login;
    protected int ativo;
    protected int tipoUsuario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public SqlSeguranca() {
    }

    public SqlSeguranca(int matricula, String cpf, String nome, String login, int ativo, int tipoUsuario) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.ativo = ativo;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return  "\n   --Dados Seguranca--"+
                "\n Matrícula: "+getMatricula()+
                "\n CPF: "+getCpf()+
                "\n Nome: "+getNome()+
                "\n Login: "+getLogin()+
                "\n Ativo: "+getAtivo()+
                "\n Tipo de usuário: "+getTipoUsuario()+
                "\n ";
    }

}
