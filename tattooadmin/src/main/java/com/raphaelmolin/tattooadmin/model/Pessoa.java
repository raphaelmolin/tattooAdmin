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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PESSOAS")
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
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.tipo);
        hash = 53 * hash + Objects.hashCode(this.categoria);
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.nomeFantasia);
        hash = 53 * hash + Objects.hashCode(this.documento);
        hash = 53 * hash + Objects.hashCode(this.enderecos);
        hash = 53 * hash + Objects.hashCode(this.telefones);
        hash = 53 * hash + Objects.hashCode(this.emails);
        hash = 53 * hash + Objects.hashCode(this.tattoos);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nomeFantasia, other.nomeFantasia)) {
            return false;
        }
        if (!Objects.equals(this.documento, other.documento)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (this.categoria != other.categoria) {
            return false;
        }
        if (!Objects.equals(this.enderecos, other.enderecos)) {
            return false;
        }
        if (!Objects.equals(this.telefones, other.telefones)) {
            return false;
        }
        if (!Objects.equals(this.emails, other.emails)) {
            return false;
        }
        if (!Objects.equals(this.tattoos, other.tattoos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", tipo=" + tipo + ", categoria=" + categoria + ", nome=" + nome + ", nomeFantasia=" + nomeFantasia + ", documento=" + documento + ", enderecos=" + enderecos + ", telefones=" + telefones + ", emails=" + emails + ", tattoos=" + tattoos + '}';
    }

    
}
