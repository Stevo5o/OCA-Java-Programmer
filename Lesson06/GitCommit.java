import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class GitCommit  
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String gitCommit;
		
		System.out.println("Enter git commit");
		
		gitCommit = scanner.nextLine(); 
		
		System.out.println(gitCommit);		
		
		String [] emojiArr = 
		{
			"bowtie","smile","laughing","blush","smiley","relaxed","smirk","heart_eyes","kissing_heart","kissing_closed_eyes","flushed","relieved","satisfied","grin","wink","stuck_out_tongue_winking_eye","stuck_out_tongue_closed_eyes","grinning","kissing","kissing_smiling_eyes","stuck_out_tongue","sleeping","worried","frowning","anguished","open_mouth","grimacing","confused","hushed","expressionless","unamused","sweat_smile","sweat","disappointed_relieved","weary","pensive","disappointed","confounded"
		};
		
		Random random = new Random();
		
		String randomPick1 = emojiArr[random.nextInt(emojiArr.length)];
		String randomPick2 = emojiArr[random.nextInt(emojiArr.length)];
		
		System.out.println(":" + randomPick1 + ": " + gitCommit + " :" + randomPick2 + ":");				
	}
}