
	public class LineComparision {

		public static void main(String[] args) {
		//variables
      double x1=1;
      double y1=5;
      double x2=6;
      double y2=7;

      double x3=1;
      double y3=6;
      double x4=7;
      double y4=8;
		//Computation
      double line1 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
      System.out.println("Length of first line is: " +line1);
      double line2 = Math.sqrt((Math.pow(x4 - x3, 2)) + (Math.pow(y4 - y3, 2)));
      System.out.println("Length of second line is: " +line2);

      if (line1==line2)
         System.out.println("Both the lines are equal");
      else if (line1 > line2)
      	System.out.println("Line1 is Greater");
      else
			System.out.println("Line2 is Greater");
	   }
}
