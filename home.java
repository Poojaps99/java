import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class home extends Applet implements MouseListener
	{
		Color c =Color.blue;
	public void init()
	{
	Label l;
	l = new Label("hello");
	l.setBounds(180,190,40,150);
	add (l);
	addMouseListener(this);
	}
	public void paint(Graphics g)
		{		
		g.drawRect (100,150,200,200);
		g.drawLine(100,150,200,50);
		g.drawLine(300,150,200,50);
		g.setColor(c);
		g.fillRect (180,190,40,150);		
		}
	public void mouseClicked(MouseEvent me)
		{
			c=Color.red;
		// g.setColor(Color.red);
		// g.fillRect (180,190,40,150);
		repaint();
		}
	public void mouseExited(MouseEvent me){}
	public void mouseMoved(MouseEvent me){}
	public void mouseDragged(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	}
/*
<applet code="home.class" width="500" height="500">
</applet>
*/