import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class GridLay extends JFrame{
 
    
    public GridLay() {
        setTitle("GridLayout Test");
        this.init();
        this.start();
        this.setSize(500,200);
        setVisible(true);
    }
    public void init(){
        setLayout(new GridLayout(4, 3));
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));
        add(new JButton("7"));
        add(new JButton("8"));
        add(new JButton("9"));
        add(new JButton("*"));
        add(new JButton("0"));
        add(new JButton("#"));   
        
    }
    public void start(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class Exam7 {
    public static void main(String[] args) {
        new GridLay();
    }
}
