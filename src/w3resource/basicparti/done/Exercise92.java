package w3resource.basicparti.done;

public class Exercise92 {
    public static void main(String[] args) {
        int [ ] arr={1, 2, 3, 4, 5, 6};
        int odd=0;
        int even=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0){
                even=even+1;
            }else{
                odd++;
            }

        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
