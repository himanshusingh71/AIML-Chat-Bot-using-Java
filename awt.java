import java.awt.*;

class awt extends Frame{
	awt()
	{
		Button b = new Button("hello");
		b.setBounds(10,20,60,50);
		setSize(200,100);
		add(b);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		awt obj = new awt();
	}

}