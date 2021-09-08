/* applet program to draw line, circle, rectangle*/

import java.applet.Applet;  
import java.awt.Graphics;  
public class first extends Applet
	{  
  	public void paint(Graphics g)
		{  
		g.drawLine(100,100,50,50);
           	g.drawRect(100,60,40,30);  
		g.drawOval(130,10,50,50);
		}  
	}  
/* 
<applet code="first.class" width="300" height="300"> 
</applet> 
*/  