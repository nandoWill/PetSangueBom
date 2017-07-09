/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author biscoito
 */
public class Veterinario extends Pessoa {
    private String crmv;
    private Clinica trabalhoAtual;

    public String getCrmv() {
        return crmv;
    }

    public Clinica getTrabalhoAtual() {
        return trabalhoAtual;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public void setTrabalhoAtual(Clinica trabalhoAtual) {
        this.trabalhoAtual = trabalhoAtual;
    }
    
    
}
