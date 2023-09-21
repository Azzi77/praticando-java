package POO;

import com.sun.source.tree.NewArrayTree;

public class TestarCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta ();

        c1.cor = "Azul"; // referencia a atributo
        c1.ponta = 0.5f;
        c1.status();    // referencia a metodo
        c1.tampar();
        c1.rabiscar();

    }
}
