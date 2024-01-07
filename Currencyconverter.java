package registration_form;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import java.awt.SystemColor;

public class Currencyconverter extends JFrame {
	
    
	private JPanel contentPane;
	private JTextField input;
	private JTextField textField_1;
	private JComboBox choiceTo;
	private JComboBox choiceFrom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currencyconverter frame = new Currencyconverter();
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
	public Currencyconverter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Currency Converter");
		lblNewLabel.setBounds(160, 11, 127, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Amount");
		lblNewLabel_1.setBounds(108, 53, 87, 14);
		contentPane.add(lblNewLabel_1);
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(input.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "incorrect");
				}
			}
		});
		input.setBounds(220, 50, 86, 20);
		contentPane.add(input);
		input.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Convert from");
		lblNewLabel_2.setBounds(108, 105, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Convert to");
		lblNewLabel_3.setBounds(108, 154, 87, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		           Double total;
		   		   Double amount= Double.parseDouble(input.getText());
			switch (choiceFrom.getSelectedItem().toString()) {
            case "USD":
                //INR
                switch (choiceTo.getSelectedItem().toString()) {
                    case "INR":
                        total=amount*82.743;
                        textField_1.setText(input.getText()+" USD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.943;
                        textField_1.setText(input.getText()+" USD = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*1.351;
                        textField_1.setText(input.getText()+" USD = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*132.440;
                        textField_1.setText(input.getText()+" USD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*6.871;
                        textField_1.setText(input.getText()+" USD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000594;
                        textField_1.setText(input.getText()+" USD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" USD = "+total+" USD");
                        break;
                }
                break;
            case "INR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.0120;
                        textField_1.setText(input.getText()+" INR = "+total+" USD");
                        break;
                    case "EUR":
                        total=amount*0.01139;
                        textField_1.setText(input.getText()+" INR = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.0163;
                        textField_1.setText(input.getText()+" INR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*1.6012;
                        textField_1.setText(input.getText()+" INR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*0.083;
                        textField_1.setText(input.getText()+" INR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.000000726;
                        textField_1.setText(input.getText()+" INR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" INR = "+total+" INR");
                        break;
                }
                break;
            case "EUR":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*1.06057;
                        textField_1.setText(input.getText()+" EUR = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*87.74738;
                        textField_1.setText(input.getText()+" EUR = "+total+" INR");
                        break;
                    case "CAD":
                        total=amount*1.4336;
                        textField_1.setText(input.getText()+" EUR = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*140.5083;
                        textField_1.setText(input.getText()+" EUR = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*7.2925;
                        textField_1.setText(input.getText()+" EUR = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000630;
                        textField_1.setText(input.getText()+" EUR = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" EUR = "+total+" EUR");
                        break;
                }
                break;
            case "CAD":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.7397;
                        textField_1.setText(input.getText()+" CAD = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*61.2043;
                        textField_1.setText(input.getText()+" CAD = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.6975;
                        textField_1.setText(input.getText()+" CAD = "+total+" EUR");
                        break;
                    case "JPY":
                        total=amount*98.0054;
                        textField_1.setText(input.getText()+" CAD = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*5.0865;
                        textField_1.setText(input.getText()+" CAD = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000439;
                        textField_1.setText(input.getText()+" CAD = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" CAD = "+total+" CAD");
                        break;
                }
                break;
            case "JPY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.00754;
                        textField_1.setText(input.getText()+" JPY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*0.6244;
                        textField_1.setText(input.getText()+" JPY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.00711;
                        textField_1.setText(input.getText()+" JPY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.01020;
                        textField_1.setText(input.getText()+" JPY = "+total+" CAD");
                        break;
                    case "CNY":
                        total=amount*0.051900;
                        textField_1.setText(input.getText()+" JPY = "+total+" CNY");
                        break;
                    case "BTC":
                        total=amount*0.0000000453;
                        textField_1.setText(input.getText()+" JPY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" JPY = "+total+" JPY");
                        break;
                }
                break;
            case "CNY":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*0.1454;
                        textField_1.setText(input.getText()+" CNY = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*12.0325;
                        textField_1.setText(input.getText()+" CNY = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*0.13712;
                        textField_1.setText(input.getText()+" CNY = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*0.19659;
                        textField_1.setText(input.getText()+" CNY = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*19.26750;
                        textField_1.setText(input.getText()+" CNY = "+total+" JPY");
                        break;
                    case "BTC":
                        total=amount*0.000008646;
                        textField_1.setText(input.getText()+" CNY = "+total+" BTC");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" CNY = "+total+" CNY");
                        break;
                }
                break;
            case "BTC":
                //USD
                switch (choiceTo.getSelectedItem().toString()) {
                    case "USD":
                        total=amount*16820.845;
                        textField_1.setText(input.getText()+" BTC = "+total+" USD");
                        break;
                    case "INR":
                        total=amount*1391685.7254;
                        textField_1.setText(input.getText()+" BTC = "+total+" INR");
                        break;
                    case "EUR":
                        total=amount*15860.1393;
                        textField_1.setText(input.getText()+" BTC = "+total+" EUR");
                        break;
                    case "CAD":
                        total=amount*22738.3511;
                        textField_1.setText(input.getText()+" BTC = "+total+" CAD");
                        break;
                    case "JPY":
                        total=amount*2228482.3907;
                        textField_1.setText(input.getText()+" BTC = "+total+" JPY");
                        break;
                    case "CNY":
                        total=amount*115660.1311;
                        textField_1.setText(input.getText()+" BTC = "+total+" CNY");
                        break;
                    default:
                        total=amount*1;
                        textField_1.setText(input.getText()+" BTC = "+total+" BTC");
                        break;
                }
                break;
			
        }
		}
		

		});
		btnNewButton.setBounds(121, 196, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 230, 293, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 78, 414, -1);
		contentPane.add(separator);
		
		choiceFrom = new JComboBox();
		choiceFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"INR","EURO","Canadian dollar","Japanese yen","Chinese yen","Bitcoin"}));
		choiceFrom.setBounds(220, 101, 89, 22);
		contentPane.add(choiceFrom);
		
		choiceTo = new JComboBox();
		choiceTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"USD","EURO","Canadian dollar","Japanese yen","Chinese yen","Bitcoin"}));
		choiceTo.setBounds(220, 150, 86, 22);
		contentPane.add(choiceTo);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText(" ");
				
				;
			}
		});
		btnNewButton_1.setBounds(220, 196, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
