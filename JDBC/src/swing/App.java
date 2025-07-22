package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setVisible(true);
       // frame.setLayout(new GridLayout(2,2));
        frame.setLayout(null);

        JLabel title = new JLabel("Student Registration");
        title.setBounds(150,50,150,30);

        JLabel uname = new JLabel("Username");
        uname.setBounds(100,100,150,30);
        JLabel email = new JLabel("Email");
        email.setBounds(100,150,150,30);
        JLabel password = new JLabel("Password");
        password.setBounds(100,200,150,30);
        JLabel gender = new JLabel("Gender");
        gender.setBounds(100,250,150,30);
        JLabel lang  =new JLabel("Languages");
        lang.setBounds(100,300,150,30);
        JLabel country = new JLabel("Country");
        country.setBounds(100,400,150,30);

        JTextField t1 = new JTextField();
        t1.setBounds(250,100,150,30);
        JTextField t2 = new JTextField();
        t2.setBounds(250,150,150,30);

        JPasswordField t3 = new JPasswordField();
        t3.setBounds(250,200,150,30);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        male.setBounds(250,250,70,30);
        female.setBounds(330,250,70,30);
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JCheckBox gujarati = new JCheckBox("Gujarati");
        JCheckBox hindi = new JCheckBox("Hindi");
        JCheckBox english = new JCheckBox("English");
        JCheckBox marathi = new JCheckBox("Marathi");

        gujarati.setBounds(250,300,70,30);
        hindi.setBounds(330,300,70,30);
        english.setBounds(250,350,70,30);
        marathi.setBounds(330,350,70,30);

        String str[] = {"India","USA","Canada","UK","AUS"};

        JComboBox<String> countrylist = new JComboBox(str);
        countrylist.setBounds(250,400,150,30);


        JButton btn  =new JButton("Submit");
        btn.setBounds(250,450,150,20);



        JMenuBar menu = new JMenuBar();
        menu.setBounds(0,0,800,30);


        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenu view = new JMenu("View");

        menu.add(file);
        menu.add(help);
        menu.add(view);

        JMenuItem open  =new JMenuItem("Open");
        JMenuItem save  =new JMenuItem("Save");
        JMenuItem saveas  =new JMenuItem("Save As");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               String username  = t1.getText();
               String email = t2.getText();
               String password = t3.getText();
               String gendervalue = null;
               String langVal = "";
               String countryval = (String)countrylist.getSelectedItem();

                if(male.isSelected())
                {
                    gendervalue = male.getText();
                }
                else if(female.isSelected())
                {
                    gendervalue=female.getText();
                }


                if(gujarati.isSelected())
                {
                    langVal+=gujarati.getText()+",";
                }

                if(hindi.isSelected())
                {
                    langVal+=hindi.getText()+",";
                }

                if(english.isSelected())
                {
                    langVal+=english.getText()+",";
                }

                if(marathi.isSelected())
                {
                    langVal+=marathi.getText()+",";
                }

             //   System.out.println(username+" "+email+" "+password+" "+gendervalue+" "+langVal+" "+countryval);

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection cn =
                            DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");

                    PreparedStatement ps = cn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
                    ps.setInt(1,0);
                    ps.setString(2,username);
                    ps.setString(3,email);
                    ps.setString(4,password);
                    ps.setString(5,gendervalue);
                    ps.setString(6,langVal);
                    ps.setString(7,countryval);

                    int i  =ps.executeUpdate();
                    if(i>0)
                    {
                        JOptionPane.showMessageDialog(frame,"Registraton success");
                    }


                }
                catch (ClassNotFoundException | SQLException ex) {
                    throw new RuntimeException(ex);
                }


            }
        });



        file.add(open);
        file.add(save);
        file.add(saveas);
        frame.add(title);
        frame.add(uname);
        frame.add(email);
        frame.add(password);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(btn);
        frame.add(gender);
        frame.add(male);
        frame.add(female);
        frame.add(lang);
        frame.add(gujarati);
        frame.add(hindi);
        frame.add(english);
        frame.add(marathi);
        frame.add(country);
        frame.add(countrylist);
        frame.add(menu);


    }
}
