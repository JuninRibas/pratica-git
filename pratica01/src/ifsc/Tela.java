package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(129, 29, 86, 20);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(129, 68, 86, 20);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JButton soma = new JButton("Soma");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text1= txtNumero1.getText();
				String text2 = txtNumero2.getText();
				
				if(!text1.isEmpty() && !text2.isEmpty()){
					Double n1 = Double.valueOf(text1);
					Double n2= Double.valueOf(text2);
					JOptionPane.showMessageDialog(null, n1 + n2);
				}
				
				
			}
		});
		soma.setBounds(126, 114, 89, 23);
		contentPane.add(soma);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setBounds(50, 29, 69, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setBounds(50, 68, 69, 17);
		contentPane.add(lblNewLabel_1);
	}
}
