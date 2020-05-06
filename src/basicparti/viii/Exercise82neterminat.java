package basicparti.viii;

public class Exercise82neterminat {
    public static void main(String[] args) {
        int[] arr = {20, 30, 40, 50, 67};
        int x=arr[0];

        if (arr[arr.length-1]>x){
            x=arr[arr.length-1];
        }

        if (arr[arr.length/2+1]>x){
            x=arr[arr.length/2+1];
        }
        System.out.println(x);

    }
}
