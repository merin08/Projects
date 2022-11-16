/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotate;

/**
 *
 * @author Merin
 */
public class Rotate {

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void left(int[] arr, int k) {

        // Reverse all numbers
        reverse(arr, 0, arr.length - 1);

        // Reverse first arr.length-k numbers
        reverse(arr, 0, arr.length - k - 1);

        // Reverse last k numbers
        reverse(arr, arr.length - k, arr.length - 1);
    }

    public void right(int[] arr, int k) {

        // Reverse all numbers
        reverse(arr, 0, arr.length - 1);

        // Reverse last k numbers
        reverse(arr, arr.length - k, arr.length - 1);
        

        // Reverse first arr.length-k numbers
        reverse(arr, 0, arr.length - k - 1);
    }

    static void PrintTheArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,2,7,4,6,8,9};
        int p = 3; 
        int n = arr.length;
        int d = 1;  //here we can change the value 0 or 1 , 0 for left and 1 for right 
        Rotate kl = new Rotate();
        if (d == 0) {
            kl.left(arr, p);
            PrintTheArray(arr, n);

        }if(d==1) {
            kl.right(arr, p);
            PrintTheArray(arr, n);

        }
    }

}
