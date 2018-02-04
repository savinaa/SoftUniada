import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Savina on 3.2.2018 г..
 */
public class DuplicatedLetters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String pattern ="([a-z])\\1";
        Pattern p=Pattern.compile(pattern);
        Matcher m=p.matcher(s);
        long counterOfDuplicates=0;
        while(m.find()){
            counterOfDuplicates++;
            s=s.replaceFirst(m.group(), "");
            m=p.matcher(s);
        }
        if(s.isEmpty()){
            System.out.println("Empty String");
        }else {
            System.out.println(s);
        }
        System.out.printf("%d operations", counterOfDuplicates);
    }
}
