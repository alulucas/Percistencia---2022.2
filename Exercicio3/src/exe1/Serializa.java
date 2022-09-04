package exe1;

/*
    Questão 02 -

    Crie uma classe Java de nome Serializa para instanciar objetos da classe definida na Questão 1 e adicionar 
    esses objetos em uma Lista. Depois percorrer a lista e Serializar os objetos em disco/ssd. Serialize usando 
    a Serialização de objetos da própria API Java (Introduction to Java Serialization | Baeldung).
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializa {
    public static void main (String [] args) {

        Filme filme = new Filme(001, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        Filme filme2 = new Filme(002, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        Filme filme3 = new Filme(003, "Como Treinar seu Dragão", "Soluço é um adolescente viking da ilha de Berk, onde lutar contra dragões é um meio de vida. Suas opiniões avançadas e um senso de humor estranho o tornam um desajustado, apesar de seu pai ser o chefe do clã.", "Chris Sanders, Dean DeBlois");
        
        List<Filme> lista = new ArrayList<>();
        
        lista.add(filme);
        lista.add(filme2);
        lista.add(filme3);

        FileOutputStream fileOut = null;

        try {
            fileOut = new FileOutputStream("filme.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(lista);

            out.close();
            fileOut.close();

            System.out.println("Serializado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}