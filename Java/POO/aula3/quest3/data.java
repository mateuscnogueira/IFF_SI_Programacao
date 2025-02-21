package POO.aula3.quest3;

public class data {
    private int dia, mes, ano;

    public int getDia() {
        return this.dia;
    }
    public void setDia(int d) {
        this.dia = d;
    }

    public int getMes() {
        return this.mes;
    }
    public void setMes(int m) {
        this.mes = m;
    }

    public int getAno() {
        return this.ano;
    }
    public void setAno(int a) {
        this.ano = a;
    }

    public String displayData() {
        return this.dia+"/"+this.mes+"/"+this.ano;
    }

    public data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
}
