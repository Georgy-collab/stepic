import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Drawing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillOval(300, 85, 100, 80);
                g.setColor(Color.WHITE);
                g.fillRoundRect(300, 95, 100, 310, 10, 10);
                g.setColor(Color.BLACK);
                g.fillRoundRect(300, 100, 100, 310, 10, 10);
                g.fillRoundRect(325, 420, 50, 50, 10, 10);

                g.setColor(Color.WHITE);
                g.fillOval(310, 110, 80, 80);
                g.fillOval(310, 200, 80, 80);
                g.fillOval(310, 300, 80, 80);
                g.setColor(Color.BLACK);
                g.fillOval(310, 120, 80, 80);
                g.fillOval(310, 210, 80, 80);
                g.fillOval(310, 310, 80, 80);
                g.setColor(Color.RED);
                g.fillOval(320, 130, 60, 60);
                g.setColor(Color.YELLOW);
                g.fillOval(320, 220, 60, 60);
                g.setColor(Color.GREEN);
                g.fillOval(320, 320, 60, 60);

                g.setColor(Color.BLACK);
                g.fillRoundRect(240,130, 50, 10, 10, 10);
                g.fillRoundRect(280,130, 10, 50, 10, 10);
                int xp_1[]= {240,280,280};
                int yp_1[]= {135,135,175};
                g.fillPolygon(xp_1,yp_1,3);

                g.fillRoundRect(410,130, 50, 10, 10, 10);
                g.fillRoundRect(410,130, 10, 50, 10, 10);
                int xp_2[]= {420,462,420};
                int yp_2[]= {135,135,175};
                g.fillPolygon(xp_2,yp_2,3);

                g.fillRoundRect(240,230, 50, 10, 10, 10);
                g.fillRoundRect(280,230, 10, 50, 10, 10);
                int xp_3[]= {240,280,280};
                int yp_3[]= {235,235,275};
                g.fillPolygon(xp_3,yp_3,3);

                g.fillRoundRect(410,230, 50, 10, 10, 10);
                g.fillRoundRect(410,230, 10, 50, 10, 10);
                int xp_4[]= {420,462,420};
                int yp_4[]= {235,235,275};
                g.fillPolygon(xp_4,yp_4,3);

                g.fillRoundRect(240,330, 50, 10, 10, 10);
                g.fillRoundRect(280,330, 10, 50, 10, 10);
                int xp_5[]= {240,280,280};
                int yp_5[]= {335,335,375};
                g.fillPolygon(xp_5,yp_5,3);

                g.fillRoundRect(410,330, 50, 10, 10, 10);
                g.fillRoundRect(410,330, 10, 50, 10, 10);
                int xp_6[]= {420,462,420};
                int yp_6[]= {335,335,375};
                g.fillPolygon(xp_6,yp_6,3);


            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
