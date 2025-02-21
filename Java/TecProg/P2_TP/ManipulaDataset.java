package P2_TP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulaDataset {

    public static void lerDoArquivoCsv(ColecaoDePersonalidades colecao, int quantidadePersonalidades) throws FileNotFoundException, IOException {
        FileReader arquivoTextoLeitura = null;
        BufferedReader leituraBufferizada = null;
        
        System.out.printf("\nConteúdo do arquivo texto:\n");

        arquivoTextoLeitura = new FileReader("/Users/nog/Downloads/AgeDataset-V1.csv");
        leituraBufferizada = new BufferedReader(arquivoTextoLeitura);
        leituraBufferizada.readLine();

        String linhaLidaDoArquivo = leituraBufferizada.readLine();
        int linha = 0;

        while(linhaLidaDoArquivo != null && linha < quantidadePersonalidades) {
            Personalidade novaPersonalidade = processarLinha(linhaLidaDoArquivo);

            colecao.adicionarPersonalidade(novaPersonalidade);

            linha++;
            linhaLidaDoArquivo = leituraBufferizada.readLine();
        }
        System.out.println();
	    arquivoTextoLeitura.close();		
    }

    private static Personalidade processarLinha(String linha) {
		boolean entreAspas = false;
		
		String[] personalidadeString = new String[] {"","","","","","","","","",""};
		
		int atributoAtual = 0;
		
		//System.out.println(linha);
		
		for(int i = 0; i < linha.length(); i++) {
			
			switch(linha.charAt(i)) {
				case '"':
					entreAspas = !entreAspas;
					break;						
				case ',':
					if(entreAspas) {
						personalidadeString[atributoAtual] += ',';
					}
					else {
						atributoAtual++;
					}
					break;	
					
				default:
					personalidadeString[atributoAtual] += linha.charAt(i);
			}
			
		}
		
        
		if(personalidadeString[6] == "") {
			personalidadeString[6] = "0";
		}
		if(personalidadeString[7] == "") {
			personalidadeString[7] = "0";
		}
		if(personalidadeString[9] == "") {
			personalidadeString[9] = "0";
		}
		
		return new Personalidade(personalidadeString[1], Integer.parseInt(personalidadeString[6]), personalidadeString[2], personalidadeString[3], personalidadeString[4], 
        personalidadeString[5], personalidadeString[8], Integer.parseInt(personalidadeString[7]), Integer.parseInt(personalidadeString[9]));
		
	}

    public static void escreverNoArquivoCsv(ColecaoDePersonalidades colecao) throws IOException{
		
        String nomeDoArquivo = "/Users/nog/Downloads/Personalidades100Teste.csv";
		FileWriter arquivoTextoEscrita = new FileWriter(nomeDoArquivo, true);

		int i = 0;
		while(i < colecao.totalDePersonalidades()) {
			Personalidade personalidade = colecao.obterPersonalidade(i);	
			String linha = "";
            char delimitador = '|';

            if(contemCaractere(personalidade.obterNome(), delimitador)) {
                linha += '"' + personalidade.obterNome() + '"' + delimitador;
            } else {
                linha += personalidade.obterNome() + delimitador;
            }
            
            if(contemCaractere(personalidade.getDescricao(), delimitador)) {
                linha += '"' + personalidade.getDescricao() + '"' + delimitador;
            } else {
                linha += personalidade.getDescricao() + delimitador;
            }
            
            if(contemCaractere(personalidade.getGenero(), delimitador)) {
                linha += '"' + personalidade.getGenero() + '"' + delimitador;
            } else {
                linha += personalidade.getGenero() + delimitador;
            }
            
            if(contemCaractere(personalidade.getPais(), delimitador)) {
                linha += '"' + personalidade.getPais() + '"' + delimitador;
            } else {
                linha += personalidade.getPais() + delimitador;
            }
            
            if(contemCaractere(personalidade.getProfissao(), delimitador)) {
                linha += '"' + personalidade.getProfissao() + '"' + delimitador;
            } else {
                linha += personalidade.getProfissao() + delimitador;
            }
            
            linha += personalidade.obterAnoDeNascimento() + delimitador;

            linha += personalidade.getAnoDaMorte() + delimitador;
            
            if(contemCaractere(personalidade.getCausaDaMorte(), delimitador)) {
                linha += '"' + personalidade.getCausaDaMorte() + '"' + delimitador;
            } else {
                linha += personalidade.getCausaDaMorte() + delimitador;
            }

            linha += personalidade.getIdadeDaMorte() + delimitador;

            //lendo cada atributo de Personalidades, usando getters, para testar se eles possuem o caractere delimitador.
			//se possuir o delimitador, adiciona aspas por volta do atributo.
			//se n, adiciona o atributo diretamente na linha.	
			arquivoTextoEscrita.write(linha + "\n");
			i++;
		}
		
		arquivoTextoEscrita.flush();
	    arquivoTextoEscrita.close();	
	}

    private static boolean contemCaractere(String palavra, char caractere) {    	
    	for(int i = 0; i < palavra.length(); i++) {
    		if(palavra.charAt(i) == caractere) {
    			return true;
    		}
    	}
    	return false;
    }
}


// /Users/nog/Downloads/AgeDataset-V1.csv
