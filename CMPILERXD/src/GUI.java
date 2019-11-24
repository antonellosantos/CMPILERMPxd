import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JList;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1100, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Run");
		btnNewButton.setBounds(724, 402, 150, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnParse = new JButton("Parse");
		btnParse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnParse.setBounds(564, 402, 150, 45);
		frame.getContentPane().add(btnParse);
		
		JButton btn_scan = new JButton("Scan");
		btn_scan.setBounds(404, 402, 150, 45);
		frame.getContentPane().add(btn_scan);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 339, 388, 111);
		frame.getContentPane().add(panel);
		
		JList list = new JList();
		list.setBounds(884, 11, 190, 436);
		frame.getContentPane().add(list);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 11, 388, 321);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(408, 11, 466, 380);
		frame.getContentPane().add(textPane_1);
	}
}
