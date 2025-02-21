package POO.aula3.quest2;
import POO.aula3.*;

public class empregadoTeste {
    public static void main (String[] args) {
        empregado f1 = new empregado("Mateus", "Nogueira", 15000);
        
        System.out.println("Nome: " + f1.getNome() + " " + f1.getSobrenome());
        System.out.println("Salario: " + f1.getSalario());

        System.out.println("Após o reajuste salarial, houve um aumento no salário anual de Mateus");
        System.out.println("Novo salario: " + f1.getNovoSalario());

        empregado f2 = new empregado("Bianca", "Kautscher", 20000);
        
        System.out.println("Nome: " + f2.getNome() + " " + f2.getSobrenome());
        System.out.println("Salario: " + f2.getSalario());

        System.out.println("Após o reajuste salarial, houve um aumento no salário anual de Bianca");
        System.out.println("Novo salario: " + f2.getNovoSalario());
    }
}