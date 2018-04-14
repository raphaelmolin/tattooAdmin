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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA_TATTOOS")
    private Long id;

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
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.tattoo);
        hash = 79 * hash + Objects.hashCode(this.realizacao);
        hash = 79 * hash + Objects.hashCode(this.tatuador);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaTattoo other = (PessoaTattoo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tattoo, other.tattoo)) {
            return false;
        }
        if (!Objects.equals(this.realizacao, other.realizacao)) {
            return false;
        }
        if (!Objects.equals(this.tatuador, other.tatuador)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaTattoo{" + "id=" + id + ", tattoo=" + tattoo + ", realizacao=" + realizacao + ", tatuador=" + tatuador + '}';
    }

}
