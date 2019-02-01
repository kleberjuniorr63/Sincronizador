package br.gov.df.terracap.sincronizer.entities;

import java.math.BigDecimal;

/**
 *
 * @author Jeysel e Kleber
 */
public class GrupoB {

    private BigDecimal matricula;
    private int ativo;
    private String cpf;
    private String nome;
    private String login;
    private int revisao_id;
    private int tipoUsuario;

    public BigDecimal getMatricula() {
        return matricula;
    }

    public void setMatricula(BigDecimal matricula) {
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

    public int getRevisao_id() {
        return revisao_id;
    }

    public void setRevisao_id(int revisao_id) {
        this.revisao_id = revisao_id;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public GrupoB() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GrupoB other = (GrupoB) obj;
        if (this.matricula != other.matricula && (this.matricula == null || !this.matricula.equals(other.matricula))) {
            return false;
        }
        return true;
    }
    
    public GrupoB(BigDecimal matricula, String cpf, String nome, String login, int ativo, int revisao_id, int tipoUsuario) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.login = login;
        this.ativo = ativo;
        this.revisao_id = revisao_id;
        this.tipoUsuario = tipoUsuario;

    }

    @Override
    public String toString() {
        return "\n   --Dados Seguranca--"
                + "\n Matrícula: " + getMatricula()
                + "\n CPF: " + getCpf()
                + "\n Nome: " + getNome()
                + "\n Login: " + getLogin()
                + "\n Ativo: " + getAtivo()
                + "\n revisao_id: " + getRevisao_id()
                + "\n tipoUsuario: " + getTipoUsuario()
                + "\n ";
    }

}
