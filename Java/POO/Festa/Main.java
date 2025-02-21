package POO.Festa;

public class Main {
    public static void main(String[] args) {
        
        Vip v1 = new Vip(50, 100);
        Normal n1 = new Normal(100);
        CamaroteInferior ci1 = new CamaroteInferior("Inferior", 50, 50, 100);
        CamaroteSuperior cs1 = new CamaroteSuperior(100, 50, 100);

        n1.imprimirIngresso();
        v1.imprimirIngressoVIP();

        ci1.imprimirIngressoCamaroteInferior();
        cs1.imprimirIngressoCamaroteSuperior();

    }
}
