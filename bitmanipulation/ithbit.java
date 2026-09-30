
public class ithbit {
    public static void getIthBit(int n,int i ){
        int bitMask= (1<<i);
        if ((n&bitMask)== 0){
            System.out.println("The bit is zero");
        }
        else{
        System.out.println("The bit is one");

        }
    }
     public static int setIthBit(int n,int i ){
        int bitMask=1<<i;
        return n|bitMask;
     }
      public static int clearIthBit(int n,int i ){
        int bitMask=~(1<<i);
        return n&bitMask;
     }
           public static int clearNIBit(int n,int i ){
        int bitMask=(-1<<i);
        return n&bitMask;
     }
    public static void main(String[] args) {
        getIthBit(6,1);
        System.out.println(setIthBit(10, 2));
        System.out.println(clearNIBit(15 ,2));

    }
}
