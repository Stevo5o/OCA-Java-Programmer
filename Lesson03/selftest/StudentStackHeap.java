class StudentStackHeap
{
	public int id = 100;
	
	public static void main(String [] args)
	{
		int val = 200;
		StudentStackHeap stSH1 = new StudentStackHeap();
		stSH1.id = val;
		update(stSH1);
		System.out.println(stSH1.id); // 300
		StudentStackHeap stSH2 = new StudentStackHeap();
		stSH2.id = 500;
		switchStudentSH(stSH2, stSH1);
		System.out.println(stSH1.id); // 300
		System.out.println(stSH2.id); // 300
	}
	
	static public void update(StudentStackHeap stSH)
	{
		stSH.id = 300;
		stSH = new StudentStackHeap();
		stSH.id = 400;
	}
	
	static public void switchStudentSH(StudentStackHeap stSH1, StudentStackHeap stSH2)
	{
		int temp = stSH1.id;
		stSH1.id = stSH2.id;
		stSH2 = new StudentStackHeap();
		stSH2.id = temp;
	}
}

/*
HEAP
----
1000x: StudentStackHeapObj, id: 100 = val: 200 = 300
2000x: StudentStackHeapObj, id: 100 = 400
3000x: StudentStackHeapObj, id: 500 = 300
4000x: StudentStackHeapObj, id: 100 = 500

STACK
-----
Main_Stack
----------
val: 200 - local var
stSH1: 1000x
stSH2: 3000x

update_Stack 
------------
stSH: 1000x
id: 300
stSH: 2000x
-Remove from stack-

switchStudentSH_Stack
---------------------
stSH1: 3000x - main stack value
stSH2: 1000x - main stack value
temp: 500
stSH2: 4000x
-Remove from stack-



*/

