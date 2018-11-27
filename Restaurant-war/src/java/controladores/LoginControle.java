/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbUsuario;
import javax.inject.Named;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import modelos.UsuarioFacade;
import org.primefaces.context.RequestContext;

import org.apache.log4j.Logger;

/**
 *
 * @author Gabriel
 */
@Named(value = "loginControle")
@SessionScoped
public class LoginControle implements Serializable {
    
    private static Logger logger = Logger.getLogger(LoginControle.class);
    @EJB
    private UsuarioFacade usuarioFacade;
    private int login;
    private String senha;
    private String codigo;
    
       
    @ManagedProperty(value = "#{userBO}")
    private TbUsuario userBO;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public LoginControle() {
    }
    
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public String logar(){
        try{
            TbUsuario usuario = usuarioFacade.verificaUsuario(codigo, login, senha);
            if(usuario == null){
                throw new Exception ("Erro no login");
            }else{
                if (usuario.isAdmin()) {
                    SessionContext.getInstance().setUsuarioLogado(usuario);
                    return "adminHome.xhtml?faces-redirect=true";
                } else {
                    SessionContext.getInstance().setUsuarioLogado(usuario);
                    return "garcomHome.xhtml?faces-redirect=true";
                }
                
            }    
        }catch(Exception e){
            RequestContext.getCurrentInstance().update("growl");
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", "Usuário e/ou Senha inválido!"));
        }finally{
            zerarCampos();
        }
        
       return "";
    }        

    public String fazerLogout(){
        SessionContext.getInstance().encerrarSessao();
        return "index.xhtml";
    }        
            
    
    
    public TbUsuario getUserBO() {
        TbUsuario usuario = (TbUsuario) SessionContext.getInstance().getUsuarioLogado();
        return usuario;
    }
    
    public void setUserBO(TbUsuario usuario){
        this.userBO = usuario;
    }
    
    public void zerarCampos(){
        setLogin(0);
        setSenha(null);
    }
    
    
}       
    
