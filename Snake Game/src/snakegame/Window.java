package snakegame;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Window extends JFrame{
    private static final long serialVersionUID = -254200141876486970L;
    public static ArrayList<ArrayList<DataOfSquare>> Grid;
    public static int width = 20;
    public static int height = 20;
    
    public Window(){
        // Creates the arraylist that'll contain the threads
        Grid = new ArrayList<ArrayList<DataOfSquare>>();
        ArrayList<DataOfSquare> data;
        
        // Creates threads and its data and adds it to the arraylist;
        
        for (int i=0;i<width;i++){
            data = new ArrayList<DataOfSquare>();
            for(int j=0;j<height;j++){
                DataOfSquare c = new DataOfSquare(2);
                data.add(c);
            }
            Grid.add(data);
        }
        
        // setting up the layout of the panel
        getContentPane().setLayout(new GridLayout(20, 20, 0, 0));
        // start & pauses all threads, then adds every square of each thread to the panel
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                getContentPane().add(Grid.get(i).get(j).square);
            }
        }
        
        // initial position of the snake
        Tuple position = new Tuple(10, 10);
        // passing this values to the controller
        ThreadsController c = new ThreadsController(position);
        // Lets start the game
        c.start();
        
        // links the window to the keyboard listener
        this.addKeyListener((KeyListener) new KeyboardListener());
        
        
    }
}
