import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String reverse
        String str1 = "Hollywood";
        System.out.println(rev(str1));
    }

    private static String rev(String str1) {
        char[] chrArr = str1.toCharArray();
        int len = chrArr.length;

        for(int i=0; i<len/2;i++){
            char temp = chrArr[i];
            chrArr[i] = chrArr[len-1-i];
            chrArr[len-1-i] = temp;
        }
        return new String(chrArr);
    }
}