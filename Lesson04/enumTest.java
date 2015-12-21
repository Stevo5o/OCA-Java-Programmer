public class enumTest
{
	enum irishProvinces{MUNSTER, LEINSTER, ULSTER, CONNACHT}
	
	public static void main (String[] args)
	{
		irishProvinces[] provinces = irishProvinces.values();
		for(irishProvinces p:provinces)
		{
			if(p == irishProvinces.LEINSTER)
			{
				System.out.println("blue");
				break;
			} else
			{
				System.out.println("Keep going");
			}
		}
	}	
}	

// Output:
// Keep going
// blue
