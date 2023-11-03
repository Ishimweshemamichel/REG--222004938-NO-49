class compoundInterest {//creates the class compoundInterest
  public  double calculate(double  p, double  r, double t){//creates a function to calculate the compound interest

    return (p * Math.pow((1 + r/12),12*t));//returns the compound interest
  }
}
  public class compound{//creates a public class compound
  public static void main(String args[]){//declares the main method
    double principal=500000;//initializes the variable principal to 500000
    double rate=0.18;//initializes the variable rate to 0.18
    double time=3;//initializes the variable time to 3

    compoundInterest O1 = new compoundInterest();//creates a compoundInterest object
    double Ci = O1.calculate(principal,rate,time);//calculates the compound interest
    System.out.println("The Compound Interest is:"+" " + Ci);//prints the compound interest
  }//ends the main method
}//ends the public class

