import java.util.Arrays;

class TestArrays
{
	public static void main(String [] args)
	{
		int[] testScores1;
		testScores1 = new int[4];
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < testScores1.length; i++)
		{
			System.out.print(testScores1[i] + " ");
		}
		
		for(int val : testScores1)
		{
			if(builder.length() != 0)
			{
				builder.append(",");
			}
			builder.append(val);
		}
		System.out.print(builder + " ");		
		
		int[] testScores2 = {9,12,5,76,3};
		StringBuilder sb = new StringBuilder();
		
		for(int val : testScores2)
		{
			if(sb.length() != 0)
			{
				sb.append(",");
			}
			sb.append(val);
		}
		System.out.print(sb + " ");
		
		int[][] scores = {{5,2,4,7}, {9,2}, {3,4}}; 	
		
		System.out.println(Arrays.deepToString(scores));				
	}
}