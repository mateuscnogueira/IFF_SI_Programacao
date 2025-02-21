package Arquivo.ManipulacaoDataSet_Aula;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeituraArquivoTextoPorLinhaThrows {
	public static void main(String[] args) throws FileNotFoundException, IOException {

		System.out.printf("\nConteúdo do arquivo texto:\n");
		FileReader arquivoTextoLeitura = new FileReader("/Users/aluno/Downloads/AgeDataset-V1.csv");
		BufferedReader leituraBufferizada = new BufferedReader(arquivoTextoLeitura);
		String linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê a primeira linha
		while (linhaLidaDoArquivo != null) {
			//System.out.printf("%s\n", linhaLidaDoArquivo);
			escrever(linhaLidaDoArquivo);
			linhaLidaDoArquivo = leituraBufferizada.readLine(); // lê da segunda até a última linha
		}
		System.out.println("Cópia finalizada.");	
		arquivoTextoLeitura.close();
	}

	public static void escrever(String linhaLidaDoArquivo) throws IOException{
		String nomeDoArquivo = "/Users/aluno/Downloads/AgeDataset-Alterado.csv";
	    FileWriter arquivoTextoEscrita = new FileWriter(nomeDoArquivo, true);
	    
	    arquivoTextoEscrita.write(linhaLidaDoArquivo);
	    arquivoTextoEscrita.flush();
	    arquivoTextoEscrita.close();
	}
}
