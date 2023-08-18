package QuizApp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Scoure  extends JFrame implements ActionListener{
       Scoure(String name, int Scoure)
       {
    	   setBounds(400,150,750,550);
   		getContentPane().setBackground(Color.white);
           setLayout(null);

   		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
   		Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
   		ImageIcon i3=new ImageIcon(i2);
   		
           JLabel image =new JLabel(i3);  //SET THE IMAGE
            add(image);
           image.setBounds(0,200, 300, 250);
          
           JLabel heading=new JLabel("Thank You  "+name+"  For Playing Simple Mind Quiz");
           heading.setBounds(50,30,700,30);
           heading.setFont(new Font("Lucida Bright",Font.PLAIN,26));
           heading.setForeground(Color.BLUE);
           add(heading);
           
           JLabel lblscore=new JLabel("Your Score  "+Scoure+" !!");
           lblscore.setBounds(350,200,700,30);
           lblscore.setFont(new Font("Modern No. 20",Font.PLAIN,40));
           lblscore.setForeground(Color.GREEN);
           add(lblscore);
           
          JButton  Submit=new JButton("Play Again");
           Submit.setBounds(390, 260, 150, 25);
           Submit.setFont(new Font("Dailog",Font.PLAIN,20));
           Submit.setBackground(Color.blue);
           Submit.setForeground(Color.WHITE);
           Submit.addActionListener(this);
           add(Submit);
             setVisible(true);
       }
       public void actionPerformed(ActionEvent e) {
   		      setVisible (false);
   		      new LoginQuiz();
   	}

	public static void main(String[] args) {
        new Scoure("user",0);
	}
	
}
