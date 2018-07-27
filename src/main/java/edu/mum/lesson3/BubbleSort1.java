package edu.mum.lesson3;

import java.util.Arrays;


/**
 * This is the slowest version of BubbleSort
 * No optimization for already sorted arrays.
 * Doesn't take into account the fact that
 * largest elements are pushed to the right.
 *
 */
public class BubbleSort1 {
	
	int[] arr;
	public int[] sort(int[] array){
		this.arr = array;
		bubbleSort();
		return arr;
		
	}
	private void bubbleSort(){
		int len = arr.length;
		boolean isDone = false;
		for(int i = 0; i < len; ++i) {
			if(!isDone) {
				boolean changed = false;
				for(int j = 0; j < len-1; ++j) {
					if(arr[j]> arr[j+1]){
					  	changed = true;
						swap(j,j+1);
					}
				}
				if(!changed) {
					isDone = true;
				}
			}
		}
	}
	
	int[] swap(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
		
	}
	public static void main(String[] args){
		int[] test = {21,13,1,-22, 51, 5, 18};
		BubbleSort1 bs = new BubbleSort1();
		
		System.out.println(Arrays.toString(bs.sort(test)));
		
	}

}
