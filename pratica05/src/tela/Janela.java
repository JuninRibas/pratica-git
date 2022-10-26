package tela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private String textoTotal;

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
		setBounds(100, 100, 464, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Opções");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(48, 21, 52, 22);
		contentPane.add(lblNewLabel);

		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(116, 21, 127, 22);
		comboBox.addItem("Brasil");
		comboBox.addItem("Uruguai");
		comboBox.addItem("Argentina");
		comboBox.addItem("Chile");
		contentPane.add(comboBox);

		JButton btnAdicionar = new JButton("ADICIONAR");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String text = (String) comboBox.getSelectedItem();
				if (textoTotal == null) {
					textoTotal = text;
				} else {
					textoTotal = textoTotal + "," + text;
				}
				textArea.setText(textoTotal);

			}
		});
		btnAdicionar.setBounds(275, 21, 127, 23);
		contentPane.add(btnAdicionar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 57, 143, 194);
		contentPane.add(scrollPane);
		
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
	}
}
