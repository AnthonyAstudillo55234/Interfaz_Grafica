import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JLabel nombreLbl;
    private JButton sumarButton;
    private JTextField num1;
    private JButton multiplicarButton;
    private JTextField num2;
    private JButton restarButton;
    private JButton dividirButton;


    public form1() {
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 + numero2;
                nombreLbl.setText(String.valueOf("Resultado: "+resultado));
            }
        });
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 * numero2;
                nombreLbl.setText(String.valueOf("Resultado: "+resultado));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 - numero2;
                nombreLbl.setText(String.valueOf("Resultado: "+resultado));
            }
        });
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float numero1 = Float.parseFloat(num1.getText());
                float numero2 = Float.parseFloat(num2.getText());
                float resultado = numero1 / numero2;
                if (numero2==0){
                    nombreLbl.setText(String.valueOf("Resultado: no se puede dividir para 0"));
                }else {
                    nombreLbl.setText(String.valueOf("Resultado: "+resultado));
                }
            }
        });
    }
}


