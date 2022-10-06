import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    private String filename;
    public ReadFile2(){
        this.filename = filename;
    }
    
    public String readNChar(String filename, int n) throws IOException {
        FileReader fileReader = new FileReader(filename);
        int asciiCD = 0;
        String str = "";
        for (int i = 0; i < n; i++) {
            if ((asciiCD = fileReader.read()) == -1)
                break;
            str += (char) asciiCD;
        }
        return str;
    }
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }
    }
    public char readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        return (char) fileReader.read();

    }
    public String read2Char(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char) fileReader.read();
        str += (char) fileReader.read();
        return str;
    }
    public static void main(String[] args)throws IOException{

        ReadFile2 fileExercise = new ReadFile2();
        String str1 = fileExercise.read2Char("./aa_file.txt");
        String str2 = fileExercise.readNChar("./aa_file.txt", 3);

        // char c = (char) reader.read();i
        System.out.println(str1);
        System.out.println(str2);
    }
}




