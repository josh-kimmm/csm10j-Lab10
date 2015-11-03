package checked;
import java.io.*;


public class CheckedExceptions {
    
    public static void OpenFileChecked() throws FileNotFoundException, IOException
    {
        FileReader console = new FileReader("nofile.txt");
        try
        {
            console.close();
        }
        catch(IOException aex)
        {
            throw aex;
        }
    }
    
}
