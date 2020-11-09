import org.junit.jupiter.api.*;

class CalculatorTest {

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
    @DisplayName("Test of addition method.")
    void testAdd() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(45,calculator.add(30,15));
    }

    @Disabled
    @RepeatedTest(5)
    @DisplayName("Repeated test to check for value of 15 in subtract method.")
    void testSubtractDisabled() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(15,calculator.subtract(30,15));
    }

    @RepeatedTest(5)
    @DisplayName("Repeated test to check against 0 value in subtract method.")
    void testSubtract() {
        Calculator calculator = new Calculator();
        Assertions.assertNotEquals(0,calculator.subtract(30,15));
    }

    @Test
    @DisplayName("Test of multiply method.")
    void testMultiply() {
        Calculator calculator = new Calculator();
        Assertions.assertFalse(450 != calculator.multiply(30,15));
    }

    @Test
    @DisplayName("Test of divide method.")
    void testDivide() {
        Calculator calculator = new Calculator();
        Assertions.assertTrue(2 == calculator.divide(30,15));
    }


}