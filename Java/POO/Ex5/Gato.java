package POO.Ex5;

public class Gato extends Animal{
    public Gato(String nome, String raca){
        super(nome, raca);
    }

    public String mia() {
        return "\nmiau";
    }
}
