package series;

import java.util.Scanner;

public class SeriesDemo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many places you want to display...?");
		int n=sc.nextInt();
		
		int series[]=new int[n];
		series[0]=3;
		series[1]=5;
		System.out.print("Series is : 3 5 ");
		
		for(int i=2;i<n;i++)
		{
			series[i] = series[i-2]+2*series[i-1];
			System.out.print(series[i]+ " ");
		}	
		
	}

}
