package org.example;

public class Main {
    public static void main(String[] args) {
        char character1 = 1;
        char character2 = 65535;
        System.out.println(character1 + character2);

        byte byte1 = -2;
        byte byte2 = 127;
        System.out.println(byte1 - byte2);

        int int1 = 2147483647;
        int int2 = 1;
        boolean boolean1 = (int1 + int2) == -2147483648;
        System.out.println(boolean1);
        System.out.println(int1 + int2);

        long long1 = 34567;
        long long2 = 2147483649L;
        int int3 = (int) long1;
        int int4 = (int) long2;
        System.out.println(int3);
        System.out.println(int4);

        int int5 = 6;
        int int6 = 4;
        System.out.println(int5 / int6);

        double double1 = 100.0;
        double double2 = 40.0;
        System.out.println(double1 / double2);
        System.out.println(double2 / (double) int5);
        System.out.println(double2 / int6);

        float float1 = 10.0f;
        float float2 = 3.3f;
        System.out.println(float1 * float2);

        if (character1 > character2) {
            System.out.println("character1 more then character2");
        } else if (byte1 < byte2) {
            System.out.println("byte1 more then byte2");
        } else if ((character1 > character2) && (byte1 < byte2)) {
            System.out.println("character1 more then character2 and byte1 more then byte2");
        } else if ((character1 > character2) || (byte1 < byte2)) {
            System.out.println("One of options is true");
        }
    }
}