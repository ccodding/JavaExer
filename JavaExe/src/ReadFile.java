import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args)throws IOException{

        FileReader reader = new FileReader("./aa_file.txt");
        char c = (char) reader.read();
        System.out.println(c);

        //파일위치 지정법 ./ 현재 디렉토리 root디렉토리 >> java.exercise
        //현재 디렉토리 파일체킹

        File dir = new File("./");
        //File dir = new File("C://");
        File files[] = dir.listFiles();
        for(File file : files) {
            System.out.println(file);
        }


    }
}
