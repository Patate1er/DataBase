package view.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.controller.NewDataBaseMouseListener;

/**
 * The panel where the user can add a new database connection to his list
 */
public class NewDataBasePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private JPanel newConnPane;

	private JLabel nameLabel;
	private JTextField nameField;

	private JLabel adressLabel;
	private JTextField adressField;

	private JLabel loginLabel;
	private JTextField loginField;

	private JLabel passwordLabel;
	private JTextField passwordField;

	private JButton addDatabaseButton;

	private static NewDataBasePanel newConnection;

	/**
	 * Create the panel.
	 */
	public NewDataBasePanel() {

		this.setBounds(100, 100, 946, 712);
		this.setLayout(new BorderLayout(0, 0));

		newConnPane = new JPanel();
		newConnPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		newConnPane.setBackground(new Color(54, 57, 62));
		newConnPane.setLayout(null);

		nameLabel = new JLabel("Name :");
		nameLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setBounds(427, 209, 46, 14);

		nameField = new JTextField();
		nameField.setBorder(null);
		nameField.setBackground(new Color(54, 57, 62));
		nameField.setForeground(new Color(255, 255, 255));
		nameField.setColumns(10);
		nameField.setBounds(427, 224, 186, 20);

		JSeparator nameSeparator = new JSeparator();
		nameSeparator.setBounds(427, 246, 186, 2);

		adressLabel = new JLabel("Adress :");
		adressLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		adressLabel.setForeground(Color.WHITE);
		adressLabel.setBounds(426, 273, 71, 14);

		adressField = new JTextField();
		adressField.setBorder(null);
		adressField.setColumns(10);
		adressField.setBackground(new Color(54, 57, 62));
		adressField.setForeground(new Color(255, 255, 255));
		adressField.setBounds(427, 292, 186, 20);

		JSeparator adressSeparator = new JSeparator();
		adressSeparator.setBounds(427, 314, 186, 2);

		loginLabel = new JLabel("Login :");
		loginLabel.setForeground(Color.WHITE);
		loginLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		loginLabel.setBounds(427, 337, 120, 14);

		loginField = new JTextField();
		loginField.setForeground(Color.WHITE);
		loginField.setColumns(10);
		loginField.setBorder(null);
		loginField.setBackground(new Color(54, 57, 62));
		loginField.setBounds(427, 354, 186, 20);

		addDatabaseButton = new JButton("Add dataBase");
		addDatabaseButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addDatabaseButton.setForeground(Color.WHITE);
		addDatabaseButton.setBorder(null);
		addDatabaseButton.setBounds(472, 462, 89, 23);
		addDatabaseButton.setBackground(new Color(30, 33, 38));

		JSeparator loginSeparator = new JSeparator();
		loginSeparator.setBounds(427, 376, 186, 2);

		passwordLabel = new JLabel("Password :");
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setFont(new Font("Calibri", Font.PLAIN, 15));
		passwordLabel.setBounds(427, 401, 120, 14);

		passwordField = new JTextField();
		passwordField.setForeground(Color.WHITE);
		passwordField.setColumns(10);
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(54, 57, 62));
		passwordField.setBounds(427, 415, 186, 20);

		JSeparator passwordSeparator = new JSeparator();
		passwordSeparator.setBounds(427, 436, 186, 2);

		newConnPane.add(nameLabel);
		newConnPane.add(nameField);
		newConnPane.add(nameSeparator);

		newConnPane.add(adressLabel);
		newConnPane.add(adressField);
		newConnPane.add(adressSeparator);

		newConnPane.add(loginLabel);
		newConnPane.add(loginField);
		newConnPane.add(loginSeparator);

		newConnPane.add(passwordLabel);
		newConnPane.add(passwordField);
		newConnPane.add(passwordSeparator);

		newConnPane.add(addDatabaseButton);

		this.add(newConnPane);

		addDatabaseButton.addMouseListener(new NewDataBaseMouseListener());
		
		newConnection = this;
	}

	/**
	 * Getter for this NewDatabasePanel
	 * @return this NewDatabasePanel
	 */
	public static NewDataBasePanel getNewDataBasePanel() {
		return newConnection;
	}

	/**
	 * Getter for the nameField
	 * @return the nameField
	 */
	public JTextField getNameField() {
		return newConnection.nameField;
	}

	/**
	 * Getter for the addressField
	 * @return the addressField
	 */
	public JTextField getAdressField() {
		return newConnection.adressField;
	}

	/**
	 * Getter for the loginField
	 * @return the loginField
	 */
	public JTextField getLoginField() {
		return newConnection.loginField;
	}

	/**
	 * Getter for the passwordField
	 * @return the passwordField
	 */
	public JTextField getPasswordField() {
		return newConnection.passwordField;
	}

	/**
	 * Getter for the addDatabaseButton
	 * @return the addDatabaseButton
	 */
	public JButton getAddDatabaseButton() {
		return newConnection.addDatabaseButton;
	}
}
