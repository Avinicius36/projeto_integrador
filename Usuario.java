package br.com.getnet.getpay.payment.integration.onboarding.Trabalho;

import java.util.List;

public class Usuario {

    private String nome;     // nome do usuário
    private String email;   // email do usuário
    private String senha;   // senha do usuário
    private List<Sugestao> sugestoes;
    private Integer telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Sugestao> getSugestoes() {
        return sugestoes;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSugestoes(List<Sugestao> sugestoes) {
        this.sugestoes = sugestoes;
    }

    public Usuario(String nome, String email, String senha, List<Sugestao> sugestoes) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sugestoes = sugestoes;
        this.telefone = telefone;

    }
}
