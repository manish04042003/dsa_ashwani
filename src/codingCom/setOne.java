package codingCom;

public class setOne {
    public static void main(String[] args) {

        newemp e1 = new newemp();
        e1.sal = 20000 ;
        e1.hour = 10 ;
        e1.name = "manish";
        e1.tax = 10;
        e1.calsal();
    }
}


class newemp {
    String name;
        int sal ;
        int hour;
        int tax ;
  public void calsal(){
      System.out.print(name + " Payroll : ");
      System.out.println(sal - (sal/100)*tax);
      System.out.print("Per Day Hour : ");
      System.out.println(hour);
  }
}





