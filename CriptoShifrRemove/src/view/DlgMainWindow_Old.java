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
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgMainWindow_Old extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldIncomingText;
	private JTextField textFieldSourceText;
	private JTextField textFieldKey;
	private JRadioButton rdbtnNewRadioButtonDecrypt;
	private JRadioButton rdbtnNewRadioButtonEncrypt;
	private int[] key = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMainWindow_Old dialog = new DlgMainWindow_Old();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgMainWindow_Old() {
		setModal(true);
		setTitle("\u0428\u0438\u0444\u0440 \u043F\u0435\u0440\u0435\u0441\u0442\u0430\u043D\u043E\u0432\u043A\u0438");
		setBounds(100, 100, 450, 249);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("120px:grow"), ColumnSpec.decode("294px:grow"),
						ColumnSpec.decode("197px"), },
				new RowSpec[] { FormSpecs.UNRELATED_GAP_ROWSPEC, RowSpec.decode("22px"), FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC, FormSpecs.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"), }));
		{
			JLabel lblNewLabel = new JLabel("Source text: ");
			contentPanel.add(lblNewLabel, "1, 2, center, default");
		}
		{
			textFieldSourceText = new JTextField();
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
			panelOptions.setBorder(new TitledBorder(null, "\u041E\u043F\u0446\u0438\u0438", TitledBorder.LEADING,
					TitledBorder.TOP, null, null));
			contentPanel.add(panelOptions, "1, 6, fill, fill");
			panelOptions.setLayout(new FormLayout(new ColumnSpec[] { ColumnSpec.decode("127px"), },
					new RowSpec[] { FormSpecs.LINE_GAP_ROWSPEC, RowSpec.decode("25px"), FormSpecs.LINE_GAP_ROWSPEC,
							RowSpec.decode("25px"), }));
			{
				rdbtnNewRadioButtonDecrypt = new JRadioButton(
						"\u0420\u0430\u0441\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
				panelOptions.add(rdbtnNewRadioButtonDecrypt, "1, 2, fill, top");

				rdbtnNewRadioButtonEncrypt = new JRadioButton(
						"\u0417\u0430\u0448\u0438\u0444\u0440\u043E\u0432\u0430\u0442\u044C");
				panelOptions.add(rdbtnNewRadioButtonEncrypt, "1, 4, fill, top");

			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, "2, 6, fill, fill");
			panel.setLayout(new FormLayout(
					new ColumnSpec[] { FormSpecs.RELATED_GAP_COLSPEC, FormSpecs.DEFAULT_COLSPEC,
							FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("max(104dlu;default)"),
							FormSpecs.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), },
					new RowSpec[] { FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC,
							FormSpecs.RELATED_GAP_ROWSPEC, FormSpecs.DEFAULT_ROWSPEC, }));
			{
				JButton btnNewButtonExecute = new JButton("\u0417\u0430\u043F\u0443\u0441\u043A");
				btnNewButtonExecute.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						onOk();
					}
				});
				panel.add(btnNewButtonExecute, "4, 2, center, default");
			}
			{
				JLabel lblNewLabel_2 = new JLabel("\u041A\u043B\u044E\u0447: ");
				panel.add(lblNewLabel_2, "2, 4, right, default");
			}
			{
				textFieldKey = new JTextField();
				panel.add(textFieldKey, "4, 4, fill, default");
				textFieldKey.setColumns(10);
			}
		}
	}

	/**
	 * Overload methods
	 */
	public void SetKey(String[] _key) {
		key = new int[_key.length];

		for (int i = 0; i < _key.length; i++) {
			key[i] = Integer.parseInt(_key[i]);
		}
	}

	public void SetKey(String _key) {
		SetKey(_key.split(" "));
	}

	public String Encrypt(String input)
	    {
	        for (int i = 0; i < input.length() % key.length; i++)
	            input += " ";
	 
	        String result = "";
	 
	        for (int i = 0; i < input.length(); i += key.length)
	        {
	            char[] transposition = new char[key.length];
	 
	            for (int j = 0; j < key.length; j++)
	                transposition[key[j] - 1] = input.charAt(i + j);
	 
	            for (int j = 0; j < key.length; j++)
	                result += transposition[j];
	        }
	 
	        return result;
	    }
	 
	  public String Decrypt(String input)
	    {
	        String result = "";
	 
	        for (int i = 0; i < input.length(); i += key.length)
	        {
	            char[] transposition = new char[key.length];
	 
	            for (int j = 0; j < key.length; j++)
	                transposition[j] = input.charAt(i + key[j] - 1);
	 
	            for (int j = 0; j < key.length; j++)
	                result += transposition[j];
	        }
	 
	        return result;
	    }
	  
	private void onOk() {

		SetKey(textFieldKey.getText());

		if (rdbtnNewRadioButtonEncrypt.isSelected() && rdbtnNewRadioButtonDecrypt.isSelected()) {
			JOptionPane.showMessageDialog(this, "Выбрано обе кнопки!");
			return;
		} else if (!rdbtnNewRadioButtonDecrypt.isSelected() && !rdbtnNewRadioButtonEncrypt.isSelected()) {
			JOptionPane.showMessageDialog(this, "Не выбрано ни одной кнопки!");
			return;
		} else if (rdbtnNewRadioButtonEncrypt.isSelected()) {
			System.out.println("Encrypt");
			textFieldIncomingText.setText(Encrypt(textFieldSourceText.getText()));
		} else {
			System.out.println("Decrypt");
			textFieldIncomingText.setText(Decrypt(textFieldSourceText.getText()));
		}
	}

}
