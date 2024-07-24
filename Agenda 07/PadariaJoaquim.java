import java.util.Scanner;
public class PadariaJoaquim {

    public static void main(String[] args) {
        
        //Declaração das variáveis
        String nome; //do produto
        double preco; //do produto
        double precoNovo; //preço com desconto
        
        //Utilização do Scanner
        Scanner ler = new Scanner(System.in);
        
        //laço de repetição para os 10 produtos
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("Digite o nome do produto " + i + ":");
            nome = ler.next(); //usuário irá digitar o nome e este comando irá ler e armazenar na variável.
            System.out.println("Digite o preço do produto " + i + ":");
            preco = ler.nextDouble();
            
            //Cálculo do novo preço, com desconto de 50%.
            precoNovo = preco - (preco * 0.5);
            
            //Apresentação do resultado
            System.out.println();
            System.out.println("Produto " + i + ": " + nome + " >>> " + "Preço: " + precoNovo + " reais");
            System.out.println("--------------------------------------------------------");
            System.out.println();
        }//Fim do for
    }
}
