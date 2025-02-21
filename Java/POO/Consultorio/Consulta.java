package POO.Consultorio;

public class Consulta {
    private String data = new String();
    private String hora = new String();
    private Paciente pac;
    private Medico med;

    public void Consulta() {    
    }

    public void agendarConsulta(String data, String hora, Paciente paciente, Medico medico) {
        this.data = data;
        this.hora = hora;
        this.pac = paciente;
        this.med = medico;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPac() {
        return pac;
    }
    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    public Medico getMed() {
        return med;
    }
    public void setMed(Medico med) {
        this.med = med;
    }

    public void Consultar() {
        System.out.println("Consulta em agendamento\n");
    }

    public String mostrarConsulta() {
        return "CONSULTA AGENDADA" + "\nPaciente: " + this.pac.getNome() + "\nMédico: " + this.med.getNome() + "\nData: " + this.data + " às " + this.hora;
    }

}
