import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializaJSON {
    public static void main(String[] args) throws Exception {
        File file = new File("Filmes.json");
        ObjectMapper Objectmapper = new ObjectMapper();
        Filmes p = Objectmapper.readValue(file, Filmes.class);
        System.out.println(p);
    }

}
