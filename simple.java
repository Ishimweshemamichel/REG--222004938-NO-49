//this program calculates the simple interest for a given principal amount, interest rate, and time period.
class simpleInterest {//creates a class
  public  int calculate(int  p, int  r, int t){//creates a function to calculate the simple interest

    return (p*r*t)/100;//returns the simple interest
  }
}
  public class simple{// creates a public class simple
  public static void main(String args[]){//declares the main method
    int p=100000;//initializes the principal
    int r=5;//initializes the rate
    int t=5;//initializes the time
    simpleInterest O1 = new simpleInterest();//creates a simpleInterest object
    int Interest = O1.calculate(p,r,t);//calculates the simple interest
    System.out.println("The Simple Interest for Mr. Rob is:"+" " + Interest);//prints the simple interest
  }//ends the main method
}//ends the public class
