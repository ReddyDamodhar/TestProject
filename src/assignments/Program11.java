package assignments;

public class Program11 {

	public static void main(String[] args) {
		// search specific String 
		String str="This is Damodhar";
		int index = str.indexOf("Damodhar");
		if(index==-1)
		{
			System.out.println("Damodhar not Found");
		}
		else
		{
			System.out.println("Damodhar is Found at index of "+index);
		}
	}


	}


