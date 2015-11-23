public class VarDeclare
{
    public static void main(String[] args)
    {
        Change f = new Change();
        System.out.println("size = " + Change.size);
        f.changeIt(Change.size);
        System.out.println("size after changeIt() is " + f.size);
        
        ChangeBar foo = new ChangeBar();
        System.out.println("f.mybarNum: " + foo.myBar.barNum);
        foo.changeIt(foo.myBar);
        System.out.println("f.myBar.barNum after change: " + foo.myBar.barNum);       
    } // end main
} // end class VariableDeclarations