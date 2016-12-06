package Server;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainwid extends Frame implements ActionListener{
	Button la1;
	Button la2;
	Panel p;
	static int y=0;
	public mainwid() {
	    this.setVisible(true);
		this.setSize(1000,600);
		la1=new Button("ok");
		la1.setSize(50, 50);
		p=new Panel();
		p.setSize(500,500);
		p.add(la1);
		this.add(p);
		la1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getSource());
		la2=new Button("hello");
		la2.setSize(50,50);
		if(e.getSource().equals(la1)){
			
			la2.setLocation(0,y);
			p.add(la2);
			y+=50;
		}
	}
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
	}
	public static void main(String[] args) {
		new mainwid();
	}
}
