/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.ThPedidos;
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
public class HistoricoPedidosFacade extends AbstractFacade<ThPedidos>{
    
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;

    public HistoricoPedidosFacade() {
        super(ThPedidos.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    
    public boolean registrarPedido(){
        return false;
    }
    
    public List<ThPedidos> listarPedidos(){
        return null;
    }
    
}
