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
@Table(name = "TB_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbUsuario.findAll", query = "SELECT t FROM TbUsuario t")
    , @NamedQuery(name = "TbUsuario.findByCoUsuario", query = "SELECT t FROM TbUsuario t WHERE t.coUsuario = :coUsuario")
    , @NamedQuery(name = "TbUsuario.findByNuCpf", query = "SELECT t FROM TbUsuario t WHERE t.nuCpf = :nuCpf")
    , @NamedQuery(name = "TbUsuario.findBySenha", query = "SELECT t FROM TbUsuario t WHERE t.senha = :senha")
    , @NamedQuery(name = "TbUsuario.findByCoQuemCadastrou", query = "SELECT t FROM TbUsuario t WHERE t.coQuemCadastrou = :coQuemCadastrou")
    , @NamedQuery(name = "TbUsuario.loginAdmin", query = "SELECT t FROM TbUsuario t WHERE t.coUsuario = :coUsuario AND t.senha = :senha")
    , @NamedQuery(name = "TbUsuario.loginGarcom", query = "SELECT t FROM TbUsuario t WHERE t.nuCpf = :nuCpf AND t.senha = :senha")})
public class TbUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CO_USUARIO")
    private Integer coUsuario;
    @Column(name = "NU_CPF")
    private Integer nuCpf;
    @Size(max = 250)
    @Column(name = "SENHA")
    private String senha;
    @Column(name = "CO_QUEM_CADASTROU")
    private Integer coQuemCadastrou;

    public TbUsuario() {
    }

    public TbUsuario(Integer coUsuario) {
        this.coUsuario = coUsuario;
    }

    public Integer getCoUsuario() {
        return coUsuario;
    }

    public void setCoUsuario(Integer coUsuario) {
        this.coUsuario = coUsuario;
    }

    public Integer getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(Integer nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getCoQuemCadastrou() {
        return coQuemCadastrou;
    }

    public void setCoQuemCadastrou(Integer coQuemCadastrou) {
        this.coQuemCadastrou = coQuemCadastrou;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coUsuario != null ? coUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TbUsuario)) {
            return false;
        }
        TbUsuario other = (TbUsuario) object;
        if ((this.coUsuario == null && other.coUsuario != null) || (this.coUsuario != null && !this.coUsuario.equals(other.coUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TbUsuario[ coUsuario=" + coUsuario + " ]";
    }
    
    public boolean isAdmin(){
        return getNuCpf() == null;
    }
    
}
