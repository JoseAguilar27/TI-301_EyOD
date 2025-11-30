/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3_EstructurasNoLineales;

/**
 *
 * @author Jose
 */
public class BinarySearch {
 
    public static void main(String[] args){
    int[] datos = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37};
    System.out.println(binarySearch(datos,22,8,23));
    }
public static boolean binarySearch(int[] data, int target, int low, int high) {
    if (low > high)
        return false;    // interval empty; no match
    else {
        int mid = (low + high) / 2;
        if (target == data[mid])
            return true;    // found a match
        else if (target < data[mid])
            return binarySearch(data, target, low, mid - 1);   // recur left of the middle
        else
            return binarySearch(data, target, mid + 1, high);   // recur right of the middle
    }
}
}
