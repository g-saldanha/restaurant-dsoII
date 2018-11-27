/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gabri
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<TbUsuario>{
    
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;

    public UsuarioFacade() {
        super(TbUsuario.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public TbUsuario verificaUsuario(String codigo, int login, String senha){
    
        switch(codigo){
            case "admin":
               return em.createNamedQuery("TbUsuario.loginAdmin", TbUsuario.class)
                       .setParameter("coUsuario", login)
                       .setParameter("senha", senha)
                       .getSingleResult();
            case "garcom":
                return em.createNamedQuery("TbUsuario.loginGarcom", TbUsuario.class)
                        .setParameter("nuCpf", login)
                        .setParameter("senha", senha)
                        .getSingleResult();
            default:
                return null;
        }
    }
    
}
