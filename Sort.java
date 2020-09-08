import java.util.*;

public class main {
    public static void main(String[] args) {
        String words;
        System.out.print("Input words: ");
        Scanner in = new Scanner(System.in);
        words = in.nextLine();
        words = words.toLowerCase();
        vowelOrConsonant(words);
    }

    public static void vowelOrConsonant(String words){
        ArrayList<Character> arrV = new ArrayList<Character>();
        ArrayList<Character> arrC = new ArrayList<Character>();
        for (int i = 0; i < words.length(); i++) {
            char ch =  words.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                arrV.add(ch);
            }else if((ch >= 'a'&& ch <= 'z')){
                arrC.add(ch);
            }
        }

        System.out.print("Vowel: ");
        Collections.sort(arrV);
        for (int i = 0; i < arrV.size(); i++) {
            System.out.print(arrV.get(i));
        }
        System.out.println();

        System.out.print("Consonant: ");
        Collections.sort(arrC);
        for (int i = 0; i < arrC.size(); i++) {
            System.out.print(arrC.get(i));
        }
    }
}
