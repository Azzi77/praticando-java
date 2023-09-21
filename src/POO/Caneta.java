package POO;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");

        }
    }

        void tampar () {
            this.tampada = true;
    }

        void destampar () {
        this.tampada = false;


        }

        void status () {
            System.out.println("Uma caneta " + this.cor);
            System.out.println("Esta tampada ? " + this.tampada);

        }
    }


