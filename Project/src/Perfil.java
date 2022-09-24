
/*1. Defina uma entidade principal com pelo menos 5 atributos e relacionada a um domínio de problema. Crie também uma classe Java para representá-la. Exemplo de entidade com 9 atributos: Cliente: id, nome, cpf, endereço, email, fone, cidade, uf, cep. A entidade deve estar relacionada a algo que você gosta bastante como: hobie, esporte, pet, alimentação, educação, música, filmes, séries, redes sociais, etc. A entidade escolhida por você não pode ser a entidade Cliente dada como exemplo. Escolha uma entidade bem diferente dela, inclusive quanto aos seus atributos. */
import java.io.Serializable;

public class Perfil implements Serializable {

    String name;
    String description;
    int forca;
    int energia;
    int poder;

    public Perfil() {

    }

    public Perfil(String name, String description, int forca, int energia, int poder) {
        this.name = name;
        this.description = description;
        this.forca = forca;
        this.energia = energia;
        this.poder = poder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return description;
    }

    public void setDecription(String description) {
        this.description = description;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "CadernoDeCaracteres{" +
                "Nome='" + name + '\'' +
                ", Descrição='" + description + '\'' +
                ", Força='" + forca + '\'' +
                ", Energia='" + energia + '\'' +
                ", Poder='" + poder + '\'' +
                '}';
    }

}
