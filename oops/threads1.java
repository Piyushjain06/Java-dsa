
class t1 extends Thread{
    public void run(){
        for (int i =0; i<=5;i++ ){
            System.out.println("Thread 1 "+ i);

        }
    }
    
}
class t2 extends Thread{
    public void run(){
        for (int i =0; i<=5;i++ ){
            System.out.println("Thread 2 "+ i);
        }
    }
    
}
public class threads1{
public static void main(String[] args){
    t1 obj1 = new t1();
    t2 obj2 = new t2();
    obj1.run();

    
    obj2.run();
}}