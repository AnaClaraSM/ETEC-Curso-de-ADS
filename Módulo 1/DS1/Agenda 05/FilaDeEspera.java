//Ana Clara Santos Moreira - Turma CNG
//DS I - Agenda 05 - Exercício 1

import javax.swing.JOptionPane;

public class FilaDeEspera {

    public static void main(String[] args) {
        
        //declaração de variáveis
        int idade; // variável para armazenamento da idade
        
        //entrada de dados com conversão de tipos
        idade = Integer.parseInt(JOptionPane.showInputDialog("Atendimento NewInfo. Informe sua idade"));
        
        //processamento
        
        //If-else 1: Se a idade estiver acima de 60 anos
        if (idade >= 60){
            
            //If-else 2: Se a idade estiver acima de 80 anos
            if (idade >= 80){
                JOptionPane.showMessageDialog(null, "Acima de 80 anos. Dirija-se à fila 80+.");
            }
            //Se a idade estiver acima de 60 anos e abaixo de 80 anos
            else {
                JOptionPane.showMessageDialog(null, "Entre 60 e 80 anos. Dirija-se à fila prioritária.");
            }//Fim do If-else 2
        }
        //Se a idade estiver abaixo de 60 anos
        else {
            JOptionPane.showMessageDialog(null, "Abaixo de 60 anos. Dirija-se à fila comum.");
        }//Fim do If-else 1f
    }
}//Fim da classe
