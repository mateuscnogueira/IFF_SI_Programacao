public class test {

  public static void main(String[] args) {
    int vetor[] = {1, 2, 3, 4, 5, 6};
    int i;

    for(i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();

    inverterVetor(vetor, 0, 5);

    for(i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println();

    System.out.println("O vetor possui " + contarPares(vetor, 0) + " números pares");
    System.out.println("A soma desses números pares é: " + somarPares(vetor, 0));

    System.out.println("A soma de todos os elementos do vetor e: " + somarElementosVetor(vetor, 0));

  }

  public static void inverterVetor(int vetor[], int inicio, int fim) {
    int auxiliar;

    if(inicio < fim) {
      auxiliar = vetor[inicio];
      vetor[inicio] = vetor[fim];
      vetor[fim] = auxiliar;

      inverterVetor(vetor, inicio + 1, fim - 1);
    }
  }

  public static int contarPares(int vetor[], int indice) {
    int conta = 0;

    if(indice < vetor.length) {
      if(vetor[indice] %2 == 0) {
        conta++;
      }
      return conta + contarPares(vetor, indice + 1);
    }
    return 0;
  }

  public static int somarPares(int vetor[], int indice) {
    int soma = 0;

    if(indice < vetor.length) {
      if(vetor[indice] %2 == 0) {
        soma = soma + vetor[indice];
      }
      return soma + somarPares(vetor, indice + 1);
    }
    return 0;
  }

  public static int somarElementosVetor(int vetor[], int indice) {
    int soma = 0;

    if(indice < vetor.length) {
      soma = soma + vetor[indice];
      return soma + somarElementosVetor(vetor, indice + 1);
    }
    return 0;
  }
}