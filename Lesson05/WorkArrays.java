class WorkArrays
{
    private String[] quotes = new String[8];
    quotes[0] = "Dempsey: Hey Nikolai, if shit goes down with the kraut, you got my back don't you?";
    quotes[1] = "Nikolai: I hope to never see the day we turn on each other.";
    quotes[2] = "Dempsey: Richtofen says he's been here before. Was that crazy evil Richtofen or this new man-with-a-plan Richtofen?";
    quotes[3] = "Nikolai: I am not sure which Richtofen is most dangerous.";
    quotes[4] = "Dempsey: Hey Nikolai, a word: this artifact of Richtofen's, has he shown it to you?";
    quotes[5] = "Nikolai: I do not understand this American slang, but it had better not be what I think it is.";
    quotes[6] = "Dempsey: Call me crazy, but I'm starting to think Richtofen may actually know how we get out of all this.";
    quotes[7] = "Nikolai: Crazy you may be, but Richtofen's knowledge cannot be denied. Whether or not he can be trusted is a different matter. Richtofen has told us little of his comrade Dr. Maxis, I do not like to put my trust in a man I have not met.";
    quotes[8] = "Dempsey: I know what you mean, especially seeing as how Richtofen put his damn brain in a jar.";
    
    public WorkArrays()
    {
        for(String q: quotes)
        {
            System.out.println(q);
        }
    }
    
    public static void main(String [] args)
    {
        new WorkArrays();
    }
}