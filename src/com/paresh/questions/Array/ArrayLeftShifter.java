package com.paresh.questions.Array;

import java.util.Scanner;

public class ArrayLeftShifter {

    public static void ArrayLeftShift() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length Of Array: ");
        int length1 = sc.nextInt();
        int[] Arr1 = new int[length1];

        for (int i = 0; i < length1; i++) {
            System.out.print("Enter Array Element " + i + " :");
            Arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Number To Left Shift: ");
        int Left = sc.nextInt();
        int[] LeftArray = new int[length1];
        if (length1 - Left >= 0) System.arraycopy(Arr1, Left + 0, LeftArray, 0, length1 - Left);

        if (Left >= 0) System.arraycopy(Arr1, 0, LeftArray, (length1 - Left) + 0, Left);
        for (int i = 0; i < length1; i++) {
            System.out.print(LeftArray[i] + " ");
        }

        System.out.print("Enter Number To Right Shift: ");
        int Right = sc.nextInt();
        int[] RightArray = new int[length1];

        if (Right >= 0) System.arraycopy(Arr1, (length1 - Right) + 0, RightArray, 0, Right);
        if (length1 - Right >= 0) System.arraycopy(Arr1, 0, RightArray, Right + 0, length1 - Right);

        for (int i = 0; i < length1; i++) {
            System.out.println(RightArray[i]);
        }
        sc.close();

    }

    static void main(String[] args) {
        ArrayLeftShifter.ArrayLeftShift();

    }

}
