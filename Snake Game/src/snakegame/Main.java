package snakegame;


import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {
        //Creating a window with all its awesome sneaky features
        Window f1 = new Window();
        
        //Setting up the window settings
        f1.setTitle("Snake");
        f1.setSize(300, 300);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
