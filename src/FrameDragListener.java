import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class FrameDragListener extends MouseAdapter{

    private JFrame frame;
    private Point mouseDownCompCoords = null;

    public FrameDragListener(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.mouseReleased(e); //To change body of generated methods, choose Tools | Templates.
        mouseDownCompCoords = null;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e); //To change body of generated methods, choose Tools | Templates.
        Point currCoords = e.getLocationOnScreen();
        frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
        mouseDownCompCoords = e.getPoint();
    }
    
    
    

}