package com.raphaelmolin.tattooadmin.model.enums;

public enum TipoAgendamento {

    VISITA("V", "Agendamento de Visita"),
    TATUAGEM("T", "Agendamento de Tatuagem");

    private final String id;
    private final String descricao;

    private TipoAgendamento(final String id, final String descricao) {
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
        return "TipoAgendamento{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
