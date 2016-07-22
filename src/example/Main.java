package example;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 7 on 7/22/2016.
 */
public class Main
{
    private Dimension dimension=null;
    private JFrame jFrame_login=null;
    private JPanel jPanel1=null;
    private JLabel lbl_name;
    private JTextField txt_name;
    //----------------------------------------------------------------------------------
    public void initView()
    {
        dimension=Toolkit.getDefaultToolkit().getScreenSize();
        jFrame_login=new JFrame("Login Form");
        jFrame_login.setBounds(0,0,dimension.width,dimension.height);
        jFrame_login.setLayout(null);
        jFrame_login.setResizable(true);
        //jFrame_login.pack();
        jFrame_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jPanel1=new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,0,dimension.width/2,dimension.height);
        jPanel1.setBackground(Color.pink);



        lbl_name=new JLabel("Name : ",JLabel.CENTER);
        lbl_name.setBounds(10,10,50,30);



        txt_name=new JTextField();
        txt_name.setBounds(70,10,200,30);


        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);
        jFrame_login.add(jPanel1);

        jFrame_login.setVisible(true);
        jPanel1.setVisible(true);
        lbl_name.setVisible(true);
        txt_name.setVisible(true);
    }

    public static void main(String[] args)
    {
        Main m1=new Main();
        m1.initView();

    }
}
