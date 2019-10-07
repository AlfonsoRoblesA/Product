/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author ponch
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {1, 2, 3, 4, 5};
        int newArray[];
        newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
            newArray[i]=1;
        }
        System.out.println();
        array = noDivision(array,newArray,0);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static int[] newArray(int[] array) {
        int p = 1;
        for (int i = 0; i < array.length; i++) {
            p = p * array[i];
        }
        int newArray[];
        newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = p / array[i];
        }
        return newArray;
    }

    public static int[] noDivision(int[] array, int[] memory, int index) {
        if (index == array.length) {
            return memory;
        }
        for (int i = 0; i < array.length; i++) {
            if (index != i) {
                memory[i] = memory[i] * array[index];
            }
        }
        return noDivision(array, memory, index+1);
    }

}
