import java.util.Scanner;

public class QuestCinema {

    public static void main(String[] args) {
        //Declaração de variáveis
        //Recebe a contagem
        int contador;
        //Recebe a idade
        int idade;
        //Recebe a nota (A, B, C, D ou E)
        String nota;
        //Receberão a quantidade de notas para cada letra
        int a_quant, b_quant, c_quant, d_quant, e_quant;
        //Receberão a média de idade para cada nota
        float a_med, b_med, c_med, d_med, e_med;
        //Receberão a porcentagem de cada nota
        float a_pct, b_pct, c_pct, d_pct, e_pct;
        
        //Inicia o contador em 1 (Primeiro a responder)
        contador = 1;
        
        //Inicia em 0 a quantidade de notas
        a_quant = 0;
        b_quant = 0;
        c_quant = 0;
        d_quant = 0;
        e_quant = 0;
        
        //Inicia em 0 as médias
        a_med = 0;
        b_med = 0;
        c_med = 0;
        d_med = 0;
        e_med = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        while(contador<=40){
            System.out.println("Agradecemos sua presença! Por favor, ajude-nos avaliando o filme que acabou de assistir.");
            System.out.println("Digite sua idade:");
            idade = leitor.nextInt();
            System.out.println("Dê uma nota, de A a E, para o filme (sendo: A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo):");
            nota = leitor.next();
            if(!nota.equals("A") && !nota.equals("B") && !nota.equals("C") && !nota.equals("D") && !nota.equals("E")){
                System.out.println("Entrada Inválida. Digite uma nota de A a E (sendo: A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo).");
                nota = leitor.next();
            }
            System.out.println("Agradecemos por sua participação.");
            System.out.println();
            contador++;
            
            //Se a nota for A
            if(nota.equals("A")){
                //Incrementa em 1 a quantidade dessa nota
                a_quant++;
                //soma e acumula a idade
                a_med = a_med + idade;
            }
            //Se a nota for B
            else if(nota.equals("B")){
                //Incrementa em 1 a quantidade dessa nota
                b_quant++;
                //soma e acumula a idade
                b_med = b_med + idade;
            }
            //Se a nota for C
            else if(nota.equals("C")){
                //Incrementa em 1 a quantidade dessa nota
                c_quant++;
                //soma e acumula a idade
                c_med = c_med + idade;
            }
            //Se a nota for D
            else if(nota.equals("D")){
                //Incrementa em 1 a quantidade dessa nota
                d_quant++;
                //soma e acumula a idade
                d_med = d_med + idade;
            }
            //Se a nota for E
            else if(nota.equals("E")){
                //Incrementa em 1 a quantidade dessa nota
                e_quant++;
                //soma e acumula a idade
                e_med = e_med + idade;
            }
        }
        
        //Média de idade para a nota A
        a_med = a_med/a_quant;
        //Porcentagem de notas A
        a_pct = (float) a_quant/40*100;
        
        //Média de idade para a nota B
        b_med = b_med/b_quant;
        //Porcentagem de notas B
        b_pct = (float) b_quant/40*100;
        
        //Média de idade para a nota C
        c_med = c_med/c_quant;
        //Porcentagem de notas C
        c_pct = (float) c_quant/40*100;
        
        //Média de idade para a nota D
        d_med = d_med/d_quant;
        //Porcentagem de notas D
        d_pct = (float) d_quant/40*100;
        
        //Média de idade para a nota E
        e_med = e_med/e_quant;
        //Porcentagem de notas E
        e_pct = (float) e_quant/40*100;
        
        System.out.println();
        System.out.println("Questionário finalizado. Mostrando resultados...");
        System.out.println();
        System.out.println("RESULTADOS DA PESQUISA:");
        System.out.println();
        System.out.println("Total de avaliações: 40");
        System.out.println();
        System.out.println("A - Ótimo:");
        System.out.println("Total de avaliações com essa nota: " + a_quant);
        System.out.println("Média de idade: " + a_med + " anos");
        System.out.println("Porcentagem: " + a_pct + " %");
        System.out.println();
        System.out.println("B - Bom:");
        System.out.println("Total de avaliações com essa nota: " + b_quant);
        System.out.println("Média de idade: " + b_med + " anos");
        System.out.println("Porcentagem: " + b_pct + " %");
        System.out.println();
        System.out.println("C - Regular:");
        System.out.println("Total de avaliações com essa nota: " + c_quant);
        System.out.println("Média de idade: " + c_med + " anos");
        System.out.println("Porcentagem: " + c_pct + " %");
        System.out.println();
        System.out.println("D - Ruim:");
        System.out.println("Total de avaliações com essa nota: " + d_quant);
        System.out.println("Média de idade: " + d_med + " anos");
        System.out.println("Porcentagem: " + d_pct + " %");
        System.out.println();
        System.out.println("E - Péssimo:");
        System.out.println("Total de avaliações com essa nota: " + e_quant);
        System.out.println("Média de idade: " + e_med + " anos");
        System.out.println("Porcentagem: " + e_pct + " %");
        System.out.println();
        System.out.println("FIM DOS RESULTADOS.");
        System.out.println();  
    }
}