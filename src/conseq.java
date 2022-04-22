import java.util.Arrays;

public class conseq {
    public static int solve(int[] A)
    {
        Arrays.sort(A);
        int count =1;
        int max_count = Integer.MIN_VALUE;
        for(int i=1; i< A.length; i++)
        {
            if(A[i-1]==A[i]-1) {    // it's very important how we handle the edge cases
                count++;
            }
            else count =1;
            if(count>max_count)
                max_count = count;
        }
        return max_count;
    }

    public static void main(String[] args)
    {
        int arr[] = {3,9,15,7,14,16,17};
        System.out.println(solve(arr));

    }
}
