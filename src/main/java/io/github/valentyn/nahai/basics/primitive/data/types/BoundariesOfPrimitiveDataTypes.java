package io.github.valentyn.nahai.basics.primitive.data.types;

/**
 * Task:
 * Write out the boundaries of the primitive data types.
 * Hint: 
 * You can use constants defined in 'wrap' classes for primitives.
 * For example, Integer.MAX_VALUE contains the upper boundary of the 'int'.
 */
public class BoundariesOfPrimitiveDataTypes {
    public static void main(String[] args) {
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
            Boolean.class.getSimpleName(), "" + Boolean.FALSE, "" + Boolean.TRUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n",
            Character.class.getSimpleName(), "" + Character.MIN_VALUE, "" + Character.MAX_VALUE);
        System.out.printf("%-24s: min = %-30s| max = %-30s\n", 
                            Byte.class.getSimpleName(), "" + Byte.MIN_VALUE, "" + Byte.MAX_VALUE);
        //... do by the analogy
        // Your code here
    }
}
