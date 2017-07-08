package Model;
import java.util.Date;

/**
 *
 * @author biscoito
 */
public class Pessoa {
    	private String nome;

	private String sobrenome;

	private String cpf;

	private String login;

	private String senha;

	private Date dt_nascimento;

	private String no_celular;

	private String email;

	
public Pessoa(String nome, String sobrenome, String cpf,String login, String senha,Date nasc, String cel, String email){
    if (!"".equals(nome)){
        this.nome = nome;}
    if (!"".equals(sobrenome)){
        this.sobrenome = sobrenome;}
    if (!"".equals(cpf)){
        this.cpf = cpf;}
    if (null != nasc){
        this.dt_nascimento = nasc;}
    if (!"".equals(email)){
        this.email = email;}
    if (!"".equals(cel)){
        this.no_celular = cel;}
    if (!"".equals(login)){
        this.login = login;}
    if (!"".equals(senha)){
        this.senha = senha;}

}	

public Pessoa(){
    super();
}

}
