
package calculo;
import javax.swing.JOptionPane;
public class Calculo {

    public static void main(String[] args) {
        String numberOne =
        JOptionPane.showInputDialog("Digite o primeiro numero para calcularmos");
        String numberTwo =
        JOptionPane.showInputDialog("Digite o segundo numero");
        int n1 = Integer.parseInt(numberOne);
        int n2 = Integer.parseInt(numberOne);
        int result = 0;
        
        
        for (int i = 0; i < 2; i++){
            
        String opera =
        JOptionPane.showInputDialog("Escolha qual operacao utilizaremos(Mais, Menos,Multiplicacao e Divisao");   
        
        if(opera.equals ("Mais")){
            result = n1+n2;
            i = 2;
        }else{
            if(opera.equals ("Menos")){
                result = n1-n2;
                i = 2;
            }else{
                if (opera.equals ("Multiplicacao")){
                    result = n1*n2;
                    i = 2;
            }else{
                    if (opera.equals ("Divisao")){
                        result = n1/n2;
                        i = 2;
                    }else{
                        JOptionPane.showMessageDialog(null,"Operaçãi invalida");
                        i = 0;
                    }
                }
            }
        }
        }
        JOptionPane.showMessageDialog(null,"O resultado: " + result );
    
    }
}
