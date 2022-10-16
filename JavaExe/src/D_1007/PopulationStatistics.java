package D_1007;

import com.objects.domain.PopulationMove;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class PopulationStatistics {
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        // 파일을 읽지 않는다.

        String fileContents = "";
        while (fileContents.length() < 1_000_000) {
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
        // 1byte 읽기
        // 1줄씩 읽는 기능
    }
    public List<PopulationMove> readByLine(String filename) throws IOException {
        // 삽
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
//            System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        reader.close();
        return pml;
    }

    public void readAllLines(String filename) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
        List<PopulationMove> pms = lines.parallelStream()
                .map(item -> {
                    String[] splittedLine = item.split(",");
                    return new PopulationMove(splittedLine[0], splittedLine[6]);
                }).collect(Collectors.toList());
        for (PopulationMove pm : pms) {
            System.out.println(pm.getFromSido());
        }
    }
    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename),StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public PopulationMove parse(String data) {
        //String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528\n";
        // csv
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);// from, to
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename) {
        File file = new File(filename);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getToSido()+"\n";
    }

    public Set<Integer> printSidoCd(List<PopulationMove> populationMoveList) {

        Set<Integer> intSet = new HashSet<>();
        for (PopulationMove pm : populationMoveList) {
            intSet.add(pm.getToSido());
            intSet.add(pm.getFromSido());
        }
        System.out.println(intSet);
        return intSet;
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {

        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);
        return map;
    }

    public static void main(String[] args) throws IOException {
        String address = "./from_to.txt";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> pml = ps.readByLine(address);
        // A ~ Z

        Map<String, Integer> map = ps.getMoveCntMap(pml);
        Map<String, Integer> heatMapIdxMap = ps.heatmapIdxMap();

        String targetFilename = "for_heatmap.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            // 매핑을 해서 저장
            String s = String.format("[%s, %s, %d],\n", heatMapIdxMap.get(fromto[0]), heatMapIdxMap.get(fromto[1]), map.get(key));
            cntResult.add(s);
//            System.out.printf("key:%s value:%d\n", key, map.get(key));
        }
        ps.write(cntResult, targetFilename);

    }
}