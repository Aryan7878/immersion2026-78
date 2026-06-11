public class displayNameWithoutVowel {
    public static void main(String[] args) {
        String name = "Aryan Chaudhary";
        String result = "";
        for (char c : name.toCharArray()) {
            int ascii = Character.toLowerCase(c);
            if (ascii != 97 && ascii != 101 && ascii != 105 && ascii != 111 && ascii != 117) {
                result += c;
            }
        }
        System.out.println(result);
    }
}
