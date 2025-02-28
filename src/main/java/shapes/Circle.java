package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import shapes.gui.CircleDialog;

// SOL Circle
public class Circle extends AShape {
    
    private static final long serialVersionUID = 3258408452127732017L;
    protected int x;
    protected int y;
    protected int radius;
    private Color color;
    
    public Circle(int x , int y , int radius, Color color, int id) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        setID(id);
        this.color = color;
    }
    
    public double area() {
        return 0;
    }
    
    public double perimeter() {
        return 0;
    }
    
    public void change() {
        javax.swing.JDialog d = new CircleDialog(this);
        d.setVisible(true);
    }
    
    public void change(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.radius = r;
    }
    
    public String toString() {
        return "";
    }
    
    public void draw( Graphics g ) {
        g.setColor( color );
        g.fillOval( x-radius , y-radius , radius * 2, radius * 2);
    }
    
    public boolean contains(Point p) {
        return false;
    }
    
    public void move(int dx, int dy) {
        
    }
}
