package ntu.NguyenKhacDuyHung_63132095;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;

public class OverWeight extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private float bmi;
    private int height;
    private float weight;
    private int age;
    private String gioitinh;

	/**
	 * Create the frame.
	 */
	public OverWeight(float bmi, int height, float weight, int age, String gioitinh) {
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
		
		JLabel lblNewLabel_4 = new JLabel("<html>Hãy ổn định chế độ ăn uống,<br> tăng cường hoạt động vận động hàng ngày để giảm cân và duy<br> trì sức khỏe tốt.</html>");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Baloo 2", Font.BOLD, 26));
		lblNewLabel_4.setBounds(875, 90, 434, 205);
		contentPane.add(lblNewLabel_4);;
		
		JLabel lblShowWeight = new JLabel("");
		lblShowWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowWeight.setForeground(new Color(77, 139, 50));
		lblShowWeight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 35));
		lblShowWeight.setBounds(165, 354, 119, 62);
		contentPane.add(lblShowWeight);
		
		JLabel lblShowHeight = new JLabel("");
		lblShowHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowHeight.setForeground(new Color(77, 139, 50));
		lblShowHeight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 35));
		lblShowHeight.setBounds(300, 354, 119, 62);
		contentPane.add(lblShowHeight);
		
		JLabel lblShowAge = new JLabel("");
		lblShowAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowAge.setForeground(new Color(77, 139, 50));
		lblShowAge.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 35));
		lblShowAge.setBounds(415, 354, 89, 62);
		contentPane.add(lblShowAge);
		
		JLabel lblShowGender = new JLabel("");
		lblShowGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowGender.setForeground(new Color(77, 139, 50));
		lblShowGender.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 35));
		lblShowGender.setBounds(513, 354, 89, 62);
		contentPane.add(lblShowGender);
		
		JLabel lblShowBMI = new JLabel("");
		lblShowBMI.setForeground(new Color(77, 139, 50));
		lblShowBMI.setHorizontalAlignment(SwingConstants.CENTER);
		lblShowBMI.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 60));
		lblShowBMI.setBounds(306, 186, 169, 92);
		contentPane.add(lblShowBMI);
		
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
		
		//Làm tròn 1 chữ số thập phân
		lblShowBMI.setText(String.valueOf(Math.round(bmi * 10) / 10.0f));
        lblShowHeight.setText(String.valueOf(height) + "cm");
        lblShowWeight.setText(String.valueOf(weight) + "kg");
        lblShowAge.setText(String.valueOf(age));
        lblShowGender.setText(gioitinh);
        
        
        btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				AppBMI_UI appBMI_UI = new AppBMI_UI();
				appBMI_UI.setVisible(true);
			}
		});
        
        btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int thoat = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn thoát chương trình", "Thông báo", JOptionPane.YES_NO_OPTION);
				if(thoat == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
	}

}
