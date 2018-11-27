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
@Table(name = "TB_BEBIDA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbBebida.findAll", query = "SELECT t FROM TbBebida t")
    , @NamedQuery(name = "TbBebida.findByCoBebida", query = "SELECT t FROM TbBebida t WHERE t.coBebida = :coBebida")
    , @NamedQuery(name = "TbBebida.findByDsBebida", query = "SELECT t FROM TbBebida t WHERE t.dsBebida = :dsBebida")
    , @NamedQuery(name = "TbBebida.findByVlBebida", query = "SELECT t FROM TbBebida t WHERE t.vlBebida = :vlBebida")})
public class TbBebida implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_BEBIDA")
    private Integer coBebida;
    @Size(max = 250)
    @Column(name = "DS_BEBIDA")
    private String dsBebida;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_BEBIDA")
    private Double vlBebida;

    public TbBebida() {
    }

    public TbBebida(Integer coBebida) {
        this.coBebida = coBebida;
    }

    public Integer getCoBebida() {
        return coBebida;
    }

    public void setCoBebida(Integer coBebida) {
        this.coBebida = coBebida;
    }

    public String getDsBebida() {
        return dsBebida;
    }

    public void setDsBebida(String dsBebida) {
        this.dsBebida = dsBebida;
    }

    public Double getVlBebida() {
        return vlBebida;
    }

    public void setVlBebida(Double vlBebida) {
        this.vlBebida = vlBebida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coBebida != null ? coBebida.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbBebida)) {
            return false;
        }
        TbBebida other = (TbBebida) object;
        if ((this.coBebida == null && other.coBebida != null) || (this.coBebida != null && !this.coBebida.equals(other.coBebida))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbBebida[ coBebida=" + coBebida + " ]";
    }
    
}
