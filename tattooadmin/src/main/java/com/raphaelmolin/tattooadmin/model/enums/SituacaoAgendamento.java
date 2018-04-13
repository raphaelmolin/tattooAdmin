package com.raphaelmolin.tattooadmin.model.enums;

public enum SituacaoAgendamento {

    AGUARDANDOVISITA("AV", "Aguardando visita"),
    AGUARDANDORETORNO("AR", "Aguardando retorno"),
    EMATENDIMENTO("EA", "Em atendimento"),
    EMSESSAO("ES", "Em sessão"),
    CANCELADO("C", "Cancelado"),
    FINALIZADO("F", "Finalizado");

    private final String id;
    private final String descricao;

    private SituacaoAgendamento(final String id, final String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "SituacaoAgendamento{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
