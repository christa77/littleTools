import java.io.*;
public class Testlength {
    public static void main(String[] args) throws IOException {
        // Open the file
        FileInputStream fstream = new FileInputStream("/Users/yuxiaocao/Desktop/QC.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;

        int count = 0;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console
            count++;
            //System.out.println (strLine);
        }

        //Close the input stream
        fstream.close();
        System.out.println(count);
    }
}
