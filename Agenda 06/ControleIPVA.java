import javax.swing.JOptionPane;

public class ControleIPVA {

    public static void main(String[] args) {
        
        //Declaração de variáveis
        int numero; //Para armazer o numero final da placa
        
        //Entrada de dados com conversão de tipos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final da placa do veículo."));
        
        //Início do switch-case
        switch (numero) {
            case 1: 
                JOptionPane.showMessageDialog(null,"Final 1: Pagamento até 30/04.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Final 2: Pagamento até 31/05.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Final 3: Pagamento até 30/06.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"Final 4: Pagamento até 31/07.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"Final 5: Pagamento até 31/08.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Final 6: Pagamento até 30/09.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"Final 7: Pagamento até 31/10.");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"Final 8: Pagamento até 30/11.");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"Final 9: Pagamento até 31/12.");
                break;
            case 0:
                JOptionPane.showMessageDialog(null,"Final 0: Pagamento até 31/12.");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Número Inválido.");
                break;
        }//Fim do switch-case
    }//Fim do método main
}//Fim da Classe
