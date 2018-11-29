/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbIngredientes;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gabriel
 */
@Stateless
@LocalBean
public class IngredientesFacade extends AbstractFacade<TbIngredientes>{
     @PersistenceContext(unitName = "Restaurant-ejbPU")
     private EntityManager em;
     
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public IngredientesFacade() {
        super(TbIngredientes.class);
    }
    
    public String cadastrarIngrediente(){
        return null;
    }
    
    public String listarIngredientes(){
        return null;
    }
}
