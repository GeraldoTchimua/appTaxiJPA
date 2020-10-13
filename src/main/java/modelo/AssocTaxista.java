/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author GENATCHI
 */
@Entity
@Table (name = "tb_assoc_taxist")
public class AssocTaxista implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAssocT;
    
    @Column(name = "nome_taxist")
    private String nome;
    
    @Column(name = "bi_taxist")
    private String bi;
    
    @Column(name = "carta_taxist")
    private String numCond;
    
    @Column(name = "tel_taxist")
    private String telefone;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_nasc_taxist")
    private Date datNasc;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_cadast_taxist")
    private Date datCadastro;
    
    @Column(name = "cargo_taxist")
    private String cargo;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "dat_cargo")
    private Date datCargo;

    public AssocTaxista() {
    }

    public int getIdAssocT() {
        return idAssocT;
    }

    public void setIdAssocT(int idAssocT) {
        this.idAssocT = idAssocT;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getNumCond() {
        return numCond;
    }

    public void setNumCond(String numCond) {
        this.numCond = numCond;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(Date datNasc) {
        this.datNasc = datNasc;
    }

    public Date getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(Date datCadastro) {
        this.datCadastro = datCadastro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDatCargo() {
        return datCargo;
    }

    public void setDatCargo(Date datCargo) {
        this.datCargo = datCargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.idAssocT;
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
        final AssocTaxista other = (AssocTaxista) obj;
        if (this.idAssocT != other.idAssocT) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AssocTaxista{" + "idAssocT=" + idAssocT + '}';
    }
    
    
    
    

}
