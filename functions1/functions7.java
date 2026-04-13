public class functions7 {
    public static void DecToBin(int num){
        int num1=num;
        int pow=0;
        int decbase=0;
        while (num>0){
            int lastdigit= num%2;
            decbase= decbase + (lastdigit* (int)Math.pow(10, pow));
            pow++;
            num=num/2;
        }
        System.out.println("binary of decimal number "+num1+" is "+ decbase);
    }
     public static void main(String args[]){
        DecToBin(5);
    }
}