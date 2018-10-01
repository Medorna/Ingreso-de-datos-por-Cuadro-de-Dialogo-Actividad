import javax.swing.JOptionPane;

public class IngresoDialogo {

    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Ejercicio Casting!!! ");
        
        String numero1 = JOptionPane.showInputDialog("Ingrese primer numero");
        String numero2 = JOptionPane.showInputDialog("Ingrese segundo numero");
        
        float num1 = Float.parseFloat(numero1);
        float num2 = Float.parseFloat(numero2);
        
        
        JOptionPane.showMessageDialog(null, "Elija operación");
        
        String opcion = JOptionPane.showInputDialog(" \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. Divición \n 5. Resto");
        
        byte operacion = Byte.parseByte(opcion);
        float resultado;
        
        switch (operacion) {
        
            case 1: resultado = num1 + num2;
                
            JOptionPane.showMessageDialog(null, resultado);
            
            break;
                
            case 2: resultado = num1 - num2;
            
            JOptionPane.showMessageDialog(null, resultado);

            break;

            case 3: resultado = num1 * num2;
            
            JOptionPane.showMessageDialog(null, resultado);

            break;

            case 4: resultado = num1 / num2;
            
            JOptionPane.showMessageDialog(null, resultado);

            break;
                
            case 5: resultado = num1 % num2;
            
            JOptionPane.showMessageDialog(null, resultado);

            break;
            
            
        }
        
        
    }
    
}
