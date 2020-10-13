
package controller;


import ejb.AssocTaxistaFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import modelo.AssocTaxista;


/**
 *
 * @author GENATCHI
 */
@Named(value = "tbAssocTaxistBean")
@SessionScoped
public class AssocTaxistBean implements Serializable {

   @EJB
   private AssocTaxistaFacadeLocal assocTaxistaFacade;
   private List<AssocTaxista> listaAssocTaxista;
   private AssocTaxista assocTaxista;

    public List<AssocTaxista> getListaAssocTaxista() {
        return listaAssocTaxista;
    }

    public void setListaAssocTaxista(List<AssocTaxista> listaAssocTaxista) {
        this.listaAssocTaxista = listaAssocTaxista;
    }

    public AssocTaxista getAssocTaxista() {
        return assocTaxista;
    }

    public void setAssocTaxista(AssocTaxista assocTaxista) {
        this.assocTaxista = assocTaxista;
    }

   
   
   @PostConstruct
   public void inicializar(){
   
   }
   
    
}
