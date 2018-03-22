import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class compoundInterest implements ActionListener{
	
	JFrame frame;
	JTextArea textInitAmt, textComPerYear, textRate, textTotal, textYear;
	JLabel labelInitAmt, labelComPerYear, labelRate, labelTotal, labelAmort, labelYear;
	JButton bSubmit;
	
	double a = 0.00;
	double p = 0.00;
	double r = 0.00;
	double n = 0.00;
	double b = 0.00;
	double t = 0.00;
	
	
	compoundInterest() {
		frame=new JFrame("Finance");
		
		textInitAmt = new JTextArea();
		textComPerYear = new JTextArea();
		textRate = new JTextArea();
		textTotal = new JTextArea();
		textYear = new JTextArea();
		
		labelAmort = new JLabel("Compound Interest");
		labelInitAmt = new JLabel("Initial Amount");
		labelComPerYear = new JLabel("Compounds per year");
		labelRate = new JLabel("Rate");
		labelTotal = new JLabel("Total");
		labelYear = new JLabel("Years");
		
		bSubmit = new JButton("Submit");
		
		//amort.setPreferredSize(new Dimension(400, 400));
		
		bSubmit.setBounds(50,220,100,30);
		
		labelAmort.setBounds(30,20,150,30);
		labelInitAmt.setBounds(200,60,100,30);
		labelComPerYear.setBounds(200,100,200,30);
		labelRate.setBounds(200,140,100,30);
		labelYear.setBounds(200,180,100,30);;
		labelTotal.setBounds(200,220,150,30);
		
		
		textInitAmt.setBounds(50,60,100,30);
		textComPerYear.setBounds(50,100,100,30);
		textRate.setBounds(50,140,100,30);
		textYear.setBounds(50,180,100,30);
		textTotal.setBounds(50,260,300,30);
		
		frame.add(labelAmort);
		frame.add(labelInitAmt);
		frame.add(labelComPerYear);
		frame.add(labelRate);
		frame.add(labelTotal);
		frame.add(labelYear);
		
		frame.add(textInitAmt);
		frame.add(textComPerYear);
		frame.add(textRate);
		frame.add(textTotal);
		frame.add(textYear);
		
		frame.add(bSubmit);
		
		frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
		
        bSubmit.addActionListener(this);
        
        
	}
	
	public void actionPerformed(ActionEvent e) {
		p = Double.parseDouble(textInitAmt.getText());
		r = Double.parseDouble(textRate.getText()) / 100;
		n = Double.parseDouble(textComPerYear.getText());
		t = Double.parseDouble(textYear.getText());
		b = (r/n + 1);
		a = p * Math.pow(b, n*t);
		a = Math.round(a*100.0) / 100.0;
		textTotal.setText(""+a);
		
	}
	
	public static void main(String[] args) {
		new compoundInterest();

	}



}
