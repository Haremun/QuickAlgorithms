int[] array = new int[] {5, 2, 10, 15, 32, 1, 17, 4};
int[] copyOfArray = Arrays.copyOf(array, array.length);
Arrays.sort(copyOfArray);
void showArray(int[] array){
for(int i = 0; i < array.length; i++){
System.out.println(array[i]);
}
}
showArray(copyOfArray);
for (int i = 0; i < array.length - 1; i++)
for (int j =0; j < array.length - 1 - i; j++){
if(array[j] > array[j+1]){
int tmp = array[j];
array[j] = array[j+1];
array[j+1] = tmp;
}
}
for(int i = 0; i < array.length; i++)
System.out.println(array[i]);
