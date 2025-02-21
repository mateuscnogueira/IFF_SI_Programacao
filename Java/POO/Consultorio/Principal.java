package POO.Consultorio;

public class Principal {
    public static void main(String[] args) {
        Especialidade e1 = new Especialidade("Cardiologista");
        Medico m1 = new Medico("Mateus Nogueira", "008", e1);
        Paciente p1 = new Paciente("Bianca Kautscher", "0901", "09/01/2004");

        Consulta c1 = new Consulta();
        c1.Consultar();
        c1.agendarConsulta("20/12/2023", "22:00", p1, m1);
        System.out.println(c1.mostrarConsulta());
    }
}
