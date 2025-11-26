import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javaz.swing.tree.*;

class TreeDemo extends JFrame{
	Label l;

	TreeDemo(){
		super("JTree Demo");
	DefaultMutableTreeNode root = new 
DefaultMutableTreeNode("Fruits");
	//FRUITS CHILD//
	fruits.add(new DefaultMutableTreeNode("Apple"));
	fruits.add(new DefaultMutableTreeNode("Mango"));
	fruits.add(new DefaultMutableTreeNode("Litchi"));
	
	root.add(fruits);

	DefaultMutableTreeNode root = new 
DefaultMutableTreeNode("Soft Drinks");
	
	softdrinks.add(new DefaultMutableTreeNode("Fanta"));
	softdrinks.add(new DefaultMutableTreeNode("Sprite"));
	
	root.add(softdrinks);

	JTree jt = new JTree(root);

	add(jt);
	
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String...args){
	new TreeDemo();
	}
}
