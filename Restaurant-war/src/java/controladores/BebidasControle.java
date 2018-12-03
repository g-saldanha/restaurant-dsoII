/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import entidades.TbBebida;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelos.BebidasFacade;
import recursos.Mensagens;

/**
 *
 * @author gabriel
 */
@Named("bebidasControle")
@SessionScoped
public class BebidasControle implements Serializable{

    @EJB
    private BebidasFacade bebidasFacade;
    private TbBebida bebidas = new TbBebida();
    private LoginControle loginControle = new LoginControle();


    public BebidasControle() {
    }

    public TbBebida getBebida() {
        return bebidas;
    }

    public void setBebidas(TbBebida bebidas) {
        this.bebidas = bebidas;
    }

    public List<TbBebida> getListaBebidas(){
        return this.bebidasFacade.listarBebidas();
    }

    public String cadastrarBebida(TbBebida bebida){
        boolean cadastrou = bebidasFacade.cadastrarBebida(bebida, this.loginControle.getUserBO());
        if (true) {
            return bebida.getDsBebida() + Mensagens.CADASTRADA_COM_SUCESSO;
        } else {
            return Mensagens.ERRO;
        }
    }

}
