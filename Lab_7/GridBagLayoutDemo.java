import java.awt.*;
import javax.swing.*;
class GridBagLayoutDemo extends JFrame{

   public GridBagLayoutDemo(){
                   setLayout(new GridBagLayout());
                   JLabel label1 = new JLabel("Name");
                   JLabel label2 = new JLabel("Bio");
                   JLabel label3 = new JLabel("Country");
                   JLabel label4 = new JLabel("Hobbies");
                   JLabel label5 = new JLabel("Gender");
                   JLabel label6 = new JLabel("Programming Laguage");
                   JTextField name = new JTextField(20);
                   JTextField bio = new JTextField(50);
                   JButton login = new JButton("Login");
                   Choice co = new Choice();
                   co.add("Nepal");
                   co.add("India");
                   co.add("China");
                   JRadioButton rb1=new JRadioButton("Dancing");
                   JRadioButton rb2=new JRadioButton("Reading");
                   JRadioButton rb3=new JRadioButton("Singing");
                   JRadioButton rb11=new JRadioButton("Male");
                   JRadioButton rb12=new JRadioButton("Female");
                   JRadioButton rb13=new JRadioButton("Others");
                   ButtonGroup bg=new ButtonGroup();
                   bg.add(rb11);bg.add(rb12);bg.add(rb13);
                   DefaultListModel<String> l1 = new DefaultListModel<>(); 
                   l1.addElement("PHP");  
                   l1.addElement("C");  
                   l1.addElement("C++"); 
                   l1.addElement("Java");
                   l1.addElement("Java Script");
                   l1.addElement("Python");
                   JList<String> list = new JList<>(l1);
                   add(label1, 0, 0, 1, 1);
                   add(label2, 0, 1, 1, 1);
                   add(label3, 0, 2, 1, 1);
                   add(label4, 0, 3, 1, 1);
                   add(label5, 0, 6, 1, 1);
                   add(label6, 0, 9, 1, 1);
                   add(name, 1, 0, 1, 1);
                   add(bio, 1, 1, 1, 1);
                   add(co, 1, 2, 1, 1);
                   add(rb1, 1, 3, 1, 1);
                   add(rb2, 1, 4, 1, 1);
                   add(rb3, 1, 5, 1, 1);
                   add(rb11, 1, 6, 1, 1);
                   add(rb12, 1, 7, 1, 1);
                   add(rb13, 1, 8, 1, 1);
                   add(list, 1, 9, 1, 1);
                   setBounds(100, 100, 200, 100);
                   setVisible(true);
                   setSize(900,900);
                   setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

         }
         public void add(Component c, int x, int y, int w, int h){
                   GridBagConstraints gbc = new GridBagConstraints();
                   gbc.gridx = x;
                   gbc.gridy = y;
                   gbc.gridwidth = w;
                   gbc.gridheight = h;
                   add(c, gbc);
      }

public static void main(String[] args) {
	new GridBagLayoutDemo();
}

}