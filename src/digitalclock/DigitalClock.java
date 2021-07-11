
package digitalclock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Chad Parker
 */
public class DigitalClock extends JFrame {

    JLabel jlabClock;
    ClockThread ct;
    
    public DigitalClock() {
        jlabClock = new JLabel("");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        jlabClock.setFont(new Font("Arial", Font.CENTER_BASELINE, 30));
        jlabClock.setOpaque(true);
        jlabClock.setBackground(Color.BLACK);
        jlabClock.setForeground(Color.GREEN);
        add(jlabClock);
        setSize(600, 120);
        setLocationRelativeTo(null);
        ct = new ClockThread(this);
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        
        new DigitalClock();
    }
    
}
