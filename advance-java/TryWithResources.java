import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TryWithResources
 */
public class TryWithResources {

    public static void main(String[] args) throws IOException{
        


        try( BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
       

            br.read();
        }


   
    }
}