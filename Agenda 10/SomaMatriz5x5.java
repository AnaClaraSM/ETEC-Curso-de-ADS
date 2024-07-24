import javax.swing.JOptionPane;

public class SomaMatriz5x5 {

    public static void main(String[] args) {
        //declaração das matrizes
        int a[][] = new int [5][5];
        int b[][] = new int [5][5];
        int c[][] = new int [5][5];
        int linha, coluna;
        
        //Entrada de dados
        
        //Matriz A
        for(linha = 0; linha < 5; linha++){
            for(coluna = 0; coluna < 5; coluna++){
                a[linha][coluna] =Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento [" + linha + "][" + coluna + "] da matriz A"));
            }//fim do for
        }//fim do for / fim da entrada de dados da Matriz A
        
        //Matriz B
        for(linha = 0; linha < 5; linha++){
            for(coluna = 0; coluna < 5; coluna++){
                b[linha][coluna] =Integer.parseInt(JOptionPane.showInputDialog("Entre com o elemento [" + linha + "][" + coluna + "] da matriz B"));
            }//fim do for
        }//fim do for / fim da entrada de dados da Matriz B
        
        //Cálculo
        for(linha = 0; linha < 5; linha++){
            for(coluna = 0; coluna < 5; coluna++){
                c[linha][coluna] = a[linha][coluna] + b[linha][coluna];
            }//fim do for
        }//fim do for / fim do cálculo Matriz A
        
        //Saída de dados / Matriz C
        for(linha = 0; linha < 5; linha++){
            for(coluna = 0; coluna < 5; coluna++){
                System.out.print("C[" + linha + "][" + coluna + "] = " + c[linha][coluna] + "  ");
            }//fim do for
            System.out.println("");
        }//fim do for / fim do cálculo Matriz C
    }
    
}
