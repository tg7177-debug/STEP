/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 *
 * This use case extends UC6 by implementing a CharacterPatternMap class
 * to encapsulate character-to-pattern mappings.
 *
 * @author Developer
 * @version 7.0
 */

public class OOPSBannerApp {

    // Inner Class to store character and its pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create pattern objects for O, P, and S

        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });

        // Display "OOPS"
        String word = "OOPS";

        for (int i = 0; i < oPattern.getPattern().length; i++) {

            for (char ch : word.toCharArray()) {

                if (ch == 'O') {
                    System.out.print(oPattern.getPattern()[i] + "  ");
                } else if (ch == 'P') {
                    System.out.print(pPattern.getPattern()[i] + "  ");
                } else if (ch == 'S') {
                    System.out.print(sPattern.getPattern()[i] + "  ");
                }
            }
            System.out.println();
        }
    }
}