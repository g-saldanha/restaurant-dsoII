/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbCaixa;
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
public class MesasFacade extends AbstractFacade<TbCaixa>{
    
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;

    public MesasFacade() {
     super(TbCaixa.class);
    }
    
    
    
    public List<TbCaixa> consultarMesas(){
        return em.createNamedQuery("TbCaixa.queryMesas", TbCaixa.class).getResultList();              
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
