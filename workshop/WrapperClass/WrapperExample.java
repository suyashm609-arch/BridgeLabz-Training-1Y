public class WrapperExample {
    public static void main(String[] args) {

        // Primitive values
        byte b = 10;
        int i = 100;
        char c = 'A';
        float f = 10.5f;
        double d = 20.99;
        short s = 5;
        long l = 100000L;
        boolean bool = true;

        // Converting primitives to Wrapper objects (Boxing)
        Byte byteObj = Byte.valueOf(b);
        Integer intObj = Integer.valueOf(i);
        Character charObj = Character.valueOf(c);
        Float floatObj = Float.valueOf(f);
        Double doubleObj = Double.valueOf(d);
        Short shortObj = Short.valueOf(s);
        Long longObj = Long.valueOf(l);
        Boolean boolObj = Boolean.valueOf(bool);

        // Printing Wrapper Objects
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Integer Object: " + intObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Long Object: " + longObj);
        System.out.println("Boolean Object: " + boolObj);

        // Unboxing (Wrapper → Primitive)
        byte b2 = byteObj;
        int i2 = intObj;
        char c2 = charObj;
        float f2 = floatObj;
        double d2 = doubleObj;
        short s2 = shortObj;
        long l2 = longObj;
        boolean bool2 = boolObj;

        System.out.println("\nAfter Unboxing:");
        System.out.println("byte: " + b2);
        System.out.println("int: " + i2);
        System.out.println("char: " + c2);
        System.out.println("float: " + f2);
        System.out.println("double: " + d2);
        System.out.println("short: " + s2);
        System.out.println("long: " + l2);
        System.out.println("boolean: " + bool2);
    }
}
