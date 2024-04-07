package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class UI_RSA extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI_RSA frame = new UI_RSA();
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
	public UI_RSA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("RSA SOFTWARE");
		lblNewLabel.setBackground(new Color(128, 64, 64));
		lblNewLabel.setBounds(352, 11, 162, 24);
		lblNewLabel.setForeground(new Color(181, 106, 106));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 72, 235, 421);
		panel.setBackground(new Color(255, 128, 128));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(250, 72, 293, 421);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(183, 255, 183));
		panel_1_1.setBounds(553, 72, 284, 421);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Người Nhận");
		lblNewLabel_1_1_1.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Graphicloads-Colorful-Long-Shadow-User.32.png")));
		lblNewLabel_1_1_1.setBounds(81, 11, 141, 32);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabel_1_1 = new JLabel("Người Gửi");
		lblNewLabel_1_1.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Blackvariant-Button-Ui-System-Folders-Alt-Users.32.png")));
		lblNewLabel_1_1.setBounds(86, 11, 133, 32);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabel_2_2 = new JLabel("Tin nhắn");
		lblNewLabel_2_2.setBounds(10, 73, 67, 14);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 12));
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mã hóa tin nhắn");
		lblNewLabel_2_1_1.setBounds(10, 207, 100, 14);
		lblNewLabel_2_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JButton btnMaHoa = new JButton("Mã khóa");
		btnMaHoa.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Gartoon-Team-Gartoon-Mimetype-App-pgp-keys.32.png")));
		btnMaHoa.setBounds(86, 357, 121, 32);
		btnMaHoa.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Khóa");
		lblNewLabel_1.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Gartoon-Team-Gartoon-Apps-Seahorse-key.32.png")));
		lblNewLabel_1.setBounds(66, 11, 87, 32);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("Khóa bí mật");
		lblNewLabel_2.setBounds(10, 73, 67, 14);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 98, 215, 98);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JLabel lblNewLabel_2_1 = new JLabel("Khóa công khai");
		lblNewLabel_2_1.setBounds(10, 207, 87, 14);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 232, 215, 98);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton btnTaoKhoa = new JButton("Tạo khóa");
		btnTaoKhoa.setBackground(new Color(255, 255, 255));
		btnTaoKhoa.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Gartoon-Team-Gartoon-Mimetype-App-pgp-encrypted.32.png")));
		btnTaoKhoa.setBounds(58, 357, 121, 32);
		btnTaoKhoa.setFont(new Font("Arial", Font.BOLD, 12));
		
		JTextArea textAreaKhoaCongKhai = new JTextArea();
		textAreaKhoaCongKhai.setLineWrap(true);
		scrollPane_1.setViewportView(textAreaKhoaCongKhai);
		
		JTextArea textAreaKhoaBiMat = new JTextArea();
		textAreaKhoaBiMat.setLineWrap(true);
		scrollPane.setViewportView(textAreaKhoaBiMat);
		panel.setLayout(null);
		panel.add(lblNewLabel_1);
		panel.add(lblNewLabel_2);
		panel.add(scrollPane);
		panel.add(lblNewLabel_2_1);
		panel.add(scrollPane_1);
		panel.add(btnTaoKhoa);
		contentPane.add(panel);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_2_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 100, 273, 98);
		panel_1.add(scrollPane_3);
		
		JTextArea textAreaTinNhan = new JTextArea();
		scrollPane_3.setViewportView(textAreaTinNhan);
		textAreaTinNhan.setLineWrap(true);
		panel_1.add(lblNewLabel_2_1_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 232, 273, 98);
		panel_1.add(scrollPane_2);
		
		JTextArea textAreaMaHoaTinNhan = new JTextArea();
		scrollPane_2.setViewportView(textAreaMaHoaTinNhan);
		textAreaMaHoaTinNhan.setLineWrap(true);
		panel_1.add(btnMaHoa);
		panel_1.add(lblNewLabel_1_1);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Tin nhắn đã được mã hóa");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_2_1.setBounds(10, 73, 145, 14);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 100, 264, 98);
		panel_1_1.add(scrollPane_4);
		
		JTextArea textAreaTinNhanMaHoa = new JTextArea();
		scrollPane_4.setViewportView(textAreaTinNhanMaHoa);
		textAreaTinNhanMaHoa.setLineWrap(true);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Giải mã tin nhắn");
		lblNewLabel_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(10, 207, 100, 14);
		panel_1_1.add(lblNewLabel_2_1_1_1);
		
		JTextArea textAreaGiaiMaTinNhan = new JTextArea();
		textAreaGiaiMaTinNhan.setLineWrap(true);
		textAreaGiaiMaTinNhan.setBounds(10, 232, 264, 98);
		panel_1_1.add(textAreaGiaiMaTinNhan);
		
		JButton btnGiaiMa = new JButton("Giải mã");
		btnGiaiMa.setIcon(new ImageIcon(UI_RSA.class.getResource("/icon/Paomedia-Small-N-Flat-Shield-ok.32.png")));
		btnGiaiMa.setFont(new Font("Arial", Font.BOLD, 12));
		btnGiaiMa.setBounds(89, 357, 111, 32);
		panel_1_1.add(btnGiaiMa);
		contentPane.add(lblNewLabel);
	}
}
