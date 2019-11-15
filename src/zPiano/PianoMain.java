package zPiano;

import java.awt.Insets;

import javax.swing.JFrame;

/**
 * The main class of the application that initializes and opens the piano GUI.
 * 
 * @author sashimimi
 * @version 1.0.0
 * @since November 13, 2019
 *
 */

public class PianoMain 
{

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("zPiano");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Set up the content pane.
        PianoGUI.addComponentsToPane(frame.getContentPane());

        //Size and display the window.
        Insets insets = frame.getInsets();
        frame.setSize(1460 + insets.left + insets.right, 500 + insets.top + insets.bottom);
        frame.setVisible(true);
        frame.requestFocus();
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
