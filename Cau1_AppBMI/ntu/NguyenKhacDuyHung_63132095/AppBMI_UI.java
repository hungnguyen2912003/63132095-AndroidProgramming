package ntu.NguyenKhacDuyHung_63132095;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;



public class AppBMI_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBMI_UI frame = new AppBMI_UI();

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
	public AppBMI_UI() {
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
		
		JLabel lblNewLabel = new JLabel("Tính Toán Chỉ Số");
		lblNewLabel.setBounds(255, 5, 339, 59);
		lblNewLabel.setForeground(new Color(101, 183, 65));
		lblNewLabel.setFont(new Font("Cherry Bomb One", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BMI");
		lblNewLabel_1.setBounds(604, 5, 83, 59);
		lblNewLabel_1.setForeground(new Color(255, 181, 52));
		lblNewLabel_1.setFont(new Font("Cherry Bomb One", Font.BOLD, 40));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nam");
		lblNewLabel_2.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 32));
		lblNewLabel_2.setForeground(new Color(221, 112, 112));
		lblNewLabel_2.setBounds(488, 289, 83, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nữ");
		lblNewLabel_3.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 32));
		lblNewLabel_3.setForeground(new Color(221, 112, 112));
		lblNewLabel_3.setBounds(738, 284, 60, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Chiều Cao");
		lblNewLabel_4.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 32));
		lblNewLabel_4.setBounds(322, 377, 157, 46);
		lblNewLabel_4.setForeground(new Color(227, 120, 74));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cân Nặng (kg)");
		lblNewLabel_5.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 25));
		lblNewLabel_5.setBounds(686, 387, 174, 30);
		lblNewLabel_5.setForeground(new Color(227, 120, 74));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Tuổi");
		lblNewLabel_6.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 25));
		lblNewLabel_6.setBounds(983, 382, 71, 41);
		lblNewLabel_6.setForeground(new Color(227, 120, 74));
		contentPane.add(lblNewLabel_6);
		
		JSlider slider = new JSlider();
		slider.setBounds(284, 519, 223, 35);
		contentPane.add(slider);
		
		JLabel lblNewLabel_7 = new JLabel("Tính Toán");
		lblNewLabel_7.setFont(new Font("Baloo 2", Font.BOLD, 30));
		lblNewLabel_7.setBounds(573, 613, 146, 35);
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		contentPane.add(lblNewLabel_7);
		
		JLabel bgImage = new JLabel("");
		bgImage.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/Main_UI.png")));
		bgImage.setBounds(0, 0, 1266, 683);
		contentPane.add(bgImage);
		
	}	
}


