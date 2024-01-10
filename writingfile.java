import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class writingfile{
public static void main ( String[] args)
{
Scanner system = new Scanner(System.in);
Path file = Paths.get("C:\\Users\\TJ\\Desktop\\programs\\gir_test-\\writingFile.txt");
String s = " ";
String m= " ";
try
{
OutputStream output= new BufferedOutputStream(Files.newOutputStream(file,CREATE));
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
System.out.print("Enter employee ID number");
int id = system.nextInt();
while(id!= 999)
{

System.out.print("Enter a  phrase for this employee ID number"+id);
system.nextLine();
m= system.nextLine();
s= m;
writer.write(s,0,s.length());
writer.newLine();
System.out.println("new id num type quit to exit");
id = system.nextInt();

}
writer.close();
}
catch (Exception e)
{
System.out.println("Message : " + e);
}


}
}