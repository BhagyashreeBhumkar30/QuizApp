package QuizApp;
 import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Rules  extends JFrame implements ActionListener{
 String name;
 JButton back, start;
	 public Rules(String name)
	
	{  
		this.name =name; 
		getContentPane().setBackground(Color.WHITE);
		setSize(800,650);
		setLocation(350,100);
        setLayout(null);

		
		 JLabel heading =new JLabel("Welcome "  +name+ " to Simple Mind Quiz ");
	        heading.setBounds(50, 25, 700, 25);
	        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,20));
	        add(heading);
			heading.setForeground(Color.BLUE);
			
			JLabel rulelist =new JLabel();
			rulelist.setBounds(20, 90, 700, 350);
			rulelist.setFont(new Font("Tahoma",Font.PLAIN,16));
			rulelist.setText(

	 "<html>"+ 
       "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
	   "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
	   "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
	   "4. Crying is allowed but please do so quietly." + "<br><br>" +
	   "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
	   "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
	   "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
		"8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
	  "<html>"				);
	        add(rulelist);
			heading.setForeground(Color.BLUE);
			
			 back=new JButton("Back");
		        back.setBounds(100, 500, 150, 25);
		        back.setBackground(Color.blue);
		        back.setForeground(Color.WHITE);
		        back.addActionListener(this);
		        add(back);
		        
		        start=new JButton("Start");
		        start.setBounds(500, 500, 150, 25);
		        start.setBackground(Color.blue);
		        start.setForeground(Color.WHITE);
		        start.addActionListener(this);
		        add(start);
		        
			
		setVisible(true);
	}

		public void actionPerformed(ActionEvent e) {
		      if(e.getSource()== start)
		    		  {
		    	        setVisible(false);
		    	        new Start(name);

		    		  }
		      else 
		      {
		    	  setVisible(false);
	    	        new LoginQuiz();
		      }
		      
		}

	public static void main(String[] args) {
       new Rules("User");
	}


	
}
