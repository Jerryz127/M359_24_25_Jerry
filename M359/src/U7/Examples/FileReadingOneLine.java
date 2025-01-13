package U7.Examples;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.Scanner;

public class FileReadingOneLine {
    public static void main(String[] args) throws FileNotFoundException {
        // 01-17   22  Shannon Denna/Fremd High School
        Scanner inF = new Scanner(new File("teacherData.txt"));
        String birthday = inF.next();
        int yearsExp = inF.nextInt();
        String restOfLine = inF.nextLine();
        int loc = restOfLine.indexOf("/");
        String firstHalf = restOfLine.substring(2,loc);
        System.out.println(firstHalf);
        String secondHalf = restOfLine.substring(loc + 1);
        System.out.println(secondHalf);
    }
}
