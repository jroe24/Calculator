
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator1 =new Calculator();
        calculator1.setOperandOne(10.5);
        calculator1.setOperation('+');
        calculator1.setOperandTwo(5.2);
        calculator1.performOperation();
        calculator1.getResults();
    }
}