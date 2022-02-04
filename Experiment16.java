/*
    Java program to design a basic GUI using awt package
    Author : Benjamin Joseph
    Date : 04-02-2022
*/

package Java;

import java.awt.*;
import java.awt.event.*;

public class Experiment16 extends Frame implements MouseListener, MouseMotionListener {
    Experiment16() {
        setSize(300,300);
        setTitle("Experiment16");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        setBackground(Color.orange);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.blue);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(Color.magenta);
    }
    public static void main(String[] args) {
            new Experiment16();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.fillOval(e.getX(),e.getY(),15,15);
        setBackground(Color.gray);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Graphics g = getGraphics();
        g.drawString("Moving", getMousePosition().x, getMousePosition().y);
        setBackground(Color.magenta);
    }
}

