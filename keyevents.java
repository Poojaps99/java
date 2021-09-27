import java.applet.Applet; 
import java.awt.*; 
import java.awt.event.*; 
 /* <APPLET CODE ="keyevents.class" WIDTH=500 HEIGHT=500> </APPLET> */ 
public class keyevents extends Applet implements KeyListener 
	{ 
        TextArea tpress,trel; 
        TextField t; 
        public void init() 
        	{ 
            	t=new TextField(20); 
           	t.addKeyListener(this); 
            	tpress=new TextArea(3,70); 
            	tpress.setEditable(false); 
            	trel=new TextArea(3,70); 
            	trel.setEditable(false); 
            	add(t); 
            	add(tpress); 
            	add(trel); 
         	} 
        public void keyTyped(KeyEvent e) 
             	{ 
                disppress(e,"Key Typed:"); 
                } 
        public void keyPressed(KeyEvent e) 
                { 
                disppress(e,"KeyPressed:"); 
                } 
        public void keyReleased(KeyEvent e) 
                { 
                String charString,keyCodeString; 
                char c=e.getKeyChar(); 
                int keyCode=e.getKeyCode();                
                charString="Key character='"+c+"'"; 
                keyCodeString="key code="+keyCode+"("+KeyEvent.getKeyText(keyCode)+")";                
                trel.setText("Key released"+charString+keyCodeString);
                } 
         protected void disppress(KeyEvent e,String s) 
                { 
                String charString,keyCodeString,tmpString; 
                char c=e.getKeyChar(); 
                int keyCode=e.getKeyCode();                
                if(Character.isISOControl(c)) 
                	{ 
                        charString="key character=(an unprintable control character)"; 
                        } 
                 else 
                        { 
                        charString="key character='"+c+"'"; 
                        }                 
                  keyCodeString="key code="+keyCode+"("+KeyEvent.getKeyText(keyCode)+")"; 
                  tpress.setText(s+charString);
                  } 
   	}                