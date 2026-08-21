class Mythread1 extends Thread{
    int a=5; 
    public void run(){
    for (int i =0 ; i<11; i++){
        System.out.println(i*a);
    }
}}
class Mythread2 extends Thread{
    int a=7; 
    public void run(){
    for (int i =0 ; i<11; i++){
        System.out.println(i*a);
    }
}}


public class prac1 {
    public static void main(String[] args) {
        Mythread1 t1= new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
