package sort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;


public class SortandSHowInGUi extends JFrame  {
// TODO Auto-generated method stub
private JLabel label;
private JTextField field;
private JButton button1;
private JButton button2;
private ArrayList<Integer> list;

	public SortandSHowInGUi() {
		set();
		setVisible(true);
		setTitle("create view");
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	}
	public void set() {
		list = new ArrayList<Integer>();
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		label=new JLabel("0");
		field=new JTextField("type numbers");
		button1=new JButton("add");
		button1.addActionListener(new update());
		panel.add(label);
		panel.add(field);
		panel.add(button1);
		button2 = new JButton("sort and show");
		button2.addActionListener(new sort());
		panel.add(button2);
	}
	
	
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new SortandSHowInGUi() ;
				}
				
				
			});
		
		}
		public class update implements ActionListener {
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method 
				
				
					String s=field.getText();
					boolean errorfound=false;
					if(s==null||s.length()==0) {
						errorfound=true;
						field.setText("0");
						
					}
					
					 
					for(int i=0;i<s.length();i++) {
						if(  !(s.charAt(i) < '9' && s.charAt(i) >= '0')) {
							errorfound=true;
							label.setText("you inputted a value which is not a number");
							
						}
					}
					if(!errorfound) {
					int result = Integer.parseInt(s);			
					System.out.println(result);
					list.add(result);
					
					}
					else {
						label.setText("you inputted a value which is not a number");
					}
					
					
				
			}
			
		    
			
}
		public class sort implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Collections.sort(list);
				label.setText(list.toString());
				field.setText("0");
				
				
				
			}
			
}
}