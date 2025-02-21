package POO.Revisao;

public class Principal {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Departamento d1 = new Departamento("Sistemas de Informação");
        Departamento d2 = new Departamento("Engenharia");

        Universidade u1 = new Universidade("IFF", d1);
        Universidade u2 = new Universidade("UFF", d2);

        Pessoa p1 = new Pessoa("Mateus", u1, d1);
        p1.ajustaDataDeNascimento(18, 10, 2002);
        p1.calcularIdade();
        
        Pessoa p2 = new Pessoa("Romilton", u2, d2);
        p2.ajustaDataDeNascimento(11, 8, 2001);
        p2.calcularIdade();

        p1.informarNome();
        p1.informarIdade();
        p1.informarUniversidade();

        p2.informarNome();
        p2.informarIdade();
        p2.informarUniversidade();

        //d1.setNome("Arquitetura");
        //p1.informarUniversidade();
        
    }
}
