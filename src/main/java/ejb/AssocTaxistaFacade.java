/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.AssocTaxista;

/**
 *
 * @author GENATCHI
 */
@Stateless
public class AssocTaxistaFacade extends AbstractFacade<AssocTaxista> implements AssocTaxistaFacadeLocal {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AssocTaxistaFacade() {
        super(AssocTaxista.class);
    }
    
}
