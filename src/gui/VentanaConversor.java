package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import conversor.Convertir;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaConversor extends JFrame {

	private JPanel panelPincipal;
	private JTextField lblResultado;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConversor frame = new VentanaConversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaConversor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 56, 458);
		panelPincipal = new JPanel();
		panelPincipal.setBackground(new Color(14, 10, 10));
		panelPincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPincipal);
		panelPincipal.setLayout(null);
		
		JLabel lblTitulo = new JLabel("CONVERSOR MONEDAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Times New Roman", Font.BOLD, 33));
		lblTitulo.setBounds(92, 29, 403, 45);
		panelPincipal.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Moneda inical");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(79, 166, 163, 35);
		panelPincipal.add(lblNewLabel);
		
		JComboBox monedaInicial = new JComboBox();
		monedaInicial.setBackground(new Color(62, 188, 121));
		monedaInicial.setFont(new Font("Times New Roman", Font.BOLD, 18));
		monedaInicial.setModel(new DefaultComboBoxModel(new String[] {"ARS", "USD", "EUR", "REAL", "MXN", "YEN", "YUAN", "RUBLO", "LIB"}));
		monedaInicial.setToolTipText("");
		monedaInicial.setBounds(79, 212, 163, 37);
		panelPincipal.add(monedaInicial);
		
		
		JLabel lblMonedaFinal = new JLabel("Moneda final");
		lblMonedaFinal.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblMonedaFinal.setBounds(330, 167, 147, 33);
		panelPincipal.add(lblMonedaFinal);
		
		JComboBox monedaFinal = new JComboBox();
		monedaFinal.setBackground(new Color(62, 188, 121));
		monedaFinal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		monedaFinal.setModel(new DefaultComboBoxModel(new String[] {"USD", "ARS", "EUR", "REAL", "MXN", "YEN", "YUAN", "RUBLO", "LIB"}));
		monedaFinal.setToolTipText("");
		monedaFinal.setBounds(341, 212, 136, 37);
		panelPincipal.add(monedaFinal);
		
		lblResultado = new JTextField();
		lblResultado.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBackground(new Color(64, 188, 128));
		lblResultado.setBounds(10, 334, 560, 57);
		panelPincipal.add(lblResultado);
		lblResultado.setColumns(10);
		
		
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String monedaOrigen = monedaInicial.getSelectedItem().toString();
				String monedaDestino = monedaFinal.getSelectedItem().toString();
				double cant = Integer.parseInt(txtCantidad.getText());
				double resultado = Convertir.convertir(monedaOrigen, monedaDestino, cant);
				lblResultado.setText("La cantidad de " + cant + " " + monedaOrigen  + " Equivalen a " + resultado + "  " + monedaDestino );
			}
		});
		btnConvertir.setBounds(178, 277, 210, 35);
		panelPincipal.add(btnConvertir);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtCantidad.setBackground(new Color(64, 188, 128));
		txtCantidad.setBounds(300, 103, 147, 33);
		panelPincipal.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(148, 104, 188, 32);
		panelPincipal.add(lblNewLabel_1);
		
		
	}
}
