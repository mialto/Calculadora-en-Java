package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Calculadora extends JFrame {

	String x = " ", x1 = " ";
	double acumulador = 0, captar;

	int b, op;
	boolean decimal = false;

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Calc 1.0M");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 236, 315);

		/**
		 * metodos que controlan el menu y sus opciones, abriendo ventanas
		 * emergentes
		 */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnAcercaDe = new JMenu("Menu");
		mnAcercaDe.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(mnAcercaDe);

		JMenuItem mntmDocumentacin = new JMenuItem("Documentaci\u00F3n");
		mntmDocumentacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null, "Esta calculadora basica utiliza la suma, la resta la multiplicacion y la division de numeros tanto enteros como decimales\nSe ha introducido una imagen para mostrar que en el JLabel se pueden introducir valores");
			}
		});
		mnAcercaDe.add(mntmDocumentacin);

		JMenuItem mntmNewMenuItem = new JMenuItem("Acerca de Calc");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								"Autor: Miguel Angel Lopez Torralba\nCalc 1.0M\nContacto: miguel.a.torralba@gmail.com");
			}
		});
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mnAcercaDe.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		mnAcercaDe.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/**
		 * desde aqui se controlan los botones, creandolos y dandole funciones
		 * mediante la actionperformer
		 */

		Button button = new Button("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x1 = "1";
				concatenar();
			}

		});
		button.setBackground(new Color(72, 209, 204));
		button.setBounds(31, 158, 37, 22);
		contentPane.add(button);

		Button button_1 = new Button("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "2";
				concatenar();
			}
		});
		button_1.setBackground(new Color(72, 209, 204));
		button_1.setBounds(74, 158, 37, 22);
		contentPane.add(button_1);

		Button button_2 = new Button("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "3";
				concatenar();
			}
		});
		button_2.setBackground(new Color(72, 209, 204));
		button_2.setBounds(117, 158, 37, 22);
		contentPane.add(button_2);

		Button button_3 = new Button("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "4";
				concatenar();
			}
		});
		button_3.setBackground(new Color(72, 209, 204));
		button_3.setBounds(31, 130, 37, 22);
		contentPane.add(button_3);

		Button button_4 = new Button("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "5";
				concatenar();
			}
		});
		button_4.setBackground(new Color(72, 209, 204));
		button_4.setBounds(74, 130, 37, 22);
		contentPane.add(button_4);

		Button button_5 = new Button("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "6";
				concatenar();
			}
		});
		button_5.setBackground(new Color(72, 209, 204));
		button_5.setBounds(117, 130, 37, 22);
		contentPane.add(button_5);

		Button button_6 = new Button("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "7";
				concatenar();
			}
		});
		button_6.setBackground(new Color(72, 209, 204));
		button_6.setBounds(31, 102, 37, 22);
		contentPane.add(button_6);

		Button button_7 = new Button("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "8";
				concatenar();
			}
		});
		button_7.setBackground(new Color(72, 209, 204));
		button_7.setBounds(74, 102, 37, 22);
		contentPane.add(button_7);

		Button button_8 = new Button("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "9";
				concatenar();
			}
		});
		button_8.setBackground(new Color(72, 209, 204));
		button_8.setBounds(117, 102, 37, 22);
		contentPane.add(button_8);

		Button button_9 = new Button("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x1 = "0";
				concatenar();
			}
		});
		button_9.setBackground(new Color(72, 209, 204));
		button_9.setBounds(31, 186, 37, 22);
		contentPane.add(button_9);

		Button button_11 = new Button("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				suma();
				x = " ";
				op = 1;

			}
		});
		button_11.setBackground(new Color(72, 209, 204));
		button_11.setBounds(117, 186, 37, 22);
		contentPane.add(button_11);

		Button button_12 = new Button("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				resta();
				x = " ";
				b = 1;
				op = 2;
			}
		});
		button_12.setBackground(new Color(72, 209, 204));
		button_12.setBounds(160, 186, 37, 22);
		contentPane.add(button_12);

		Button button_13 = new Button("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				multiplica();
				x = "";
				op = 3;
			}
		});
		button_13.setBackground(new Color(72, 209, 204));
		button_13.setBounds(117, 215, 37, 22);
		contentPane.add(button_13);

		Button button_14 = new Button("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				divide();
				x = "";
				op = 4;
			}
		});
		button_14.setBackground(new Color(72, 209, 204));
		button_14.setBounds(160, 215, 37, 22);
		contentPane.add(button_14);

		Button button_15 = new Button("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado();
				textField.setText(x = Double.toString(acumulador));
				x = " ";
			}
		});
		button_15.setBackground(new Color(72, 209, 204));
		button_15.setBounds(31, 214, 80, 23);
		contentPane.add(button_15);

		Button button_16 = new Button("CE");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = "";
				x1 = "";
				acumulador = 0.0;
				captar = 0;
				b=0;
				textField.setText(" ");
				decimal = true;
				op = 0;

			}
		});
		button_16.setBackground(new Color(72, 209, 204));
		button_16.setBounds(160, 102, 37, 78);
		contentPane.add(button_16);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		textField.setBounds(31, 30, 166, 29);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel
				.setIcon(new ImageIcon(
						"D:\\DAW\\primero\\Programaci\u00F3n\\eclipse\\trimestre3\\src\\calculadora\\casio.png"));
		lblNewLabel.setBounds(41, 62, 136, 34);
		contentPane.add(lblNewLabel);

		Button button_10 = new Button(".");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (decimal == false) {
					x1 = ".";
					concatenar();
					decimal = true;
				}

			}
		});
		button_10.setBackground(new Color(72, 209, 204));
		button_10.setBounds(74, 186, 37, 22);
		contentPane.add(button_10);

	}

	/**
	 * metodo para realizar la division
	 */
	protected void divide() {
		try {
			captar = Double.parseDouble(x);
			decimal = false;
			if (acumulador == 0.0)
				acumulador = captar;
			if (captar == 0)
				textField.setText("Error");
			else
				acumulador = acumulador / captar;
			textField.setText(x = Double.toString(acumulador));
		} catch (NumberFormatException e) {

		}

	}

	/**
	 * metodo que realiza la multiplicacion
	 */
	protected void multiplica() {
		try {
			captar = Double.parseDouble(x);
			if (acumulador == 0 || captar == 0) {
				acumulador = 0;
			} else
				acumulador = acumulador * captar;
			decimal = false;
			textField.setText(x = Double.toString(acumulador));
		} catch (NumberFormatException e) {

		}

	}

	/**
	 * metodo que realiza la resta
	 */
	protected void resta() {
		try {
			captar = Double.parseDouble(x);
			decimal = false;
			if (b != 1)
				acumulador = acumulador + captar;
			else
				acumulador = acumulador - captar;
			textField.setText(x = Double.toString(acumulador));
		} catch (NumberFormatException e) {

		}
	}

	/**
	 * este metodo analiza que tipo de operacion se esta realizando y nos da el
	 * resultado en pantalla
	 */
	protected void resultado() {
		try {
			switch (op) {
			case 1:
				captar = Double.parseDouble(x);
				acumulador = acumulador + captar;
				// s = false;
				break;
			case 2:
				captar = Double.parseDouble(x);
				acumulador = acumulador - captar;
				// r = false;
				break;
			case 3:
				captar = Double.parseDouble(x);
				acumulador = acumulador * captar;
				// m = false;
				break;
			case 4:
				captar = Double.parseDouble(x);
				acumulador = acumulador / captar;
				// d = false;
				break;
			}
		} catch (NumberFormatException e) {
		}

	}

	/**
	 * metodo que realiza la suma
	 */
	protected void suma() {
		try {
			captar = Double.parseDouble(x);
			acumulador = acumulador + captar;
			decimal = false;
			textField.setText(x = Double.toString(acumulador));

		} catch (NumberFormatException e) {

		}
	}

	/**
	 * metodo que concatena los valores de la pantalla de la calculadora
	 */
	protected void concatenar() {
		x = x + x1;
		textField.setText(x);

	}
}
