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

public class OverWeight extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OverWeight frame = new OverWeight();
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
	public OverWeight() {
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
		lblNewLabel_3.setBounds(183, 412, 89, 31);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblShowBMI = new JLabel("");
		lblShowBMI.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowBMI.setForeground(new Color(77, 139, 50));
		lblShowBMI.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 60));
		lblShowBMI.setBounds(309, 183, 169, 92);
		contentPane.add(lblShowBMI);
		
		JLabel lblNewLabel_1 = new JLabel("Thừa cân");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 14));
		lblNewLabel_1.setBounds(395, 289, 81, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Chỉ số BMI của bạn");
		lblNewLabel.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		lblNewLabel.setBounds(254, 131, 279, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Chiều cao");
		lblNewLabel_3_1.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(309, 412, 100, 31);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tuổi");
		lblNewLabel_3_2.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(438, 412, 51, 31);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Giới tính");
		lblNewLabel_3_3.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 20));
		lblNewLabel_3_3.setBounds(516, 412, 89, 31);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(859, 112, 309, 142);
		contentPane.add(lblNewLabel_4);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setForeground(new Color(0, 255, 64));
		btnReset.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		btnReset.setBounds(183, 484, 193, 55);
		contentPane.add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setForeground(new Color(255, 128, 128));
		btnExit.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		btnExit.setBounds(412, 484, 193, 55);
		contentPane.add(btnExit);
		
		JLabel bgImage = new JLabel("");
		bgImage.setIcon(new ImageIcon(OverWeight.class.getResource("/images/ThuaCan.png")));
		bgImage.setBounds(0, 0, 1266, 683);
		contentPane.add(bgImage);
		
        AppBMI_UI appBMI_UI = new AppBMI_UI();
        
        // Gọi phương thức TinhToanBMI() để nhận giá trị BMI
        float bmi = appBMI_UI.TinhToanBMI();
        
        // Cập nhật giá trị của lblShowBMI với giá trị BMI
        lblShowBMI.setText(String.valueOf(bmi));
	}

}
