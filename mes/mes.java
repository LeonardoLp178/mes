import javax.swing.JOptionPane;
public class month{
    public static void main (String[]args){
        String numero1 = JOptionPane.showImputDialog("choose number of month");
        int numero = Integer.parseInt(numero1);
        switch(numero){
            case 12:
            case 1:
            case 2:
                JOptionPane.showMessageDialog(null,"winter");
                break;
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null,"spring");
                break;
            case 6:
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null,"summer");
                break;
            case 9:
            case 10:
            case 11:
               JOptionPane.showMessageDialog(null,"autumn");
                break;
            default:
                JOptionPane.showMessageDialog(null,"invalid month");
        }
    }
}