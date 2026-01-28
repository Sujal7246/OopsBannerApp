/**
 * UC6: Render OOPS banner using helper methods
 * Each letter pattern is generated using a separate method
 */
public class OopsBannerApp {

    // Method to return pattern for letter O
    static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }

    // Method to return pattern for letter P
    static String[] getPPattern() {
        return new String[]{
                " *****   ",
                " *    *  ",
                " *    *  ",
                " *****   ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    // Method to return pattern for letter S
    static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  *****  "
        };
    }

    // Main method
    public static void main(String[] args) {

        // Get patterns for each letter
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Print OOPS banner row by row
        for (int i = 0; i < 7; i++) {
            System.out.println(
                    oPattern[i] +
                            oPattern[i] +
                            pPattern[i] +
                            sPattern[i]
            );
        }
    }
}