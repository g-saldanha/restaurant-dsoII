/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbCaixa;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.MesasFacade;

/**
 *
 * @author gabriel
 */
@Named("mesasControle")
@SessionScoped
public class MesasControle implements Serializable{
    @EJB
    private MesasFacade mesas;
    private TbCaixa caixa = new TbCaixa();
    
    @PersistenceContext
    private EntityManager em;

    public MesasControle() {
    }

    public TbCaixa getCaixa() {
        return caixa;
    }

    public void setCaixa(TbCaixa caixa) {
        this.caixa = caixa;
    }
    
  
    
}
