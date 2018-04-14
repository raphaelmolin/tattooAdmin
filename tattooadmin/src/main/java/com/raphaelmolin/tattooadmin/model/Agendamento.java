package com.raphaelmolin.tattooadmin.model;

import com.raphaelmolin.tattooadmin.model.enums.SituacaoAgendamento;
import com.raphaelmolin.tattooadmin.model.enums.TipoAgendamento;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "agendamentos")
@SequenceGenerator(name = "SEQ_AGENDAMENTOS", sequenceName = "SEQ_AGENDAMENTOS", allocationSize = 1)
public class Agendamento {

    @Id
    @Column(name = "id_agendamentos")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AGENDAMENTOS")
    private Long id;

    @Column(name = "tipo_agendamento")
    private TipoAgendamento tipo;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa cliente;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa tatuador;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tattoo")
    private List<Tattoo> tattoos;

    @Column(name = "dt_atendimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date atendimento;

    @Column(name = "dt_retorno")
    @Temporal(TemporalType.TIMESTAMP)
    private Date retorno;

    @Column(name = "dt_agendamento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agendamento;

    @Column(name = "situacao")
    private SituacaoAgendamento situacao;

    @Column(name = "qt_sessoes")
    private Integer sessoes;

    @Column(name = "vl_orcado", precision = 15, scale = 5)
    private BigDecimal valorOrcado;

    @Column(name = "vl_atual", precision = 15, scale = 5)
    private BigDecimal valorAtual;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoAgendamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoAgendamento tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Pessoa getTatuador() {
        return tatuador;
    }

    public void setTatuador(Pessoa tatuador) {
        this.tatuador = tatuador;
    }

    public List<Tattoo> getTattoos() {
        return tattoos;
    }

    public void setTattoos(List<Tattoo> tattoos) {
        this.tattoos = tattoos;
    }

    public Date getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Date atendimento) {
        this.atendimento = atendimento;
    }

    public Date getRetorno() {
        return retorno;
    }

    public void setRetorno(Date retorno) {
        this.retorno = retorno;
    }

    public Date getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Date agendamento) {
        this.agendamento = agendamento;
    }

    public SituacaoAgendamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAgendamento situacao) {
        this.situacao = situacao;
    }

    public Integer getSessoes() {
        return sessoes;
    }

    public void setSessoes(Integer sessoes) {
        this.sessoes = sessoes;
    }

    public BigDecimal getValorOrcado() {
        return valorOrcado;
    }

    public void setValorOrcado(BigDecimal valorOrcado) {
        this.valorOrcado = valorOrcado;
    }

    public BigDecimal getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(BigDecimal valorAtual) {
        this.valorAtual = valorAtual;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.id);
        hash = 61 * hash + Objects.hashCode(this.tipo);
        hash = 61 * hash + Objects.hashCode(this.titulo);
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + Objects.hashCode(this.cliente);
        hash = 61 * hash + Objects.hashCode(this.tatuador);
        hash = 61 * hash + Objects.hashCode(this.tattoos);
        hash = 61 * hash + Objects.hashCode(this.atendimento);
        hash = 61 * hash + Objects.hashCode(this.retorno);
        hash = 61 * hash + Objects.hashCode(this.agendamento);
        hash = 61 * hash + Objects.hashCode(this.situacao);
        hash = 61 * hash + Objects.hashCode(this.sessoes);
        hash = 61 * hash + Objects.hashCode(this.valorOrcado);
        hash = 61 * hash + Objects.hashCode(this.valorAtual);
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
        final Agendamento other = (Agendamento) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.tatuador, other.tatuador)) {
            return false;
        }
        if (!Objects.equals(this.tattoos, other.tattoos)) {
            return false;
        }
        if (!Objects.equals(this.atendimento, other.atendimento)) {
            return false;
        }
        if (!Objects.equals(this.retorno, other.retorno)) {
            return false;
        }
        if (!Objects.equals(this.agendamento, other.agendamento)) {
            return false;
        }
        if (this.situacao != other.situacao) {
            return false;
        }
        if (!Objects.equals(this.sessoes, other.sessoes)) {
            return false;
        }
        if (!Objects.equals(this.valorOrcado, other.valorOrcado)) {
            return false;
        }
        if (!Objects.equals(this.valorAtual, other.valorAtual)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agendamento{" + "id=" + id + ", tipo=" + tipo + ", titulo=" + titulo + ", descricao=" + descricao + ", cliente=" + cliente + ", tatuador=" + tatuador + ", tattoos=" + tattoos + ", atendimento=" + atendimento + ", retorno=" + retorno + ", agendamento=" + agendamento + ", situacao=" + situacao + ", sessoes=" + sessoes + ", valorOrcado=" + valorOrcado + ", valorAtual=" + valorAtual + '}';
    }

}
