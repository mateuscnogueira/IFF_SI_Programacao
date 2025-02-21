import java.util.Random;

public class TartarugaLebreFuncao {
	public static void main(String[] args) {
		Random entradaNumeroAleatorio = new Random();
		int posicaoTartaruga = 1, posicaoLebre = 1, numeroSorteado;
				
		while (posicaoTartaruga < 70 && posicaoLebre < 70) {
			numeroSorteado = entradaNumeroAleatorio.nextInt(10) + 1;
		    posicaoTartaruga = posicaoTartaruga + movimentarTartaruga(numeroSorteado);
	        posicaoTartaruga = tratarPosicaoAnimal(posicaoTartaruga);
	        numeroSorteado = entradaNumeroAleatorio.nextInt(10) + 1;
	        posicaoLebre = posicaoLebre + movimentarLebre(numeroSorteado);
	        posicaoLebre = tratarPosicaoAnimal(posicaoLebre);
	        limparTela();
	        imprimirCorrida(posicaoTartaruga, posicaoLebre);
	        aguardarTempo(400);
		}
		imprimirResultado(posicaoTartaruga, posicaoLebre);
	}
	
	static int movimentarTartaruga(int numeroSorteado) {
		if (numeroSorteado  <= 5)
        {
            return 3;
        }
        else
        {
            if (numeroSorteado  <= 7)
            {
                return -6;
            }
            else
            {
                return 1;
            }
        }
	}
	
	static int movimentarLebre(int numeroSorteado) {
		if ((numeroSorteado  >= 3) && (numeroSorteado  <= 4))
        {
            return 9;
        }
        else
        {
            if (numeroSorteado == 5)
            {
                return -12;
            }
            else
            {
                if (numeroSorteado  <= 8)
                {
                   return 1;
                }
                else
                {
                    return -2;
                }
            }
        }
	}
	
	static int tratarPosicaoAnimal(int posicaoAnimal) {
		if (posicaoAnimal < 1)
	    {
	        return 1;
	    }
	    else
	    {
	        if (posicaoAnimal > 70)
	        {
	            return 70;
	        }
	    }
		return posicaoAnimal;
	}
	
	static void limparTela() {
		int i;
		for (i = 0; i < 50; ++i) {
        	System.out.println();
        }
	}
	
	static void imprimirCorrida(int posicaoTartaruga, int posicaoLebre) {
		int posicaoAtualPista;
		for (posicaoAtualPista = 1; posicaoAtualPista <= 70; posicaoAtualPista++)
        {
            if ((posicaoLebre == posicaoAtualPista) && (posicaoTartaruga == posicaoAtualPista))
            {
                System.out.print("Ouch!");
            }
            else
            {
                if (posicaoTartaruga == posicaoAtualPista)
                {
                	System.out.print("T");
                }
                else
                {
                    if (posicaoLebre == posicaoAtualPista)
                    {
                    	System.out.print("L");
                    }
                    else
                    {
                    	System.out.print("-");
                    }
                }

            }
        }
	}
	
	static void aguardarTempo(int tempoEmMilissegundos) {
		try{
			Thread.sleep(tempoEmMilissegundos);
		} 
        catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	static void imprimirResultado(int posicaoTartaruga, int posicaoLebre) {
		if (posicaoLebre > posicaoTartaruga)
	    {
			System.out.println("\n\nA Lebre venceu!");
	    }
	    else
	    {
	        if (posicaoTartaruga > posicaoLebre)
	        {
	        	System.out.println("\n\nA Tartaruga venceu!");
	        }
	        else
	        {
	        	System.out.println("\n\nEmpatou!!!");
	        }
	    }
	}
}
