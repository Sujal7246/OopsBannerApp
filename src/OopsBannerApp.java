import java.util.HashMap;
import java.util.Map;

/**
 * UC8: Render OOPS banner using Map and functions
 * Uses HashMap for scalable character-pattern storage
 */
public class OopsBannerApp {

    /**
     * Creates and returns a map of character to its banner pattern
     */
    static Map<Character, String[]> createCharacterPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        // Pattern for letter O
        patternMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        // Pattern for letter P
        patternMap.put('P', new String[]{
                " *****   ",
                " *    *  ",
                " *    *  ",
                " *****   ",
                " *       ",
                " *       ",
                " *       "
        });

        // Pattern for letter S
        patternMap.put('S', new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        });

        return patternMap;
    }

    /**
     * Displays banner for a given word using character patterns
     */
    static void printBanner(String word, Map<Character, String[]> patternMap) {

        // Each character pattern has 7 rows
        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            // Build one row by looping through characters
            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch)[row]);
            }

            System.out.println(line);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create pattern map
        Map<Character, String[]> patternMap = createCharacterPatternMap();

        // Word to be printed as banner
        String word = "OOPS";

        // Print banner
        printBanner(word, patternMap);
    }
}