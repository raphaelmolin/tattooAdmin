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
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_PESSOA_TELEFONES")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

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

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaTelefone that = (PessoaTelefone) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pessoa, that.pessoa) &&
                tipo == that.tipo &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(email, that.email) &&
                Objects.equals(principal, that.principal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pessoa, tipo, descricao, email, principal);
    }

    @Override
    public String toString() {
        return "PessoaTelefone{" +
                "id=" + id +
                ", pessoa=" + pessoa +
                ", tipo=" + tipo +
                ", descricao='" + descricao + '\'' +
                ", email='" + email + '\'' +
                ", principal='" + principal + '\'' +
                '}';
    }
}
