package assignments;

//No Arguments constructor
class NoArgument_Constructors{
	
	public String name;
	
	public NoArgument_Constructors()
	{
		name="Damodhar reddy";
		
	}
}
//Parameterized Constructor

class ParameterizedConstructor
{
	public String name;
	
	public  ParameterizedConstructor(String name)
	{
		this.name=name;
		
	}
}

public class Program5 {

	public static void main(String[] args) {
		
		NoArgument_Constructors ut=new NoArgument_Constructors();
		System.out.println("No Arguments constructor : my name is "+ut.name);
		
		ParameterizedConstructor pc=new ParameterizedConstructor("This is Damodhar");
		System.out.println("ParameterizedConstructor : "+pc.name);

	}



	}


