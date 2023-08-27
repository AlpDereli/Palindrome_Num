public class palindrom {
    static boolean palindromme(int i)
    {
        int temp = i,ri=0,ln;
        while (temp!=0){
            ln = temp%10;
            ri=(ri*10)+ln;
            temp/=10;
        }
        if (i==ri)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(palindromme(111));
    }
}
