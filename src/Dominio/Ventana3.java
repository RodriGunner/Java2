package Dominio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TFCantHoras;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblElegir1 = new JLabel("Elija un sistema operativo");
		lblElegir1.setBounds(34, 21, 231, 28);
		lblElegir1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		ButtonGroup grupo1 = new ButtonGroup();
		
		JRadioButton Rwindows = new JRadioButton("Windows ");
		Rwindows.setBounds(279, 77, 109, 23);
		
		JRadioButton Rmac = new JRadioButton("MAC");
		Rmac.setBounds(49, 77, 75, 23);
		
		JRadioButton Rlinux = new JRadioButton("Linux");
		Rlinux.setBounds(142, 77, 109, 23);
		
		grupo1.add(Rwindows);
		grupo1.add(Rmac);
		grupo1.add(Rlinux);
		
		JLabel lblElegir2 = new JLabel("Elija una especialidad");
		lblElegir2.setBounds(34, 120, 231, 28);
		lblElegir2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		JCheckBox checkP = new JCheckBox("Programacion");
		checkP.setBounds(34, 176, 97, 23);
		
		JCheckBox checkA = new JCheckBox("Administracion");
		checkA.setBounds(168, 176, 97, 23);
		
		JCheckBox checkD = new JCheckBox("Dise\u00F1o grafico");
		checkD.setBounds(296, 176, 97, 23);
		
		JLabel lblCantidadDeHoras = new JLabel("Cantidad de horas");
		lblCantidadDeHoras.setBounds(34, 223, 154, 28);
		lblCantidadDeHoras.setFont(new Font("Arial Black", Font.PLAIN, 14));
		
		TFCantHoras = new JTextField();
		TFCantHoras.setBounds(226, 229, 86, 20);
		TFCantHoras.setColumns(10);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = null;
				if (Rmac.isSelected()) {i=" "+Rmac.getText();}
				if (Rlinux.isSelected()) {i=" "+" "+Rlinux.getText();}
				if (Rwindows.isSelected()) {i=" "+" "+Rwindows.getText();}
				if (checkA.isSelected()) {i=" "+i+" "+checkA.getText();}
				if (checkD.isSelected()) {i=" "+i+" "+checkD.getText();}
				if (checkP.isSelected()) {i=" "+i+" "+checkP.getText();}
				i=i+" "+TFCantHoras.getText()+" Hrs";
				JOptionPane.showMessageDialog(null,i);
			}
		});
		btnAceptar.setBounds(142, 276, 89, 23);
		contentPane.setLayout(null);
		contentPane.add(lblElegir1);
		contentPane.add(Rwindows);
		contentPane.add(Rmac);
		contentPane.add(Rlinux);
		contentPane.add(lblElegir2);
		contentPane.add(checkP);
		contentPane.add(checkA);
		contentPane.add(checkD);
		contentPane.add(lblCantidadDeHoras);
		contentPane.add(TFCantHoras);
		contentPane.add(btnAceptar);
	}
	public void CambiarVisibilidad12(boolean estado) {
		
		setVisible(true);
	}
}
