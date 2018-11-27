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
@Table(name = "TB_FORNECEDORES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbFornecedores.findAll", query = "SELECT t FROM TbFornecedores t")
    , @NamedQuery(name = "TbFornecedores.findByCoFornecedor", query = "SELECT t FROM TbFornecedores t WHERE t.coFornecedor = :coFornecedor")
    , @NamedQuery(name = "TbFornecedores.findByCoIngrediente", query = "SELECT t FROM TbFornecedores t WHERE t.coIngrediente = :coIngrediente")
    , @NamedQuery(name = "TbFornecedores.findByDsFornecedor", query = "SELECT t FROM TbFornecedores t WHERE t.dsFornecedor = :dsFornecedor")})
public class TbFornecedores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_FORNECEDOR")
    private Integer coFornecedor;
    @Column(name = "CO_INGREDIENTE")
    private Integer coIngrediente;
    @Size(max = 250)
    @Column(name = "DS_FORNECEDOR")
    private String dsFornecedor;

    public TbFornecedores() {
    }

    public TbFornecedores(Integer coFornecedor) {
        this.coFornecedor = coFornecedor;
    }

    public Integer getCoFornecedor() {
        return coFornecedor;
    }

    public void setCoFornecedor(Integer coFornecedor) {
        this.coFornecedor = coFornecedor;
    }

    public Integer getCoIngrediente() {
        return coIngrediente;
    }

    public void setCoIngrediente(Integer coIngrediente) {
        this.coIngrediente = coIngrediente;
    }

    public String getDsFornecedor() {
        return dsFornecedor;
    }

    public void setDsFornecedor(String dsFornecedor) {
        this.dsFornecedor = dsFornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coFornecedor != null ? coFornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbFornecedores)) {
            return false;
        }
        TbFornecedores other = (TbFornecedores) object;
        if ((this.coFornecedor == null && other.coFornecedor != null) || (this.coFornecedor != null && !this.coFornecedor.equals(other.coFornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbFornecedores[ coFornecedor=" + coFornecedor + " ]";
    }
    
}
