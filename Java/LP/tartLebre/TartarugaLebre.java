import java.util.Random;

public class TartarugaLebre {
	public static void main(String[] args) {
		Random entradaNumeroAleatorio = new Random();
		int posicaoTartaruga = 1, posicaoLebre = 1, numeroSorteado, posicaoAtualPista;
				
		while (posicaoTartaruga < 70 && posicaoLebre < 70) {
			numeroSorteado = entradaNumeroAleatorio.nextInt(10) + 1;
		    if (numeroSorteado  <= 5)
	        {
	            posicaoTartaruga = posicaoTartaruga + 3;
	        }
	        else
	        {
	            if (numeroSorteado  <= 7)
	            {
	                posicaoTartaruga = posicaoTartaruga - 6;
	            }
	            else
	            {
	                posicaoTartaruga = posicaoTartaruga + 1;
	            }
	        }
	        if (posicaoTartaruga < 1)
	        {
	            posicaoTartaruga = 1;
	        }
	        else
	        {
	            if (posicaoTartaruga > 70)
	            {
	                posicaoTartaruga = 70;
	            }
	        }
	        numeroSorteado = entradaNumeroAleatorio.nextInt(10) + 1;
	        if ((numeroSorteado  >= 3) && (numeroSorteado  <= 4))
	        {
	            posicaoLebre = posicaoLebre + 9;
	        }
	        else
	        {
	            if (numeroSorteado == 5)
	            {
	                posicaoLebre = posicaoLebre - 12;
	            }
	            else
	            {
	                if (numeroSorteado  <= 8)
	                {
	                    posicaoLebre += 1;
	                }
	                else
	                {
	                    posicaoLebre -= 2;
	                }
	            }
	        }
	        if (posicaoLebre < 1)
	        {
	            posicaoLebre = 1;
	        }
	        else
	        {
	            if (posicaoLebre > 70)
	            {
	                posicaoLebre = 70;
	            }
	        }
//	        for (int i = 0; i < 50; ++i) {
	        	System.out.println();
//	        }
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
	        try {
				Thread.sleep(300);
			} 
	        catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
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
