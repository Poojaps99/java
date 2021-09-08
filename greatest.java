/* greatest of 3 numbers*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class greatest extends Applet implements ActionListener
	{
	TextField T1,T2,T3,T4;
	Button B1;
     	public void init()
		{
	        T1 = new TextField(10);	
	        T2 = new TextField(10);		
	        T3 = new TextField(10);		
		T4 = new TextField(10);	
	        B1 = new Button("Click");
		
		add(T1);
	        add(T2);
	        add(T3);
		add(T4);
		add(B1);
		T1.setText("");
	        T2.setText("");
        	T3.setText("");
		T4.setText("");
		B1.addActionListener(this);
        	}
	public void actionPerformed(ActionEvent e)
		{
		int a,b,c,big=0;
		
             	a=Integer.parseInt(T1.getText());
             	b=Integer.parseInt(T2.getText());
             	c=Integer.parseInt(T3.getText());

              	if (a>b) 
			{	
			if (a>c)
                      		big=a;
                  	else
                      		big=c;
                	}
            	else
			{
                  	if (b>c) 
                      		big=b;
                  	else
                      		big=c;
              		}
              	T4.setText(""+big);
              
		}
		
	}

/* 
<applet code="greatest.class" width="300" height="300"> 
</applet> 
*/  