/*  
 Purpose: Using GUI to create moving object that increases speed when it is increased by 5
 Inputs: Mouse usage
 Output: When click the "Current Score" increases*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFrame;

public class tester extends JFrame {

    //call the static JPanel
    static ImageMover mover = new ImageMover(700);

    //constructor
    public tester() {
        createMenuBar();
    }

    //menu function
    private void createMenuBar() {
        //new menu
        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");     //name "file"
        file.setMnemonic(KeyEvent.VK_F);

        //first item in the menu with an image and "China" title
        JMenuItem flag1 = new JMenuItem("China", new ImageIcon("image/flagIcon2.gif"));
        flag1.setMnemonic(KeyEvent.VK_E);
        flag1.setToolTipText("Choose China Flag");          //text show when mouse hover over
        flag1.addActionListener((ActionEvent event) -> {    //add action when mouse clicked
            Image img = getToolkit().getImage("image/china.jpg");
            mover.setImage(img);    //set this image to the JPanel
        });

        //2nd item in the menu
        JMenuItem flag2 = new JMenuItem("Germany", new ImageIcon("image/germanyIcon.gif"));
        flag1.setMnemonic(KeyEvent.VK_E);
        flag2.setToolTipText("Choose China Flag");
        flag2.addActionListener((ActionEvent event) -> {
            Image img = getToolkit().getImage("image/germany.gif");
            mover.setImage(img);

        });

        //3nd item in the menu        
        JMenuItem flag3 = new JMenuItem("India", new ImageIcon("image/flagIcon3.gif"));
        flag3.setToolTipText("Choose China Flag");
        flag3.addActionListener((ActionEvent event) -> {
            Image img = getToolkit().getImage("image/india.gif");
            mover.setImage(img);
        });

        //3rd item in the menu        
        JMenuItem flag4 = new JMenuItem("UK", new ImageIcon("image/flagIcon5.gif"));
        flag4.setToolTipText("Choose China Flag");
        flag4.addActionListener((ActionEvent event) -> {
            Image img = getToolkit().getImage("image/uk.gif");
            mover.setImage(img);
        });

        //4th item in the menu        
        JMenuItem flag5 = new JMenuItem("Canada", new ImageIcon("image/caIcon.gif"));
        flag5.setToolTipText("Choose China Flag");
        flag5.addActionListener((ActionEvent event) -> {
            Image img = getToolkit().getImage("image/ca.gif");
            mover.setImage(img);
        });

        //5th item in the menu        
        JMenuItem eMenuItem = new JMenuItem("Exist");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((ActionEvent event) -> {
            System.exit(0);     //end the program
        });

        //adding the menu items into the menu bar in an order
        file.add(flag1);
        file.add(flag2);
        file.add(flag3);
        file.add(flag4);
        file.add(flag5);
        file.add(eMenuItem);

        menubar.add(file);

        setJMenuBar(menubar);   //set the menu bat to JFrame
    }

    public static void main(String[] args) throws InterruptedException {

        tester frame = new tester();
        frame.add(mover);
        frame.setTitle("ScoreBoard");
        frame.setSize(mover.getFrame(), mover.getFrame());
        frame.setResizable(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //while loop never ends long as the program is active
        while (true) {
            mover.moveIt();
            mover.repaint();
            try {
                Thread.sleep(mover.getSpeed());                 //speed is one second.
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
