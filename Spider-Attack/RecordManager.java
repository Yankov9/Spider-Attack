    import greenfoot.*;
    import java.io.*;
    import java.nio.Buffer;
    import java.util.LinkedList;
    import java.util.List;
    
    public class RecordManager {
    
        private int maxSize;
        private final String fileName;
    
        
    
        public RecordManager(int maxSize, String fileName)
        {
            this.maxSize = maxSize;
            this.fileName = fileName;
        }
    
        public void save(Record record) {
            try (FileWriter fileWriter = new FileWriter("marcador.txt");
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {
                     printWriter.append(record.getPlayer()).append(",").print(record.getScore());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    
        public List<Record> getRecords(){
        
        List<Record> records = new LinkedList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("marcador.txt"))){
            String currentLine;
                
            while((currentLine = reader.readLine()) != null){
                String[]items = currentLine.split(",");

                records.add(new Record(items[0],Integer.parseInt(items[1])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
