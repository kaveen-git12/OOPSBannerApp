import java.util.HashMap;

public class OOPSBannerApp {

    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        });

        String word = "OOPS";

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                String[] pattern = patternMap.get(ch);

                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }
}