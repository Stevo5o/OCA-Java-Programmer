public class ChangeBar
{
    public Bar myBar = new Bar();
    
    public void changeIt(Bar myBar)
    {
         myBar.barNum = 99;
         System.out.println("myBar.barNum in changeIt is now: " + myBar.barNum);
         myBar = new Bar();
         myBar.barNum = 420;
         System.out.println("myBar.barNum in changeIt is now: " + myBar.barNum);
    } 
}