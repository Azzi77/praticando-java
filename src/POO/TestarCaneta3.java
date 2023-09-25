package POO;

public class TestarCaneta3 {

    public static void main(String[] args) {
        Caneta3 c1 = new Caneta3 ("Nic", 0.4f, "Amarela");
        c1.status();

        Caneta3 c2 = new Caneta3("Bic", 0.7f, "Rosa");
        c2.status();
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo());*/

    }
}
