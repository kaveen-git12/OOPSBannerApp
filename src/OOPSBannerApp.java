public class OOPSBannerApp {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {

        private final char character;
        private final String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Pattern for O
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        // Pattern for P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*    ",
                "*    "
        });

        // Pattern for S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                "*****",
                "*    ",
                "*****",
                "    *",
                "*****"
        });

        // Array of objects
        CharacterPattern[] letters = {O, O, P, S};

        // Print banner
        for (int i = 0; i < O.getPattern().length; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern letter : letters) {
                line.append(letter.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}


   
