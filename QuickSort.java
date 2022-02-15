package Java;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter "+size+" elements:");
        int[] array = new int[size];
        for(int i=0; i<size; ++i) {
            array[i] = sc.nextInt();
        }
        quickSort(array, 0, size-1);

        System.out.println("The sorted array is:");
        for(int i=0; i<size; ++i) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    protected static void quickSort(int[] array, int low, int upp) {
        if(low >= upp) {
            return;
        }
        int location = partition(array, low, upp);

        quickSort(array, low, location-1);
        quickSort(array, location+1, upp);
    }

    protected static int partition(int[] array, int low, int upp) {
        int start = low;
        int end = upp;
        int pivot = array[low];

        while(array[start] <= pivot && start < end) {
            start++;
        }
        while(array[end] > pivot) {
            end--;
        }
        if(start < end) {
            swap(array, start, end);
        }
        else {
                swap(array, end, low);
        }
        return end;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
