package basicJava;

// ctrl+a  then ctrl+shift+f 

public class Calculator {
	
	//global variable 
		int a = 40;
		int b = 30; 
		
		/*
		public Calculator()
		{
            int a = 20;
			
			int b = 30;
			int c = a+b;
			System.out.println("This is sum of 2 numbers using constructor: " + c);
		}
		
		*/
		public Calculator(int a, int b)
		{
			int c = a+b;
			System.out.println("Addition of 2 numbers using constructor: " + c);
			
			
		}
		
		public int addition(int a, int b)
		{
			int c = a+b;
			System.out.println("Addition of 2 numbers: " + c);
			return c;
			
		}
		
		// 25, 35, 45
		//int y = 25,35
		//y+45
		
		public int sum()
		{
			
			a=50;
			
			//local variable 
			int a = 20;
			
			int b = 30;
			int c = a+b;
			
			float d = 20.5f;
			
			String e = "java";
			
			//System.out.println(c);
			//System.out.println("This is sum of 2 numbers: " + c);
			return c;
			
			//System.out.println(a+b); //50
			//System.out.println("a"+b); //a30
			//System.out.println("a"+"b"); //ab
				
		}
		
		
		public void subs()
		{
			int c = a-b;
			System.out.println("Different between 2 numbers: " + c);
		}
		
		public static void main(String[] args) 
		{
			
			//int a = 20;
			//int b = 30; 
			//int c = a+b;
			//System.out.println(c);
			
			
			Calculator cal1 = new Calculator(20, 30);
			Calculator cal2 = new Calculator(45, 60);
			cal2.sum();
			cal1.addition(30, 40);
			
			KeywordsStatic.printdata(); 
			
			
			/*
			int x = cal.sum();
			System.out.println(x);
			
			System.out.println("-----------------");
			cal.subs();
			System.out.println("------------");
			cal.addition(70, 80);
			cal.addition(45, 55);
			cal.addition(x, 4);
			
			int y = cal.addition(25, 35);
			cal.addition(y, 45);
			
			*/
	

	    }

}
