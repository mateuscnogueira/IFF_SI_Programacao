package POO.P2;

import java.util.ArrayList;

class CadastroConteudo {
    private ArrayList<Conteudo> cadastroc;

    public String imprimirCadastro(Conteudo conteudo) {
        // Implementação da impressão do cadastro de conteúdo
        return "Detalhes do conteúdo: " + conteudo.getTitulo();
    }
}
