package aula011;

public class aula011 {

    public static void main(String[] args) {

       /* Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");

        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Maria");
        a1.setIdade(22);
        a1.setSexo("F");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1111);
        b1.setNome("jubileu");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();


    }
}
