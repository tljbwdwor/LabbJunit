import org.junit.jupiter.api.*;

class TextProcessorTest {

    @BeforeAll
    static void beforeAllTest(){
        System.out.println("Start testing process...");
    }

    @BeforeEach
    void beforeEachTest(){
        System.out.println("New test initialising...");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("Test complete.");
    }

    @AfterAll
    static void afterAllTest(){
        System.out.println("All tests complete.");
    }

    @Test
    @DisplayName("Test that upper case method not null")
    void testUpperNotNull() {
        TextProcessor textProcessor = new TextProcessor();
        Assertions.assertNotNull("HELLO WORLD!" == textProcessor.upper("Hello there!"));
    }

    @Test
    @DisplayName("Test that upper case method returns correctly")
    void testUpperWorks() {
        TextProcessor textProcessor = new TextProcessor();
        Assertions.assertEquals("HELLO THERE!",textProcessor.upper("Hello there!"));
    }

    @Test
    @DisplayName("Test that lower case method works properly")
    void testLowerCaseWorks() {
        TextProcessor textProcessor = new TextProcessor();
        Assertions.assertEquals("hello there!",textProcessor.lower("Hello there!"));
    }

    @Test
    @DisplayName("Test that reverse method works properly")
    void testReverseMethodWorks() {
        TextProcessor textProcessor= new TextProcessor();
        Assertions.assertEquals("!ereht olleH",textProcessor.reverse("Hello there!"));
    }

}