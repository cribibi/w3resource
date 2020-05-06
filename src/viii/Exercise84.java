package viii;

public class Exercise84 {
    public static void main(String[] args) {
        String str="Python";
        str=str.substring(str.length()-3)+str+str.substring(str.length()-3);
        System.out.println(str);
    }
}
