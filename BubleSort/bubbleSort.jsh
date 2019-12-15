int[] array = new int[] {5, 2, 10, 15, 32, 1, 17, 4};
int[] copyOfArray = Arrays.copyOf(array, array.length);


void measureTime(long startTime){
  System.out.println("Time: " + TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - startTime) + " ms");
}
void showArray(int[] array){
  for(int i = 0; i < array.length; i++){
    System.out.print(array[i] + " ");
  }
  System.out.println("");
}
void bubbleSort(int[] array){
  for (int i = 0; i < array.length - 1; i++)
    for (int j =0; j < array.length - 1 - i; j++){
      if(array[j] > array[j+1]){
        int tmp = array[j];
        array[j] = array[j+1];
        array[j+1] = tmp;
      }
    } 
}
System.out.println("Arrays.sort:");
long startTime = System.nanoTime();
Arrays.sort(copyOfArray);
measureTime(startTime);

showArray(copyOfArray);

System.out.println("Bubble sort:");
startTime = System.nanoTime();
bubbleSort(array);
measureTime(startTime);

showArray(array);

