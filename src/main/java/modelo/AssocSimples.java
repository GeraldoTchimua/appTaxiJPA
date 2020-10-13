/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author GENATCHI
 */
public class AssocSimples {
    
    private int idAssocS;
    private String nome;
    private String bi;
    private String numCond;
    private String telefone;
    private Date datNasc;
    private Date datCadastro;
    private String cargo;
    private Date datCargo;

    public AssocSimples() {
    }

    public int getIdAssocS() {
        return idAssocS;
    }

    public void setIdAssocS(int idAssocS) {
        this.idAssocS = idAssocS;
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
        int hash = 5;
        hash = 53 * hash + this.idAssocS;
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
        final AssocSimples other = (AssocSimples) obj;
        if (this.idAssocS != other.idAssocS) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AssocSimples{" + "idAssocS=" + idAssocS + '}';
    }
    
    
    
}
