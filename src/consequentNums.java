import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class consequentNums {
    public static int sovle(int[] A)
    {
        Arrays.sort(A);
        int max_count = Integer.MIN_VALUE;
        for(int i=0 ; i< A.length; i++)
        {
            int count =1;
            int inti = A[i];
            for(int j = i+1; j< A.length;j++) //O(n2) it can be optimised
            {
                if(A[j]== inti+1)
                {    inti = A[j];
                    count ++;}
            }
            if(count>max_count)
                max_count = count;
        }
        if(max_count == Integer.MIN_VALUE)
            return -1;
        return max_count;
    }

    public static void main(String[] args) {
        int arr[] = {3,9,15,4,7,14,17,16};
        System.out.println(sovle(arr));
    }

}
