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
@Table(name = "TB_INGREDIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbIngredientes.findAll", query = "SELECT t FROM TbIngredientes t")
    , @NamedQuery(name = "TbIngredientes.findByCoIngredientes", query = "SELECT t FROM TbIngredientes t WHERE t.coIngredientes = :coIngredientes")
    , @NamedQuery(name = "TbIngredientes.findByCoPrato", query = "SELECT t FROM TbIngredientes t WHERE t.coPrato = :coPrato")
    , @NamedQuery(name = "TbIngredientes.findByDsIngrediente", query = "SELECT t FROM TbIngredientes t WHERE t.dsIngrediente = :dsIngrediente")
    , @NamedQuery(name = "TbIngredientes.findByNuPeso", query = "SELECT t FROM TbIngredientes t WHERE t.nuPeso = :nuPeso")})
public class TbIngredientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_INGREDIENTES")
    private Integer coIngredientes;
    @Column(name = "CO_PRATO")
    private Integer coPrato;
    @Size(max = 250)
    @Column(name = "DS_INGREDIENTE")
    private String dsIngrediente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NU_PESO")
    private Double nuPeso;

    public TbIngredientes() {
    }

    public TbIngredientes(Integer coIngredientes) {
        this.coIngredientes = coIngredientes;
    }

    public Integer getCoIngredientes() {
        return coIngredientes;
    }

    public void setCoIngredientes(Integer coIngredientes) {
        this.coIngredientes = coIngredientes;
    }

    public Integer getCoPrato() {
        return coPrato;
    }

    public void setCoPrato(Integer coPrato) {
        this.coPrato = coPrato;
    }

    public String getDsIngrediente() {
        return dsIngrediente;
    }

    public void setDsIngrediente(String dsIngrediente) {
        this.dsIngrediente = dsIngrediente;
    }

    public Double getNuPeso() {
        return nuPeso;
    }

    public void setNuPeso(Double nuPeso) {
        this.nuPeso = nuPeso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coIngredientes != null ? coIngredientes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbIngredientes)) {
            return false;
        }
        TbIngredientes other = (TbIngredientes) object;
        if ((this.coIngredientes == null && other.coIngredientes != null) || (this.coIngredientes != null && !this.coIngredientes.equals(other.coIngredientes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbIngredientes[ coIngredientes=" + coIngredientes + " ]";
    }
    
}
