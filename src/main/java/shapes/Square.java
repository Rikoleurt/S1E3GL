package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import shapes.gui.SquareDialog;

public class Square extends Rectangle {
    
    private static final long serialVersionUID = 3617573803782058294L;
    private Color color ;
    
    public Square(int x, int y, int wide, Color color, int id) {
        super(x,y,wide,wide,color,id);
        this.color = color;
    }

    public void draw( Graphics g ) {
        g.setColor( color );
        g.fillRect( x , y , wide , high );
    }
    
    public void change() {
        javax.swing.JDialog d = new SquareDialog(this);   
        d.setVisible(true);
    }
    
    public void change(int x, int y, int s) {
        this.x = x;
        this.y = y;
        this.high = s;
        this.wide = s;
    }
    
}
