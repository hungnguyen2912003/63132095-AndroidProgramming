package ntu.NguyenKhacDuyHung_63132095;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UnderWeight extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnderWeight frame = new UnderWeight();
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
	public UnderWeight() {
		setTitle("Ứng dụng kiểm tra chỉ số BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(165, 10, 948, 62);
		panel.setOpaque(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Cân nặng");
		lblNewLabel_3.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3.setBounds(180, 417, 89, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(77, 139, 50));
		lblNewLabel_2.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 60));
		lblNewLabel_2.setBounds(306, 188, 169, 92);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Thiếu cân");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(180, 289, 81, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Chỉ số BMI của bạn");
		lblNewLabel.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		lblNewLabel.setBounds(251, 136, 279, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chiều cao");
		lblNewLabel_3_1.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(306, 417, 100, 31);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tuổi");
		lblNewLabel_3_2.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(435, 417, 51, 31);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Giới tính");
		lblNewLabel_3_3.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(513, 417, 89, 31);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_7 = new JLabel("RESET");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		lblNewLabel_7.setBounds(206, 519, 146, 25);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("EXIT");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setForeground(Color.WHITE);
		lblNewLabel_7_1.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		lblNewLabel_7_1.setBounds(435, 519, 146, 25);
		contentPane.add(lblNewLabel_7_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(UnderWeight.class.getResource("/images/btn.png")));
		btnNewButton.setBounds(180, 504, 193, 55);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(UnderWeight.class.getResource("/images/btn.png")));
		btnNewButton_1.setBounds(409, 504, 193, 55);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(808, 82, 379, 177);
		contentPane.add(lblNewLabel_4);
		
		JLabel bgImage = new JLabel("");
		bgImage.setIcon(new ImageIcon(UnderWeight.class.getResource("/images/Thieucan.png")));
		bgImage.setBounds(0, 0, 1266, 683);
		contentPane.add(bgImage);
	}

}
