/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbBebida;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gabriel
 */
@Named("bebidasControle")
@SessionScoped
public class BebidasControle implements Serializable{
    
    private TbBebida bebidas = new TbBebida();
    

    public BebidasControle() {
    }

    public TbBebida getBebidas() {
        return bebidas;
    }

    public void setBebidas(TbBebida bebidas) {
        this.bebidas = bebidas;
    }
    
    public String cadastrarBebida(){
        return null;
    }
    
    public String solicitarBebida(){
        return null;
    }
    
    public List<TbBebida> listarBebidas(){
        return null;
    }
    
}
