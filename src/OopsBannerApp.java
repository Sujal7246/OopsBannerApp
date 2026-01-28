/**
 * UC7: Render OOPS banner using CharacterPattern class
 * Demonstrates encapsulation and object usage
 */
public class OopsBannerApp {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPattern {

        // Stores the 7-line pattern for a character
        private final String[] pattern;

        // Constructor to initialize pattern
        CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        // Getter to access pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Method to return CharacterPattern object for letter O
    static CharacterPattern getO() {
        return new CharacterPattern(new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });
    }

    // Method to return CharacterPattern object for letter P
    static CharacterPattern getP() {
        return new CharacterPattern(new String[]{
                " *****   ",
                " *    *  ",
                " *    *  ",
                " *****   ",
                " *       ",
                " *       ",
                " *       "
        });
    }

    // Method to return CharacterPattern object for letter S
    static CharacterPattern getS() {
        return new CharacterPattern(new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });
    }

    // Main method
    public static void main(String[] args) {

        // Create objects for each character
        CharacterPattern o = getO();
        CharacterPattern p = getP();
        CharacterPattern s = getS();

        // Print OOPS banner row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    o.getPattern()[i] +
                            o.getPattern()[i] +
                            p.getPattern()[i] +
                            s.getPattern()[i]
            );
        }
    }
}