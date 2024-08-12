public class App {
    // Alexander Quirk
    public static int add(int a, int b) { 
        return a + b;
    }  
    public static void main(String[] args) { 
        // Autoboxing: Converting primitive type int to wrapper object Integer wrappedNum1
        int num1 = 42; 
        Integer wrappedNum1 = num1; 
        // Autoboxing: Converting num2 to wrapper object Double wrappedNum2
        double num2 = 38.54;
        Double wrappedNum2 = num2;
        // Autoboxing: Converting primitive character to wrapper object Character wrappedChar
        char Char = 'A';
        Character wrappedChar = Char;
        System.out.println("Autoboxing:"); 
        System.out.println("Wrapped Integer: " + wrappedNum1); 
        System.out.println("Wrapped Double: " + wrappedNum2); 
        System.out.println("Wrapped Character: " + wrappedChar); 
        // Unboxing: Converting wrapper objects to primitive types 
        int primitiveNum1 = wrappedNum1;
        double primitiveNum2 = wrappedNum2;
        char primitiveChar = wrappedChar;
        // autoboxing: invoking add() method for primitive types addition and display result1
        int result1 = add(primitiveNum1, (int) primitiveNum2);
        System.out.println("Unboxing:");
        System.out.println("Primitive Type Addition: " + result1); 
        // Unboxing: using intValue() method to extract the primitive int value from the Integer objects and display result2 
        int result2 = wrappedNum1.intValue() + wrappedNum2.intValue();
        System.out.println("Wrapper Class Addition: " + result2);
    }
} 