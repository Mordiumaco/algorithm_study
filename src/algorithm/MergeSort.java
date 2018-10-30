package algorithm;

import java.util.Arrays;

public class MergeSort {
	
	int number = 9;
	int[] sorted = new int[number];
	int size;
	int count = 0;
	
	public static void main(String[] args) {
		MergeSort m =  new MergeSort(); 
		
		int[] array =  new int[]{7,6,5,8,3,2,9,1,4};
		
		m.mergeSort(array, 0, m.number-1);
		
		System.out.println(Arrays.toString(array));
		
	}
	
	
	void mergeSort(int a[], int m, int n){
		if( m < n ){
			int middle = (m+n)/2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	}
	
	public void merge(int a[], int m , int middle, int n){
		
		int i = m;
		int j = middle+1;
		int k = m;
		
		
		while(i <= middle && j <= n){
			
			if(a[i] <= a[j]){
				
				sorted[k] = a[i];
				i++;
				
			}else{
				
				sorted[k] = a[j];
				j++;
			}
			
			k++;
		}
		
		if(i > middle){
			for(int t = j; t <=n; t++){
				sorted[k] = a[t];
				k++;
			}
			
		}else{
			
			for(int t = i; t<= middle; t++){
				sorted[k] = a[t];
				k++;
			}
			
		}
		
		//정렬된 배열을 삽입 
		for(int t = m; t <= n; t++){
			a[t] = sorted[t];
		}
		
	}
	
	

	
}
