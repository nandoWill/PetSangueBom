package Model;
/**
 *
 * @author biscoito
 */
public class Clinica {
    private String nomeFantasia;
    private String cnpj;
    private String razaoSocial;
    private String crmvResponsavel;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCrmvResponsavel() {
        return crmvResponsavel;
    }

    public void setCrmvResponsavel(String crmvResponsavel) {
        this.crmvResponsavel = crmvResponsavel;
    }

    public Clinica(String nomeFantasia, String cnpj, String razaoSocial, String crmvResponsavel) {
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.crmvResponsavel = crmvResponsavel;
    }



}

