package POO.Informacoes;

public class Gato extends Animal{
    public Gato(String nome, String raca){
        super(nome, raca);
    }

    public String mia() {
        return "\nmiau";
    }
}
