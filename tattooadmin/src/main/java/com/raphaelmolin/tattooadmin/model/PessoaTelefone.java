package com.raphaelmolin.tattooadmin.model;

import com.raphaelmolin.tattooadmin.model.enums.TipoTelefone;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pessoa_telefones")
@SequenceGenerator(name = "SEQ_PESSOA_TELEFONES", sequenceName = "SEQ_PESSOA_TELEFONES", allocationSize = 1)
public class PessoaTelefone {

    @Id
    @Column(name = "id_pessoa_telefone")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA_TELEFONES")
    private Long id;

    @Column(name = "tipo")
    private TipoTelefone tipo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "email")
    private String email;

    @Column(name = "principal")
    private String principal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + Objects.hashCode(this.tipo);
        hash = 31 * hash + Objects.hashCode(this.descricao);
        hash = 31 * hash + Objects.hashCode(this.email);
        hash = 31 * hash + Objects.hashCode(this.principal);
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
        final PessoaTelefone other = (PessoaTelefone) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.principal, other.principal)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PessoaTelefone{" + "id=" + id + ", tipo=" + tipo + ", descricao=" + descricao + ", email=" + email + ", principal=" + principal + '}';
    }
}
