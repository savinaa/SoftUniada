import java.util.Scanner;

/**
 * Created by Savina on 3.2.2018 г..
 */
public class SumTo13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int aOposite=a*(-1);
        int bOposite=b*(-1);
        int cOposite=c*(-1);
        if(a+b+c==13
            || a+b+cOposite==13
            ||a+bOposite+c==13
            ||a+bOposite+cOposite==13
            ||aOposite+b+c==13
            ||aOposite+b+cOposite==13
            ||aOposite+bOposite+c==13
            ||aOposite+bOposite+cOposite==13){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
