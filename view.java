import java.awt.Color;

import javax.swing.*;

public class view {
    public static void main(String[] args) {
        new view();
    }
    private int x = 50,win =0;
    private JFrame f;
    private JPanel land,block,fin;
    private JLabel winText,pb;


    public view(){
        f = new JFrame();
        block = new JPanel();
        land = new JPanel();
        fin = new JPanel();
        winText = new JLabel("Bạn đã chiến thắng");
        pb = new JLabel("1.0");

        walk w = new walk(this);
        f.addKeyListener(w);
        f.setSize(1300,700);
        f.setVisible(true);
        f.setLayout(null);

        block.setBounds(x, 550 , 50 ,50);
        block.setBackground(Color.black);

        land.setBounds(0,600,1300,2);
        land.setBackground(Color.green);

        fin.setBounds(1200,550,50,50);
        fin.setBorder(BorderFactory.createLineBorder(Color.black));

        winText.setBounds(50,50,500,50);
        winText.setVisible(false);

        pb.setBounds(0,0,50,10);

        f.add(block);
        f.add(land);
        f.add(fin);
        f.add(winText);
        f.add(pb);
    }

    public void walk(){
        x += 50;
        block.setBounds(x, 550,50,50);
    }

    public int getXBlock(){
        return block.getX();
    }

    public int getWin(){
        return win;
    }

    public void win(){
        winText.setVisible(true);
        win = 1;
    }

}
