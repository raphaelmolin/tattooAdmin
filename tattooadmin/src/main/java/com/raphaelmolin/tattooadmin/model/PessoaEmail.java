package com.raphaelmolin.tattooadmin.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pessoa_emails")
@SequenceGenerator(name = "SEQ_PESSOA_EMAILS", sequenceName = "SEQ_PESSOA_EMAILS", allocationSize = 1)
public class PessoaEmail {

    @Id
    @Column(name = "id_pessoa_email")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOA_EMAILS")
    private Long id;

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
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.descricao);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.principal);
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
        final PessoaEmail other = (PessoaEmail) obj;
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
        return true;
    }

    @Override
    public String toString() {
        return "PessoaEmail{" + "id=" + id + ", descricao=" + descricao + ", email=" + email + ", principal=" + principal + '}';
    }

}
