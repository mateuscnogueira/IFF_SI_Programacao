package ProjetoOO.SOLID;

public class O {
    /*
    Princípio Aberto-Fechado
        "Objetos ou entidades devem ser abertos para extensão, mas fechados para modificações".

        Isso significa que todas as entidades do projeto podem receber adições e novos recursos, mas não podem alterar o código que já foi escrito. Esse princípio  evita que erros sejam criados em métodos e códigos que já existem e que estão funcionando corretamente.
        Sendo assim, em vez de ter somente 1 classe para calcular o desconto, foi criada uma interface e uma classe para cada desconto a ser calculado.
        Assim, caso seja necessário implentar outro calculo de desconto, não será necessário modificar nenhuma entidade, poderá acrescentar outra sem afetar as anteriores.
    */

    public static void main(String[] args) {
        Produto produto1 = new Produto("Chocolate1", 10);
        CalculadorDesconto desconto0 = new SemDesconto();
        desconto0.calcularDesconto(produto1);

        Produto produto2 = new Produto("Chocolate2", 10);
        CalculadorDesconto desconto20 = new DescontoVinte();
        desconto20.calcularDesconto(produto2);

        Produto produto3 = new Produto("Chocolate3", 10);
        CalculadorDesconto desconto50 = new DescontoCinquenta();
        desconto50.calcularDesconto(produto3);

        System.out.println(produto1.getNome() + " - " + produto1.getPreco());
        System.out.println(produto2.getNome() + " - " + produto2.getPreco());
        System.out.println(produto3.getNome() + " - " + produto3.getPreco());
    }

    public static class Produto {
        private String nome = new String();
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }
    } 

    public static interface CalculadorDesconto {
        public double calcularDesconto(Produto produto);
    }

    public static class SemDesconto implements CalculadorDesconto {
        @Override
        public double calcularDesconto(Produto produto) {
            return 0; //Sem desconto
        }
    }

    public static class DescontoVinte implements CalculadorDesconto {
        @Override
        public double calcularDesconto(Produto produto) {
            produto.preco = produto.preco * 0.80; //Desconto de 20%
            return produto.getPreco();
        }
    }

    public static class DescontoCinquenta implements CalculadorDesconto {
        @Override
        public double calcularDesconto(Produto produto) {
            produto.preco = produto.preco * 0.50; //Desconto de 50%
            return produto.getPreco();
        }
    }
}
