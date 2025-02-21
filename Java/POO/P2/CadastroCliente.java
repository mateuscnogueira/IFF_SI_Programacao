package POO.P2;

import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> cadastroC;

    public String imprimirCadastro(Cliente cliente) {
        // Implementação da impressão do cadastro de cliente
        return "Detalhes do cliente: " + cliente.getNome();
    }
}
