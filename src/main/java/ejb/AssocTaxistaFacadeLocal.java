/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Local;
import modelo.AssocTaxista;

/**
 *
 * @author GENATCHI
 */
@Local
public interface AssocTaxistaFacadeLocal {

    void create(AssocTaxista assocTaxista);

    void edit(AssocTaxista assocTaxista);

    void remove(AssocTaxista assocTaxista);

    AssocTaxista find(Object id);

    List<AssocTaxista> findAll();

    List<AssocTaxista> findRange(int[] range);

    int count();
    
}
