//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and Welcome");

        String primerNumero= JOptionPane.showInputDialog("Introduzca el primer entero");
        String segundoNumero= JOptionPane.showInputDialog("Introduzca el segundo entero");

        int numero1= Integer.parseInt(primerNumero);
        int numero2= Integer.parseInt(segundoNumero);
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        int division=numero1/numero2;

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: " +suma+"\nEl resultado de la resta es: "+"\nEl resultado de la mult es: "+multiplicacion+"\nEl resultado de la division es: "+division, "Suma de Enteros",JOptionPane.PLAIN_MESSAGE);
    }
}