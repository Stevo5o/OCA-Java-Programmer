import javax.swing.*;
import java.awt.*;

class Drawing extends JFrame
{
	private JPanel panel;
		
	public Drawing()
	{
		setSize(300, 300);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			panel = new JPanel()
			{				
			@Override
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);			
				Graphics2D eg = (Graphics2D) g;
				eg.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
				eg.setColor(Color.BLACK);
				eg.drawString("SteJ theWhiteFox", 40, 120);				
			}		
		};
		
		Container mainP = getContentPane();
		mainP.add(panel);
		panel.setBackground(Color.WHITE);
		setVisible(true);
	}		
	
	public static void main(String [] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				new Drawing();
			}
		});
	}
}