import java.applet.*;
import java.awt.*;
public class PassingParam extends Applet{
 public void paint(Graphics g)
 {
    String name=getParameter("name");
    String address=getParameter("address");
g.drawString(name,250,350);  
g.drawString(address,150,150);  

 }

}