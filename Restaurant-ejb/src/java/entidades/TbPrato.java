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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabri
 */
@Entity
@Table(name = "TB_PRATO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbPrato.findAll", query = "SELECT t FROM TbPrato t")
    , @NamedQuery(name = "TbPrato.findByCoPrato", query = "SELECT t FROM TbPrato t WHERE t.coPrato = :coPrato")
    , @NamedQuery(name = "TbPrato.findByTpComida", query = "SELECT t FROM TbPrato t WHERE t.tpComida = :tpComida")
    , @NamedQuery(name = "TbPrato.findByVlPrato", query = "SELECT t FROM TbPrato t WHERE t.vlPrato = :vlPrato")
    , @NamedQuery(name = "TbPrato.findByNuPesototal", query = "SELECT t FROM TbPrato t WHERE t.nuPesototal = :nuPesototal")})
public class TbPrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_PRATO")
    private Integer coPrato;
    @Size(max = 250)
    @Column(name = "TP_COMIDA")
    private String tpComida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_PRATO")
    private Double vlPrato;
    @Column(name = "NU_PESOTOTAL")
    private Double nuPesototal;

    public TbPrato() {
    }

    public TbPrato(Integer coPrato) {
        this.coPrato = coPrato;
    }

    public Integer getCoPrato() {
        return coPrato;
    }

    public void setCoPrato(Integer coPrato) {
        this.coPrato = coPrato;
    }

    public String getTpComida() {
        return tpComida;
    }

    public void setTpComida(String tpComida) {
        this.tpComida = tpComida;
    }

    public Double getVlPrato() {
        return vlPrato;
    }

    public void setVlPrato(Double vlPrato) {
        this.vlPrato = vlPrato;
    }

    public Double getNuPesototal() {
        return nuPesototal;
    }

    public void setNuPesototal(Double nuPesototal) {
        this.nuPesototal = nuPesototal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coPrato != null ? coPrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbPrato)) {
            return false;
        }
        TbPrato other = (TbPrato) object;
        if ((this.coPrato == null && other.coPrato != null) || (this.coPrato != null && !this.coPrato.equals(other.coPrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbPrato[ coPrato=" + coPrato + " ]";
    }
    
}
