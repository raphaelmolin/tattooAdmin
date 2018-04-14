package com.raphaelmolin.tattooadmin.model.enums;

public enum TipoPessoa {

    FISICA("F", "Física"), JURIDICA("J", "Jurídica");

    private final String id;
    private final String descricao;

    private TipoPessoa(final String id, final String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getIdTipoPessoa() {
        return this.id;
    }

    public String getDescricaoTipoPessoa() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return "TipoPessoa{" + "id=" + id + ", descricao=" + descricao + '}';
    }

}
