import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaPrincipal  extends JFrame implements ActionListener{
    private Container contenedor;
    private JButton cilindro, esfera, piramide;

    public VentanaPrincipal() {
        inicio();
        setTitle("Figuras");
        setSize(350,160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20,50,80,23);
        cilindro.addActionListener(this);

        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125,50,80,23);
        esfera.addActionListener(this);

        piramide = new JButton();
        piramide.setText("Piramide");
        piramide.setBounds(225,50,80,23);
        piramide.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }

    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == cilindro) {
            VentanaCilindro cilindro = new VentanaCilindro();
            cilindro.setVisible(true);
        }
        if(evento.getSource() == esfera) {
            VentanaEsfera cilindro = new VentanaEsfera();
            cilindro.setVisible(true);
        }
        if(evento.getSource() == piramide) {
            VentanaPiramide cilindro = new VentanaPiramide();
            cilindro.setVisible(true);
        }
    }
}