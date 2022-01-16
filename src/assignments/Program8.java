package assignments;
class Outer_Class
{
	private int num=3;
// inner class
	public class Inner_Class{
		public int getNum()
		{
			System.out.println("This is inner class");
			return num;
			
		}
	}


}
public class Program8 {

	public static void main(String[] args) {
		Outer_Class outer=new Outer_Class();
	     
		  // instantiating the inner class
		     
		     Outer_Class.Inner_Class inner=outer.new Inner_Class();
		     System.out.println(inner.getNum());
		    	


	}

}
