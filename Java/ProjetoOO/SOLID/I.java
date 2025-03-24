package ProjetoOO.SOLID;

public class I {
    /*
    Princípio da Segregação de Interfaces
        "Interfaces mais específicas são melhores do que uma única interface geral".

        Isso significa que é melhor ter interfaces pequenas com métodos específicos, do que interfaces muito grandes cheia de métodos que uma classe terá que implementar, mas que não vai usar.
        Sendo assim, a classe Pinguin não pode implementar uma interface Ave, que possui os métodos comer(), voar(), cantar(), pois pinguins não voam e nem cantar. Logo, o melhor seria criar interfaces Comedor, Voador e Cantor. Dessa forma, a classe Pinguim vai implementar apenas métodos que ela vai usar
    */
    public static void main(String[] args) {
        Pinguin pinguin = new Pinguin();

        pinguin.comer();
    }

    public static interface Comedor {
        public void comer();        
    }

    public static interface Voador {
        public void voar();        
    }

    public static interface Cantor {
        public void cantar();   
    }

    public static class Pinguin implements Comedor {

        @Override
        public void comer() {
            System.out.println("Pinguin está comendo peixes.");
        }
    }
}
