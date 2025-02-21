package P2_TP;

import java.io.IOException;

public class ProgramaPersonalidades {
    /* TESTES
    public static void main(String[] args) {
        ColecaoDePersonalidades colecao = new ListaPersonalidades();
        
        Personalidade p1 = new Personalidade("Gisa", 1878, null, null, null, null, null, 0, 0);
        Personalidade p2 = new Personalidade("JR", 1871, null, null, null, null, null, 0, 0);
        Personalidade p3 = new Personalidade("Mat", 2002, null, null, null, null, null, 0, 0);
        Personalidade p4 = new Personalidade("PV", 2014, null, null, null, null, null, 0, 0);
        Personalidade p5 = new Personalidade("Bibs", 2004, null, null, null, null, null, 0, 0);
        
        colecao.adicionarPersonalidade(p1);
        colecao.adicionarPersonalidade(p2);
        colecao.adicionarPersonalidade(p3);
        colecao.adicionarPersonalidade(p4);
        colecao.adicionarPersonalidade(p5);
        
        //Ordenador ordenadorNome = new OrdenarPorNomeComBoubbleSort();
        //ordenadorNome.ordenar(colecao);
        //listar(colecao, "Vetor");
        
        Ordenador ordenadorAno = new OrdenarPorAnoComQuickSort();
        ordenadorAno.ordenar(colecao);
        listar(colecao, "Lista");
        
        /*
        System.out.println("Lista de personalidades após a adição:");
        listar(colecao, "Lista");
        
        colecao.excluirPersonalidade("Bibs");
        System.out.println("\nLista de personalidades após excluir 'Bibs':");
        listar(colecao, "Lista");
        
        System.out.println("\nA personalidade da posição pedida é: " + colecao.obterPersonalidade(2).obterNome());
        System.out.println("\nO total de Personalidades na Lista Encadeada é de: " + colecao.totalDePersonalidades());
        
        colecao.trocarPosicaoEntrePersonalidades(0, 1);
        System.out.println("\nLista de personalidades após trocar Gisa com JR:");
        listar(colecao, "Lista");
        
        System.out.println("\nLista de personalidades após alterar uma personalidade:");
        Personalidade novoNog = new Personalidade("Mat Nog", 2002, "Estudante do IFF", "Masculino", "Brasil", "Estudante", null, 0, 0);
        colecao.alterarPersonalidade(2, novoNog);
        listar(colecao, "Lista");
        
        ast/
        
        // Ordenar as personalidades pelo nome (usando BubbleSort)
        // colecao.ordenarPorNome();
        // System.out.println("\nLista de personalidades após ordenação por nome:");
        // listar(colecao);
        
        // Ordenar as personalidades pelo ano de nascimento (usando QuickSort)
        // colecao.ordenarPorAnoDeNascimento();
        // System.out.println("\nLista de personalidades após ordenação por ano de nascimento:");
        // listar(colecao);
        
    }
    */
    
    
// -------/-------
    

/* Manipulação do Dataset
*/
    public static void main(String[] args) throws IOException {
        ColecaoDePersonalidades colecaoLista = new ListaPersonalidades();
        ColecaoDePersonalidades colecaoVetor = new VetorPersonalidades(101);
    

        System.out.println("Lendo personalidades do arquivo CSV...");
        // Ler personalidades do arquivo CSV e adicionar à coleção
        ManipulaDataset.lerDoArquivoCsv(colecaoLista, 100);
        // ordenacao da lista demorou
        // 10000 ordenou em menos de 30s
        // 100000 leitura concluida em 1min e pouco. Já a ordenação cancelei com 5min 12s total, não apresentou.
    
        System.out.println("\nLeitura concluída. Total de personalidades lidas: " + colecaoLista.totalDePersonalidades());
    
    
        Personalidade nova = new Personalidade("Mat Nog", 2002, "Estudante do IFF", "Masculino", "Brasil", "Estudante", "To vivo", 9999, 9999);
        colecaoLista.adicionarPersonalidade(nova);
    
        colecaoLista.excluirPersonalidade("Jean-Philippe Rameau");
    
        //colecao.trocarPosicaoEntrePersonalidades(99, 100);
    
        Personalidade novo2 = new Personalidade("Bibs Kaut", 2004, "Estudante da FMC", "Feminino", "Brasil", "Médica", "Vivona", 9999, 9999);
        //colecao.alterarPersonalidade(98, novo2);


        Ordenador ordenadorNome = new OrdenarPorNomeComBoubbleSort();
        colecaoLista.ordenarPersonalidade(ordenadorNome);
    
        //Ordenador ordenadorAno = new OrdenarPorAnoComQuickSort();
        //ordenadorAno.ordenar(colecaoVetor);
    
        // Listar personalidades para verificar a leitura e manipulação
        listar(colecaoLista);
    
        System.out.println("\nEscrevendo personalidades no arquivo CSV...");
        //ManipulaDataset.escreverNoArquivoCsv(colecaoLista);
        System.out.println("\nEscrita no arquivo CSV concluída.");
    
    }

    
    public static void listar(ColecaoDePersonalidades colecao) {
        for(int i = 0; i < colecao.totalDePersonalidades(); i++) {
            Personalidade p = colecao.obterPersonalidade(i);
            System.out.println(p.obterNome() + " - " + p.getDescricao() + " - " + p.getGenero() + " - " + p.getPais() + " - " + p.getProfissao() + " - " + p.getCausaDaMorte() + " - " + p.obterAnoDeNascimento()  + " - " + p.getAnoDaMorte()  + " - " + p.getIdadeDaMorte());
        }
    }
}
