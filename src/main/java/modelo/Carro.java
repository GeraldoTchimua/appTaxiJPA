/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author GENATCHI
 */
@Entity
@Table(name = "tb_carro")
public class Carro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCarro;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "matricula")
    private String matricula;
    
    @ManyToOne
    @JoinColumn(name = "idassoc_taxist")
    private AssocTaxista nomeTaxista;

    public Carro() {
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public AssocTaxista getNomeTaxista() {
        return nomeTaxista;
    }

    public void setNomeTaxista(AssocTaxista nomeTaxista) {
        this.nomeTaxista = nomeTaxista;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.idCarro;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.idCarro != other.idCarro) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" + "idCarro=" + idCarro + '}';
    }

}
