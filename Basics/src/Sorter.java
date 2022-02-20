
public class Sorter {
	public int[] bubleSort(int[] arrayToSort) {
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			for (int j = 0; j < arrayToSort.length - 1; j++) {
				if (arrayToSort[j + 1] < arrayToSort[j]) {
					int temp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j + 1];
					arrayToSort[j + 1] = temp;
				}
			}
		}
		return arrayToSort;
	}
	
	public void heapSort(int[] arrayToSort) {
		
		for (int i = arrayToSort.length / 2 - 1; i >= 0; i--) {
			buildHeap(arrayToSort, arrayToSort.length, i);
		}
		
		for (int i = arrayToSort.length - 1; i >= 0; i--) {
			int temp = arrayToSort[0];
			arrayToSort[0] = arrayToSort[i];
			arrayToSort[i] = temp;
			buildHeap(arrayToSort, i, 0);
		}
	}
	
	public int[] buildHeap(int[] arrayToBuildHeap, int sizeHeap, int currentRoot) {
		
		int largest = currentRoot;
		int leftNode = currentRoot * 2 + 1;
		int rightNode = currentRoot * 2 + 2;
		
		if (leftNode < sizeHeap && arrayToBuildHeap[largest] < arrayToBuildHeap[leftNode]) {
			largest = leftNode;
		}
		
		if (rightNode < sizeHeap && arrayToBuildHeap[largest] < arrayToBuildHeap[rightNode]) {
			largest = rightNode;
		}
		
		if (largest != currentRoot) {
			int temp = arrayToBuildHeap[currentRoot];
			arrayToBuildHeap[currentRoot] = arrayToBuildHeap[largest];
			arrayToBuildHeap[largest] = temp;
			buildHeap(arrayToBuildHeap, sizeHeap, largest);
		}
		
		return arrayToBuildHeap;
	}
}
