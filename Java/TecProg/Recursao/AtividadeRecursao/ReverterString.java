package Recursao.AtividadeRecursao;

public class ReverterString {
    public static void main(String[] args) {
        String original = "mateus";
        String reversa = reverterString(original, original.length() - 1);
        System.out.println("String original: " + original);
        System.out.println("String reversa: " + reversa);
    }

    //função recursiva para reverter a string
    static String reverterString(String string, int indice) {
        if (indice < 0) { //se o índice for menor q 0 n irá retornar nd, pois a string esta vazia
            return "";
        }
        return string.charAt(indice) + reverterString(string, indice - 1);
    }

}
