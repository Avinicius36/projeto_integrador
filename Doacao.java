package br.com.getnet.getpay.payment.integration.onboarding.Trabalho;

import java.time.LocalDateTime;

public class Doacao {

    private Integer id;
    private Integer receptor_id;
    private LocalDateTime data;
    private Integer quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReceptor_id() {
        return receptor_id;
    }

    public void setReceptor_id(Integer receptor_id) {
        this.receptor_id = receptor_id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Doacao(Integer id, Integer receptor_id, LocalDateTime data, Integer quantidade) {
        this.id = id;
        this.receptor_id = receptor_id;
        this.data = data;
        this.quantidade = quantidade;
    }
}
