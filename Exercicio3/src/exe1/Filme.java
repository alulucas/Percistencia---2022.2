package exe1;
import java.io.Serializable;
public class Filme implements Serializable {
    
    int id;
    String name;
    String decription;
    String diretor;

    public Filme(int id, String name, String decription, String diretor){
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.diretor = diretor;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String toString() {
        return "Filme [id: " + id + ", Título: " + name + ", Sinopse: " + decription + ", Diretor: " + diretor + "]" + "\n";
    }

}   
