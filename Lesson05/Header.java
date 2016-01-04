import java.util.Date;

final public class Header
{
	private final String title;
	private final int version;
	private final Date date;
	
	public Header(String t, int v, Date d)
	{
		title = t;
		version = v;
		date = d;		
	}
	
	public Date getDate()
	{
		return new Date(date.getTime());
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public int getVersion()
	{
		return version;
	}
	
	public String toString()
	{
		return "Title: " + title + "\nVersion: " + version + "\nDate: " + date;
	}
	
	public static void main(String[] args)
	{
		Date date = new Date();
		Header header = new Header("Ste", 3, date);		
		System.out.println(header.toString());
	}
}

/* 
 * Output
 * Title: Ste
 * Version: 3
 * Date: Mon Jan 04 13:49:04 GMT 2016
*/