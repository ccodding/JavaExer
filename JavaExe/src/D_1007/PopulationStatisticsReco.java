package D_1007;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PopulationStatisticsReco {

    public void readByChar(String filename) throws IOException{ //메인함수 내 함수 메인함수 밖으로 이동
        FileReader fileReader = new FileReader(filename);
        String fileContents = "";
        while (fileContents.length() < 1_000_000){
            char c = (char) fileReader.read(); // 한 바이트씩 읽음, 시간이 오래걸려서
            fileContents += c;
//            System.out.println(fileContents); 실행상태 남기는 법
        }
        System.out.println(fileContents);
    }

    public void createAFile(String filename){
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    //기존에쓰던거 사용 가능, 기능 추가가능
public void readAllLines(String filename)throws IOException{
    List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
    List<PopulationMoveReco> pms = lines.parallelStream()
            .map(item -> {
                String [] spllitedLine = item.split(",");
                return new PopulationMoveReco((spllitedLine[0]), spllitedLine[6]);
            }).collect(Collectors.toList());
    for(PopulationMoveReco pm : pms){
        System.out.println(pm.getFromSido());
    }
}

    /*public class readByLine2(String filename) {
            try(BufferedReader br = Files.newBufferedReader(Paths.get("afile.txt"), StandardCharsets.UTF_8)){
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }// 근래의 형태 modern type
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

    //split 메서드
    public List<PopulationMoveReco> readByLine(String filename)throws IOException { // method 추가, method가 커지면 java class로 분리

        // BufferedReader reader = new BufferedReader(new FileReader(filename)); //fileReader를 br로 감싼것
        // BufferedReader reader = new BufferedReader(filereader); 상단과 같은 구조
        List<PopulationMoveReco> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = reader.readLine()) != null) {
            PopulationMoveReco pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }
    public void readByLine2(String filename){
        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename),StandardCharsets.UTF_8)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    //List <String>을 지정한 파일에 write
    public void write(List<String> strs, String filename){
        File file = new File((filename));

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for(String str : strs){
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PopulationMoveReco parse(String data){
        String[] splittedLine = data.split(",");
        return new PopulationMoveReco(splittedLine[0], splittedLine[1]); // 전입to 전출from
    }
    public String fromToString(PopulationMoveReco populationMoveReco){
        return populationMoveReco.getFromSido() + "," + populationMoveReco.getFromSido() + "\n" ;
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMoveReco> pml){

        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMoveReco pm : pml){
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public static void main(String[] args) throws IOException{
        String address = "./from_to.txt"; // 파일 읽는 가장 간단한 방법
        //FileReader fileReader = new FileReader(address);
        PopulationStatisticsReco populationStatisticsReco = new PopulationStatisticsReco();
        List<PopulationMoveReco> pml = populationStatisticsReco.readByLine(address);

       /*for(PopulationMove pm : pml){
           System.out.printf("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
       }*/

        //Map<String, Integer> moveCntMap = new HashMap<>();
        Map<String, Integer> map = populationStatisticsReco.getMoveCntMap(pml);
        populationStatisticsReco.createAFile(("each_sido_cnt.txt"));
        for(String key : map.keySet()){
            System.out.printf("key:%s value:%d\n", key, map.get(key));
        }

        //A~Z



       // List<String> strings = new ArrayList<>();
        /*for (PopulationMove pm : pml){
            String fromTo = populationStatistics.fromToString(pm);
            strings.add(fromTo);
        }
        System.out.println(strings.size());*/

        /*char c = (char)fileReader.read(); 한 글자씩 읽기
        System.out.println();
        char c2 = (char) fileReader.read();*/
/*
        String data = " aba";
        String data2 = "aaa";
        //.split() --> String[]*/
        //String [] splitted = data.split(",");

   //     populationStatistics.createAFile("./from_to.txt");

        /*List<String> strings = new ArrayList<>();
        strings.add("11,11");
        populationStatistics.write(strings, "./from_to.txt");*/
    }
}
// split 문자기준으로 자르는 것

