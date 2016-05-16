import java.util.Arrays;

class WorkArrays
{    
    static void initArray(String[] quotes)
    {
        quotes[0] = "Dempsey: Hey Nikolai, if shit goes down with the kraut, you got my back don't you?";
        quotes[1] = "Nikolai: I hope to never see the day we turn on each other.";
        quotes[2] = "Dempsey: Richtofen says he's been here before. Was that crazy evil Richtofen or this new man-with-a-plan Richtofen?";
        quotes[3] = "Nikolai: I am not sure which Richtofen is most dangerous.";
        quotes[4] = "Dempsey: Hey Nikolai, a word: this artifact of Richtofen's, has he shown it to you?";
        quotes[5] = "Nikolai: I do not understand this American slang, but it had better not be what I think it is.";
        quotes[6] = "Dempsey: Call me crazy, but I'm starting to think Richtofen may actually know how we get out of all this.";
        quotes[7] = "Nikolai: Crazy you may be, but Richtofen's knowledge cannot be denied. Whether or not he can be trusted is a different matter. Richtofen has told us little of his comrade Dr. Maxis, I do not like to put my trust in a man I have not met.";
        quotes[8] = "Dempsey: I know what you mean, especially seeing as how Richtofen put his damn brain in a jar.";
    }
    
    static void initArrayMulti(String[][] charQuotes)
    {
        charQuotes[0][0] = "Dempsey: "; 
        charQuotes[0][1] = "Hey Nikolai, if shit goes down with the kraut, you got my back don't you?";
        charQuotes[0][2] = "Richtofen says he's been here before. Was that crazy evil Richtofen or this new man-with-a-plan Richtofen?";
        charQuotes[0][3] = "Hey Nikolai, a word: this artifact of Richtofen's, has he shown it to you?";
        charQuotes[0][4] = "Call me crazy, but I'm starting to think Richtofen may actually know how we get out of all this.";
        charQuotes[0][5] = "I know what you mean, especially seeing as how Richtofen put his damn brain in a jar.";        
        charQuotes[1][0] = "Nikolai: ";
        charQuotes[1][1] = "I hope to never see the day we turn on each other.";
        charQuotes[1][2] = "Nikolai: I am not sure which Richtofen is most dangerous.";
        charQuotes[1][3] = "I do not understand this American slang, but it had better not be what I think it is.";     
        charQuotes[1][4] = "Crazy you may be, but Richtofen's knowledge cannot be denied. Whether or not he can be trusted is a different matter. Richtofen has told us little of his comrade Dr. Maxis, I do not like to put my trust in a man I have not met.";         
    } 
      
    void WorkArrays(String[] quotes)
    {
        for(String q: quotes)
        {
            System.out.println(q);
        }
    }   
 
    public static void main(String [] args)
    {
        String[] quotes = new String[9];
        String[][] charQuotes = new String[2][6];   
       
        new WorkArrays().initArray(quotes);
        new WorkArrays().initArrayMulti(charQuotes);
        
        for(String q: quotes)
        {
            System.out.println(q);
        }  
        
        System.out.println(Arrays.deepToString(charQuotes)); 
    }
}