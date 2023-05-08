//program for Train reservation system
import java.util.Scanner;
class Res {
    String login_id = "Komal"; //consider login id
    int password = 3011; //consider password
    int PNR_NO = 1234; //consider pnr no

    //method to check details of login id and password
    public void LoginForm() {
        System.out.println("Enter your login id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println("Enter your password");
        int pass = sc.nextInt();

        if (id.equals(login_id) && pass == password) {
            main_system();
        } else {
            System.out.println("Enter valid login id and password");
        }
    }

    //method to access main system
    public void main_system() {
        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1.See Basic Details");
            System.out.println("2.Cancel Form");

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter your login id");
                    String id = sc.next();
                    System.out.println("Enter your password");
                    int pass = sc.nextInt();
                    String INSERT="Insert";
                    if (id.equals(login_id) && pass == password) {
                        System.out.println("Train Number: xxxx");
                        System.out.println("Train Name: XYZ Express Train");
                        System.out.println("Class type: X");
                        System.out.println("Date of journey is from DD-MM-YYYY To DD-MM-YYYY");
                        System.out.println("Journey is from place A to place B");
                        System.out.println("Press Insert to book reservation");
                        String insert=sc.next();
                        if(insert.equals(INSERT)){
                            System.out.println("Reservation has been book successfully.");
                        }else{
                            System.out.println("Please press insert button properly");
                        }
                    }
                    else {
                        System.out.println("Enter valid details");
                    }
                    break;

                case 2:
                    System.out.println("Enter PNR Number");
                    int n = sc.nextInt();
                    String OK = "OK";
                    if (n == PNR_NO) {
                        System.out.println("Train Number: xxxx");
                        System.out.println("Train Name: XYZ Express Train");
                        System.out.println("Class type: X");
                        System.out.println("Date of journey is from DD-MM-YYYY To DD-MM-YYYY");
                        System.out.println("Journey is from place A to place B");
                        System.out.println("Press OK to cancel form");
                        String ok = sc.next();
                        if (ok.equals(OK)) {
                            System.out.println("Your form has been cancelled successfully");
                            System.exit(0);
                        }else{
                            System.out.println("Please press OK button properly");
                        }
                    }
                        else {
                            System.out.println("Enter correct PNR Number");
                        }
                        break;
            }
        }
    }
}

public class Reservation_System{
    public static void main(String [] args){
        Res obj=new Res();
        obj.LoginForm();
    }
}
