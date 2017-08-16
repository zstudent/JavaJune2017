package lesson170814;

import java.util.Arrays;

public class MergeExamples {
	
	public static void main(String[] args) {
		
//		Integer[] a = {10, 20, 30, 40, 15, 25, 30, 35 };
//		Integer[] aux = new Integer[a.length];
//		
//		merge(a, aux, 0, a.length - 1, 3);
//		
//		System.out.println(Arrays.toString(a));
		
		Integer[] a2 = {70, 60, 50, 40, 30, 20, 10, 0};
		sort(a2);
		
	}
	
	static public void sort(Comparable[] a) {
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}
	
	
	static private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
//		System.out.println(Arrays.toString(a) + " " + lo + "," + hi);
		if (hi <= lo) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a , aux, mid+1, hi);
		merge(a, aux, lo, hi, mid);
		System.out.println("Merged: " + Arrays.toString(a) + " " + lo + "," + hi);
		System.out.println();
	}

	static public void merge(Comparable[] a, Comparable[] aux, int lo, int hi, int mid) {
		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}
		
		int i = lo; int j = mid+1;
		
		for (int k = lo; k <= hi; k++) {
			
			if (i > mid) {  // если левая часть закончилась, то... 
				a[k] = aux[j++];  // берём из правой части
				
			} else if (j > hi) {  // если же правая часть закончилась, то...
				a[k] = aux[i++];  //  то берём из левой части
			} else if (aux[j].compareTo(aux[i]) < 0) {  // иначе 
				// если элемент справа меньше, чем элемент слева, то...
				a[k] = aux[j++]; // берём из правой части
			}
			else {
				a[k] = aux[i++]; // иначе берём из левой части
			}
		}
	}

}
