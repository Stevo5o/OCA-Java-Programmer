import javax.swing.JFrame;

// MyWindow is-a JFrame 

class MyWindow extends JFrame
{
	public static void main(String [] args)
	{
		new MyWindow();
	}
	
	public MyWindow()
	{
		setSize(300, 300);
		setVisible(true);
		setTitle("My Window");
	}
}

// displays a window MyWindow