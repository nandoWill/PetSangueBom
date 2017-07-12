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

    private Endereco endereco;

    private int id;

    private String celular2;

    public Pessoa(){
        super();
    }

    public Pessoa(String nome, String sobrenome, String cpf, String login, String senha, Date dt_nascimento, String no_celular, String email, Endereco endereco, String celular2) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.login = login;
        this.senha = senha;
        this.dt_nascimento = dt_nascimento;
        this.no_celular = no_celular;
        this.email = email;
        this.endereco = endereco;
        this.celular2 = celular2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public void setNo_celular(String no_celular) {
        this.no_celular = no_celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public String getNo_celular() {
        return no_celular;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
