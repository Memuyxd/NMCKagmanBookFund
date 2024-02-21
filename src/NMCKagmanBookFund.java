import java.util.Scanner;



public class NMCKagmanBookFund {


    public static void main(String[] args) {
         String studentName;
        int year1;
        int year2;
        int year3;
        int year4;

        double freshGpa;
        double sophomoreGpa;
        double juniorGpa;
        double seniorGpa;

        //GET YEARS
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        studentName = input.nextLine();
        System.out.println("Please enter your Freshman graduation year:");
        year1 = input.nextInt();
        System.out.println("Please enter your Sophomore graduation year:");
        year2 = input.nextInt();
        System.out.println("Please enter your Junior graduation year:");
        year3 = input.nextInt();
        System.out.println("Please enter your Senior graduation year:");
        year4 = input.nextInt();

        //GET GPA
        System.out.println("Please enter your gpa for your Freshman year:");
        freshGpa = input.nextDouble();
        System.out.println("Please enter your gpa for your Sophomore year:");
        sophomoreGpa = input.nextDouble();
        System.out.println("Please enter your gpa for your Junior year:");
        juniorGpa = input.nextDouble();
        System.out.println("Please enter your gpa for your Senior year:");
        seniorGpa = input.nextDouble();

        //CALCULATED GPA
        double calculatedFreshman = freshGpa*10;
        double calculatedSophomore = sophomoreGpa*10;
        double calculatedJunior = juniorGpa*10;
        double calculatedSenior = seniorGpa*10;
        double finalAward = calculatedFreshman+calculatedSophomore+calculatedJunior+calculatedSenior;

        //PRINT AWARD
        System.out.println("\nStudent: " + studentName + "\n");
        System.out.println("      Y1(2018)   Y2(2019)   Y3(2020)   Y4(2021)  ");
        System.out.println("GPA:     " + freshGpa + "        " + sophomoreGpa + "       " + juniorGpa + "       " + seniorGpa);
        System.out.println("CREDIT: $" + calculatedFreshman + "     $" + calculatedSophomore + "      $" + calculatedJunior + "      $" + calculatedSenior);
        System.out.println("=================================================");
        System.out.println("FINAL BOOK STORE CREDIT: $" + finalAward);

        }
    }

