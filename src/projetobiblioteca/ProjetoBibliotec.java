package projetobiblioteca;

public class ProjetoBibliotec {
    public static void main(String[] args) {
        Cliente[] c = new Cliente[2];
        Livro[] l = new Livro[3];

        c [0] = new Cliente("Pedro", 22, "M");
        c [1] = new Cliente("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Jose da Silva",300,c[0]);
        l[1] = new Livro("POO Iniciantes", "Pedro Paulo", 500, c[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, c[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();

        System.out.println(l[0].detalhes());

    }
}
