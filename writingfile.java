import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class writingfile{
public static void main ( String[] args)
{
Scanner system = new Scanner(System.in);
//file and location in the doc
Path file = Paths.get("C:\\Users\\TJ\\Desktop\\programs\\git_test-\\writingFile.txt");
// initializing the string variables and initialiazing them empty.
String s = " ";
String m= " ";
// the try statement is for trying to open the file and perform functions 
try
{
//creates a new BufferedOutputStream and wraps it in the object that writes bytes to the specified file location. The create tells the program to create a file if it isnt found.
OutputStream output= new BufferedOutputStream(Files.newOutputStream(file,CREATE));
//creates the actual writer for the program to print onto the new file.
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
System.out.print("Enter employee ID number");
int id = system.nextInt();
while(id!= 999)
{

System.out.print("Enter a  phrase for this employee ID number"+id);
system.nextLine();
m= system.nextLine();
s= m;
// writes the s string from the beginning of line to the end of the length of the line
writer.write(s,0,s.length());
writer.newLine();
System.out.println("new id num type quit to exit");
id = system.nextInt();

}
// closes writer
writer.close();
}
catch (Exception e)
{
System.out.println("Message : " + e);
}


}
}