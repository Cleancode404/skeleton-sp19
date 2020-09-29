//CS61b spring 2019, HW0:basic java syntax concepts

//Lesson
//1. Class name must match file name otherwise it wont run
//2. Only one class name exist in one file otherwise it wont run
//3. semic colon(;) at the end of each statement
//4. Java is case sensitive and make sure check typo

// public class hw0{
	// public static void main (String [] args){
		// int x = 5;
		
		// if (x < 10)
			// x = x + 10;
		
		// if (x< 10)
			// x = x +10;
		
		// System.out.println(x);
	// }
// }

// public class hw0{
	// public static void main (String [] args){
		// int x =9;
		// if (x-3>9){
			// System.out.println("x-3 is greater than 9");
			
		// }
		// else{
			// System.out.println("x-3 is not greater than 9");
			
		// }
	// }
// }

//while statement
// public class hw0{
	// public static void main (String [] args){
		// int bottles =99;
		// while (bottles >0){
			// System.out.println(bottles + " bottles of beer on the wall.");
			// bottles = bottles -1;
		// }
	// }
// }

//Doubles adn strings
// public class hw0{
	// public static void main (String [] args){
		// String a = "Achilles";
		// String t = "Tortoise";
		// double aPos = 0;
		// double tPos = 100;
		// double aSpeed = 20;
		// double tSpeed = 10;
		// double totalTime = 0;
		// while (aPos < tPos){
			// System.out.println("At time: " + totalTime);
			// System.out.println(" " + a+ "is at position "+ aPos);
			// System.out.println(" " + t+ "is at position "+ tPos);
			
			// double timeToRead = (tPos -aPos)/aSpeed;
			// totalTime = totalTime + timeToRead;
			// aPos = aPos + timeToRead*aSpeed;
			// tPos = tPos + timeToRead*tSpeed;
			
		// }
	// }
// }



//creative exercise 1, use loop
// public class hw0{
	// public static void main (String [] args){
		// int col = 0; int row = 0; int SIZE = 5;
		
		// while (row < SIZE ){
			// while (col== row){
				// System.out.println("row is " + row);
				// System.out.println("column is " + col);
				// System.out.print('*'); //* doesn go to the right side 
				
				// System.out.println();
				
				// col = col + 1;
				
				
			// } 
			// row = row +1;	
			
		// }
		// while (row < SIZE){
			// while (col < row ){
				// System.out.println("row is not" + row);
				// System.out.println("column is not" + col);
				// System.out.print("*");
				// row = row + 1;
				
				
			// }
		// }
			
		
		// }
			

// }
//solution from others
// public class TriangleDemo {
    // public static void main(String[] args) {
      // drawTriangle(10);
    // }
    // public static String drawTriangle(int N) {
      // String triangle = "";
      // int counter = 0;
      // while (counter < N) {
        // triangle += "*";
        // counter += 1;
        // System.out.println(triangle);
      // }
      // return triangle;
    // }
// }


//solution from others
// System.out.println("*");
		// System.out.println("**");
		// System.out.println("***");
		// System.out.println("****");
		// System.out.println("*****");		
			// 
public class Trangle {
	public static void main(String[] args) {
		int SIZE = 10;
		int row = 0;
		int col = 0;
		while (SIZE > 0) {
			row = row + 1;
			col = row;
			while (col > 0) {
				System.out.print('*');
				col = col - 1;
			} 

			System.out.println();
			SIZE = SIZE - 1;
		}
	}
}









