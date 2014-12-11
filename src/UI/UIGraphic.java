package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIGraphic extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIGraphic frame = new UIGraphic();
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
	public UIGraphic() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 240, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel JPanel_Menu = new JPanel();
		JPanel_Menu.setBackground(SystemColor.activeCaption);
		JPanel_Menu.setBounds(0, 0, 224, 56);
		contentPane.add(JPanel_Menu);
		JPanel_Menu.setLayout(null);
		
		JLabel lblLongitude = new JLabel("Longitude");
		lblLongitude.setBounds(21, 11, 60, 14);
		JPanel_Menu.add(lblLongitude);
		
		textField = new JTextField();
		textField.setBounds(21, 25, 86, 20);
		JPanel_Menu.add(textField);
		textField.setColumns(10);
		
		JLabel lblLatitude = new JLabel("Latitude");
		lblLatitude.setBounds(122, 11, 45, 14);
		JPanel_Menu.add(lblLatitude);
		
		textField_1 = new JTextField();
		textField_1.setBounds(117, 25, 86, 20);
		JPanel_Menu.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(62, 67, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton result0 = new JButton("New button");
		result0.setForeground(SystemColor.desktop);
		result0.setBackground(SystemColor.menu);
		result0.setBounds(0, 101, 224, 42);
		contentPane.add(result0);
		
		JButton result1 = new JButton("New button");
		result1.setBounds(0, 142, 224, 42);
		contentPane.add(result1);
		
		JButton result2 = new JButton("New button");
		result2.setBounds(0, 183, 224, 42);
		contentPane.add(result2);
		
		JButton result3 = new JButton("New button");
		result3.setBounds(0, 225, 224, 42);
		contentPane.add(result3);
		
		JButton result4 = new JButton("New button");
		result4.setBounds(0, 266, 224, 42);
		contentPane.add(result4);
		
		JButton result5 = new JButton("New button");
		result5.setBounds(0, 305, 224, 42);
		contentPane.add(result5);
	}
}
