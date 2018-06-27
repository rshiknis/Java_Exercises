import java.util.Scanner;

public class Client {
    public void print (){
        System.out.println("You selected print");
    }
    public void mean (){
        System.out.println("You selected mean");
    }
    public void small (){
        System.out.println("You selected smallest");
    }
    public void large (){
        System.out.println("You selected largest");
    }
    public void quit (){
        System.out.println("You selected to quit");
    }




    public static void main(String[]args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose an option from below");
        System.out.println("Print:p");
        System.out.println("M:Mean");
        System.out.println("S: Smallest");
        System.out.println("L:Largest");
        System.out.println("Q:Quit");

        String x =myScanner.next();
        if (x.equals("p") || x.equals("P")) {
            Client x2 = new Client();
            x2.print();
        }




    }
}
