package POO.Informacoes;

public class Cachorro extends Animal {
    public Cachorro(String nome, String raca){
        super(nome, raca);
    }

    public String late() {
        return "\nauau";
    }
}
