import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthDayCakeCandle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int num=0;
        for (int i = 0; i < height.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j <height.length; j++)
                if (height[j] < height[index])
                    index = j;
      
            int smallerNumber = height[index]; 
            height[index] = height[i];
            height[i] = smallerNumber;
        }
        int max=height[height.length-1];
        for (int i=height.length-1;i>=0; i--)
        {
        	if(height[i]!=max)
        	{
        		break;
        	}
        	num++;
        }

        System.out.println(num);
    }
}
