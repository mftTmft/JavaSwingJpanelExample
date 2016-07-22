package example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    private JPanel jPanel2=null;
    private JButton btn_save=null;


    private JPanel jPanel3;
    private JButton btn_exit;
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


        jPanel2=new JPanel(null);
        //jPanel2.setLayout(null);
        jPanel2.setBounds(dimension.width/2,0,dimension.width/2,dimension.height/2);
        jPanel2.setBackground(Color.cyan);


        btn_save=new JButton("Save");
        btn_save.setBounds(10,10,100,30);


        jPanel3=new JPanel(null);
        jPanel3.setBounds(dimension.width/2,dimension.height/2,dimension.width/2,dimension.height/2);
        jPanel3.setBackground(Color.orange);


        btn_exit=new JButton("Exit");
        btn_exit.setBounds(jPanel3.getWidth()/2-50,jPanel3.getHeight()/2-15,100,30);
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);


        jPanel2.add(btn_save);

        jPanel3.add(btn_exit);

        jFrame_login.add(jPanel1);
        jFrame_login.add(jPanel2);
        jFrame_login.add(jPanel3);

        jFrame_login.setVisible(true);
        jPanel1.setVisible(true);
        lbl_name.setVisible(true);
        txt_name.setVisible(true);
        jPanel2.setVisible(true);
        btn_save.setVisible(true);
        jPanel3.setVisible(true);
        btn_exit.setVisible(true);
    }

    public static void main(String[] args)
    {
        Main m1=new Main();
        m1.initView();

    }
}
