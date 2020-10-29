package w3resource.basicparti.x;

public class Exercise107 {
    public static void main(String[] args) {
        int [] arr={10, 1, 2, 4, 6, 7, 8};
        metoda(arr);


    }public static void metoda(int [] arr){
        for (int i = 1; i <arr.length -1 ; i++) {
            if((arr[i-1]+1==arr[i])&&(arr[i]+1==arr[i+1])){
                System.out.println("true");
                System.out.println(arr[i-1]+", "+arr[i]+", "+arr[i+1]);
                break;
            }
        }
    }
}
