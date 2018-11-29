/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbFornecedores;
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
public class FornecedoresFacade extends AbstractFacade<TbFornecedores>{
    
    @PersistenceContext(unitName = "Restaurant-ejbPU")
    private EntityManager em;
    
    
    public FornecedoresFacade() {
        super(TbFornecedores.class);
    }
    
    public String cadastraFornecedores(){
        return null;
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
