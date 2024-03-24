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
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class AppBMI_UI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtheight;
	private JTextField txtWeight;
	private JTextField txtAge;
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
		
		JLabel lblNewLabel_7 = new JLabel("Tính Toán");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		lblNewLabel_7.setBounds(572, 618, 146, 25);
		contentPane.add(lblNewLabel_7);
		
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
		
		JLabel lblNewLabel_4 = new JLabel("Chiều Cao (cm)");
		lblNewLabel_4.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 32));
		lblNewLabel_4.setBounds(284, 377, 232, 46);
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
		
		JSlider sliderHeight = new JSlider();
		sliderHeight.setBounds(284, 519, 223, 35);
		contentPane.add(sliderHeight);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setSelectedIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/male_select.png")));
		tglbtnNewToggleButton.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/male.png")));
		tglbtnNewToggleButton.setBounds(428, 113, 186, 215);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setSelectedIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/female_select.png")));
		tglbtnNewToggleButton_1.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/female.png")));
		tglbtnNewToggleButton_1.setBounds(667, 113, 186, 215);
		contentPane.add(tglbtnNewToggleButton_1);
		
		txtheight = new JTextField();
		txtheight.setForeground(new Color(79, 89, 98));
		txtheight.setHorizontalAlignment(SwingConstants.CENTER);
		txtheight.setBounds(321, 450, 152, 46);
		txtheight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtheight.setOpaque(false);
		txtheight.setBorder(null);
		contentPane.add(txtheight);
		txtheight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeight.setForeground(new Color(79, 89, 98));
		txtWeight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtWeight.setColumns(10);
		txtWeight.setOpaque(false);
		txtWeight.setBorder(null);
		txtWeight.setBounds(718, 450, 100, 35);
		contentPane.add(txtWeight);
		
		txtAge = new JTextField();
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setForeground(new Color(79, 89, 98));
		txtAge.setColumns(10);
		txtAge.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtAge.setOpaque(false);
		txtAge.setBorder(null);
		txtAge.setBounds(963, 450, 100, 35);
		contentPane.add(txtAge);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/btn.png")));
		btnNewButton.setBounds(514, 600, 255, 62);
		contentPane.add(btnNewButton);
		

		
		JLabel bgImage = new JLabel("");
		bgImage.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/Main_UI.png")));
		bgImage.setBounds(0, 0, 1266, 683);
		contentPane.add(bgImage);
		
	}	
}


