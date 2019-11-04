package zPiano;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PianoGUI 
{
    public static void addComponentsToPane(Container pane) 
    {
        pane.setLayout(null);
        
        Insets insets = pane.getInsets();
        
        addWhiteKeys(pane, insets);
    }
    
    public static void addWhiteKeys(Container pane, Insets insets)
    {
    	Dimension size;
    	int x = 0;
    	
    	for (int i = 1; i <= 36; i++)
    	{
    		JButton btn = new JButton(" ");
    		btn.setBackground(Color.WHITE);
    		btn.setRolloverEnabled(false);
    		pane.add(btn);
    		
    		size = btn.getPreferredSize();
    		btn.setBounds(x + insets.left, 180 + insets.top, 5 + size.width, 255 + size.height);
    		x += 40;
    	}
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("AbsoluteLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(1460 + insets.left + insets.right, 500 + insets.top + insets.bottom);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
