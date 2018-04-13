package com.raphaelmolin.tattooadmin.model;

import com.raphaelmolin.tattooadmin.model.enums.CategoriaPessoa;
import com.raphaelmolin.tattooadmin.model.enums.TipoPessoa;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pessoas")
@SequenceGenerator(name = "SEQ_PESSOAS", sequenceName = "SEQ_PESSOAS", allocationSize = 1)
public class Pessoa {

    @Id
    @Column(name = "id_pessoa")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_PESSOAS")
    private Long id;

    @Column(name = "tipo_pessoa")
    private TipoPessoa tipo;

    @Column(name = "categoria_pessoa")
    private CategoriaPessoa categoria;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nome_fantasia")
    private String nomeFantasia;

    @Column(name = "documento")
    private String documento;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa")
    private List<PessoaEndereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa")
    private List<PessoaTelefone> telefones;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa")
    private List<PessoaEmail> emails;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pessoa")
    private List<PessoaTattoo> tattoos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    public CategoriaPessoa getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPessoa categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<PessoaEndereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<PessoaEndereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<PessoaTelefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<PessoaTelefone> telefones) {
        this.telefones = telefones;
    }

    public List<PessoaEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<PessoaEmail> emails) {
        this.emails = emails;
    }

    public List<PessoaTattoo> getTattoos() {
        return tattoos;
    }

    public void setTattoos(List<PessoaTattoo> tattoos) {
        this.tattoos = tattoos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) &&
                tipo == pessoa.tipo &&
                categoria == pessoa.categoria &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(nomeFantasia, pessoa.nomeFantasia) &&
                Objects.equals(documento, pessoa.documento) &&
                Objects.equals(enderecos, pessoa.enderecos) &&
                Objects.equals(telefones, pessoa.telefones) &&
                Objects.equals(emails, pessoa.emails) &&
                Objects.equals(tattoos, pessoa.tattoos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, categoria, nome, nomeFantasia, documento, enderecos, telefones, emails, tattoos);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", categoria=" + categoria +
                ", nome='" + nome + '\'' +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", documento='" + documento + '\'' +
                ", enderecos=" + enderecos +
                ", telefones=" + telefones +
                ", emails=" + emails +
                ", tattoos=" + tattoos +
                '}';
    }
}
