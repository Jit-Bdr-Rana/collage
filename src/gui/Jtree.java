package gui;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class Jtree {
JFrame f;
DefaultMutableTreeNode style,color,font,red,green,blue;

Jtree(){
	f=new JFrame();
	style=new DefaultMutableTreeNode("style");
	color=new DefaultMutableTreeNode("color");
	font=new DefaultMutableTreeNode("font");
	red=new DefaultMutableTreeNode("red");
	green=new DefaultMutableTreeNode("green");
	blue=new DefaultMutableTreeNode("blue");
	color.add(red); color.add(blue);color.add(green);
	style.add(color);
	style.add(font);
	JTree jt=new JTree(style);
	f.add(jt);
	f.setSize(200,200);
	f.setVisible(true);

}
public static void main(String []args)
{
	new Jtree();
}
}
