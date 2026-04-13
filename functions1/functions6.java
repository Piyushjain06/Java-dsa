public class functions6 {
    public static  void BinToDec(int num){
        int num1=num;
        int pow=0;
        int decbase=0;
        while (num>0){
            int lastdigit= num%10;
            decbase= decbase + (lastdigit* (int)Math.pow(2, pow));
            pow++;
            num=num/10;
        }
        System.out.println("decimal of binary number "+num1+" is "+ decbase);
    }
     public static void main(String args[]){
        BinToDec(101);
    }
}
