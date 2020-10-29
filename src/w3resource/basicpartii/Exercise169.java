package w3resource.basicpartii;

public class Exercise169 {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        reverseString(s);
    }
    public static void reverseString(String s){
        String [] c=s.split(" ");
        for (int i = c.length-1; i >=0 ; i--) {
            System.out.print(c[i]+" ");
        }
    }
}
