package com.raphaelmolin.tattooadmin.model.enums;

public enum CategoriaPessoa {

    CLIENTE("C", "Cliente"),
    TATUADOR("T", "Tatuador"),
    FORNECEDOR("F","Fornecedor");

    private final String id;
    private final String descricao;

    private CategoriaPessoa(final String id, final String descricao) {
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
        return "CategoriaPessoa{" +
                "id='" + id + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
