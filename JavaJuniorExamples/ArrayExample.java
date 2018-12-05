import java.util.Arrays;

public class ArrayExample {

   public static void main(String[] args) {

       int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

       int [] numbersCopy = Arrays.copyOf(numbers, 5);
	   
       System.out.println(Arrays.toString(numbers));
	   Arrays.sort(numbersCopy);
	   System.out.println(Arrays.toString(numbersCopy));
   }
}
