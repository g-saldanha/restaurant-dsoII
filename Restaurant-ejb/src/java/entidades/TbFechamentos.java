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
@Table(name = "TB_FECHAMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFechamentos.findAll", query = "SELECT t FROM TbFechamentos t")
    , @NamedQuery(name = "TbFechamentos.findByCoFechamento", query = "SELECT t FROM TbFechamentos t WHERE t.coFechamento = :coFechamento")
    , @NamedQuery(name = "TbFechamentos.findByDtFechamento", query = "SELECT t FROM TbFechamentos t WHERE t.dtFechamento = :dtFechamento")
    , @NamedQuery(name = "TbFechamentos.findByVlFechamento", query = "SELECT t FROM TbFechamentos t WHERE t.vlFechamento = :vlFechamento")})
public class TbFechamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_FECHAMENTO")
    private Integer coFechamento;
    @Column(name = "DT_FECHAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VL_FECHAMENTO")
    private Double vlFechamento;

    public TbFechamentos() {
    }

    public TbFechamentos(Integer coFechamento) {
        this.coFechamento = coFechamento;
    }

    public Integer getCoFechamento() {
        return coFechamento;
    }

    public void setCoFechamento(Integer coFechamento) {
        this.coFechamento = coFechamento;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Double getVlFechamento() {
        return vlFechamento;
    }

    public void setVlFechamento(Double vlFechamento) {
        this.vlFechamento = vlFechamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coFechamento != null ? coFechamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFechamentos)) {
            return false;
        }
        TbFechamentos other = (TbFechamentos) object;
        if ((this.coFechamento == null && other.coFechamento != null) || (this.coFechamento != null && !this.coFechamento.equals(other.coFechamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbFechamentos[ coFechamento=" + coFechamento + " ]";
    }
    
}
