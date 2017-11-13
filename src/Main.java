import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int counter=1;
        int grade,sum=0;
        while(counter<=10)
        {
            grade=in.nextInt();
            sum=grade+sum;
            counter=counter+1;

        }
        System.out.println(sum/10);
    }
}
