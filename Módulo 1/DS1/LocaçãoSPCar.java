import java.util.Scanner;

public class LocaçãoSPCar {

    public static void main(String[] args) {

        //Declaração das variáveis
        String modelo;
        float valorDiaria;
        int quantDias;
        float quantKm;
        float precoTotal;

        //Inicialização de leitores
        Scanner leitor = new Scanner(System.in);

        // início do programa
        System.out.println("Programa Locação SPCar – Este programa irá calcular o preço a ser pago pela locação de um carro.");
        //Solicitação e leitura dos dados
        System.out.println("Digite o modelo do carro alugado.");
        modelo = leitor.next();
        System.out.println("Digite o valor da diária para locação.");
        valorDiaria = leitor.nextFloat();
        System.out.println("Digite a quantidade de dias de locação.");
        quantDias = leitor.nextInt();
        System.out.println("Digite a quantidade de km percorridos.");
        quantKm = leitor.nextFloat();
        //Processamento - Cálculo
        precoTotal = (float) ((valorDiaria * quantDias) + (quantKm * 0.20));
        //Saída de dados - Resultado
        System.out.println("Dados da Locação: ");
        System.out.println("Modelo: " + modelo + ". Preço Total: " + precoTotal + " reais.");
        //Fim do programa
    }
}