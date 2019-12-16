import java.util.*;

public class Polynomial{
  public static void main(String[] args){
    polyArray();
    polyString();
    polyLinkedList();
    polyQueue();
  }

  private static void polyArray(){
     int[] polynomial = new int[] { 5, 3, 0, 1, 5, 9};
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < polynomial.length; i++){
       if(polynomial[i] != 0){
         builder.append(polynomial[i] + "x");
	 if(i != polynomial.length - 1){
           builder.append("^" + (polynomial.length - i));
           builder.append(" + ");
         }
       }
    }
    System.out.println(builder.toString());
  }
  private static void polyString(){
    String poly = "5x^3 + 2x^2 + 4x";
    System.out.println(poly);
  }
  private static void polyLinkedList(){
    List<Integer> poly = new LinkedList<>();
    poly.add(5);
    poly.add(0);
    poly.add(-1);
    poly.add(2);
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < poly.size(); i++){
       if(poly.get(i) != 0){
         builder.append(poly.get(i) + "x");
	 if(i != poly.size() - 1){
           builder.append("^" + (poly.size() - i));
           builder.append(" + ");
         }
       }
    }
    System.out.println(builder.toString());
  }
  private static void polyQueue(){
    ArrayDeque<Integer> poly = new ArrayDeque<>();
    poly.add(8);
    poly.add(5);
    poly.add(2);
    poly.add(2);
    StringBuilder builder= new StringBuilder();
    int size = poly.size();
    for (int i = 0; i < size; i++){
      Integer number = poly.poll();
      if (number != 0){
        builder.append(number + "x");
	if(i != size - 1){
          builder.append("^" + (size - i));
	  builder.append(" + ");
	}
      }
    }
    System.out.println(builder.toString());
  }
}
