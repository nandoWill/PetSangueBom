
package Model;

import java.util.Date;

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

    public Veterinario(String crmv, Clinica trabalhoAtual, String nome, String sobrenome, String cpf, String login, String senha, Date dt_nascimento, String no_celular, String email, Endereco endereco, String celular2) {
        super(nome, sobrenome, cpf, login, senha, dt_nascimento, no_celular, email, endereco, celular2);
        this.crmv = crmv;
        this.trabalhoAtual = trabalhoAtual;
    }

    
    
    
}
