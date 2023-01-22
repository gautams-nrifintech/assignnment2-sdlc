/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7};
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println("The sum of elements in array is: " + sum);

    }
}

/* 
 * 
 * output
 * The sum of elements in array is: 28
 */