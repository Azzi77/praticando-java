package POO;

public class TestarCaneta2 {

    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
       // c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();    // referencia a metodo
        c1.rabiscar();

    }
}
