import javax.persistence.*;

@NamedQuery(name="Aluno.findAll", query="select c from Aluno as c")
@NamedQuery(name="Aluno.findByIniciadosPorNome", query="select c from Aluno as c where c.nome like :nome")

@Entity
@Table(name = "aluno")

public class Aluno {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Integer id;
    private String matricula;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;

    public Aluno(){

    }

    public Aluno(Integer id, String matricula, String cpf, String nome, String email, String telefone) {
        this.id = id;
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String toString() {
        return "aluno{" +
                "id=" + id +
                ", matricula= '" + matricula + '\'' +
                ", cpf= '" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
