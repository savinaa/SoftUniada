import java.util.Scanner;

/**
 * Created by Savina on 3.2.2018 г..
 */
public class HalloweenPumpkin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=Integer.parseInt(input.nextLine());
        String dotsOnTheFirstLine=repeatString(".", n-1);
        System.out.println(dotsOnTheFirstLine+"_/_"+dotsOnTheFirstLine);

        String dotsOnTheFaceLine=repeatString(".", n-2);
        System.out.println("/"+dotsOnTheFaceLine+"^,^"+dotsOnTheFaceLine+"\\");
        for (int i = 0; i <n-3 ; i++) {
            System.out.println("|"+repeatString(".",2*n-1)+"|");
        }
        String dotsOnTheLastLine=repeatString(".", n-2);
        System.out.println("\\"+dotsOnTheLastLine+"\\_/"+dotsOnTheLastLine+"/");
    }

    public static String repeatString(String symbol, int count){
        String result="";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <count ; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }
}
