package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[1000000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);


		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("insertion_sort", "insertingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);
		//By following above, Continue for rest of the Sorting Algorithm....

		//bubble sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("bubble_sort", "bubbleNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//merge sort
		algo.mergeSort(num,0,n-1);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "mergeNumbers");
		numbers = connectToSqlDB.readDataBase("merge_sort", "mergeNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//quick sort
		algo.quickSort(num,0,n-1);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "quickNumbers");
		numbers = connectToSqlDB.readDataBase("quick_sort", "quickNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//heap sort
		algo.heapSort(num,n);
		int maxValueForBucketSort = num[num.length-1];
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort", "heapNumbers");
		numbers = connectToSqlDB.readDataBase("heap_sort", "heapNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//Bucket sort
		algo.bucketSort(num,maxValueForBucketSort);
		long bucketSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");
		//connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort", "bucketNumbers");
		//numbers = connectToSqlDB.readDataBase("bucket_sort", "bucketNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);


		//shell Short
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort", "shellNumbers");
		numbers = connectToSqlDB.readDataBase("shell_sort", "shellNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);



		//Come to conclusion about which Sorting Algo is better in given data set.

	}


	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
