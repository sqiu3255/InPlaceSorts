/*
*  Author: Sophia Qiu
*  Date Created: 01.17.2018
*  Project Name: Lab 3.1 In Place Sorts
*/


import java.util.Arrays;

public class sort {
	
	public static void main(String[] args)
	{
		//testing arrays
		int[] test1 = new int[]{1, 4, 4, 5, 2, 4, 3, 17, 0};
		
		double[] test2 = new double[]{1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		
		String[] test3 = new String[]{"zebra","tortilla","abba","foo","bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		//Selection Sort Test 
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + "nanoseconds");
		System.out.println(Arrays.toString(test3));
		
	}
	
	
	
	public static void insertionSort(int[] list1)
	{
		for (int i = 0; i < list1.length - 1; i++)
		{	
			if (list1[i] < list1[i + 1])
			{
				xinsertionSort(list1, i, i+1);
			}
		}
	}
	
	public static void selectionSort(double[] list2)
	{
		
	}
	
	public static void bubbleSort(String[] list1)
	{
		
	}
	
	public static void xinsertionSort(int[]arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void xselectionSort(int[]arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void xbubbleSort(int[]arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
}
