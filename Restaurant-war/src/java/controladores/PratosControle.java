/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbPrato;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gabriel
 */

@Named("pratosControle")
@SessionScoped
public class PratosControle implements Serializable{
    
    private TbPrato pratos = new TbPrato();
    
    @PersistenceContext
    private EntityManager em;

    public PratosControle() {
    }

    public TbPrato getPratos() {
        return pratos;
    }

    public void setPratos(TbPrato pratos) {
        this.pratos = pratos;
    }  
}
