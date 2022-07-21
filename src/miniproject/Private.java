package miniproject;;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Private 
{
    static Frame jf1;
    static JTextField tf1;
    static JTextField tf2;
    static JTextField tf3;
    static JTextField tf4;
    static JTextField tf5;
    
    public static void data()
    {
        jf1=new JFrame("DataAdmin");
    	jf1.setLayout(null);
        Toolkit t=Toolkit.getDefaultToolkit();
        Dimension d=t.getScreenSize();
        jf1.setSize(500,500);       
        jf1.setExtendedState(jf1.getExtendedState()|JFrame.MAXIMIZED_BOTH);
        
        BufferedImage img=null;
        try{img = ImageIO.read(new File("F:\\MiniProject JAVA\\src\\miniproject\\black.png"));}
        catch(IOException e){System.out.println(e);}
        Image dimg=img.getScaledInstance(d.width+60,d.height-30, Image.SCALE_SMOOTH);
        JLabel bgl=new JLabel(new ImageIcon(dimg));
        bgl.setBounds(0,0,d.width+60,d.height-30);
        
        Font F2=new Font("Agency FB",Font.BOLD,70);       
        int lax = (d.width/2);
        
        JLabel lb=new JLabel("ADMIN");
        lb.setFont(F2);
    	lb.setBounds(lax+100,250,300,60);
        lb.setForeground(Color.white);
    	jf1.add(lb);
        
    	
        Font F1=new Font("Agency FB",Font.BOLD,30);
        
        JLabel label=new JLabel();
        label.setFont(F1);
        label.setForeground(Color.red);
        label.setBounds(lax-630,500,500,100);
        jf1.add(label);
        
        Font F3=new Font("Agency FB",Font.PLAIN,20);
        
        JButton jb1=new JButton("MODIFY QUANTITY");
        jb1.setFont(F3);
        jb1.setBounds(lax+240,375,230,50);
        jb1.setForeground(Color.black);
        jb1.setBackground(Color.white);
        jb1.addActionListener(new ActionListener()
    	{
                @Override
    		public void actionPerformed(ActionEvent e)
    		{
                        Data.modify(Integer.parseInt(tf1.getText()),Integer.parseInt(tf5.getText()));
                        label.setText("DATA UPDATED");
    		}
    	});
        jf1.add(jb1);
        
        F3=new Font("Agency FB",Font.PLAIN,20);
        
        JButton jb3=new JButton("DELETE PRODUCT");
        jb3.setFont(F3);
        jb3.setBounds(lax+240,455,230,50);
        jb3.setForeground(Color.black);
        jb3.setBackground(Color.white);
        jb3.addActionListener(new ActionListener()
    	{
                @Override
    		public void actionPerformed(ActionEvent e)
    		{
                        Data.delete(Integer.parseInt(tf1.getText()));
                        label.setText("DATA DELETED");
    		}
    	});
        jf1.add(jb3);
        
        JButton jbA=new JButton("ADD PRODUCT");
        jbA.setFont(F3);
        jbA.setBounds(lax,455,230,50);
        jbA.setForeground(Color.black);
        jbA.setBackground(Color.white);
        jbA.addActionListener(new ActionListener()
    	{
                @Override
    		public void actionPerformed(ActionEvent e)
    		{
                        Data.add(Integer.parseInt(tf1.getText()),tf2.getText(),tf4.getText(),Integer.parseInt(tf5.getText()),Integer.parseInt(tf3.getText()));
                        label.setText("DATA ADDED");
    		}
    	});
        jf1.add(jbA);
        
        JButton jb2=new JButton("CONTINUE");
        jb2.setFont(F3);
        jb2.setBounds(lax,375,230,50);
        jb2.setForeground(Color.black);
        jb2.setBackground(Color.white);
        jb2.addActionListener(new ActionListener()
    	{
                @Override
    		public void actionPerformed(ActionEvent e)
    		{
                        //Search.basic_search();-------------------------------------------------------------------------
                        jf1.setVisible(false);
    		}
    	});
        jf1.add(jb2);
        
                        F2=new Font("Agency FB",Font.BOLD,30);
                        JLabel lbs=new JLabel("        ID ");
                        lbs.setFont(F2);
                        lbs.setBounds(lax-600,180,200,60);
                        lbs.setForeground(Color.white);
                        jf1.add(lbs);
        
                        JLabel lcs=new JLabel("          NAME ");
                        lcs.setFont(F2);
                        lcs.setBounds(lax-670,230,300,70);
                        lcs.setForeground(Color.white);
                        jf1.add(lcs);
        
                        JLabel lds=new JLabel("COMPANY ");
                        lds.setFont(F2);
                        lds.setBounds(lax-650,335,300,70);
                        lds.setForeground(Color.white);
                        jf1.add(lds);
        
                        JLabel le=new JLabel("QUANTITY");
                        le.setFont(F2);
                        le.setBounds(lax-650,390,300,70);
                        le.setForeground(Color.white);
                        jf1.add(le);
        
                        JLabel lf=new JLabel("      PRICE");
                        lf.setFont(F2);
                        lf.setBounds(lax-645,280,300,70);
                        lf.setForeground(Color.white);
                        jf1.add(lf);
        
                        tf1=new JTextField("1");
                        tf1.setBounds(lax-475,195,450,30);
                        jf1.add(tf1);
    	
                        tf2=new JTextField("Milk");
                        tf2.setBounds(lax-475,250,450,30);
                        jf1.add(tf2);
        
                        tf3=new JTextField("40");
                	tf3.setBounds(lax-475,300,450,30);
                        jf1.add(tf3);
        
                        tf4=new JTextField("Amul");
                        tf4.setBounds(lax-475,355,450,30);
                        jf1.add(tf4);
        
                        tf5=new JTextField("500");
                        tf5.setBounds(lax-475,410,450,30);
                        jf1.add(tf5);
                        
        jf1.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        jf1.add(bgl);
        jf1.setVisible(true);
    }   
}