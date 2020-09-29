//CS61b spring 2019, 
//Discussion 1: introduction to java
//Q2



//instace array 

class Mystery{
	public static void main(String[] args){
		int [] arr  = new int[5];
		//inputArray = [3, 0, 4, 6, 3]; //error: illegal start of expression
		arr[0] = 3; // solve with the following 
		arr[1]= 0;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 3;
		int k = 2;
		int x = arr[k];
		int answer = k;
		int index = k + 1;
		while (index < arr.length){
			if (arr[index]<x){
				x = arr[index];
				answer = index;
				System.out.println(answer);
			
		}
			index = index + 1;
		
	}
		//return answer;
}
}

// class GFG  
// { 
    // public static void main (String[] args)  
    // {          
      //declares an Array of integers. 
      // int[] arr; 
          
      //allocating memory for 5 integers. 
      // arr = new int[5]; 
          
      //initialize the first elements of the array 
      // arr[0] = 10; 
          
      //initialize the second elements of the array 
      // arr[1] = 20; 
          
      //so on... 
      // arr[2] = 30; 
      // arr[3] = 40; 
      // arr[4] = 50; 
          
      //accessing the elements of the specified array 
      // for (int i = 0; i < arr.length; i++){
		  // System.out.println("Element at index " + i +  " : "+ arr[i]); 
	  // }            
    // }
// }	

