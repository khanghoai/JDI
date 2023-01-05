import java.awt.event.*;

public class walk implements KeyListener{
    view walk;
    public walk (view walk){
        this.walk = walk;
    }
    public void keyPressed(KeyEvent e){

    }

    public void keyReleased (KeyEvent e){
        if(e.getKeyCode() == 39 && walk.getWin() == 0){
            walk.walk();
        }
        if(walk.getXBlock() == 1200){
            walk.win();
        }
    }

    public void keyTyped (KeyEvent e){

    }

}
