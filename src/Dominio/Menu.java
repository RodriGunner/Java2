package Dominio;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("Ejercicio 1");
		
		btn1.addActionListener(new Click1());
		
		btn1.setBounds(119, 57, 227, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("Ejercicio 2");
		btn2.setBounds(119, 110, 227, 23);
		contentPane.add(btn2);
		
		btn2.addActionListener(new Click2());
		
		JButton btn3 = new JButton("Ejercicio 3 ");
		btn3.setBounds(119, 159, 227, 23);
		contentPane.add(btn3);
	}
	public void CambiarVisibilidad1(boolean estado) {
		
		setVisible(true);
	}
	
	class Click1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// aca tengo que hacer que habra ventan1 
			Ventana1 nueva = new Ventana1();
			nueva.CambiarVisibilidad(true);
			
			
		}
		
	}
	
	class Click2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			Ventana2 nuevo = new Ventana2();
			nuevo.CambiarVisibilidad2(true);
			
		}
		
		
	}
}
