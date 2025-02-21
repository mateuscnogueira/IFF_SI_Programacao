package Arquivo.P2_TP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*

public class ManipulaDataset {

    // Função para ler o arquivo CSV usando ',' como delimitador
    public void lerDoArquivoCsv(ColecaoDePersonalidades colecao) {
        String caminhoArquivo = "/Users/nog/Downloads/AgeDataset-V1.csv";
        try (BufferedReader leituraBufferizada = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            leituraBufferizada.readLine(); // Lê a primeira linha (cabeçalho) sem armazenar

            while ((linha = leituraBufferizada.readLine()) != null) {
                // Processa a linha e adiciona à coleção
                processarLinhaCsv(linha, colecao);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo CSV: " + e.getMessage());
        }
    }

    // Função para processar uma linha do CSV
    private void processarLinhaCsv(String linha, ColecaoDePersonalidades colecao) {
        String[] colunas = parseLinhaCsv(linha);
    
        // Verifique se há o número esperado de colunas
        if (colunas.length >= 9) { // Deve haver pelo menos 9 colunas
            try {
                // Extraindo os valores de cada coluna
                String nome = (colunas[0] != null) ? colunas[0].trim() : "";
                int anoDeNascimento = converterParaInt(colunas[5]); // Ano de Nascimento
                String descricao = (colunas[1] != null) ? colunas[1].trim() : "";
                String genero = (colunas[2] != null) ? colunas[2].trim() : "";
                String pais = (colunas[3] != null) ? colunas[3].trim() : "";
                String profissao = (colunas[4] != null) ? colunas[4].trim() : "";
                String causaDaMorte = (colunas[6] != null)   colunas[6].trim() : ""; // Lê a Causa da Morte
                int anoDaMorte = converterParaInt(colunas[7]); // Ano da Morte
                int idadeDaMorte = (colunas.length > 9) ? converterParaInt(colunas[8]) : 0; // Lê a Idade da Morte
    
                // Cria uma nova Personalidade com os dados lidos
                Personalidade p = new Personalidade(nome, anoDeNascimento, descricao, genero, pais, profissao, causaDaMorte, anoDaMorte, idadeDaMorte);
    
                // Adiciona a personalidade na coleção
                colecao.adicionarPersonalidade(p);
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter número em: " + linha);
            }
        } else {
            System.out.println("Linha inválida: " + linha);
        }
    }
    
    
    

    // Método para analisar uma linha CSV com suporte a vírgulas dentro de aspas
    private String[] parseLinhaCsv(String linha) {
        String[] colunas = new String[9]; // O número de colunas esperado
        int indiceColuna = 0;
        String colunaAtual = "";
        boolean dentroDeAspas = false;

        for (int i = 0; i < linha.length(); i++) {
            char c = linha.charAt(i);
            if (c == '\"') {
                dentroDeAspas = !dentroDeAspas; // Alterna o estado de dentroDeAspas
            } else if (c == ',' && !dentroDeAspas) { // Mude para ',' como delimitador
                if (indiceColuna < colunas.length) {
                    colunas[indiceColuna] = colunaAtual.trim(); // Adiciona a coluna atual
                    colunaAtual = ""; // Limpa a coluna atual
                    indiceColuna++;
                }
            } else {
                colunaAtual += c; // Adiciona o caractere à coluna atual
            }
        }

        // Adiciona a última coluna, se houver
        if (indiceColuna < colunas.length) {
            colunas[indiceColuna] = colunaAtual.trim();
        }

        return colunas;
    }

    // Função auxiliar para converter string em int ou retornar 0
    private int converterParaInt(String valor) {
        if (valor == null || valor.length() == 0) {
            return 0; // Se a string estiver vazia ou for null, retorna 0
        }

        // Inicializa o resultado
        int resultado = 0;
        boolean negativo = false;

        // Verifica se o valor é negativo
        int inicio = 0;
        if (valor.charAt(0) == '-') {
            negativo = true;
            inicio = 1; // Começa a leitura após o sinal de negativo
        }

        // Converte cada caractere para inteiro
        for (int i = inicio; i < valor.length(); i++) {
            char c = valor.charAt(i);
            if (c >= '0' && c <= '9') { // Verifica se é um dígito
                resultado = resultado * 10 + (c - '0'); // Converte o caractere para dígito
            } else {
                // Se encontrar um caractere inválido, retorna 0
                return 0;
            }
        }

        if (negativo) {
            return -resultado; // Retorna o resultado negativo
        } else {
            return resultado; // Retorna o resultado positivo
        }
    }

    // Função para escreverNoArquivoCsv as personalidades em um arquivo CSV usando ',' como delimitador
    public void escreverNoArquivoCsvNoArquivoCsv(ColecaoDePersonalidades colecao) {
        String caminhoArquivo = "/Users/nog/Downloads/PersonalidadesSaida2.csv";
        try (BufferedWriter bufferDeEscrita = new BufferedWriter(new FileWriter(caminhoArquivo, false));
             PrintWriter fluxoDeSaidaFormatado = new PrintWriter(bufferDeEscrita)) {

            // escreverNoArquivoCsv o cabeçalho
            fluxoDeSaidaFormatado.println("ID|Nome|Descricao|Genero|Pais|Profissao|AnoDeNascimento|AnoDaMorte|IdadeDaMorte");

            // escreverNoArquivoCsv os dados das personalidades
            for (int i = 0; i < colecao.totalDePersonalidades(); i++) {
                Personalidade p = colecao.obterPersonalidade(i);
                fluxoDeSaidaFormatado.printf("%s|%s|%s|%s|%s|%s|%d|%d|%d%n",
                    "ID", // Se houver uma coluna ID, você pode extrair isso também
                    p.obterNome(),
                    p.getDescricao(),
                    p.getGenero(),
                    p.getPais(),
                    p.getProfissao(),
                    p.obterAnoDeNascimento(),
                    p.getAnoDaMorte(),
                    p.getIdadeDaMorte()
                );
            }
            fluxoDeSaidaFormatado.flush();
        } catch (IOException e) {
            System.out.println("Erro ao escreverNoArquivoCsv no arquivo CSV: " + e.getMessage());
        }
    }
}
 */
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
		
		/*for(int i = 0; i < personalidadeString.length; i++) {
			System.out.println(personalidadeString[i]);			
		}*/
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
