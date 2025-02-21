package POO.aula3.quest1;
import POO.aula3.*;

public class faturaTeste {
    public static void main (String[] args) {
        fatura f1 = new fatura("1", "Bolo", 3, 12);
        
        System.out.println("Número: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Item: " + f1.getQuantidadeItem());
        System.out.println("Preço: " + f1.getPreco());

        System.out.println("Valor total da fatura: " + f1.getTotalFatura());

        f1.setPreco(10);
        System.out.println("\nO preço do bolo mudou. Antes custava R$12, agora custa R$10");
        System.out.println("\nNovo Valor total da fatura: " + f1.getTotalFatura());
    }
}