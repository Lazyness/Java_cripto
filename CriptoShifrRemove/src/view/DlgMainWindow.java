package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Color;

public class DlgMainWindow extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldIncomingText;
	private JTextField textFieldSourceText;
	private JTextField textFieldKeyColumnStr;
	private JRadioButton rdbtnNewRadioButtonDecrypt;
	private JRadioButton rdbtnNewRadioButtonEncrypt;
	private int[] keyX = null;
	private int[] keyY = null;
	private final int SIZE = 25 / 5;
	private String[][] tempMassColumn = new String[SIZE][SIZE], tempMassStr = new String[SIZE][SIZE];
	private JTextField textFieldStrColumn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMainWindow dialog = new DlgMainWindow();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgMainWindow() {
		setModal(true);
		setTitle("\u0428\u0438\u0444\u0440 \u043F\u0435\u0440\u0435\u0441\u0442\u0430\u043D\u043E\u0432\u043A\u0438");
		setBounds(100, 100, 550, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(
				new FormLayout(new ColumnSpec[] { ColumnSpec.decode("120px:grow"), ColumnSpec.decode("294px:grow"), },
						new RowSpec[] { FormSpecs.UNRELATED_GAP_ROWSPEC, RowSpec.decode("22px"),
								FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC,
								RowSpec.decode("default:grow"), }));
		{
			JLabel lblNewLabel = new JLabel("Source text: ");
			contentPanel.add(lblNewLabel, "1, 2, center, default");
		}
		{
			textFieldSourceText = new JTextField();
			textFieldSourceText.setText("\u041D\u0410\u0428\u0410\u041A\u041E\u041C\u0410\u041D\u0414\u0410\u0425\u041E\u0427\u0415\u0414\u041E\u0414\u041E\u041C\u0423\u0406\u0427\u0410\u0419");
			contentPanel.add(textFieldSourceText, "2, 2, fill, top");
			textFieldSourceText.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Incoming text: ");
			contentPanel.add(lblNewLabel_1, "1, 4, center, default");
		}
		{
			textFieldIncomingText = new JTextField();
			contentPanel.add(textFieldIncomingText, "2, 4, fill, top");
			textFieldIncomingText.setColumns(10);
		}
		{
			JPanel panelOptions = new JPanel();
			panelOptions.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
					"\u041E\u043F\u0446\u0438\u0438", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPanel.add(panelOptions, "1, 6, fill, fill");
			panelOptions.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("159px"), },
					new RowSpec[] { FormSpecs.LINE_GAP_ROWSPEC, RowSpec.decode("25px"), FormSpecs.LINE_GAP_ROWSPEC,
							RowSpec.decode("25px"), }));
			{
				rdbtnNewRadioButtonDecrypt = new JRadioButton(
						"\u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
				panelOptions.add(rdbtnNewRadioButtonDecrypt, "1, 2, center, top");

				rdbtnNewRadioButtonEncrypt = new JRadioButton(
						"\u0417\u0430\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
				panelOptions.add(rdbtnNewRadioButtonEncrypt, "1, 4, center, top");

			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, "2, 6, fill, fill");
			panel.setLayout(new FormLayout(
					new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
							FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(100dlu;default):grow"), },
					new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
							FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("max(23dlu;default)"),
							FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));
			{
				JButton btnNewButtonExecute = new JButton("\u0417\u0430\u043F\u0443\u0441\u043A");
				btnNewButtonExecute.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onOk();
					}
				});
				panel.add(btnNewButtonExecute, "2, 2, 3, 1, center, default");
			}
			{
				JLabel lblNewLabel_2 = new JLabel(
						"\u041A\u043B\u044E\u0447 \r\n(\u0421\u0442\u043E\u043B\u0431\u0438\u043A\u0438-\u0441\u0442\u0440\u043E\u043A\u0438): ");
				panel.add(lblNewLabel_2, "2, 4, right, default");
			}
			{
				textFieldKeyColumnStr = new JTextField();
				panel.add(textFieldKeyColumnStr, "4, 4, fill, default");
				textFieldKeyColumnStr.setColumns(10);
			}
			{
				JLabel lblNewLabel_3 = new JLabel(
						"\u041A\u043B\u044E\u0447 (\u0421\u0442\u0440\u043E\u043A\u0438-\u0441\u0442\u043E\u043B\u0431\u0438\u043A\u0438):");
				panel.add(lblNewLabel_3, "2, 6, right, default");
			}
			{
				textFieldStrColumn = new JTextField();
				panel.add(textFieldStrColumn, "4, 6, fill, default");
				textFieldStrColumn.setColumns(10);
			}
		}
	}

	public void SetKeyStr(String[] _key) {
		keyY = new int[_key[0].length()];
		for (int i = 0; i < _key[0].length(); i++) {
			keyY[i] = Integer.parseInt("" + _key[0].charAt(i));
		}

		keyX = new int[_key[1].length()];
		for (int i = 0; i < _key[1].length(); i++) {
			keyX[i] = Integer.parseInt("" + _key[1].charAt(i));
		}
		System.out.println(keyX.length + "\n" + keyY.length);
	}

	public void SetKeyStr(String _key) {
		SetKeyStr(_key.split(" "));
	}

	public String EncryptStr(String[][] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				tempMassStr[keyY[i] - 1][j] = input[i][j];
			}
		}

		for (int i = 0; i < tempMassStr.length; i++) {
			for (int j = 0; j < tempMassStr.length; j++) {
				tempMassColumn[i][keyX[j] - 1] = tempMassStr[i][j];
			}
		}

		return parseDoubleMassiveToString(tempMassColumn);
	}

	public String DecryptStr(String[][] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				tempMassColumn[i][j] = input[i][keyX[j] - 1];
			}
		}

		for (int i = 0; i < tempMassColumn.length; i++) {
			for (int j = 0; j < tempMassColumn.length; j++) {
				tempMassStr[i][j] = tempMassColumn[keyY[i] - 1][j];
			}
		}

		return parseDoubleMassiveToString(tempMassStr);
	}


	public void SetKey(String[] _key) {
		keyX = new int[_key[0].length()];
		for (int i = 0; i < _key[0].length(); i++) {
			keyX[i] = Integer.parseInt("" + _key[0].charAt(i));
		}

		keyY = new int[_key[1].length()];
		for (int i = 0; i < _key[1].length(); i++) {
			keyY[i] = Integer.parseInt("" + _key[1].charAt(i));
		}
		System.out.println(keyX.length + "\n" + keyY.length);
	}

	public void SetKey(String _key) {
		SetKey(_key.split(" "));
	}

	public String[][] parseDoubleMassive(String input) {
		String[][] mass = new String[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				mass[i][j] = "" + input.charAt(i * SIZE + j);
			}
		}
		return mass;
	}

	public String parseDoubleMassiveToString(String[][] mass) {
		String result = "";
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass.length; j++) {
				result += mass[i][j];
			}
		}
		return result;
	}

	public String Encrypt(String[][] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				tempMassColumn[i][keyX[j] - 1] = input[i][j];
			}
		}

		for (int i = 0; i < tempMassColumn.length; i++) {
			for (int j = 0; j < tempMassColumn.length; j++) {
				tempMassStr[keyY[i] - 1][j] = tempMassColumn[i][j];
			}
		}

		return parseDoubleMassiveToString(tempMassStr);
	}

	public String Decrypt(String[][] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				tempMassStr[i][j] = input[keyY[i] - 1][j];
			}
		}

		for (int i = 0; i < tempMassStr.length; i++) {
			for (int j = 0; j < tempMassStr.length; j++) {
				tempMassColumn[i][j] = tempMassStr[i][keyX[j] - 1];
			}
		}

		return parseDoubleMassiveToString(tempMassColumn);
	}

	private void onOk() {
		
		if (textFieldKeyColumnStr.getText().length() != 0 && textFieldStrColumn.getText().length() != 0) {
			JOptionPane.showMessageDialog(this, "Написано в обоих полях одновременно выберите одно!");
			return;
		} else if (textFieldKeyColumnStr.getText().length() == 0 && textFieldStrColumn.getText().length() == 0) {
			JOptionPane.showMessageDialog(this, "В обоих полях одновременно пусто, заполните одно поле!");
			return;
		} else if (textFieldKeyColumnStr.getText().length() != 0) {
			SetKey(textFieldKeyColumnStr.getText());
			
			if (rdbtnNewRadioButtonEncrypt.isSelected() && rdbtnNewRadioButtonDecrypt.isSelected()) {
				JOptionPane.showMessageDialog(this, "Выбрано обе кнопки!");
				return;
			} else if (!rdbtnNewRadioButtonDecrypt.isSelected() && !rdbtnNewRadioButtonEncrypt.isSelected()) {
				JOptionPane.showMessageDialog(this, "Не выбрано ни одной кнопки!");
				return;
			} else if (rdbtnNewRadioButtonEncrypt.isSelected()) {
				System.out.println("Encrypt");
				textFieldIncomingText.setText(Encrypt(parseDoubleMassive(textFieldSourceText.getText())));
			} else {
				System.out.println("Decrypt");
				textFieldIncomingText.setText(Decrypt(parseDoubleMassive(textFieldSourceText.getText())));
			}
		} else {
			SetKeyStr(textFieldStrColumn.getText());
			if (rdbtnNewRadioButtonEncrypt.isSelected() && rdbtnNewRadioButtonDecrypt.isSelected()) {
				JOptionPane.showMessageDialog(this, "Выбрано обе кнопки!");
				return;
			} else if (!rdbtnNewRadioButtonDecrypt.isSelected() && !rdbtnNewRadioButtonEncrypt.isSelected()) {
				JOptionPane.showMessageDialog(this, "Не выбрано ни одной кнопки!");
				return;
			} else if (rdbtnNewRadioButtonEncrypt.isSelected()) {
				System.out.println("EncryptStr");
				textFieldIncomingText.setText(EncryptStr(parseDoubleMassive(textFieldSourceText.getText())));
			} else {
				System.out.println("DecryptStr");
				textFieldIncomingText.setText(DecryptStr(parseDoubleMassive(textFieldSourceText.getText())));
			}
		}
	}

}
