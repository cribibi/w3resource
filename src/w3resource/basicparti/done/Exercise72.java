package w3resource.basicparti.done;

public class Exercise72 {
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "";
        metoda(str1);
        metoda(str2);
    }

    public static void metoda(String string) {
        String noulString = new String();
        if (string.length() >= 3) {
            noulString = string.substring(0, 3);
        }else if(string.length()==2){
            noulString=string+"#";
        }else if(string.length()==1){
            noulString=string+"##";
        }else {
            noulString="###";
        }
        System.out.println(noulString);

    }
}
