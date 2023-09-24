package Java_training;
/*
      *
     **
    ***
   ****
  *****
    
    
 */

public class LeftTrianglePattern {

	public static void main(String[] args) {
		 int k = 5;
		 int a, b;
		 // 1st loop
		 for(a = 0;a<k;a++) 
		 {
		   for(b = 2*(k-a);b>=0;b--) {//this loop to handle the no of spaces
			   System.out.print(" ");
		   }
		   for(b =0;b<=a;b++) {// this loop print the * symbol 
			   System.out.print("* ");
		   }
	         // end-line
	         System.out.println();
	     }
	  }
	}


	}

}
