/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbPrato;
import java.util.List;
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
public class PratosFacade extends AbstractFacade<TbPrato>{
    
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;

    public PratosFacade() {
        super(TbPrato.class);
    }
    
    public TbPrato solicitarPrato(){
        return null;
    }
    
    public String cadastrarPrato(){
        return null;
    }
    
    public List<TbPrato> listarPratos(){
        return null;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
