import java.awt.*;
      
public class awt1 extends Frame{
    awt1(){
        Button b = new Button("Click here");
        b.setBounds(20,100,80,30);
        setSize(400,400); // frame size
        setLayout(null);
        setVisible(true);
        add(b);
    }
    public static void main(String[] args){
        awt1 a = new awt1();

    }
}
