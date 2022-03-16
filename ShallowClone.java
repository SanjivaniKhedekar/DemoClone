package DemoClone;



class ABC 
{
  int x=30;  //mutable object
}

public class ShallowClone 
{
	 public static void main(String[] args) 
	  {
		    ABC obj1=new ABC(); // object creation
			ABC obj2= obj1;  //it will copy reference not value
			obj2.x=6;  //updating value 6 using reference variable obj2
			System.out.println("Value of X is:" + obj2.x); 
	  }
}
