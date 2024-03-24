package ntu.NguyenKhacDuyHung_63132095;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
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
	private JSlider sliderHeight;
	private JToggleButton tglbtnNam;
	private JToggleButton tglbtnNu;
	private JButton btnSubmit;
	private JButton btntang_age;
	private JButton btngiam_age;
	private JButton btntang_weight;
	private JButton btngiam_weight;
	
	private int countAge = 0;
	private float countweight = 0;
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
		
		btntang_weight = new JButton("");
		btntang_weight.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/btncong.png")));
		btntang_weight.setOpaque(false);
		btntang_weight.setBounds(780, 510, 51, 46);
		contentPane.add(btntang_weight);
		
		btngiam_weight = new JButton("");
		btngiam_weight.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/btntru.png")));
		btngiam_weight.setOpaque(false);
		btngiam_weight.setBounds(710, 510, 51, 46);
		contentPane.add(btngiam_weight);
		
		btntang_age = new JButton("");
		btntang_age.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/btncong.png")));
		btntang_age.setOpaque(false);
		btntang_age.setBounds(1024, 505, 51, 46);
		contentPane.add(btntang_age);
		
		btngiam_age = new JButton("");
		btngiam_age.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/btntru.png")));
		btngiam_age.setOpaque(false);
		btngiam_age.setBounds(950, 505, 51, 46);
		contentPane.add(btngiam_age);
		
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
		lblNewLabel_2.setBounds(485, 87, 83, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nữ");
		lblNewLabel_3.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 32));
		lblNewLabel_3.setForeground(new Color(221, 112, 112));
		lblNewLabel_3.setBounds(732, 82, 60, 35);
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
		
		sliderHeight = new JSlider(JSlider.HORIZONTAL, 100, 250, 150);
		sliderHeight.setBounds(284, 510, 223, 46);
		sliderHeight.setMinorTickSpacing(1);
		sliderHeight.setMajorTickSpacing(25);

		sliderHeight.setPaintLabels(true);
		contentPane.add(sliderHeight);
		
		sliderHeight.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				 // Lấy giá trị mới từ Slider
				int height = sliderHeight.getValue();
				 // Cập nhật giá trị TextField với giá trị mới
                txtheight.setText(String.valueOf(height));
			}
		});
		
		
		tglbtnNam = new JToggleButton("");
		tglbtnNam.setSelectedIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/male_select.png")));
		tglbtnNam.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/male.png")));
		tglbtnNam.setBounds(428, 113, 186, 215);
		contentPane.add(tglbtnNam);
		
		tglbtnNu = new JToggleButton("");
		tglbtnNu.setSelectedIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/female_select.png")));
		tglbtnNu.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/female.png")));
		tglbtnNu.setBounds(665, 113, 186, 215);
		contentPane.add(tglbtnNu);
		
		txtheight = new JTextField();
		txtheight.setText("150");
		txtheight.setForeground(new Color(79, 89, 98));
		txtheight.setHorizontalAlignment(SwingConstants.CENTER);
		txtheight.setBounds(321, 450, 152, 46);
		txtheight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtheight.setOpaque(false);
		txtheight.setBorder(null);
		contentPane.add(txtheight);
		txtheight.setColumns(10);
		txtheight.setEditable(false);
		
		txtWeight = new JTextField();
		txtWeight.setText("50");
		txtWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtWeight.setForeground(new Color(79, 89, 98));
		txtWeight.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtWeight.setColumns(10);
		txtWeight.setOpaque(false);
		txtWeight.setBorder(null);
		txtWeight.setBounds(718, 450, 100, 35);
		contentPane.add(txtWeight);
		
		txtAge = new JTextField();
		txtAge.setText("20");
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setForeground(new Color(79, 89, 98));
		txtAge.setColumns(10);
		txtAge.setFont(new Font("Baloo 2 ExtraBold", Font.BOLD, 30));
		txtAge.setOpaque(false);
		txtAge.setBorder(null);
		txtAge.setBounds(963, 450, 100, 35);
		contentPane.add(txtAge);
		
		btnSubmit = new JButton("Tính Toán");
		btnSubmit.setBackground(new Color(255, 255, 255));
		btnSubmit.setForeground(new Color(0, 128, 64));
		btnSubmit.setFont(new Font("Baloo 2", Font.BOLD, 30));
		btnSubmit.setBounds(512, 595, 255, 62);
		contentPane.add(btnSubmit);
		

		

		
		JLabel bgImage = new JLabel("");
		bgImage.setIcon(new ImageIcon(AppBMI_UI.class.getResource("/images/Main_UI.png")));
		bgImage.setBounds(0, 0, 1266, 683);
		contentPane.add(bgImage);
		
		
		btntang_age.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String strAge = txtAge.getText().toString();
		        int age = Integer.parseInt(strAge);
		        
		        countAge = age;
		        countAge++;
		        
		        txtAge.setText(String.valueOf(countAge));
		    }
		});

		btngiam_age.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String strAge = txtAge.getText().toString();
		        
	            int age = Integer.parseInt(strAge);
	            
	            if(age < 0) {
	            	countAge = 0;
	            }
	            if(age != 0) {
		            countAge = age;
		            countAge--;
	            }
	            txtAge.setText(String.valueOf(countAge));


		    }
		});

		btntang_weight.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String strWeight = txtWeight.getText().toString();
		        
	            float weight = Float.parseFloat(strWeight);
	            countweight = weight;
	            countweight++;
	            txtWeight.setText(String.valueOf(countweight));
		    }
		});

		btngiam_weight.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        String strWeight = txtWeight.getText().toString();
		        
	            float weight = Float.parseFloat(strWeight);
	            
	            if(weight < 0) {
	            	countweight = 0;
	            }
	            if(weight != 0) {
		            countweight = weight;
		            countweight--;
	            }
	            txtWeight.setText(String.valueOf(countweight));
		    }
		});
		
		
		
		
		//Xử lý nút Tính toán
		btnSubmit.addActionListener(new ActionListener() {
		    
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        // TODO Auto-generated method stub
		        String strWeight = txtWeight.getText().toString();
		        String strHeight = txtheight.getText().toString();
		        String strAge = txtAge.getText().toString();
		        
		        try {
		            int age = Integer.parseInt(strAge);
		        } catch (NumberFormatException e2) {
		            JOptionPane.showMessageDialog(null, "Định dạng số tuổi không đúng. Vui lòng nhập lại", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
		            txtAge.requestFocus();
		            txtAge.setText("");
		            return;
		        }
		        
		        try {
		            Float weight = Float.parseFloat(strWeight);
		            Float height = Float.parseFloat(strHeight);
		            
		            if (!tglbtnNam.isSelected() && !tglbtnNu.isSelected()) {
		                JOptionPane.showMessageDialog(null, "Bạn chưa chọn giới tính", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
		            } else if (tglbtnNam.isSelected() && tglbtnNu.isSelected()) {
		                JOptionPane.showMessageDialog(null, "Bạn chỉ được chọn một giới tính", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
		            } else {
		                int age = Integer.parseInt(strAge);
		                float bmi = weight / (height * height);
		                
		                if (bmi < 18.5) {
		                    setVisible(false);
		                    UnderWeight thieuCan = new UnderWeight();
		                    thieuCan.setVisible(true);
		                } else if (bmi >= 18.5 && bmi <= 25) {
		                    setVisible(false);
		                    GoodHealth_UI khoemanh = new GoodHealth_UI();
		                    khoemanh.setVisible(true);
		                } else if (bmi > 25 && bmi < 30) {
		                    setVisible(false);
		                    OverWeight thuaCan = new OverWeight();
		                    thuaCan.setVisible(true);
		                } else if (bmi >= 30) {
		                    setVisible(false);
		                    OverWeight beoPhi = new OverWeight();
		                    beoPhi.setVisible(true);
		                }
		            }
		        } catch (NumberFormatException e2) {
		            JOptionPane.showMessageDialog(null, "Cân nặng và chiều cao định dạng không đúng", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		    }
		});
	}
}
		



