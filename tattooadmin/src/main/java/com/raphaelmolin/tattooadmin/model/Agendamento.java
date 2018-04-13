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
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQ_AGENDAMENTOS")
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(id, that.id) &&
                tipo == that.tipo &&
                Objects.equals(titulo, that.titulo) &&
                Objects.equals(descricao, that.descricao) &&
                Objects.equals(cliente, that.cliente) &&
                Objects.equals(tatuador, that.tatuador) &&
                Objects.equals(tattoos, that.tattoos) &&
                Objects.equals(atendimento, that.atendimento) &&
                Objects.equals(retorno, that.retorno) &&
                Objects.equals(agendamento, that.agendamento) &&
                situacao == that.situacao &&
                Objects.equals(sessoes, that.sessoes) &&
                Objects.equals(valorOrcado, that.valorOrcado) &&
                Objects.equals(valorAtual, that.valorAtual);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, titulo, descricao, cliente, tatuador, tattoos, atendimento, retorno, agendamento, situacao, sessoes, valorOrcado, valorAtual);
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cliente=" + cliente +
                ", tatuador=" + tatuador +
                ", tattoos=" + tattoos +
                ", atendimento=" + atendimento +
                ", retorno=" + retorno +
                ", agendamento=" + agendamento +
                ", situacao=" + situacao +
                ", sessoes=" + sessoes +
                ", valorOrcado=" + valorOrcado +
                ", valorAtual=" + valorAtual +
                '}';
    }
}
