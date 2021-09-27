import java.awt.*;  
import java.awt.event.*;  
public class Drawchoice extends Frame implements ActionListener{  
    String data="";      
	String temp="";
	Button b;
	final Label label;      
	final Choice c;
    public Drawchoice(){  
		
		b = new Button("Show"); 
		b.addActionListener(this);
		c = new Choice();
		label = new Label();   
        c.setBounds(100, 100, 75, 75); 
		b.setBounds(200, 100, 50, 20);    
		label.setSize(400, 100);   
		label.setAlignment(Label.CENTER);    
        c.add("Circle");    
        c.add("Rectangle");    
        c.add("Line");  
		add(label); 
        add(c);  
		add(b);   
        setSize(400, 400);    
        setLayout(null);    
        setVisible(true); 
        
    }         
    public void paint(Graphics g)
    {
		super.paint(g);
		if(data.equals("Line")){
			g.drawLine(300,300,50,50);
		}
		else if(data.equals("Circle")){
			g.drawOval(300,300,50,50);
		}
		else{
			g.drawRect(300,300,50,50);
		}
	}
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource()==b){
			temp = "Shape Selected: "+ c.getItem(c.getSelectedIndex());    
			data=c.getItem(c.getSelectedIndex()); 
			label.setText(temp);
		}
		repaint();
    }  
public static void main(String[] args) {  
    new Drawchoice();  
}  
}  
/*
<applet code="Drawchoice.class" width="300" height="300">
</applet>*/