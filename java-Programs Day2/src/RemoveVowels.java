public class RemoveVowels {
    public static void main(String[] args) {
        String s="Welcome to Candid Java Program";
        System.out.println("Input String"+s);
        s=s.replaceAll("[AaEeIiOoUu]","");
        System.out.println(s);

    }
}
