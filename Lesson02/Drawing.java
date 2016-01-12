import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

class Drawing extends JFrame
{
	private JPanel panel;
	
	public static void main(String [] args)
	{
		new Drawing();
	}
	
	public Drawing()
	{
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			panel = new JPanel()
			{
				
			@Override
			public void paintCompontent(Graphics g)
			{
				// super.paint(g);
				
				int fontSize = 20;
				
				// draw rectangle
				// g.drawRect(50, 50, 100, 50);
				
				// g.setColor(new Color(0, 0, 255));
				// g.drawOval(150, 75, 50, 50);
				
				// g.setColor(Color.GREEN);
				// g.fillRect(50, 100, 100, 50);
				
				g.setColor(Color.BLACK);
				g.drawString("SteJ theWhiteFox", 50, 50);
			}		
		};
	}		
}