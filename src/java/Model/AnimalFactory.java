package Model;

/**
 *
 * @author Nêro
 */
public interface AnimalFactory {
    String especieAnimal;
    String racaAnimal;
    String nomeAnimal;
    String tipoSangAnimal;
    float pesoAnimal;

    public boolean criarAnimal();
}
