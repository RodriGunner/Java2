package Dominio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TF1;
	private JTextField TF2;
	private JTextField TF3;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Ventana2 frame = new Ventana2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private JComboBox<String> Combo;
	private JLabel lblVacia1;
	private JLabel lblVacia2;
	
	public Ventana2() {
		setTitle("Promedio");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Combo = new JComboBox<String>();
		Combo.setBounds(100, 183, 131, 20);
		contentPane.add(Combo);
		
		JButton bntCalcular = new JButton("CALCULAR");
		
		

		bntCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a,b,c,i ;
				int d;
				a= Integer.parseInt(TF1.getText());
				b=Integer.parseInt(TF2.getText());
				c=Integer.parseInt(TF3.getText());
				d=a+b+c;
				d=d/3;
				lblVacia1.setText(" "+d);
				if(Combo.getSelectedItem()=="Aprobado") {
					if (a >=6 &&  b >=6 && c >=6 && a < 8 && b <8 && c <8)    
							{ lblVacia2.setText("REGULAR "); }
					
					i=a+b+c;
					if (i>=21 ) {lblVacia2.setText("REGULAR ");}
					if (a<6||b<6||c<6) {lblVacia2.setText("LIBRE");}
					if (a>=8 && b>=8 && c>=8) {
						lblVacia2.setText("PROMOCIONADO");
					}
					
				}
				else { lblVacia2.setText("LIBRE"); } // del 1° if dende pregunto x aprobado
			}
		});
		
		
		bntCalcular.setBounds(315, 84, 89, 23);
		contentPane.add(bntCalcular);
		
		JButton bntNuevo = new JButton("NUEVO");
		bntNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TF1.setText(null);
				TF2.setText(null);
				TF3.setText(null);
				lblVacia1.setText(null);
				lblVacia2.setText(null);

			}
		});
		bntNuevo.setBounds(315, 131, 89, 23);
		contentPane.add(bntNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  System.exit(0);
				  // tengo que buscar uno que cierre el formulario "Ventana2"
			}
		});
		btnSalir.setBounds(315, 182, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblNota = new JLabel("NOTA 1");
		lblNota.setBounds(10, 56, 46, 14);
		contentPane.add(lblNota);
		
		JLabel lblNota2 = new JLabel("NOTA 2");
		lblNota2.setBounds(10, 93, 46, 14);
		contentPane.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("NOTA 3");
		lblNota3.setBounds(10, 131, 46, 14);
		contentPane.add(lblNota3);
		
		TF1 = new JTextField();
		TF1.setBounds(100, 53, 86, 20);
		contentPane.add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.setColumns(10);
		TF2.setBounds(100, 90, 86, 20);
		contentPane.add(TF2);
		
		TF3 = new JTextField();
		TF3.setColumns(10);
		TF3.setBounds(100, 129, 86, 20);
		contentPane.add(TF3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(10, 186, 46, 14);
		contentPane.add(lblTPS);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(10, 248, 89, 14);
		contentPane.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 288, 65, 14);
		contentPane.add(lblCondicion);
		
		lblVacia1 = new JLabel("");
		lblVacia1.setBounds(100, 248, 144, 14);
		contentPane.add(lblVacia1);
		
		lblVacia2 = new JLabel("");
		lblVacia2.setBounds(100, 288, 144, 14);
		contentPane.add(lblVacia2);
		
		Combo.addItem("Aprobado");
		Combo.addItem("Desaprobado");
		
	}
	public void CambiarVisibilidad2(boolean estado) {
		
		setVisible(true);
	}
}
