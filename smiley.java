import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class smiley extends Applet implements ActionListener
	{
	TextField T1,T2,T3,T4,T5;
	Label l,l2;
	Button B1;
	String str;
     	public smiley()
		{
	        T1 = new TextField(10);	
	        T2 = new TextField(10);		
	        T3 = new TextField(10);		
		T4 = new TextField(10);	
		T5 = new TextField(10);
		l = new Label("enter 5 numbers");
		l2 = new Label();
	        B1 = new Button("Click");
		add(l);
		add(T1);
	        add(T2);
	        add(T3);
		add(T4);
		add(T5);
		add(B1);
		add(l2);
		T1.setText("");
	        T2.setText("");
        	T3.setText("");
		T4.setText("");
		T5.setText("");
		B1.addActionListener(this);
		str="";
        	}
	public void actionPerformed(ActionEvent e1)
		{
		int a,b,c,d,e,av=0;
		
             	a=Integer.parseInt(T1.getText());
             	b=Integer.parseInt(T2.getText());
             	c=Integer.parseInt(T3.getText());
		d=Integer.parseInt(T2.getText());
             	e=Integer.parseInt(T3.getText());
		av=(a+b+c+d+e)/5;
		
		if(av>50)
			str="yes";
		else
			str="no";
		
		repaint();	
		}
	public void paint(Graphics g)
		{
		super.paint(g);
		g.drawString(str,550,550);
		if(str=="yes")
			{
			g.drawOval(200,110,110,110);
			g.setColor(Color.black);
			g.fillOval(220,130,20,20);
			g.fillOval(270,130,20,20);
			g.drawArc(230,180,50,20,180,180);
			}
		else if(str=="no")
			{
			g.drawOval(200,110,110,110);
			g.setColor(Color.black);
			g.fillOval(220,130,20,20);
			g.fillOval(270,130,20,20);
			g.drawArc(230,180,50,20,-180,-180);
			}
		}			
	
	public static void main(String[] args)
		{
		new smiley();
		}
	}
/*
<applet code="smiley.class" width="500" height="500">
</applet>
*/