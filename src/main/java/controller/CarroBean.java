/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ejb.CarroFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import modelo.AssocTaxista;
import modelo.Carro;

/**
 *
 * @author GENATCHI
 */
@Named(value = "carroBean")
@SessionScoped
public class CarroBean implements Serializable {

    @EJB
    private CarroFacadeLocal carroFacade;
    private List<Carro> listaCarro;
    private Carro carro;
    private AssocTaxista assocTaxista;

    public List<Carro> getListaCarro() {
        this.listaCarro = this.carroFacade.findAll();
        return listaCarro;
    }

    public void setListaCarro(List<Carro> listaCarro) {
        this.listaCarro = listaCarro;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public AssocTaxista getAssocTaxista() {
        return assocTaxista;
    }

    public void setAssocTaxista(AssocTaxista assocTaxista) {
        this.assocTaxista = assocTaxista;
    }

    @PostConstruct
    public void inicializar() {
        this.carro = new Carro();
        this.assocTaxista = new AssocTaxista();
    }

}
