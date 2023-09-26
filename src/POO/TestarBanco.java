package POO;

public class TestarBanco {

    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(001);
        p1.setCliente("Regina");
        p1.abrirConta("CC");


        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setCliente("Maria");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(100);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();


    }
}
