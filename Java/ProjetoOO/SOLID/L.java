package ProjetoOO.SOLID;

public class L {
    /*
    Princípio da Substituição de Liskov
        "Se uma classe A é um subtipo da classe B, então você deve ser capaz de substituir toda ocorrência de B por A mantendo o mesmo comportamento."

        Isso significa que  uma classe Filha deve substituir uma classe Pai sem que isso acarrete em problemas no código.  Tudo o que uma classe Pai faz, a classe Filha tem que fazer também.
        Sendo assim, a classe Cachorro que é filha da classe Animal, herda todos os seus comportamentos.
    */
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.fazerBarulho();
    }

    public static class Animal {
        public void fazerBarulho() {
            System.out.println("Animal fazendo barulho.");
        }
    }

    public static class Cachorro extends Animal{
        @Override
        public void fazerBarulho() {
            System.out.println("Cachorro fazendo barulho.");
        }
    }
}
