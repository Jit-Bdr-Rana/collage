import  java.awt.*;
import  java.applet.*;
 class news extends Applet{
  Image picture;
	public void init()
	{
		picture=getImage(getDocumentBase(),"new.jpeg");
	}
	public void paint(Graphics g)
	{ 
	  g.drawImage(picture,50,50,this);
	}

}