public class Animal {
    private String especieAnimal;
    private String racaAnimal;
    private String nomeAnimal;
    private String tipoSangAnimal;
    private float pesoAnimal;

    public Animal(String especieAnimal,String racaAnimal,String nomeAnimal,String tipoSangAnimal,float pesoAnimal){
        this.especieAnimal=especieAnimal;
        this.racaAnimal=racaAnimal;
        this.nomeAnimal=nomeAnimal;
        this.tipoSangAnimal=tipoSangAnimal;
        this.pesoAnimal=pesoAnimal;
    }

    public float getPesoAnimal() {
        return pesoAnimal;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public String getTipoSangAnimal() {
        return tipoSangAnimal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setPesoAnimal(float pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public void setTipoSangAnimal(String tipoSangAnimal) {
        this.tipoSangAnimal = tipoSangAnimal;
    }

}
