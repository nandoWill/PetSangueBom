/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Nêro
 */
public class Gato extends Animal implements AnimalFactory {
    private Date ultimaDoacao;
    public Gato(String nome, float peso, String raca, String tipoSanguineo, int idAnimal, Date ultimaDoacao) {
        super(nome, peso, raca, tipoSanguineo, idAnimal);
        this.ultimaDoacao = ultimaDoacao;
    }

    private boolean isDoador() {
        //precisa ser feita a verificação da última vez que ele doou pra ver se ele vai poder ser um doador. 
        return false;
    }

    @Override
    //precisa ser criada as exceções caso o animal não seja apto a doar jogarmos a doação de prontidão.
    public boolean criarAnimal() {
       
        if(isDoador() == true){
        // se as regras de comparação forem verdade o retorno confirmara que ele está apto a doar.
        }
        
     return true;   
    }
    
}
