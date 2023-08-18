package QuizApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
   
public class LoginQuiz extends JFrame implements ActionListener{
	JButton rules ,Back;   
	JTextField  nm;
	LoginQuiz()

	{   
		getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1200,500);
	     setLocation(100,100);
		 setVisible(true);

		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image =new JLabel(i1);  //SET THE IMAGE
      add(image);
        image.setBounds(0,0, 600, 500);
        
        JLabel heading =new JLabel("Simple Minds");
        heading.setBounds(800, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(heading);
		heading.setForeground(Color.BLUE);
		 
		
		JLabel name =new JLabel("Enter Your Name");
        name.setBounds(810, 150, 500, 30);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        add(name);
		name.setForeground(Color.BLUE);
		
		 nm=new JTextField();
		nm.setBounds(735, 240, 400, 35);
        nm.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        add(nm);
        
        
         rules=new JButton("Rules");
        rules.setBounds(735, 350, 150, 25);
        rules.setBackground(Color.blue);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        

        Back=new JButton("Back");
        Back.setBounds(975, 350, 150, 25);
        Back.setBackground(Color.blue);
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
		 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== rules) {
			String name=nm.getText();
			setFocusable(false);
			new Rules(name);
		}
		else if(e.getSource()==Back)
		{
			setVisible(false);
		}
             		
	}
	public static void main(String[] args) {
      new LoginQuiz();
	}
	

}
