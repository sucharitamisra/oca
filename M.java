import javax.swing.JFrame;


import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import java.awt.Insets;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;

import java.io.IOException;


import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import javax.swing.JMenuBar;
import javax.swing.JMenu;


public class MyExercise extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	
	
	public MyExercise() throws BiffException, IOException{
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		
		JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
	    
	    JMenu mnFile = new JMenu("File");
	    menuBar.add(mnFile);
	    
	    JMenu mnEdit = new JMenu("Edit");
	    menuBar.add(mnEdit);
	    
	    JMenu mnNewMenu = new JMenu("Help");
	    menuBar.add(mnNewMenu);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		GridBagConstraints gbc_lblAccountNumber = new GridBagConstraints();
		gbc_lblAccountNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblAccountNumber.anchor = GridBagConstraints.EAST;
		gbc_lblAccountNumber.gridx = 0;
		gbc_lblAccountNumber.gridy = 0;
		panel.add(lblAccountNumber, gbc_lblAccountNumber);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		final JLabel lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		final JButton btnNewButton = new JButton("LIR");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 0;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		final JButton btnNewButton_1 = new JButton("Devices");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 7;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		panel_1.add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Card Members", null, panel_2, null);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 5, 0);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 0;
		panel_2.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{241, 0, 59, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
	
	/*** retrieving dynamic values from an excel sheet*/	
		String FilePath = "Book1.xls";
        FileInputStream fs = new FileInputStream(FilePath);
        Workbook wb = Workbook.getWorkbook(fs);
        final Sheet sh = wb.getSheet("Sheet1");
        int totalNoOfRows = sh.getRows();
        int count = 0;
        final JTable table = new JTable(totalNoOfRows, 3);
  	  
  	    
       JScrollPane scrollPane = new JScrollPane(table);
       GridBagConstraints gbc_scroll = new GridBagConstraints();
       gbc_scroll.fill = GridBagConstraints.BOTH;
       gbc_scroll.gridwidth = 2;
       gbc_scroll.gridx = 0;
       gbc_panel_4.fill = GridBagConstraints.BOTH;
	   gbc_panel_4.gridx = 0;
	   gbc_panel_4.gridy = 0;
       panel_4.add(scrollPane,gbc_scroll);
         
        
 final int dialogButton = JOptionPane.YES_NO_OPTION;
 for ( int row= 0; row < totalNoOfRows; row++) {
              table.setValueAt(sh.getCell(1, count).getContents(), count, 0);
              table.setValueAt(sh.getCell(2, count).getContents(), count, 1);
              table.setValueAt(sh.getCell(3, count).getContents(), count, 2);
              count++;
    	 }
         table.addMouseListener(new MouseAdapter() {
        	 @Override
        	 public void mousePressed(MouseEvent arg0) {
        		 if (arg0.getButton() == MouseEvent.BUTTON1){
        			 System.out.println("Left button clicked");
        			 int x= table.getSelectedRow();
        			 if(table.getSelectedRow()==x){
        				 System.out.println("hi");
        				 textField.setText(sh.getCell(0, x).getContents());
        				 textField_1.setText(sh.getCell(12, x).getContents());
        				 textField_2.setText(sh.getCell(4, x).getContents());
        				 textField_3.setText(sh.getCell(5, x).getContents());
        				 textField_4.setText(sh.getCell(6, x).getContents());
        				 textField_5.setText(sh.getCell(7, x).getContents());
        				 
        				 textField_6.setText(sh.getCell(8, x).getContents());
        				 textField_7.setText(sh.getCell(9, x).getContents());
        				 textField_8.setText(sh.getCell(10, x).getContents());
        				 textField_9.setText(sh.getCell(11, x).getContents());
        			 }
        			 
        		 }
        		 
        		 
        		 
        		 if (arg0.getButton() == MouseEvent.BUTTON3) {
        			 System.out.println("Right button clicked");
        			 final int dialogResult = JOptionPane.showConfirmDialog(table, "Do you Want to add new Cardmember", "Confirm", dialogButton);
        			 if(dialogResult == 0) {
        				 System.out.println("Yes option");
        				 JFrame f=new JFrame("New Card Member");
        				 GridBagLayout gridBagLayout = new GridBagLayout();
        				    gridBagLayout.columnWidths = new int[]{0, 0, 0};
        				    gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
        				    gridBagLayout.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
        				    gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
        				    f.setLayout(gridBagLayout);
        				    
        				    JLabel lblNewLabel = new JLabel("Card Member Name");
        				    GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        				    gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
        				    gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        				    gbc_lblNewLabel.gridx = 0;
        				    gbc_lblNewLabel.gridy = 0;
        				    f.add(lblNewLabel, gbc_lblNewLabel);
        				    
        				    textField = new JTextField();
        				    GridBagConstraints gbc_textField = new GridBagConstraints();
        				    gbc_textField.insets = new Insets(0, 0, 5, 0);
        				    gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        				    gbc_textField.gridx = 1;
        				    gbc_textField.gridy = 0;
        				   f.add(textField, gbc_textField);
        				    textField.setColumns(10);
        				    
        				    JLabel lblNewLabel_1 = new JLabel("SSN");
        				    GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
        				    gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
        				    gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
        				    gbc_lblNewLabel_1.gridx = 0;
        				    gbc_lblNewLabel_1.gridy = 1;
        				    f.add(lblNewLabel_1, gbc_lblNewLabel_1);
        				    
        				    textField_1 = new JTextField();
        				    GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        				    gbc_textField_1.insets = new Insets(0, 0, 5, 0);
        				    gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
        				    gbc_textField_1.gridx = 1;
        				    gbc_textField_1.gridy = 1;
        				    f.add(textField_1, gbc_textField_1);
        				    textField_1.setColumns(10);
        				    
        				    JLabel lblNewLabel_2 = new JLabel("MMN");
        				    GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
        				    gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
        				    gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
        				    gbc_lblNewLabel_2.gridx = 0;
        				    gbc_lblNewLabel_2.gridy = 2;
        				   f.add(lblNewLabel_2, gbc_lblNewLabel_2);
        				    
        				    textField_2 = new JTextField();
        				    GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        				    gbc_textField_2.insets = new Insets(0, 0, 5, 0);
        				    gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
        				    gbc_textField_2.gridx = 1;
        				    gbc_textField_2.gridy = 2;
        				    f.add(textField_2, gbc_textField_2);
        				    textField_2.setColumns(10);
        				    
        				    JLabel lblNewLabel_3 = new JLabel("Type of Card Member");
        				    GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
        				    gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
        				    gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
        				    gbc_lblNewLabel_3.gridx = 0;
        				    gbc_lblNewLabel_3.gridy = 3;
        				    f.add(lblNewLabel_3, gbc_lblNewLabel_3);
        				    
        				    textField_3 = new JTextField();
        				    GridBagConstraints gbc_textField_3 = new GridBagConstraints();
        				    gbc_textField_3.insets = new Insets(0, 0, 5, 0);
        				    gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
        				    gbc_textField_3.gridx = 1;
        				    gbc_textField_3.gridy = 3;
        				   f.add(textField_3, gbc_textField_3);
        				    textField_3.setColumns(10);
        				    
        				    JLabel lblNewLabel_4 = new JLabel("Address");
        				    GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
        				    gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
        				    gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
        				    gbc_lblNewLabel_4.gridx = 0;
        				    gbc_lblNewLabel_4.gridy = 4;
        				    f.add(lblNewLabel_4, gbc_lblNewLabel_4);
        				    
        				    textField_4 = new JTextField();
        				    GridBagConstraints gbc_textField_4 = new GridBagConstraints();
        				    gbc_textField_4.insets = new Insets(0, 0, 5, 0);
        				    gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
        				    gbc_textField_4.gridx = 1;
        				    gbc_textField_4.gridy = 4;
        				    f.add(textField_4, gbc_textField_4);
        				    textField_4.setColumns(10);
        				    
        				    JButton btnNewButton = new JButton("Save");
        				    GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        				    gbc_btnNewButton.anchor = GridBagConstraints.EAST;
        				    gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
        				    gbc_btnNewButton.gridx = 0;
        				    gbc_btnNewButton.gridy = 5;
        				    f.add(btnNewButton, gbc_btnNewButton);
        				    
        				    JButton btnNewButton_1 = new JButton("Cancel");
        				    GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
        				    gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
        				    gbc_btnNewButton_1.gridx = 1;
        				    gbc_btnNewButton_1.gridy = 5;
        				    f.add(btnNewButton_1, gbc_btnNewButton_1);
        				 f.setVisible(true);
        				 f.setSize(300, 500);
        				 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        				 
        			 } 
        		 }else {
        			 System.out.println("No Option");
        		 } 
        		 
        		 
        	 }
         });	 
         
         
         
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.gridwidth = 2;
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.fill = GridBagConstraints.BOTH;
		gbc_panel_6.gridx = 2;
		gbc_panel_6.gridy = 0;
		panel_4.add(panel_6, gbc_panel_6);
		GridBagLayout gbl_panel_6 = new GridBagLayout();
		gbl_panel_6.columnWidths = new int[]{0, 0, 0};
		gbl_panel_6.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_6.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_6.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_6.setLayout(gbl_panel_6);
	
		UIManager.getDefaults().put("TitledBorder.titleColor", Color.BLACK);
		 Border lowerEtched2 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	        TitledBorder title2 = BorderFactory.createTitledBorder(lowerEtched2, "Misc Information");
	        Font titleFont2 = UIManager.getFont("TitledBorder.font");
	        title2.setTitleFont( titleFont2.deriveFont(Font.ITALIC + Font.BOLD) );
	        panel_6.setBorder(title2);
		
		
		JLabel lblEmail = new JLabel("Email");
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.anchor = GridBagConstraints.EAST;
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 1;
		panel_6.add(lblEmail, gbc_lblEmail);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel_6.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPreferences = new JLabel("Preferences");
		GridBagConstraints gbc_lblPreferences = new GridBagConstraints();
		gbc_lblPreferences.insets = new Insets(0, 0, 5, 5);
		gbc_lblPreferences.gridx = 0;
		gbc_lblPreferences.gridy = 2;
		panel_6.add(lblPreferences, gbc_lblPreferences);
		
		JCheckBox chckbxEmail = new JCheckBox("Email");
		GridBagConstraints gbc_chckbxEmail = new GridBagConstraints();
		gbc_chckbxEmail.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxEmail.gridx = 0;
		gbc_chckbxEmail.gridy = 3;
		panel_6.add(chckbxEmail, gbc_chckbxEmail);
		
		JCheckBox chckbxPhone = new JCheckBox("Phone");
		GridBagConstraints gbc_chckbxPhone = new GridBagConstraints();
		gbc_chckbxPhone.gridx = 1;
		gbc_chckbxPhone.gridy = 3;
		panel_6.add(chckbxPhone, gbc_chckbxPhone);
		
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.insets = new Insets(0, 0, 5, 0);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 1;
		panel_2.add(panel_5, gbc_panel_5);
		GridBagLayout gbl_panel_5 = new GridBagLayout();
		gbl_panel_5.columnWidths = new int[]{0, 0, 0};
		gbl_panel_5.rowHeights = new int[]{0, 0};
		gbl_panel_5.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_5.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_5.setLayout(gbl_panel_5);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 0, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		panel_5.add(panel_7, gbc_panel_7);
		GridBagLayout gbl_panel_7 = new GridBagLayout();
		gbl_panel_7.columnWidths = new int[]{0, 0, 0};
		gbl_panel_7.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_7.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_7.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_7.setLayout(gbl_panel_7);
		UIManager.getDefaults().put("TitledBorder.titleColor", Color.BLACK);
		 Border lowerEtched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	        TitledBorder title = BorderFactory.createTitledBorder(lowerEtched, "Physical Address");
	        Font titleFont = UIManager.getFont("TitledBorder.font");
	        title.setTitleFont( titleFont.deriveFont(Font.ITALIC + Font.BOLD) );
	        panel_7.setBorder(title);
		
		JLabel lblNewLabel_1 = new JLabel("Street");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE_TRAILING;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_7.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 0;
		panel_7.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("City");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_7.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 1;
		panel_7.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("ZIP");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 2;
		panel_7.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 2;
		panel_7.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("State");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 3;
		panel_7.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 3;
		panel_7.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 1;
		gbc_panel_8.gridy = 0;
		panel_5.add(panel_8, gbc_panel_8);
		GridBagLayout gbl_panel_8 = new GridBagLayout();
		gbl_panel_8.columnWidths = new int[]{0, 0, 0};
		gbl_panel_8.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel_8.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_8.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_8.setLayout(gbl_panel_8);
		
		UIManager.getDefaults().put("TitledBorder.titleColor", Color.BLACK);
		 Border lowerEtched1 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	        TitledBorder title1 = BorderFactory.createTitledBorder(lowerEtched1, "Personal Address");
	        Font titleFont1 = UIManager.getFont("TitledBorder.font");
	        title1.setTitleFont( titleFont1.deriveFont(Font.ITALIC + Font.BOLD) );
	        panel_8.setBorder(title1);
		
		
		JLabel lblNewLabel_5 = new JLabel("MMN");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		panel_8.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 0);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 0;
		panel_8.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("DOB");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		panel_8.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 0);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 1;
		panel_8.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("SSN");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 2;
		panel_8.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 0);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 2;
		panel_8.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Mobile");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 3;
		panel_8.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 1;
		gbc_textField_9.gridy = 3;
		panel_8.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 2;
		panel_2.add(panel_9, gbc_panel_9);
		GridBagLayout gbl_panel_9 = new GridBagLayout();
		gbl_panel_9.columnWidths = new int[]{0, 0, 0};
		gbl_panel_9.rowHeights = new int[]{0, 0};
		gbl_panel_9.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_9.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_9.setLayout(gbl_panel_9);
		
		JButton btnNewButton_2 = new JButton("Update");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 0;
		panel_9.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Cancel");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_3.gridx = 1;
		gbc_btnNewButton_3.gridy = 0;
		panel_9.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Materials", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 0);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 0;
		panel_3.add(panel_10, gbc_panel_10);
		GridBagLayout gbl_panel_10 = new GridBagLayout();
		gbl_panel_10.columnWidths = new int[]{341, 0, 0};
		gbl_panel_10.rowHeights = new int[]{0, 0};
		gbl_panel_10.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_10.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel_10.setLayout(gbl_panel_10);
		
	
		
	
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Materials") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Account Materials");
						node_1.add(new DefaultMutableTreeNode("Statement Back"));
						node_1.add(new DefaultMutableTreeNode("CBB Partner Broucher"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Additional Materials");
						node_1.add(new DefaultMutableTreeNode("More Application"));
						node_1.add(new DefaultMutableTreeNode("Open Road Application"));
					add(node_1);
				}
			}
		));
		GridBagConstraints gbc_tree = new GridBagConstraints();
		gbc_tree.insets = new Insets(0, 0, 0, 5);
		gbc_tree.fill = GridBagConstraints.BOTH;
		gbc_tree.gridx = 0;
		gbc_tree.gridy = 0;
		panel_10.add(tree, gbc_tree);
		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 1;
		gbc_panel_12.gridy = 0;
		panel_10.add(panel_12, gbc_panel_12);
		GridBagLayout gbl_panel_12 = new GridBagLayout();
		gbl_panel_12.columnWidths = new int[]{0, 0};
		gbl_panel_12.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_12.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_12.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_12.setLayout(gbl_panel_12);
		
		JLabel lblSelectCardmember = new JLabel("Select CardMember");
		GridBagConstraints gbc_lblSelectCardmember = new GridBagConstraints();
		gbc_lblSelectCardmember.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectCardmember.gridx = 0;
		gbc_lblSelectCardmember.gridy = 0;
		panel_12.add(lblSelectCardmember, gbc_lblSelectCardmember);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		panel_12.add(comboBox, gbc_comboBox);
		
		JLabel lblSelectAddress = new JLabel("Select Address");
		GridBagConstraints gbc_lblSelectAddress = new GridBagConstraints();
		gbc_lblSelectAddress.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectAddress.gridx = 0;
		gbc_lblSelectAddress.gridy = 2;
		panel_12.add(lblSelectAddress, gbc_lblSelectAddress);
		
		JRadioButton rdbtnPhysicalAddress = new JRadioButton("Physical Address");
		GridBagConstraints gbc_rdbtnPhysicalAddress = new GridBagConstraints();
		gbc_rdbtnPhysicalAddress.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnPhysicalAddress.gridx = 0;
		gbc_rdbtnPhysicalAddress.gridy = 3;
		panel_12.add(rdbtnPhysicalAddress, gbc_rdbtnPhysicalAddress);
		
		JRadioButton rdbtnBusinessAddress = new JRadioButton("Business Address");
		GridBagConstraints gbc_rdbtnBusinessAddress = new GridBagConstraints();
		gbc_rdbtnBusinessAddress.gridx = 0;
		gbc_rdbtnBusinessAddress.gridy = 4;
		panel_12.add(rdbtnBusinessAddress, gbc_rdbtnBusinessAddress);
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 1;
		panel_3.add(panel_11, gbc_panel_11);
		GridBagLayout gbl_panel_11 = new GridBagLayout();
		gbl_panel_11.columnWidths = new int[]{0, 0, 0};
		gbl_panel_11.rowHeights = new int[]{0, 0};
		gbl_panel_11.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_11.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_11.setLayout(gbl_panel_11);
		
		JButton btnNewButton_4 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 0;
		panel_11.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_5.gridx = 1;
		gbc_btnNewButton_5.gridy = 0;
		panel_11.add(btnNewButton_5, gbc_btnNewButton_5);
		setVisible(true);
	    setSize(600,400);
	    
	    
	    
	}
	
	
	public static void main(String[] args) throws BiffException, IOException {
		new MyExercise();

	}

	
}
Pallapu, Nithin