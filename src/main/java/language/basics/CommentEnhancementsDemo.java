package language.basics;

/**
 * <h1>Comment Enhancements Demo Class</h1>
 *
 * This class demonstrates **all modern enhancements** in Java comments,
 * including Unicode, Javadoc tags, code snippets, links, and HTML5 support.  
 *
 * <p><b>Features Covered:</b></p>
 * <ul>
 *     <li>{@code} – Inline code formatting</li>
 *     <li>{@literal} – Display raw HTML characters</li>
 *     <li>{@link}/{@linkplain} – Cross-reference links</li>
 *     <li>{@snippet} – (Java 18+) Real code snippet with syntax highlighting</li>
 *     <li>Unicode + Emoji support 😊</li>
 *     <li>HTML5 supported formatting</li>
 *     <li>Module tags: @uses, @provides (JPMS)</li
 * </ul>
 *
 * @author Bharath
 * @version 1.0
 * @since 2025
 *
 * @uses    java.sql.Driver
 * @provides java.util.Random
 */
public class CommentEnhancementsDemo {

    // -------------------------------------------------------------
    // 1. SINGLE-LINE COMMENT: Normal use, supports Unicode 🚀
    // -------------------------------------------------------------
    // This is a single-line comment with emoji 👍


    /* -----------------------------------------------------------
       2. MULTI-LINE COMMENT: Also supports Unicode & formatting 🎉
       ----------------------------------------------------------- */
    /*
       This is a multi-line comment.
       You can write paragraphs, ASCII art, diagrams, etc.
    */


    /**
     * 3. DOCUMENTATION COMMENT (JAVADOC)
     *
     * Shows inline code using {@code int x = 10;}
     * Shows literal HTML using {@literal <html>} safely.
     *
     * @param name  The name of the user.
     * @return A welcome message.
     *
     * @link https://docs.oracle.com/javase/ (External link)
     */
    public String greet(String name) {
        return "Hello, " + name;
    }


    /**
     * 4. JAVADOC WITH {@link} AND {@linkplain}
     *
     * {@link String} → Shows hyperlink with class name  
     * {@linkplain String} → Same link, but displays plain text
     */
    public void linkExamples() {
        String text = "Sample";
        System.out.println(text);
    }


    /**
     * 5. JAVADOC SNIPPET (Java 18+)
     *
     * {@snippet :
     *   int a = 10;
     *   int b = 20;
     *   System.out.println(a + b); // prints 30
     * }
     *
     * Snippets support syntax highlighting and validation.
     */
    public void snippetExample() {
        System.out.println(30);
    }


    /**
     * 6. SNIPPET USING REGIONS (Advanced)
     *
     * {@snippet lang="java" region="calc"}
     * ----
     * // @start region=calc
     * int x = 100;
     * int y = 50;
     * System.out.println(x - y);
     * // @end region=calc
     */
    public void regionSnippetExample() {
        System.out.println(50);
    }


    /**
     * 7. JAVADOC WITH HTML5 MARKUP
     *
     * <p>This paragraph is HTML5 compliant.</p>
     * <pre>
     *   This block preserves formatting.
     *   Great for printing SQL, JSON, XML, etc.
     * </pre>
     */
    public void html5Example() {
        System.out.println("HTML5 Doc Example");
    }


    /**
     * 8. JAVADOC WITH DEPRECATION NOTICE
     *
     * @deprecated Use {@link #greet(String)} instead.
     */
    @Deprecated
    public void oldMethod() {
        System.out.println("Deprecated method");
    }


    public static void main(String[] args) {

        // Emoji in comments → works on all modern Java versions 😊
        // Creating object
        CommentEnhancementsDemo demo = new CommentEnhancementsDemo();

        System.out.println(demo.greet("Abhinav"));
        demo.linkExamples();
        demo.snippetExample();
        demo.regionSnippetExample();
        demo.html5Example();
        demo.oldMethod();
    }
}
