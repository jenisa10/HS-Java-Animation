import java.util.Scanner;

public class sales
{
    private final int sales;

    public sales(int sales) {
        this.sales = sales;
    }

    public double getSalary(){
        double commission;
        if (sales < 5000){
            commission = 0;
        } else if (sales < 10000){
            commission = .1;
        } else if (sales < 15000){
            commission = .15;
        } else if (sales < 20000){
            commission = .2;
        } else{ commission = .25; }

        int BASE = 300;
        return BASE + (commission * sales);
    }

    public static void main(String[] args) {
        System.out.print("How many workers are there? ");
        Scanner scan = new Scanner(System.in);
        int workers = scan.nextInt();
        for (int i = 1; i < workers + 1; i++){
            System.out.print("Name " + i + ": ");
            String name = scan.next();
            System.out.print("How many sales does " + name + " have? ");
            int sales = scan.nextInt();
            double salary = new sales(sales).getSalary();
            System.out.format("%s earned %.2f.\n", name, salary);
        }
    }
}

