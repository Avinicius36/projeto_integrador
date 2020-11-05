package br.com.getnet.getpay.payment.integration.onboarding.Trabalho;

public class Receptor {

    private Integer id;

    private Integer cpf;

    public Receptor(Integer id, Integer cpf) {
        this.id = id;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
