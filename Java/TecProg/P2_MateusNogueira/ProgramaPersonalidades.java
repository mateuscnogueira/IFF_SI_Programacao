package P2_MateusNogueira;

import java.io.IOException;

public class ProgramaPersonalidades {
    /*
    public static void main(String[] args) {
        ColecaoDePersonalidades vetor = new VetorPersonalidades(5);

        Personalidade p1 = new Personalidade("Mat", 2002, null, null, null, null, null, 0, 0);
        Personalidade p2 = new Personalidade("JR", 2014, null, null, null, null, null, 0, 0);
        Personalidade p3 = new Personalidade("Gi", 1971, null, null, null, null, null, 0, 0);
        Personalidade p4 = new Personalidade("PV", 1978, null, null, null, null, null, 0, 0);
        Personalidade p5 = new Personalidade("Bibs", 2004, null, null, null, null, null, 0, 0);

        vetor.adicionarPersonalidade(p1);
        vetor.adicionarPersonalidade(p2);
        vetor.adicionarPersonalidade(p3);
        vetor.adicionarPersonalidade(p4);
        vetor.adicionarPersonalidade(p5);

        // Listar todas as personalidades
        System.out.println("Lista de personalidades após a adição:");
        listar(vetor);

        // Excluir uma personalidade
        vetor.excluirPersonalidade("Gi");
        System.out.println("\nLista de personalidades após excluir 'Gi':");
        listar(vetor);

        // Alterar a posição de duas personalidades
        vetor.trocarPosicaoEntrePersonalidades(0, 3);
        System.out.println("\nLista de personalidades após trocar Mat com PV:");
        listar(vetor);

        // Alterar uma personalidade
        Personalidade novoMat = new Personalidade("Nog", 2020, null, null, null, null, null, 0, 0);
        vetor.alterarPersonalidade(3, novoMat);
        System.out.println("\nLista de personalidades após modificar os dados de Mat:");
        listar(vetor);
    
    }
     */
    public static void main(String[] args) throws IOException {
        // Criar uma coleção de personalidades usando VetorDePersonalidades
        ColecaoDePersonalidades colecao = new VetorPersonalidades(101);

        System.out.println("Lendo personalidades do arquivo CSV...");
        // Ler personalidades do arquivo CSV e adicionar à coleção
        ManipulaDataset.lerDoArquivoCsv(colecao, 100);

        System.out.println("\nLeitura concluída. Total de personalidades lidas: " + colecao.totalDePersonalidades());
        
        
        Personalidade nova = new Personalidade("Mat", 2002, "Estudante do IFF", "Masculino", "Brasil", "Estudante", "To vivo", 9999, 9999);
        colecao.adicionarPersonalidade(nova);
        
        colecao.excluirPersonalidade("Jean-Philippe Rameau");
        
        colecao.trocarPosicaoEntrePersonalidades(98, 99);
        
        Personalidade novo2 = new Personalidade("Bianca", 2004, "Estudante da FMC", "Feminino", "Brasil", "Médica", "Vivona", 9999, 9999);
        colecao.alterarPersonalidade(97, novo2);
        
        // Listar personalidades para verificar a leitura e manipulação
        listar(colecao);
        System.out.println("\nEscrevendo personalidades no arquivo CSV...");
        // Escrever as personalidades no arquivo CSV de saída
        ManipulaDataset.escreverNoArquivoCsv(colecao);
        System.out.println("\nEscrita no arquivo CSV concluída.");
    }
    
    

    public static void listar(ColecaoDePersonalidades colecao) {
        for(int i = 0; i < colecao.totalDePersonalidades(); i++) {
            Personalidade p = colecao.obterPersonalidade(i);
            System.out.println(p.obterNome() + " - " + p.getDescricao() + " - " + p.getGenero() + " - " + p.getPais() + " - " + p.getProfissao() + " - " + p.getCausaDaMorte() + " - " + p.obterAnoDeNascimento()  + " - " + p.getAnoDaMorte()  + " - " + p.getIdadeDaMorte());
        }
    }
}
