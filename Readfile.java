import java.nio.file.*;
import java.io.*;
public class Readfile{
public static void main(String[] args)
{
Path file = Paths.get("C:\\Users\\TJ\\Desktop\\programs\\git_test-\\writingFile.txt");
String s = " ";
try
{
InputStream input = new BufferedInputStream(Files.newInputStream(file));
BufferedReader reader = new BufferedReader(new InputStreamReader(input));
s= reader.readLine();
while(s != null)
{
System.out.println(s);
s=reader.readLine();
}
reader.close();

}
catch( Exception e )
{
   System.out.println("message: " + e);
}

}
}