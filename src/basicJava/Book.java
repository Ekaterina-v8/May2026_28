package basicJava;

public class Book {
	
	
	String title = "Harry Potter's";
	
	String author = "Joanne Rowling";
	
	public Book() 
	{
		String title = "Harry Potter's";
		String author = "Joanne Rowling";
		
		System.out.println(title + " " + "book was writen by" + " " + author + ".");
		System.out.println(title);
		System.out.println(author);
		
		
	}

	public static void main(String[] args) {
		
		Book bk = new Book();
	
		

	}

}
