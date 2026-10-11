package basicJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class FileHandiling 
{
	public static void read_prop() throws Exception 
	{
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get("browsername"));
		System.out.println(prop.get("url"));
	}
	
	
	
	public static void read_text_data() throws Exception
	{
		//File f = new File("Macintosh HD/Users/ekaterinafilatova1/Desktop/news.txt"); //file connection
		
		File f = new File("./testdata/data.txt"); //file connection
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read(); //69
		
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
			
		}
		
		
		
	}
	
	public static void main(String[]args) throws Exception 
	{
		read_prop();
		
	}

}
