package practice_course;
import java.util.Scanner;

class browser
{
	final int urlArraySize=20;
	private String[] visitedURLs = new String[urlArraySize];
	int visitedURLsIndex=-1;
	
	public browser() {
		//does nothing
	}
	
	public browser(String[] url)
	{
		this.setVisitedURLs(url);
	}
	
	public void setVisitedURLs(String[] url)
	{
		if(this.visitedURLsIndex>=urlArraySize)
		{
			System.exit(0);
		}
		this.visitedURLs=url;
		this.visitedURLsIndex=this.visitedURLs.length;
	}
	
	public void addVisitedURLs(String url)
	{
		this.visitedURLs= reSize(visitedURLs,visitedURLsIndex,url);
		this.visitedURLsIndex++;
	}
	
	public String[] reSize(String[] urls, int length, String url)
	{
		String[] Arr=new String[length+1];
		for(int i=0;i<length;i++)
		{
			Arr[i]=urls[i];
		}
		Arr[length]=url;
		return Arr;
	}
	
	public void getVisitedURLs()
	{
		for(int i=0;i<this.visitedURLsIndex;i++)
		{
			System.out.println(this.visitedURLs[i]);
			
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args)
	{
		String[] sampleInputUrls1 = {"www.pec.edu","www.javatpoint.com","www.GFG.com"};
		browser googleChrome = new browser(sampleInputUrls1);
		String[] sampleInputUrls2 =  {"www.google.com","www.youtube.com"};
		browser fireFox = new browser(sampleInputUrls2);
		
//		Scanner inputUrl=new Scanner(System.in);
//		String url3=inputUrl.nextLine();
//		String url4=inputUrl.nextLine();
		googleChrome.addVisitedURLs("www.zoho.com");
		fireFox.addVisitedURLs("www.gmail.com");
		googleChrome.addVisitedURLs("www.git.com");
		fireFox.addVisitedURLs("www.busindia.com");
		
		System.out.println("Print history of GoogleChrome Browser:");
		googleChrome.getVisitedURLs();
		
		System.out.println("Print history of FireFox Browser: ");
		fireFox.getVisitedURLs();
	}
}
 
