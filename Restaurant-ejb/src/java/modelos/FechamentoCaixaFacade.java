/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbFechamentos;
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
public class FechamentoCaixaFacade extends AbstractFacade<TbFechamentos>{
    
    @PersistenceContext
    private EntityManager em;

    public FechamentoCaixaFacade() {
        super(TbFechamentos.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public boolean cadastrarFechamento(){
        return false;
    }
    
    public List<TbFechamentos> listarFechamentos(){
        return null;
    }
    
    
}
