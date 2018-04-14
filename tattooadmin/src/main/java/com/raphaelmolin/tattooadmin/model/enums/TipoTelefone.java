package com.raphaelmolin.tattooadmin.model.enums;

public enum TipoTelefone {

    FIXO("F", "Fixo"), CELULAR("C", "Celular"), FAX("X", "Fax");

    private final String id;
    private final String descricao;

    private TipoTelefone(final String id, final String descricao) {
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
        return "TipoTelefone{" + "id=" + id + ", descricao=" + descricao + '}';
    }

}
