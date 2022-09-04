package exe1;

import java.io.IOException;
import java.io.*;
import java.util.List;

public class Desserializa {
    public static void main(String[] args) throws IOException ,ClassNotFoundException {

        try {
            FileInputStream fileIn = new FileInputStream("filme.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            List<Filme> filmes = (List<Filme>) in.readObject();
            System.out.println(filmes);

            in.close();
            fileIn.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }

}
