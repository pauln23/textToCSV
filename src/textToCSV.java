/*
TXT File to CSV.

User defined file path.

 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class textToCSV {

    public static void main(String[] args) throws Exception {

        String textInput = askForString();
        String csvOutput = askForOutput();
        String delimiter = askForDelimiter();
        PrintWriter write = new PrintWriter(csvOutput);
        String currentLine;

        System.out.println("Converting . . . .");

        try (BufferedReader br = new BufferedReader(new FileReader(textInput))){

            while ((currentLine = br.readLine()) != null){
                System.out.println(currentLine);

                currentLine = currentLine.replace(delimiter,",");


                System.out.println(currentLine);

                write.write(currentLine + "\n");
            }

            }

            write.close();

        System.out.println("Done");


    }







  public static String askForString(){
      Scanner scan = new Scanner(System.in);
        System.out.println("Please enter path of TXT file :  ");
      return scan.next();
  }

    public static String askForOutput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter destination of CSV file :  ");
        return scan.next();
    }

    public static String askForDelimiter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter current delimiter of TXT file :  ");
        return scan.next();


}
}
