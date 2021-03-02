import  java.awt.*;
import  java.applet.*;
public class ImageDemo extends Applet{
  Image picture;
public void init()
{
	
	
	public void init()
	{
		picture=getImage(getDocumentBase(),"new.jpeg");
	}
	public void paint(Graphics g)
	{ 
	  g.drawImage(picture,50,50,this);
	}
}
}