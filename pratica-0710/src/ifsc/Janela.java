package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField nota2;
	private JTextField nota1;
	private JTextField nota3;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 261);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNome = new JTextField();
		txtNome.setBounds(66, 11, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		nota1 = new JTextField();
		nota1.setBounds(66, 55, 86, 20);
		contentPane.add(nota1);
		nota1.setColumns(10);

		nota2 = new JTextField();
		nota2.setBounds(66, 86, 86, 20);
		contentPane.add(nota2);
		nota2.setColumns(10);

		nota3 = new JTextField();
		nota3.setBounds(66, 117, 86, 20);
		contentPane.add(nota3);
		nota3.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nota 1:");
		lblNewLabel_1.setBounds(10, 58, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nota 2:");
		lblNewLabel_2.setBounds(10, 92, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Nota 3:");
		lblNewLabel_3.setBounds(10, 123, 46, 14);
		contentPane.add(lblNewLabel_3);

		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtNome.getText();

				String n1 = nota1.getText();
				String n2 = nota2.getText();
				String n3 = nota3.getText();

				Integer nt1 = Integer.valueOf(n1);
				Integer nt2 = Integer.valueOf(n2);
				Integer nt3 = Integer.valueOf(n3);

				Double media = calcMedia(nt1, nt2, nt3);
				JOptionPane.showMessageDialog(null, "A media do aluno  " + nome + "  é  " + media);
			}

			private Double calcMedia(Integer nt1, Integer nt2, Integer nt3) {
				Double media = (double) (nt1 + nt2 + nt3) / 3;
				return media;
			}

		});
		btnCalcular.setBounds(108, 176, 105, 23);
		contentPane.add(btnCalcular);
	}
}
