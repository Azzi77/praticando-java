package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();

        d1.dia = 30;
        d1.mes = 11;
        d1.ano = 1977;

        System.out.println(d1.obterDataFormatada());


    }
}
