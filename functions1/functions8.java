class function8 {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        else{
            int y=x;
            int reverse=0;
            while (x>0){
                int rem= x%10;
                reverse= reverse*10  + rem;
                x=x/10;
            }
            if (y==reverse){
                return true;
            }
            else {return false;}
        }
    }
    public static void main(String args[]){
        System.out.println(isPalindrome(121));
    }
}