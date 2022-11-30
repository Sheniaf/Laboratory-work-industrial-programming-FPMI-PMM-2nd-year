import java.io.*;
import java.util.*;


public class MyProgramm{
    public static void main(String[] args) throws IOException {
        ArrayList <String> words = new ArrayList<String>();
        File file = new File("LABA_N3/src/input");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line = null;
        while((line = reader.readLine()) != null){
            String[] words_t = line.split(" ");
            int t = words_t.length;
            for(int i = 0; i < t; i++)
                words.add(words_t[i]);
            line = null;
        }
        String regex = "[0-9]+";
        for(int i = 0; i < words.size(); i++){
            if(!words.get(i).matches(regex)){
                System.out.print(words.get(i) + " ");
            }
        }
    }
}
