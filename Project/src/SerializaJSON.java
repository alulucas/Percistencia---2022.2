/*2 Crie uma classe Java para cadastrar dados relacionados à entidade definida na questão 1. A classe deve receber dados via teclado e os salvar em um arquivo JSON. */
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class SerializaJSON {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String name = "name", description = "description";
        int forca = 0, energia = 0, poder = 0;

       

        System.out.printf("Informe o Nome do personagem\n");
        name = scan.nextLine();
        System.out.printf("Informe o Descrição do personagem\n");
        description = scan.nextLine();
        System.out.printf("Jogue os dados e informe a força do personagem\n");
        forca = scan.nextInt();
        System.out.printf("Jogue os dados e informe a energia do personagem\n");
        energia = scan.nextInt();
        System.out.printf("Jogue os dados e informe a poder do personagem\n");
        poder = scan.nextInt();

        Perfil perfil = new Perfil(name, description, forca, energia, poder);
        List<Perfil> lista = new ArrayList<Perfil>();
        lista.add(perfil);

        
        Perfis perfis = new Perfis(lista);
        File f = new File("Perfil.json");
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);
        om.writeValue(f, perfis);

        scan.close();
    }
}
