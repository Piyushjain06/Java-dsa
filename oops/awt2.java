import java.awt.*;

class awt_test extends Frame{
    awt_test(){
        // border layout manager
        Button b1 = new Button("Click here");
        b1.setBounds(20,100,80,30);
        Button b2 = new Button("Click here");
        b2.setBounds(20,100,80,30);
        setLayout(new BorderLayout());
        add(b1,"North");
        add(b2,"South");
        setSize(400,400);
        setVisible(true);
        
    }
    public static void main(String[] args){
        awt_test a = new awt_test();

    }
}