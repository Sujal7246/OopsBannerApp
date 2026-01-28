/**
 * UC5: Render OOPS banner using inline array initialization
 * Combines declaration and initialization of banner lines
 */
public class OopsBannerApp {

    public static void main(String[] args) {

        // Inline initialization of banner lines
        String[] bannerLines = {

                String.join("",
                        "  *****  ", "  *****  ", "  *****  ", "  *****  "),

                String.join("",
                        " *     * ", " *     * ", " *     * ", " *       "),

                String.join("",
                        " *     * ", " *     * ", " *     * ", " *       "),

                String.join("",
                        " *     * ", " *     * ", " *****   ", "  *****  "),

                String.join("",
                        " *     * ", " *     * ", " *       ", "       * "),

                String.join("",
                        " *     * ", " *     * ", " *       ", "       * "),

                String.join("",
                        "  *****  ", "  *****  ", " *       ", "  *****  ")
        };

        // Print banner using loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}