package net.paats;

public class Main {

    public static void main(String[] args) {
        //with of int = 32 bits
        int myIntValue = 5 / 3;
        //with of float = 32 bits
        float myFloatValue = 5f / 3f;
        //with of double = 64 bits
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloutValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //opdracht
        System.out.println("\nStart Opdracht\n");
        double poundToKilogram = 0.45359237d; // conversion 1 Pound in to 0.45359237 Kilogram
        double pounds = 745.54d; // Volume of Pounds to be converted
        double kilograms = pounds * poundToKilogram; // execution of conversion

        System.out.println("the volume of " + pounds + " Pounds is equil to " + kilograms + " Kilograms");
    }
}
