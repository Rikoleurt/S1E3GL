package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import shapes.gui.SquareDialog;

public class Square extends Rectangle {
    
    private static final long serialVersionUID = 3617573803782058294L;
    private Color color ;
    
    public Square(int x, int y, int side, Color color, int id) {
        super(x, y, side, side, color, id);
        this.color = color;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x , y , wide , high);
    }
    
    public void change() {
        javax.swing.JDialog d = new SquareDialog(this);   
        d.setVisible(true);
    }
    
    public void change(int x, int y, int side) {
        this.x = x;
        this.y = y;
        this.high = side;
        this.wide = side;
    }

    @Override
    public boolean contains(Point p){
        int xPoint = (int) p.getX();
        int yPoint = (int) p.getY();
        boolean containsVertical = (this.x <= xPoint) && (xPoint <= x + wide);
        boolean containsHorizontal = (this.y <= yPoint) && (yPoint <= y + high);
        return containsVertical && containsHorizontal;
        // As a square is also a rectangle, the contains method remains the same
    }
    @Override
    public double area(){
        return Math.pow(wide, 2);
    }

    @Override
    public String toString() {
        return "(" + getID() + ") Square: side = " + wide + ", perimeter = " + perimeter() + ", area = " + area();
    }

    @Override
    public double perimeter(){
        return 4 * wide;
    }
}
