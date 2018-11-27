/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "TB_CAIXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCaixa.findAll", query = "SELECT t FROM TbCaixa t")
    , @NamedQuery(name = "TbCaixa.findByCoPedido", query = "SELECT t FROM TbCaixa t WHERE t.coPedido = :coPedido")
    , @NamedQuery(name = "TbCaixa.findByNuMesa", query = "SELECT t FROM TbCaixa t WHERE t.nuMesa = :nuMesa")
    , @NamedQuery(name = "TbCaixa.findByVlPedido", query = "SELECT t FROM TbCaixa t WHERE t.vlPedido = :vlPedido")
    , @NamedQuery(name = "TbCaixa.findByStAtivo", query = "SELECT t FROM TbCaixa t WHERE t.stAtivo = :stAtivo")
    , @NamedQuery(name = "TbCaixa.findByStFechado", query = "SELECT t FROM TbCaixa t WHERE t.stFechado = :stFechado")
    , @NamedQuery(name = "TbCaixa.queryMesas", query = "SELECT t FROM TbCaixa t WHERE t.stAtivo = 1")})
public class TbCaixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_PEDIDO")
    private Integer coPedido;
    @Column(name = "NU_MESA")
    private Integer nuMesa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_PEDIDO")
    private Double vlPedido;
    @Column(name = "ST_ATIVO")
    private Integer stAtivo;
    @Column(name = "ST_FECHADO")
    private Integer stFechado;

    public TbCaixa() {
    }

    public TbCaixa(Integer coPedido) {
        this.coPedido = coPedido;
    }

    public Integer getCoPedido() {
        return coPedido;
    }

    public void setCoPedido(Integer coPedido) {
        this.coPedido = coPedido;
    }

    public Integer getNuMesa() {
        return nuMesa;
    }

    public void setNuMesa(Integer nuMesa) {
        this.nuMesa = nuMesa;
    }

    public Double getVlPedido() {
        return vlPedido;
    }

    public void setVlPedido(Double vlPedido) {
        this.vlPedido = vlPedido;
    }

    public Integer getStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(Integer stAtivo) {
        this.stAtivo = stAtivo;
    }

    public Integer getStFechado() {
        return stFechado;
    }

    public void setStFechado(Integer stFechado) {
        this.stFechado = stFechado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coPedido != null ? coPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbCaixa)) {
            return false;
        }
        TbCaixa other = (TbCaixa) object;
        if ((this.coPedido == null && other.coPedido != null) || (this.coPedido != null && !this.coPedido.equals(other.coPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbCaixa[ coPedido=" + coPedido + " ]";
    }
    
}
