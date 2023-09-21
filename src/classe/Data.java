package classe;

public class Data {

    int mes;
    int ano;
    int dia;
    String obterDataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
