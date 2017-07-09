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
public class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String complemento;
    private String estado;
    private String cep;
    
    
    public Endereco(){
        super();
    }
    
    public Endereco(String rua,String numero,String bairro,String complemento,String estado,String cep){
        this.bairro = bairro;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.numero = numero;
        this.rua = rua;
    }
    
    public String buscarEndereco(String busca){
        String resultado;
        return resultado;
    }
}
