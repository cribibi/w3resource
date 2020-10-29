package w3resource.basicpartii;

public class Exercise159neterminat {
    public static void main(String[] args) {
        //159. Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order

        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        int [] arrk=new int [k];

        int x=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(x<arr[i]){
                x=arr[i];
            }

        }
    }
}
