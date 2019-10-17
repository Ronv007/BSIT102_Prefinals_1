import java.util.*;

public class Prefinalnumber {

    public static void main(String[] args) {
    	
    	int n; //Variable for user inputted number
    	Scanner sc = new Scanner(System.in); // use to read the inputted number
    	System.out.println("Number to Words");
    	System.out.println("===================================");
    	System.out.print("Please enter number from 1 to 1000: ");
    	n = sc.nextInt(); // reads the inputted number
    	if(n == 0) { // if the number written is zero, then it will print zero
    		System.out.print("Zero");
    		} else if (n<0){ // else if the number is less than zero, it will ask for a valid number
    			System.out.print("Please enter a valid number");
    			} else if (n>1000){ // will also ask for a valid number if went over a thousand
    				System.out.print("Please enter a valid number");
    				}
    		else{
    			Prefinalnumber a = new Prefinalnumber(); // it lets to use other fraction(?) or other void
    			a.unit((n%100)," ");
    			a.unit(((n/1000)%100)," thousand");
                a.unit(((n/100)%10)," hundred");
    			}
 		}
 		
		public void unit(int n,String ch)
  								{
  		//arrays of the units
    	String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight"," Nine"," ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
    	String ten[]={" "," "," twenty"," thirty"," forty"," fifty"," sixty","seventy"," eighty"," ninety"};
 
    	if(n > 19) { System.out.print(ten[n/10]+" "+one[n%10]);} //if the number is more than twenty, it devides the number and get the remainder to know which spot on the array it would get
    		else { System.out.print(one[n]);} // else if the number is less than twenty, it just simply use the inputted number to know the place in the array.
    	if(n > 0)System.out.print(ch);
  								}
    
    
    }
