package w3resource.string;

public class Exercise28 {
    public static void main(String[] args) {
        String alphabet="The quick brown fox jumps over the lazy dog.";
        char [] caractere=alphabet.toCharArray();

        for (int i = 0; i <caractere.length ; i++) {
            System.out.println(caractere[i]);
        }
    }
}
