package FlappyBird;

import javax.swing.Timer;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class FlappyBird implements ActionListener {
    
	public static FlappyBird flappyBird;
	public final int WIDTH = 500;
	public final int HEIGHT = 500;
	
	public Renderer renderer;
	
	public Rectangle bird;
	
	public FlappyBird(){
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		renderer = new Renderer();
		
		jframe.add(renderer);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH,HEIGHT);
		jframe.setVisible(true);
		jframe.setResizable(false);
		
		bird = new Rectangle(WIDTH/2 - 10, HEIGHT/2 - 10, 20, 20);
		
		timer.start();
		
	}
    
	public void actionPerformed(ActionEvent e){
		renderer.repaint();
	}
	
	public void repaint(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		g.setColor(Color.black);
		g.fillRect(0, HEIGHT - 150, WIDTH, 150);
		
		g.setColor(Color.cyan);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
	}

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }



}