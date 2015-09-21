import java.awt.*;
import javax.swing.*;
import TurtleGraphics.StandardPen;
//import TurtleGraphics.Shapes;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.event.*;
/**
 * Grapher.java
 * A Function grapher
 * 
 * @author Jake Conway 
 */
public class Grapher extends JFrame
{
    public static void main(String[] args)
    {
        Grapher g = new Grapher();
        g.setVisible(true);
    }

    public static void graph(Point[] out)
    {
        int scale = 1;
        //Drawing axis
        Shapes s = new Shapes();

        s.setColor(Color.BLACK);
        s.setWidth(1);
        for(int q = 0; q <= 20; q++)
        {
            s.drawLine(25*q, 500, 25*q, -5000);
        }
        for(int r = 0; r <= 20; r++)
        {
            s.drawLine(-25*r, 500, -25*r, -500);
        }
        for(int u = 0; u <= 20; u++)
        {
            s.drawLine(-500, -25*u, 500, -25*u);
        }
        for(int t = 0; t <= 21; t++)
        {
            s.drawLine(-500, 25*t, 500, 25*t);
        }

        s.setColor(Color.BLUE);
        s.setWidth(2);
        for(int q = 0; q <= 20; q++)
        {
            s.drawLine(25*q, 10, 25*q, -10);
        }
        for(int r = 0; r <= 20; r++)
        {
            s.drawLine(-25*r, 10, -25*r, -10);
        }
        for(int u = 0; u <= 20; u++)
        {
            s.drawLine(-10, -25*u, 10, -25*u);
        }
        for(int t = 0; t <= 21; t++)
        {
            s.drawLine(-10, 25*t, 10, 25*t);
        }

        s.drawLine(0,0, 0,500);
        s.drawLine(0,0, 500, 0);
        s.drawLine(0,0, 0,-500);
        s.drawLine(0,0, -500, 0);

        s.setWidth(3);
        s.setColor(Color.RED);
        for(int i = 0; i < out.length-1; i++)
        {
            Point p = out[i];
            Point next = out[i+1];
            //             if( p == null || next == null ||p.getX() > 10 || p.getY() > 10 || next.getX() > 10 || next.getY() > 10)
            //             {
            //                 continue;
            //             }
            //             else
            //             {
            s.drawLine(p.getX()*25, p.getY()*25, next.getX()*25, next.getY()*25);
            //}
        }
    }

    public Grapher() {
        setTitle("Grapher");  
        setSize(500,100); 
        final JTabbedPane jtp = new JTabbedPane();
        getContentPane().add(jtp);

        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JPanel jp5 = new JPanel();
        JPanel jp6 = new JPanel();

        jtp.addTab("Linear", jp1);
        jtp.addTab("Quadratic", jp2);
        jtp.addTab("Exponential", jp3);
        jtp.addTab("Power", jp4);
        jtp.addTab("Trig Functions", jp5);
        jtp.addTab("Log", jp6);

        JLabel e1 = new JLabel("y=");
        jp1.add(e1);
        JLabel e2 = new JLabel("y=");
        jp2.add(e2);
        JLabel e3 = new JLabel("y=");
        jp3.add(e3);
        JLabel e4 = new JLabel("y=");
        jp4.add(e4);
        JLabel e5 = new JLabel("y=");
        jp5.add(e5);
        JLabel e6 = new JLabel("y=");
        jp6.add(e6);

        //Linear
        final JTextField jtf11 = new JTextField("m value");
        JLabel e11 = new JLabel("x+");
        final JTextField jtf12 = new JTextField("b value");
        jp1.add(jtf11);
        jp1.add(e11);
        jp1.add(jtf12);

        //Quadratic
        final JTextField jtf21 = new JTextField("a value");
        JLabel e21 = new JLabel("x^2 + ");
        final JTextField jtf22 = new JTextField("b value");
        JLabel e22 = new JLabel("x + ");
        final JTextField jtf23 = new JTextField("c value");
        jp2.add(jtf21);
        jp2.add(e21);
        jp2.add(jtf22);
        jp2.add(e22);
        jp2.add(jtf23);

        //Exponential
        final JTextField jtf31 = new JTextField("b value");
        JLabel e31 = new JLabel("^x");
        jp3.add(jtf31);
        jp3.add(e31);

        //Power
        final JTextField jtf41 = new JTextField("a value");
        JLabel e41 = new JLabel("x^");
        final JTextField jtf42 = new JTextField("b value");
        jp4.add(jtf41);
        jp4.add(e41);
        jp4.add(jtf42);

        //Trig a{trig function}(bx + c)
        final JTextField jtf51 = new JTextField("a value");
        String[] trigs =  {"sin", "cos", "tan", "csc", "sec", "cot"};
        final JComboBox<String> jcb51 = new JComboBox<String>(trigs);
        JLabel l51 = new JLabel("(");
        final JTextField jtf52 = new JTextField("b value");
        JLabel l52 = new JLabel("x + ");
        final JTextField jtf53 = new JTextField("c value");
        JLabel l53 = new JLabel(")");
        jp5.add(jtf51);
        jp5.add(jcb51);
        jp5.add(l51);
        jp5.add(jtf52);
        jp5.add(l52);
        jp5.add(jtf53);
        jp5.add(l53);

        //Log Func y=alogbase(bx+c)
        final JTextField jtf61 = new JTextField("a value");
        JLabel l61 = new JLabel("log");
        final JTextField jtf62 = new JTextField("base");
        JLabel l62 = new JLabel("(");
        final JTextField jtf63 = new JTextField("b value");
        JLabel l63 = new JLabel("x+");
        final JTextField jtf64 = new JTextField("c value");
        JLabel l64 = new JLabel(") + ");
        final JTextField jtf65 = new JTextField("d value");

        jp6.add(jtf61);
        jp6.add(l61);
        jp6.add(jtf62);
        jp6.add(l62);
        jp6.add(jtf63);
        jp6.add(l63);
        jp6.add(jtf64);
        jp6.add(l64);
        jp6.add(jtf65);

        jcb51.setVisible(true);
        jtp.setVisible(true);
        JButton b1 = new JButton("Graph Linear!");
        jp1.add(b1);
        b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    graph(Solver.graphLinear(Integer.parseInt(jtf11.getText()), Integer.parseInt(jtf12.getText()),-20, 20, .1));
                }
            });
        JButton b2 = new JButton("Graph Quadratic!");
        jp2.add(b2);
        b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    graph(Solver.graphQuadratic(Integer.parseInt(jtf21.getText()),Integer.parseInt(jtf22.getText()),Integer.parseInt(jtf23.getText()),-20, 20, .1));
                }
            });
        JButton b3 = new JButton("Graph Exponential!");
        jp3.add(b3);
        b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    graph(Solver.graphExponential(Integer.parseInt(jtf31.getText()), -20, 20, .1));
                }
            });
        JButton b4 = new JButton("Graph Power!");
        jp4.add(b4);
        b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    graph(Solver.graphPower(Integer.parseInt(jtf41.getText()), Integer.parseInt(jtf42.getText()), -20, 20, .1));
                }
            });
        JButton b5 = new JButton("Graph Trig!");
        jp5.add(b5);
        b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    if(jcb51.getSelectedItem() == "sin")
                    {
                        graph(Solver.graphSin(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                    else if(jcb51.getSelectedItem() == "cos")
                    {
                        graph(Solver.graphCos(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                    else if(jcb51.getSelectedItem() == "tan")
                    {
                        graph(Solver.graphTan(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                    else if(jcb51.getSelectedItem() == "csc")
                    {
                        graph(Solver.graphCsc(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                    else if(jcb51.getSelectedItem() == "sec")
                    {
                        graph(Solver.graphSec(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                    else if(jcb51.getSelectedItem() == "cot")
                    {
                        graph(Solver.graphCot(Integer.parseInt(jtf51.getText()), Integer.parseInt(jtf52.getText()), Integer.parseInt(jtf53.getText()),-20, 20, .1));
                    }
                }
            });

        JButton b6 = new JButton("Graph Log!");
        jp6.add(b6);
        b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){
                    jtp.setVisible(false);
                    graph(Solver.graphLog(Integer.parseInt(jtf61.getText()), Integer.parseInt(jtf62.getText()), Integer.parseInt(jtf63.getText()), Integer.parseInt(jtf64.getText()), Integer.parseInt(jtf65.getText()), -20, 20, .1));
                }
            });
    }
}
