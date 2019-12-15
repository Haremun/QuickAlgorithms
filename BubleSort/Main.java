import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main{
static int[] array = new int[] {5, 2, 10, 15, 32, 1, 17, 4};
static int[] copyOfArray = Arrays.copyOf(array, array.length);


public static void main(String[] args){
  System.out.println("Arrays.sort:");
  long startTime = 0; 

  startTime = System.nanoTime();
  Arrays.sort(copyOfArray);
  measureTimeNano(startTime);

  showArray(copyOfArray);

  System.out.println("Bubble sort:");
  startTime = System.nanoTime();
  bubbleSort(array);
  measureTimeNano(startTime);

  showArray(array);
  }

static void measureTime(long startTime){
  System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime) + " ms");
}
static void measureTimeNano(long startTime){
  System.out.println("Time: " + (System.nanoTime() - startTime) + " ns");
}

static void showArray(int[] array){
  for(int i = 0; i < array.length; i++){
    System.out.print(array[i] + " ");
  }
  System.out.println("");
}
static void bubbleSort(int[] array){
  for (int i = 0; i < array.length - 1; i++)
    for (int j =0; j < array.length - 1 - i; j++){
      if(array[j] > array[j+1]){
        int tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
      }
    } 
}
}
