package com.raphaelmolin.tattooadmin.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "tattoos")
@SequenceGenerator(name = "SEQ_TATTOOS", sequenceName = "SEQ_TATTOOS", allocationSize = 1)
public class Tattoo {

    @Id
    @Column(name = "id_tattoo")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_TATTOOS")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "caminho")
    private String caminho;

    @Column(name = "vl_preco", precision = 15, scale = 5)
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tattoo tattoo = (Tattoo) o;
        return Objects.equals(id, tattoo.id) &&
                Objects.equals(nome, tattoo.nome) &&
                Objects.equals(caminho, tattoo.caminho) &&
                Objects.equals(preco, tattoo.preco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, caminho, preco);
    }

    @Override
    public String toString() {
        return "Tattoo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", caminho='" + caminho + '\'' +
                ", preco=" + preco +
                '}';
    }
}
