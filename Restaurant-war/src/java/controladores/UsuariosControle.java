/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbUsuario;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.UsuarioFacade;

/**
 *
 * @author gabri
 */

@Named(value = "usuariosControle")
@SessionScoped
public class UsuariosControle implements Serializable{
    
    @EJB
    private UsuarioFacade usuarioFacade;
    private TbUsuario usuario = new TbUsuario();
    
    @PersistenceContext
    private EntityManager em;

    public UsuariosControle() {
    }

    public UsuarioFacade getUsuarioFacade() {
        return usuarioFacade;
    }

    public void setUsuarioFacade(UsuarioFacade usuarioFacade) {
        this.usuarioFacade = usuarioFacade;
    }

    public TbUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TbUsuario usuario) {
        this.usuario = usuario;
    }
    
    public List<TbUsuario> getListaUsuariosO(){
        return this.usuarioFacade.findAll();
    }
    
    private String insertGerente(){
        try {
            TbUsuario usuarioNew =  new TbUsuario();
            int coUsuarioNew = (int) em.createNativeQuery("SELECT MAX(user.CO_USUARIO) FROM TB_USUARIO user;").getSingleResult();
            usuarioNew.setCoUsuario(coUsuarioNew+1);
            usuarioNew.setSenha(this.usuario.getSenha());
            this.usuarioFacade.create(usuarioNew);
        } catch (Exception e) {
            
        } finally{
            zerarCampos();
        }
        
        return "index";
    }
    
    public String insertGarcom(){
        try {
            TbUsuario usuarioNew =  new TbUsuario();
            int coUsuarioNew = (int) em.createNativeQuery("SELECT MAX(user.CO_USUARIO) FROM TB_USUARIO user;").getSingleResult();
            usuarioNew.setCoUsuario(coUsuarioNew+1);
            usuarioNew.setNuCpf(this.usuario.getNuCpf());
            usuarioNew.setSenha(this.usuario.getSenha());
            this.usuarioFacade.create(usuarioNew);
        } catch (Exception e) {
            
        } finally{
            zerarCampos();
        }
        
        return "index";
    }
    
    public void delete(TbUsuario usuario){
        this.usuarioFacade.remove(usuario);
    }
    
     public void confirmaCadastro(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro realizado com sucesso!"));
    }

    private void zerarCampos() {
        this.usuario.setCoQuemCadastrou(null);
        this.usuario.setCoUsuario(null);
        this.usuario.setNuCpf(null);
        this.usuario.setSenha(null);
    }
}
    
   
