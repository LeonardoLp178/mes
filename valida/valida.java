import javax.swing.JOptionPane;
import java.util.Scanner;
public class validar{
    private static final Scanner scanner = new Scanner(System.in);
      public static int obtenerNumero(String mensaje){
        int numeroTemporal = 0;
        while(numeroTemporal <=0){
            String numero = JOptionPane.showImputDialog(mensaje);
            numeroTemporal = Integer.parseInt(numero)
        }
        return numeroTemporal;
    }
    public static void main(String[]args){
        int num = obtenerNumero("ingrese un numero");
        JOptionPane.showImputDialog(null,+num);
    }
}