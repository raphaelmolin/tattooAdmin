package com.raphaelmolin.tattooadmin.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "pessoa_tattoos")
@SequenceGenerator(name = "SEQ_PESSOA_TATTOOS", sequenceName = "SEQ_PESSOA_TATTOOS", allocationSize = 1)
public class PessoaTattoo {

    @Id
    @Column(name = "id_pessoa_tattoo")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_PESSOA_TATTOOS")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_tattoo")
    private Tattoo tattoo;

    @Column(name = "dt_realizacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date realizacao;

    @Column(name = "tatuador")
    @JoinColumn(name = "id_pessoa")
    private Pessoa tatuador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Tattoo getTattoo() {
        return tattoo;
    }

    public void setTattoo(Tattoo tattoo) {
        this.tattoo = tattoo;
    }

    public Date getRealizacao() {
        return realizacao;
    }

    public void setRealizacao(Date realizacao) {
        this.realizacao = realizacao;
    }

    public Pessoa getTatuador() {
        return tatuador;
    }

    public void setTatuador(Pessoa tatuador) {
        this.tatuador = tatuador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaTattoo that = (PessoaTattoo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pessoa, that.pessoa) &&
                Objects.equals(tattoo, that.tattoo) &&
                Objects.equals(realizacao, that.realizacao) &&
                Objects.equals(tatuador, that.tatuador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pessoa, tattoo, realizacao, tatuador);
    }

    @Override
    public String toString() {
        return "PessoaTattoo{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", tattoo=" + tattoo +
                ", realizacao=" + realizacao +
                ", tatuador=" + tatuador +
                '}';
    }
}
