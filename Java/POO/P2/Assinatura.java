package POO.P2;

import java.util.Scanner;

public class Assinatura {
    private String plano = new String();
    private String data = new String();
    private double preco;
    private Cliente cliente;

    public Assinatura(String plano,  String data, double preco, Cliente cliente) {
        this.plano = plano;
        this.data = data;
        this.preco = preco;
        this.cliente = cliente;
    }

    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String cadastrarPlano(Cliente cliente) {
        Scanner leitor = new Scanner(System.in);
        int num;

        System.out.println("\n\n***PLANOS DISPONÍVEIS***");
        System.out.println("1 - Plan Basic");
        System.out.println("2 - Plan Silver");
        System.out.println("3 - Plan Gold");

        System.out.print("Insira o número do plano que deseja adquirir: ");
        num = leitor.nextInt();

        if(num == 1) {
            return this.plano = "Basic";
        } else {
            if(num == 2) {
                return this.plano = "Silver";
            } else {
                return this.plano = "Gold";
            }
        }
    }

    public double calcularPreco() {
        if(plano == "Basic") {
            return preco = 20.00;
        } else {
            if(plano == "Silver") {
                return preco = 30.00;
            } else {
                return preco = 40.00;
            }
        }
    }

    public void pagarPlano() {
        System.out.println("Pagamento do plano " + this.plano + "\nCliente: " + getCliente().nome + 
        "\nPreço: " + this.preco + " \n\nProcessando pagamento..." + "\n\nPagamento Efetuado");
    }
}
