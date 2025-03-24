package ProjetoOO.SOLID;

public class D {
    /*
    Princípio da Inversão de Dependência
        "Os módulos de alto nível não devem depender diretamente de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações".

        Isso significa que o principal objetivo é desacoplar as dependências diretas. Imagine que você tem uma classe chamada  Interruptor que tem os métodos ligar e desligar, essa classe precisa da classe Lampada, ou seja está diretamente dependente dela. Isso não é bom, caso mudemos de Lampada  para LampadaDeLed, ou algo parecido, teremos que reescrever o código da classe Interruptor.

        Sendo assim, Para desfazer essa dependência é necessário criar uma abstração, como uma interface chamada DispositivoControlavel. Agora Lampada vai implementar essa interface e Interruptor vai chamar essa interface  ao invés de Lampada.

        Assim, caso seja necessário trocar Lampada por outro dispositivo não é preciso alterar a classe Interruptor, pois ele não depende diretamente da Lampada, mas sim de uma abstração.
    */
    public static void main(String[] args) {
        DispositivoControlavel lampada = new Lampada();
        Interruptor interruptor = new Interruptor(lampada);

        interruptor.ligar();

        interruptor.desligar();
    }

    public static interface DispositivoControlavel {
        public void ligar();
        public void desligar();
    }

    public static class Lampada implements DispositivoControlavel {

        @Override
        public void ligar() {
            System.out.println("Lâmpada ligada.");
        }

        @Override
        public void desligar() {
            System.out.println("Lâmpada desligada.");
        }
    }

    public static class Interruptor {
        private DispositivoControlavel dispositivo;

        public Interruptor(DispositivoControlavel dispositivo) {
            this.dispositivo = dispositivo;
        }

        public void ligar() {
            dispositivo.ligar();
        }

        public void desligar() {
            dispositivo.desligar();
        }
    }
}
