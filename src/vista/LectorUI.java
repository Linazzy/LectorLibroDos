package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LectorUI extends JFrame {

	private JPanel contentPane;
	private JButton btnAtras;
	private JButton btnMarcar;
	private JButton btnIrAMarca;
	private JButton btnAlante;
	private JLabel lblNumeroPagina;
	private JTextArea txtrLoremIpsumDolor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorUI frame = new LectorUI();
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
	public LectorUI() {
		setTitle("Lector");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//Panel de botones
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		lblNumeroPagina = new JLabel("0");
		btnAtras = new JButton("<<");		
		btnAlante = new JButton(">>");		
		
		btnMarcar = new JButton("Marcar");		
		btnIrAMarca = new JButton("Ir a Marca");
		
		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);		
		panel.add(lblNumeroPagina);		
		
		txtrLoremIpsumDolor = new JTextArea();
		txtrLoremIpsumDolor.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtrLoremIpsumDolor.setWrapStyleWord(true);
		txtrLoremIpsumDolor.setLineWrap(true);
		txtrLoremIpsumDolor.setEnabled(true);
		txtrLoremIpsumDolor.setEditable(false);
		contentPane.add(txtrLoremIpsumDolor, BorderLayout.CENTER);
						
	}

	public JTextArea getTextArea() {
		return txtrLoremIpsumDolor;
	}

	public void setTextArea(JTextArea textArea) {
		this.txtrLoremIpsumDolor = textArea;
	}
	
	public JButton getBtnAtras() {
		return btnAtras;
	}


	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}


	public JButton getBtnMarcar() {
		return btnMarcar;
	}


	public void setBtnMarcar(JButton btnMarcar) {
		this.btnMarcar = btnMarcar;
	}


	public JButton getBtnIrAMarca() {
		return btnIrAMarca;
	}


	public void setBtnIrAMarca(JButton btnIrAMarca) {
		this.btnIrAMarca = btnIrAMarca;
	}


	public JButton getBtnAlante() {
		return btnAlante;
	}


	public void setBtnAlante(JButton btnAlante) {
		this.btnAlante = btnAlante;
	}


	public void setLblNumeroPagina(JLabel lblNumeroPagina) {
		this.lblNumeroPagina = lblNumeroPagina;
	}


	public JLabel getLblNumeroPagina() {
		return lblNumeroPagina;
	}	


}

