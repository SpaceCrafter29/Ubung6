package h2_main;

public class H2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {10,9,8,7,6,5,4,3,2,1};
        int[] c = {1,2,3,4,5,6,7,8,9};
        System.out.println(compareArrays(a,c));

    }
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length !=  arr2.length) {
            return false;

        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
