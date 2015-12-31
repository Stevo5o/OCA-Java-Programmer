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
}