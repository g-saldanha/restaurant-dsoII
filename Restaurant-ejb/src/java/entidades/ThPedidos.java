/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "TH_PEDIDOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ThPedidos.findAll", query = "SELECT t FROM ThPedidos t")
    , @NamedQuery(name = "ThPedidos.findByCoHp", query = "SELECT t FROM ThPedidos t WHERE t.coHp = :coHp")
    , @NamedQuery(name = "ThPedidos.findByCoPedido", query = "SELECT t FROM ThPedidos t WHERE t.coPedido = :coPedido")
    , @NamedQuery(name = "ThPedidos.findByCoPrato", query = "SELECT t FROM ThPedidos t WHERE t.coPrato = :coPrato")
    , @NamedQuery(name = "ThPedidos.findByCoUsuario", query = "SELECT t FROM ThPedidos t WHERE t.coUsuario = :coUsuario")
    , @NamedQuery(name = "ThPedidos.findByDtPedido", query = "SELECT t FROM ThPedidos t WHERE t.dtPedido = :dtPedido")
    , @NamedQuery(name = "ThPedidos.findByCoGarcon", query = "SELECT t FROM ThPedidos t WHERE t.coGarcon = :coGarcon")})
public class ThPedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_HP")
    private Integer coHp;
    @Column(name = "CO_PEDIDO")
    private Integer coPedido;
    @Column(name = "CO_PRATO")
    private Integer coPrato;
    @Column(name = "CO_USUARIO")
    private Integer coUsuario;
    @Column(name = "DT_PEDIDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtPedido;
    @Column(name = "CO_GARCON")
    private Integer coGarcon;

    public ThPedidos() {
    }

    public ThPedidos(Integer coHp) {
        this.coHp = coHp;
    }

    public Integer getCoHp() {
        return coHp;
    }

    public void setCoHp(Integer coHp) {
        this.coHp = coHp;
    }

    public Integer getCoPedido() {
        return coPedido;
    }

    public void setCoPedido(Integer coPedido) {
        this.coPedido = coPedido;
    }

    public Integer getCoPrato() {
        return coPrato;
    }

    public void setCoPrato(Integer coPrato) {
        this.coPrato = coPrato;
    }

    public Integer getCoUsuario() {
        return coUsuario;
    }

    public void setCoUsuario(Integer coUsuario) {
        this.coUsuario = coUsuario;
    }

    public Date getDtPedido() {
        return dtPedido;
    }

    public void setDtPedido(Date dtPedido) {
        this.dtPedido = dtPedido;
    }

    public Integer getCoGarcon() {
        return coGarcon;
    }

    public void setCoGarcon(Integer coGarcon) {
        this.coGarcon = coGarcon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coHp != null ? coHp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThPedidos)) {
            return false;
        }
        ThPedidos other = (ThPedidos) object;
        if ((this.coHp == null && other.coHp != null) || (this.coHp != null && !this.coHp.equals(other.coHp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.ThPedidos[ coHp=" + coHp + " ]";
    }
    
}
