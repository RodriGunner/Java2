package Dominio;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Ventana1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTextField txtApellido;
	private static JTextField txtNombre;
	private static JTextField txtTelefono;
	private static JTextField txtFNac;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			@Override
//			public void run() {
//				try {
//					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setTitle("CONTACTOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(70, 229, 275, 23);
		contentPane.add(btnAceptar);
		
		
		
		txtApellido = new JTextField();
		txtApellido.setBounds(132, 87, 241, 23);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(132, 42, 241, 23);
		contentPane.add(txtNombre);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(132, 136, 241, 23);
		contentPane.add(txtTelefono);
		
		txtFNac = new JTextField();
		txtFNac.setColumns(10);
		txtFNac.setBounds(132, 175, 241, 23);
		contentPane.add(txtFNac);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(27, 51, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(27, 96, 46, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(27, 145, 46, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setBounds(27, 184, 105, 14);
		contentPane.add(lblFechaNacimiento);
		
		btnAceptar.addActionListener(new eventoBoton(txtNombre,txtApellido,txtTelefono,txtFNac));
		
	}
	public void CambiarVisibilidad(boolean estado) {
		
		setVisible(true);
	}
	public static void PintarNombre() {
		txtNombre.setBackground(Color.red);
		return;
	}
	public static void PintarNombre2() {
		txtNombre.setBackground(Color.white);
		return;
	}
	public static void PintarApellido() {
		txtApellido.setBackground(Color.red);
		return;
	}
	public static void PintarApellido2() {
		txtApellido.setBackground(Color.white);
		return;
	}
	public static void Pintartel() {
		txtTelefono.setBackground(Color.red);
		return;
	}
	public static void Pintartel2() {
		txtTelefono.setBackground(Color.white);
		return;
	}
	public static void Pintarfnac() {
		txtFNac.setBackground(Color.red);
		return;
	}
	public static void Pintarfnac2() {
		txtFNac.setBackground(Color.white);
		return;
	}
	
}

class eventoBoton implements ActionListener{

	private JTextField Nombre;
	private JTextField Apellido;
	private JTextField Tel;
	private JTextField Fnac;
	
	public eventoBoton(JTextField nombre,JTextField apellido, JTextField telefono, JTextField fnac) {
		Nombre=nombre;
		Apellido=apellido;
		Tel=telefono;
		Fnac=fnac;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (Nombre.getText().isEmpty()) //Pregunto por Nombre 
		{
		     Ventana1.PintarNombre();
		}
		else
		{
			Ventana1.PintarNombre2();
		}
		// termina nombre y empieza Apellido
		
		if (Apellido.getText().isEmpty()) {
			 Ventana1.PintarApellido();
		}
		else {Ventana1.PintarApellido2();}
		//termina Apellido y empieza Telefono
		
		if(Tel.getText().isEmpty()) {
			Ventana1.Pintartel();
		}
		else {Ventana1.Pintartel2();}
		//termina tel empieza FNAC
		
		if(Fnac.getText().isEmpty()) {Ventana1.Pintarfnac();}
		else {Ventana1.Pintarfnac2();}
		
	}
	
}