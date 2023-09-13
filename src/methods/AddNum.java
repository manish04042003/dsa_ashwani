package methods;

public class AddNum {
    public static void main(String[] args) {

        System.out.println(printSum(4,8));

        Newclass jaishreeram = new Newclass();

        jaishreeram.print_JaiShreeRam();

    }

//    if a want to access this method/fxn so i have to write a static other wise i cant access this method in main fxn
    public static int printSum(int a,int b){
        return a+b;
    }
}

//and i have a class outside a public class so  i need to make new obj dor the class to rum the respective class methods

class Newclass{
    public void print_JaiShreeRam(){
        System.out.println("Jai Shree Ram");
    }
    // for exapmle if i need to access this fxn in main method so ineed to make new obj
}

