package h1_main;

public class H1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(isMirrorArray(a,b));
    }
    public static boolean isMirrorArray(int[] a, int[] b) {
        int j = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == b[a.length -i -1]) {
                j++;
            }
        }
        if(j == a.length) {
           return true;
        }
        else  {
              return false;
        }
    }
}
