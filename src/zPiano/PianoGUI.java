package zPiano;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 * The code to build the GUI, including the frame, buttons, and actionlisteners.
 * 
 * @author sashimimi
 * @version 1.0.0
 * @since November 13, 2019
 *
 */

public class PianoGUI
{
    public static void addComponentsToPane(Container pane) 
    {
        pane.setLayout(null);
        
        Insets insets = pane.getInsets();
        
        addBlackKeys(pane, insets);
        addWhiteKeys(pane, insets);
    }
    
    public static void addWhiteKeys(Container pane, Insets insets)
    {
        JButton p1 = new JButton(" ");
        JButton p2 = new JButton(" ");
        JButton p3 = new JButton(" ");
        JButton p4 = new JButton(" ");
        JButton p5 = new JButton(" ");
        JButton p6 = new JButton(" ");
        JButton p7 = new JButton(" ");
        JButton p8 = new JButton(" ");
        JButton p9 = new JButton(" ");
        JButton p10 = new JButton(" ");
        JButton p11 = new JButton(" ");
        JButton p12 = new JButton(" ");
        JButton p13 = new JButton(" ");
        JButton p14 = new JButton(" ");
        JButton p15 = new JButton(" ");
        JButton p16 = new JButton(" ");
        JButton p17 = new JButton(" ");
        JButton p18 = new JButton(" ");
        JButton p19 = new JButton(" ");
        JButton p20 = new JButton(" ");
        JButton p21 = new JButton(" ");
        JButton p22 = new JButton(" ");
        JButton p23 = new JButton(" ");
        JButton p24 = new JButton(" ");
        JButton p25 = new JButton(" ");
        JButton p26 = new JButton(" ");
        JButton p27 = new JButton(" ");
        JButton p28 = new JButton(" ");
        JButton p29 = new JButton(" ");
        JButton p30 = new JButton(" ");
        JButton p31 = new JButton(" ");
        JButton p32 = new JButton(" ");
        JButton p33 = new JButton(" ");
        JButton p34 = new JButton(" ");
        JButton p35 = new JButton(" ");
        JButton p36 = new JButton(" ");
        
        p1.setBackground(Color.WHITE);
        p2.setBackground(Color.WHITE);
        p3.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);
        p5.setBackground(Color.WHITE);
        
        p6.setBackground(Color.WHITE);
        p7.setBackground(Color.WHITE);
        p8.setBackground(Color.WHITE);
        p9.setBackground(Color.WHITE);
        p10.setBackground(Color.WHITE);
        
        p11.setBackground(Color.WHITE);
        p12.setBackground(Color.WHITE);
        p13.setBackground(Color.WHITE);
        p14.setBackground(Color.WHITE);
        p15.setBackground(Color.WHITE);
        
        p16.setBackground(Color.WHITE);
        p17.setBackground(Color.WHITE);
        p18.setBackground(Color.WHITE);
        p19.setBackground(Color.WHITE);
        p20.setBackground(Color.WHITE);
        
        p21.setBackground(Color.WHITE);
        p22.setBackground(Color.WHITE);
        p23.setBackground(Color.WHITE);
        p24.setBackground(Color.WHITE);
        p25.setBackground(Color.WHITE);
        
        p26.setBackground(Color.WHITE);
        p27.setBackground(Color.WHITE);
        p28.setBackground(Color.WHITE);
        p29.setBackground(Color.WHITE);
        p30.setBackground(Color.WHITE);
        
        p31.setBackground(Color.WHITE);
        p32.setBackground(Color.WHITE);
        p33.setBackground(Color.WHITE);
        p34.setBackground(Color.WHITE);
        p35.setBackground(Color.WHITE);
        p36.setBackground(Color.WHITE);
        
        p1.setRolloverEnabled(false);
        p2.setRolloverEnabled(false);
        p3.setRolloverEnabled(false);
        p4.setRolloverEnabled(false);
        p5.setRolloverEnabled(false);
        
        p6.setRolloverEnabled(false);
        p7.setRolloverEnabled(false);
        p8.setRolloverEnabled(false);
        p9.setRolloverEnabled(false);
        p10.setRolloverEnabled(false);
        
        p11.setRolloverEnabled(false);
        p12.setRolloverEnabled(false);
        p13.setRolloverEnabled(false);
        p14.setRolloverEnabled(false);
        p15.setRolloverEnabled(false);
        
        p16.setRolloverEnabled(false);
        p17.setRolloverEnabled(false);
        p18.setRolloverEnabled(false);
        p19.setRolloverEnabled(false);
        p20.setRolloverEnabled(false);
        
        p21.setRolloverEnabled(false);
        p22.setRolloverEnabled(false);
        p23.setRolloverEnabled(false);
        p24.setRolloverEnabled(false);
        p25.setRolloverEnabled(false);
        
        p26.setRolloverEnabled(false);
        p27.setRolloverEnabled(false);
        p28.setRolloverEnabled(false);
        p29.setRolloverEnabled(false);
        p30.setRolloverEnabled(false);
        
        p31.setRolloverEnabled(false);
        p32.setRolloverEnabled(false);
        p33.setRolloverEnabled(false);
        p34.setRolloverEnabled(false);
        p35.setRolloverEnabled(false);
        p36.setRolloverEnabled(false);
        
        pane.add(p1);
        pane.add(p2);
        pane.add(p3);
        pane.add(p4);
        pane.add(p5);
        pane.add(p6);
        pane.add(p7);
        pane.add(p8);
        pane.add(p9);
        pane.add(p10);
        pane.add(p11);
        pane.add(p12);
        pane.add(p13);
        pane.add(p14);
        pane.add(p15);
        pane.add(p16);
        pane.add(p17);
        pane.add(p18);
        pane.add(p19);
        pane.add(p20);
        pane.add(p21);
        pane.add(p22);
        pane.add(p23);
        pane.add(p24);
        pane.add(p25);
        pane.add(p26);
        pane.add(p27);
        pane.add(p28);
        pane.add(p29);
        pane.add(p30);
        pane.add(p31);
        pane.add(p32);
        pane.add(p33);
        pane.add(p34);
        pane.add(p35);
        pane.add(p36);
        
        Dimension size = p1.getPreferredSize();
        p1.setBounds(insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p2.getPreferredSize();
        p2.setBounds(40 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p3.getPreferredSize();
        p3.setBounds(80 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);

        size = p4.getPreferredSize();
        p4.setBounds(120 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p5.getPreferredSize();
        p5.setBounds(160 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p6.getPreferredSize();
        p6.setBounds(200 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p7.getPreferredSize();
        p7.setBounds(240 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p8.getPreferredSize();
        p8.setBounds(280 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p9.getPreferredSize();
        p9.setBounds(320 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p10.getPreferredSize();
        p10.setBounds(360 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p11.getPreferredSize();
        p11.setBounds(400 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p12.getPreferredSize();
        p12.setBounds(440 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p13.getPreferredSize();
        p13.setBounds(480 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p14.getPreferredSize();
        p14.setBounds(520 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p15.getPreferredSize();
        p15.setBounds(560 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p16.getPreferredSize();
        p16.setBounds(600 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p17.getPreferredSize();
        p17.setBounds(640 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p18.getPreferredSize();
        p18.setBounds(680 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p19.getPreferredSize();
        p19.setBounds(720 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p20.getPreferredSize();
        p20.setBounds(760 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p21.getPreferredSize();
        p21.setBounds(800 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p22.getPreferredSize();
        p22.setBounds(840 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p23.getPreferredSize();
        p23.setBounds(880 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p24.getPreferredSize();
        p24.setBounds(920 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p25.getPreferredSize();
        p25.setBounds(960 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p26.getPreferredSize();
        p26.setBounds(1000 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p27.getPreferredSize();
        p27.setBounds(1040 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p28.getPreferredSize();
        p28.setBounds(1080 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p29.getPreferredSize();
        p29.setBounds(1120 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p30.getPreferredSize();
        p30.setBounds(1160 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p31.getPreferredSize();
        p31.setBounds(1200 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p32.getPreferredSize();
        p32.setBounds(1240 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p33.getPreferredSize();
        p33.setBounds(1280 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p34.getPreferredSize();
        p34.setBounds(1320 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p35.getPreferredSize();
        p35.setBounds(1360 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
        size = p36.getPreferredSize();
        p36.setBounds(1400 + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
        
    	p1.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/1.wav");
    	});
    	
    	p2.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/2.wav");
    	});
    	
    	p3.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/3.wav");
    	});
    	
    	p4.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/4.wav");
    	});
    	
    	p5.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/5.wav");
    	});
    	
    	p6.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/6.wav");
    	});
    	
    	p7.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/7.wav");
    	});
    	
    	p8.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/8.wav");
    	});
    	
    	/*p9.addActionListener((ActionEvent e) -> {
    		AudioPlayerExample1 a = new AudioPlayerExample1();
    		a.play("notes/9.wav");
    	});*/
    	
    	p10.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/0.wav");
    	});
    	
    	p11.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/q.wav");
    	});
    	
    	p12.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/w.wav");
    	});
    	
    	p13.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/e.wav");
    	});
    	
    	p14.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/r.wav");
    	});
    	
    	p15.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/t.wav");
    	});
    	
    	p16.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/y.wav");
    	});
    	
    	p17.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/u.wav");
    	});
    	
    	p18.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/i.wav");
    	});
    	
    	p19.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/o.wav");
    	});
    	
    	p20.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/p.wav");
    	});
    	
    	p21.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/a.wav");
    	});
    	
    	p22.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/s.wav");
    	});
    	
    	p23.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/d.wav");
    	});
    	
    	p24.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/f.wav");
    	});
    	
    	p25.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/g.wav");
    	});
    	
    	p26.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/h.wav");
    	});
    	
    	p27.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/j.wav");
    	});
    	
    	p28.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/k.wav");
    	});
    	
    	p29.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/l.wav");
    	});
    	
    	p30.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/z.wav");
    	});
    	
    	p31.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/x.wav");
    	});
    	
    	p32.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/c.wav");
    	});
    	
    	p33.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/v.wav");
    	});
    	
    	p34.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b.wav");
    	});
    	
    	p35.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/n.wav");
    	});
    	
    	p36.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/m.wav");
    	});
    }
    
	public static void addBlackKeys(Container pane, Insets insets)
    {
    	Dimension size;
    	
    	JButton b1 = new JButton(" ");
    	JButton b2 = new JButton(" ");
    	JButton b3 = new JButton(" ");
    	JButton b4 = new JButton(" ");
    	JButton b5 = new JButton(" ");
    	
    	JButton b6 = new JButton(" ");
    	JButton b7 = new JButton(" ");
    	JButton b8 = new JButton(" ");
    	JButton b9 = new JButton(" ");
    	JButton b10 = new JButton(" ");
    	
    	JButton b11 = new JButton(" ");
    	JButton b12 = new JButton(" ");
    	JButton b13 = new JButton(" ");
    	JButton b14 = new JButton(" ");
    	JButton b15 = new JButton(" ");
    	
    	JButton b16 = new JButton(" ");
    	JButton b17 = new JButton(" ");
    	JButton b18 = new JButton(" ");
    	JButton b19 = new JButton(" ");
    	JButton b20 = new JButton(" ");
    	
    	JButton b21 = new JButton(" ");
    	JButton b22 = new JButton(" ");
    	JButton b23 = new JButton(" ");
    	JButton b24 = new JButton(" ");
    	JButton b25 = new JButton(" ");
    	
    	b1.setBackground(Color.BLACK);
    	b2.setBackground(Color.BLACK);
    	b3.setBackground(Color.BLACK);
    	b4.setBackground(Color.BLACK);
    	b5.setBackground(Color.BLACK);
    	
    	b6.setBackground(Color.BLACK);
    	b7.setBackground(Color.BLACK);
    	b8.setBackground(Color.BLACK);
    	b9.setBackground(Color.BLACK);
    	b10.setBackground(Color.BLACK);
    	
    	b11.setBackground(Color.BLACK);
    	b12.setBackground(Color.BLACK);
    	b13.setBackground(Color.BLACK);
    	b14.setBackground(Color.BLACK);
    	b15.setBackground(Color.BLACK);
    	
    	b16.setBackground(Color.BLACK);
    	b17.setBackground(Color.BLACK);
    	b18.setBackground(Color.BLACK);
    	b19.setBackground(Color.BLACK);
    	b20.setBackground(Color.BLACK);
    	
    	b21.setBackground(Color.BLACK);
    	b22.setBackground(Color.BLACK);
    	b23.setBackground(Color.BLACK);
    	b24.setBackground(Color.BLACK);
    	b25.setBackground(Color.BLACK);
    	
        b1.setRolloverEnabled(false);
        b2.setRolloverEnabled(false);
        b3.setRolloverEnabled(false);
        b4.setRolloverEnabled(false);
        b5.setRolloverEnabled(false);
        
        b6.setRolloverEnabled(false);
        b7.setRolloverEnabled(false);
        b8.setRolloverEnabled(false);
        b9.setRolloverEnabled(false);
        b10.setRolloverEnabled(false);
        
        b11.setRolloverEnabled(false);
        b12.setRolloverEnabled(false);
        b13.setRolloverEnabled(false);
        b14.setRolloverEnabled(false);
        b15.setRolloverEnabled(false);
        
        b16.setRolloverEnabled(false);
        b17.setRolloverEnabled(false);
        b18.setRolloverEnabled(false);
        b19.setRolloverEnabled(false);
        b20.setRolloverEnabled(false);
        
        b21.setRolloverEnabled(false);
        b22.setRolloverEnabled(false);
        b23.setRolloverEnabled(false);
        b24.setRolloverEnabled(false);
        b25.setRolloverEnabled(false);
    	
    	pane.add(b1);
    	pane.add(b2);
    	pane.add(b3);
    	pane.add(b4);
    	pane.add(b5);
    	
    	pane.add(b6);
    	pane.add(b7);
    	pane.add(b8);
    	pane.add(b9);
    	pane.add(b10);
    	
    	pane.add(b11);
    	pane.add(b12);
    	pane.add(b13);
    	pane.add(b14);
    	pane.add(b15);
    	
    	pane.add(b16);
    	pane.add(b17);
    	pane.add(b18);
    	pane.add(b19);
    	pane.add(b20);
    	
    	pane.add(b21);
    	pane.add(b22);
    	pane.add(b23);
    	pane.add(b24);
    	pane.add(b25);
    	
    	
    	size = b1.getPreferredSize();
    	b1.setBounds(30 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b2.getPreferredSize();
    	b2.setBounds(70 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	size = b3.getPreferredSize();
    	
    	b3.setBounds(150 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b4.getPreferredSize();
    	b4.setBounds(190 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b5.getPreferredSize();
    	b5.setBounds(230 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b6.getPreferredSize();
    	b6.setBounds(310 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b7.getPreferredSize();
    	b7.setBounds(350 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	size = b8.getPreferredSize();
    	
    	b8.setBounds(430 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b9.getPreferredSize();
    	b9.setBounds(470 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b10.getPreferredSize();
    	b10.setBounds(510 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b11.getPreferredSize();
    	b11.setBounds(590 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b12.getPreferredSize();
    	b12.setBounds(630 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	size = b13.getPreferredSize();
    	
    	b13.setBounds(710 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b14.getPreferredSize();
    	b14.setBounds(750 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b15.getPreferredSize();
    	b15.setBounds(790 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b16.getPreferredSize();
    	b16.setBounds(870 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b17.getPreferredSize();
    	b17.setBounds(910 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b18.getPreferredSize();
    	b18.setBounds(990 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b19.getPreferredSize();
    	b19.setBounds(1030 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b20.getPreferredSize();
    	b20.setBounds(1070 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b21.getPreferredSize();
    	b21.setBounds(1150 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b22.getPreferredSize();
    	b22.setBounds(1190 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+80
    	
    	size = b23.getPreferredSize();
    	b23.setBounds(1270 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b24.getPreferredSize();
    	b24.setBounds(1310 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height); //+40
    	size = b25.getPreferredSize();
    	b25.setBounds(1350 + insets.left, 180 + insets.top, size.width - 10, 100 + size.height);
    	
    	b1.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b1.wav");
    	});
    	
    	b2.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b2.wav");
    	});
    	
    	b3.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b4.wav");
    	});
    	
    	b4.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b5.wav");
    	});
    	
    	b5.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b6.wav");
    	});
    	
    	b6.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b8.wav");
    	});
    	
    	b7.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/b9.wav");
    	});
    	
    	b8.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bq.wav");
    	});
    	
    	b9.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bw.wav");
    	});
    	
    	b10.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/be.wav");
    	});
    	
    	b11.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bt.wav");
    	});
    	
    	b12.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/by.wav");
    	});
    	
    	b13.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bi.wav");
    	});
    	
    	b14.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bo.wav");
    	});
    	
    	b15.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bp.wav");
    	});
    	
    	b16.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bs.wav");
    	});
    	
    	b17.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bd.wav");
    	});
    	
    	b18.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bg.wav");
    	});
    	
    	b19.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bh.wav");
    	});
    	
    	b20.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bj.wav");
    	});
    	
    	b21.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bl.wav");
    	});
    	
    	b22.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bz.wav");
    	});
    	
    	b23.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bc.wav");
    	});
    	
    	b24.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bv.wav");
    	});
    	
    	b25.addActionListener((ActionEvent e) -> {
    		PlayKeyNote a = new PlayKeyNote();
    		a.play("notes/bb.wav");
    	});
    }
}
