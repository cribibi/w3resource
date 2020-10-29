package w3resource.basicparti.done;

public class Exercise73 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "";
        String str3="xxxx";
        metoda(str1, str2);
        metoda(str1, str3);
    }

    public static void metoda(String string, String string2) {
        String noulString = new String();
        if (string.length() == 0) {
            string = "#";
        } else if (string2.length() == 0) {
            string2 = "#";
        }
        noulString = string.substring(0, 1) + string2.substring(string2.length() - 1);
        System.out.println(noulString);

    }
}
