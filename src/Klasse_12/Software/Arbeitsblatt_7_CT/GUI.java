package hotelkette;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textAnzHotels;
	private JTextField textKursYen;
	private JTextField textKursEuro;
	private JTextField textVermoegen;
	private JTextField textSteuer;
	private JTextField textBarVermoegen;
	private JRadioButton rdbtnDollar;
	private JRadioButton rdbtnEuro;
	private JRadioButton rdbtnYen;
	private static Steuerung dieSteuerung;
	private ButtonGroup waehrungen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dieSteuerung = new Steuerung(this);
		
		JLabel lblAnzHotels = new JLabel("Anzahl Hotels");
		lblAnzHotels.setBounds(10, 11, 90, 14);
		contentPane.add(lblAnzHotels);
		
		JLabel lblKursYen = new JLabel("Kurs Yen");
		lblKursYen.setBounds(10, 36, 90, 14);
		contentPane.add(lblKursYen);
		
		JLabel lblKursEuro = new JLabel("Kurs Euro");
		lblKursEuro.setBounds(10, 61, 90, 14);
		contentPane.add(lblKursEuro);
		
		textAnzHotels = new JTextField();
		textAnzHotels.setBounds(110, 8, 86, 20);
		contentPane.add(textAnzHotels);
		textAnzHotels.setColumns(10);
		
		textKursYen = new JTextField();
		textKursYen.setBounds(110, 33, 86, 20);
		contentPane.add(textKursYen);
		textKursYen.setColumns(10);
		
		textKursEuro = new JTextField();
		textKursEuro.setBounds(110, 58, 86, 20);
		contentPane.add(textKursEuro);
		textKursEuro.setColumns(10);
		
		JButton btnSpeichern = new JButton("Speichern");
		btnSpeichern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				speichern();
			}
		});
		
		
		
		btnSpeichern.setBounds(226, 11, 89, 64);
		contentPane.add(btnSpeichern);
		
		JLabel lblWaehrungen = new JLabel("Waehrung");
		lblWaehrungen.setBounds(10, 110, 90, 14);
		contentPane.add(lblWaehrungen);
		
		waehrungen = new ButtonGroup();
		
		rdbtnDollar = new JRadioButton("Dollar");
		rdbtnDollar.setBounds(110, 106, 53, 23);
		contentPane.add(rdbtnDollar);
		rdbtnDollar.setSelected(true);
		waehrungen.add(rdbtnDollar);
		
		rdbtnEuro = new JRadioButton("Euro");
		rdbtnEuro.setBounds(165, 106, 53, 23);
		contentPane.add(rdbtnEuro);
		waehrungen.add(rdbtnEuro);
		
		rdbtnYen = new JRadioButton("Yen");
		rdbtnYen.setBounds(220, 106, 53, 23);
		contentPane.add(rdbtnYen);
		waehrungen.add(rdbtnYen);
		
		JLabel lblVermoegen = new JLabel("Vermoegen");
		lblVermoegen.setBounds(10, 155, 90, 14);
		contentPane.add(lblVermoegen);
		
		textVermoegen = new JTextField();
		textVermoegen.setBounds(110, 152, 86, 20);
		contentPane.add(textVermoegen);
		textVermoegen.setColumns(10);
		
		JButton btnSetVermoegen = new JButton("SET");
		btnSetVermoegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setzen();
			}
		});
		btnSetVermoegen.setBounds(226, 151, 89, 23);
		contentPane.add(btnSetVermoegen);
		
		JButton btnBerechnen = new JButton("Berechnen");
		btnBerechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				berechnen();
			}
		});
		btnBerechnen.setBounds(10, 227, 89, 23);
		contentPane.add(btnBerechnen);
		
		textSteuer = new JTextField();
		textSteuer.setBounds(338, 228, 86, 20);
		contentPane.add(textSteuer);
		textSteuer.setColumns(10);
		
		textBarVermoegen = new JTextField();
		textBarVermoegen.setBounds(338, 197, 86, 20);
		contentPane.add(textBarVermoegen);
		textBarVermoegen.setColumns(10);
		
		JLabel lblBarvermoegenDollar = new JLabel("Barvermoegen in Dollar");
		lblBarvermoegenDollar.setBounds(188, 200, 127, 14);
		contentPane.add(lblBarvermoegenDollar);
		
		JLabel lblSteuer = new JLabel("Steuer");
		lblSteuer.setBounds(188, 231, 127, 14);
		contentPane.add(lblSteuer);
	}
	
	//Eigene Methoden
	private void speichern() {
		int anzHotels = Integer.parseInt(textAnzHotels.getText());
		double yenKurs = Double.parseDouble(textKursYen.getText());
		double euroKurs = Double.parseDouble(textKursEuro.getText());
		
		dieSteuerung.setDaten(anzHotels, euroKurs, yenKurs);
		
		System.out.println("Gespeichert");
	}
	
	private void setzen() {
		double vermoegen = Double.parseDouble(textVermoegen.getText());
		Hotel hotel;
		if (rdbtnDollar.isSelected()) {
			hotel = new USA(vermoegen);
		} else if (rdbtnEuro.isSelected()) {
			hotel = new Europa(vermoegen);
		} else if (rdbtnYen.isSelected()) {
			hotel = new Japan(vermoegen);
		} else {
			System.out.println("Error");
			return ;
		}
		
		dieSteuerung.hotelErzeugen(hotel);
		
	}
	
	private void berechnen() {
		double vermoegen = dieSteuerung.berechneVermoegen(dieSteuerung.getHotels());
		double steuer = dieSteuerung.berechneSteuer(dieSteuerung.getHotels());
		
		textBarVermoegen.setText(vermoegen + "");
		textSteuer.setText(steuer + "");
	}
	
}
