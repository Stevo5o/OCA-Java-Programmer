class McGee
{
	public static void main(String [] args)
	{
		Days day1 = Days.TH;
		Days day2 = Days.M;
		
		for(Days day : Days.values())
		{
			if(day.equals(Days.F))
			break;
			day2 = day;
		}
		System.out.println((day1 == day2) ? "same old" : "newly new");
	}
	enum Days { M, T, W, TH, F, S, SU};
}