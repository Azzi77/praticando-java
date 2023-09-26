package POO;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean status;

    public void estadoAtual(){

        System.out.println("----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente " + this.getCliente());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
    }

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getCliente() {
        return this.cliente;
    }

    public void setCliente(String c) {
        this.cliente = c;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
            this.setSaldo(50);
        } else if (t.equals("CP")) {
            this.setSaldo(150);

        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {

        if (this.getSaldo() > 0) {
            System.out.println("Conta com saldo, não pode ser fechada");
        } else if (getSaldo() < 0) {
            System.out.println("Conta com saldo negativo, não pode ser fechada");

        } else {
            setStatus(false);
            System.out.println("conta fechada com sucesso");
        }


    }

    public void depositar(float v) {
        if (this.getStatus()) {
            setSaldo(getSaldo() + v);
            System.out.println("Deposito realizado " + this.getCliente());
        } else {
            System.out.println("Conta fechada não é possivel depositar");

        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                setSaldo(getSaldo() - v);

                System.out.println("Saque realizado na conta de " + this.getCliente());
            } else {
                System.out.println("Saldo insuficiente para saque");

            }
        } else {
            System.out.println("Impossivel sacar, conta fechada");

        }

    }

    public void tarifaConta() {
        int v = 0;

        if (this.getTipo().equals("CC")) {
            v = 12;
        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }

            if (this.getStatus()) {
                this.setSaldo(this.getSaldo() - v);

                System.out.println("Mensalidade paga com sucesso por " + this.getCliente());
            } else{
                System.out.println("Impossivel pagar tarifa de conta fechada");


        }

    }

    }


