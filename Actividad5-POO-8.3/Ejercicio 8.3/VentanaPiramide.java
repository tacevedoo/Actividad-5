import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPiramide extends JFrame implements ActionListener{
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(280,210);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel();
        base.setText("Base (cms): ");
        base.setBounds(20,20,135,23);
        campoBase = new JTextField();
        campoBase.setBounds(120,20,135,23);

        altura = new JLabel();
        altura.setText("Altura (cms): ");
        altura.setBounds(20,50,135,23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120,50,135,23);

        apotema = new JLabel();
        apotema.setText("Apotema (cms): ");
        apotema.setBounds(20,80,135,23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120,80,135,23);

        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120,110,135,23);
        calcular.addActionListener(this);

        volumen = new JLabel();
        volumen.setText("Volumen (cm3): ");
        volumen.setBounds(20,140,135,23);

        superficie = new JLabel();
        superficie.setText("Superficie (cm2): ");
        superficie.setBounds(20,170,135,23);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == calcular){
            boolean error = false;
            double base = 0;
            double altura = 0;
            double apotema = 0;

            try {
                base = Double.parseDouble(campoBase.getText());
                altura = Double.parseDouble(campoAltura.getText());
                apotema = Double.parseDouble(campoApotema.getText());
                Piramide piramide = new Piramide(base, altura, apotema);

                volumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.CalcularVolumen()));
                superficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.CalcularSuperficie()));
            }catch(Exception e) {
                error = true;
            }finally {
                if(error) {
                    JOptionPane.showMessageDialog(null, "Campo nulo o error en formato", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}