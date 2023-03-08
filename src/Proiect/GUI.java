package Proiect;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;

public class GUI {

	private JFrame frmBuilderPc;
	private JTextField txtField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmBuilderPc.setVisible(true);
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

	
	 // Initializare continut din frame
	 
	private void initialize() {
		
		frmBuilderPc = new JFrame();
		frmBuilderPc.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmBuilderPc.getContentPane().setBackground(new Color(255, 255, 255));
		frmBuilderPc.getContentPane().setForeground(Color.DARK_GRAY);
		frmBuilderPc.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\coval\\Desktop\\New folder\\iconita.jfif"));
		frmBuilderPc.setTitle("Builder PC");
		frmBuilderPc.setBackground(new Color(224, 224, 224));
		frmBuilderPc.setBounds(100, 100, 561, 529);
		frmBuilderPc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBuilderPc.getContentPane().setLayout(null);
		
		//Adaugare imagine in frame
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\coval\\Desktop\\New folder\\pcdefrumusete.jfif"));
		lblNewLabel.setBounds(242, 297, 225, 182);
		frmBuilderPc.getContentPane().add(lblNewLabel);
		

		//TextArea pentru afisarea componentelor
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(224, 224, 224));
		textArea.setBounds(178, 40, 194, 115);
		frmBuilderPc.getContentPane().add(textArea);
		textArea.setEditable(false);
		
		//Combo pentru selectarea tip procesor
		
		JComboBox<String> comboProcesor = new JComboBox<String>();
		comboProcesor.setBounds(20, 40, 140, 43);
		frmBuilderPc.getContentPane().add(comboProcesor);
		comboProcesor.addItem("AMD Ryzen� 9 7950X");
		comboProcesor.addItem("Intel� Core� i7-12700F");
		comboProcesor.addItem("AMD Ryzen� 5 5600G");
		
		//Combo pentru selectarea tip de racire
		
		JComboBox<String> comboTipRacire = new JComboBox<String>();
		comboTipRacire.setBounds(20, 280, 140, 43);
		frmBuilderPc.getContentPane().add(comboTipRacire);
		comboTipRacire.addItem("4 x Cooler");
		comboTipRacire.addItem("Lichid");
		comboTipRacire.addItem("2 x Cooler");
		
		//Combo pentru selectarea tip placa de baza
		
		JComboBox<String> comboPlacaDeBaza = new JComboBox<String>();
		comboPlacaDeBaza.setBounds(20, 100, 140, 43);
		frmBuilderPc.getContentPane().add(comboPlacaDeBaza);
		comboPlacaDeBaza.addItem("Asus PRIME X670-P");
		comboPlacaDeBaza.addItem("Asus STRIX X670");
		comboPlacaDeBaza.addItem("ASUS GAMING B650");
		
		//Combo pentru selectarea tip placa video
		
		JComboBox<String> comboPlacaVideo = new JComboBox<String>();
		comboPlacaVideo.setBounds(20, 160, 140, 43);
		frmBuilderPc.getContentPane().add(comboPlacaVideo);
		comboPlacaVideo.addItem("GeForce� RTX 3060");
		comboPlacaVideo.addItem("GeForce GTX 1650");
		comboPlacaVideo.addItem("Radeon� RX 6600");
		comboPlacaVideo.addItem("GeForce� RTX 3050");
		
		//Combo pentru selectarea memoriei ram
		
		JComboBox<String> comboRam = new JComboBox<String>();
		comboRam.setBounds(20, 220, 140, 43);
		frmBuilderPc.getContentPane().add(comboRam);
		comboRam.addItem("8GB");
		comboRam.addItem("16 GB");
		comboRam.addItem("32 GB");
		
		//Combo pentru selectarea tip de stocare
		
		JComboBox<String> comboStocare = new JComboBox<String>();
		comboStocare.setBounds(20, 400, 140, 43);
		frmBuilderPc.getContentPane().add(comboStocare);
		comboStocare.addItem("SSD 256GB");
		comboStocare.addItem("SSD 512GB");
		comboStocare.addItem("SSD 1TB");
		comboStocare.addItem("SSD 2TB");
		
		//Combo pentru selectarea tip de sursa
		
		JComboBox<String> comboSursa = new JComboBox<String>();
		comboSursa.setBounds(20, 340, 140, 43);
		frmBuilderPc.getContentPane().add(comboSursa);
		comboSursa.addItem("Dedicata 500W");
		comboSursa.addItem("Dedicata 650W");
		comboSursa.addItem("Dedicata 750W");
		comboSursa.addItem("Dedicata 900W");
	//Comentariu
		
		//Buton pentru afisarea tipului predefinit ASUS ROG in TextArea
		
		JButton btnRog = new JButton("ASUS ROG");
		btnRog.setBounds(392, 40, 123, 43);
		frmBuilderPc.getContentPane().add(btnRog);
		btnRog.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PCBuilder pc1 = new AsusROG();
				Assambler pc2 = new Assambler(pc1);
				pc2.AssemblyPC();
                PC pc3 = pc2.getPC();
				textArea.setText(pc3.toString());
				
			}
		});
		
		//Buton pentru afisarea tipului predefinit BlackAster in TextArea
		
		JButton btnAster = new JButton("BlackAster");
		btnAster.setBounds(392, 100, 123, 43);
		frmBuilderPc.getContentPane().add(btnAster);
		btnAster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PCBuilder pc1 = new BlackAster();
				Assambler pc2 = new Assambler(pc1);
				pc2.AssemblyPC();
                PC pc3 = pc2.getPC();
				textArea.setText(pc3.toString());
				
				
			}
		});
		
		
		//Buton pentru afisarea tipului predefinit OfficeAsus in TextArea
		
		JButton btnOffice = new JButton("OfficeASUS");
		btnOffice.setBounds(392, 160, 123, 43);
		frmBuilderPc.getContentPane().add(btnOffice);
		btnOffice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				PCBuilder pc1 = new OfficeAsus();
				Assambler pc2 = new Assambler(pc1);
				pc2.AssemblyPC();
                PC pc3 = pc2.getPC();
				textArea.setText(pc3.toString());
				
			}
		});
		
		//TextField pentru introducere noi componente pentru varianta custom
		
		txtField = new JTextField();
		txtField.setText(null);
		txtField.setToolTipText("Scrieti in casuta de text denumirea componentei ce doriti sa o adaugati!\r\n");
		txtField.setBackground(new Color(224, 224, 224));
		txtField.setBounds(178, 189, 194, 43);
		frmBuilderPc.getContentPane().add(txtField);
		txtField.setColumns(10);
//Buton pentru stergere continut din TextField		
		JButton btnCLEARTF = new JButton("CLEAR");
		btnCLEARTF.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnCLEARTF.setBounds(312, 240, 60, 23);
		frmBuilderPc.getContentPane().add(btnCLEARTF);
		btnCLEARTF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(null);
			}
		});		
		
		//Buton pentru afisarea tipului CostumPC in TextArea
		
		JButton btnCustom = new JButton("CustomPC");
		btnCustom.setBounds(392, 243, 123, 43);
		frmBuilderPc.getContentPane().add(btnCustom);
		
	
		btnCustom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String p1 = comboPlacaVideo.getSelectedItem().toString();
				String p2 = comboPlacaDeBaza.getSelectedItem().toString();
				String p3 = comboProcesor.getSelectedItem().toString();
				String p4 = comboRam.getSelectedItem().toString();
				String p5 = comboStocare.getSelectedItem().toString();
				String p6 = comboSursa.getSelectedItem().toString();
				String p7 =comboTipRacire.getSelectedItem().toString();
				
				CustomPC pc = new CustomPC();
				Assambler pc2 = new Assambler(pc);
				
				pc2.AssemblyCustomPC(p1,p2,p3,p4,p5,p6,p7);
				
				PC pc3 = pc2.getPC();
				
				textArea.setText(pc3.toString());
				
			}
		});
		
		//Combo pentru selectie componente noi dorite 		
		JComboBox<String> comboTF = new JComboBox<String>();
		comboTF.setToolTipText("Selectati componenta ce doriti sa o adaugati!");
		comboTF.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboTF.setBounds(178, 240, 74, 23);
		frmBuilderPc.getContentPane().add(comboTF);
		comboTF.addItem("Procesor");
		comboTF.addItem("Placa De Baza");
		comboTF.addItem("Placa Video");
		comboTF.addItem("RAM");
		comboTF.addItem("Tip Racire");
		comboTF.addItem("Sursa");
		comboTF.addItem("Stocare");
		
		

//Buton preluare nume componenta din TextField si adaugare in una din variantele CUSTOM	
						JButton btnADD = new JButton("ADD");
						btnADD.setToolTipText("Dupa apasarea butonului de ADD puteti gasi componenta in campurile de selectare!");
						btnADD.setFont(new Font("Tahoma", Font.PLAIN, 8));
						btnADD.setBounds(252, 240, 60, 23);
						frmBuilderPc.getContentPane().add(btnADD);
				
						btnADD.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String p =comboTF.getSelectedItem().toString();
								
								String gol =txtField.getText();
								int count=gol.length();
			
									if(count==0)
										{
										txtField.setText(null);					
										}
									else
										{
										switch(p) {
										case "Procesor"		   : comboProcesor.addItem(txtField.getText());
												break;
										case "Placa De Baza"   : comboPlacaDeBaza.addItem(txtField.getText());
												break;
										case "Placa Video"     : comboPlacaVideo.addItem(txtField.getText());
												break;
										case "RAM"    		   : comboRam.addItem(txtField.getText());
												break;	
										case "Tip Racire"      : comboTipRacire.addItem(txtField.getText());
												break;
										case "Sursa"     	   : comboSursa.addItem(txtField.getText());
												break;
										case "Stocare"         : comboStocare.addItem(txtField.getText());
												break;	
										}
											
										}
							}
						});		
				
	}
}