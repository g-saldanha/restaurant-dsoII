/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import entidades.TbBebida;
import entidades.TbUsuario;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gabriel
 */
@Stateless
public class BebidasFacade {
    @EJB
    private TbBebida bebidas;
    
    @PersistenceContext
    private EntityManager em;
    
    public String solicitarBebida(){
        return null;
    }
    
    public List<TbBebida> listarBebidas(){
        return null;
    }

    public boolean cadastrarBebida(TbBebida bebida, TbUsuario userBO) {
        return false;
    }
}
