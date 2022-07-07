import javax.swing.*;
class mycombo extends Jframe{
	mycombo(){
		String[] country = {"india","australia","japan"};
		JComboBox obj = new JComboBox(country);
		obj.setBounds(300,300,100,50);
		add(obj);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		mycombo o = new mycombo();
	}
}