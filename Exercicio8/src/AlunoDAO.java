import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import java.util.List;

public class AlunoDAO implements DAO{

    public void insert(Aluno aluno) {
        EntityManager entityManager = Util.getEntityManager();
        try {
            Util.beginTransaction();
            entityManager.merge(aluno);
            Util.commit();

        }catch (Exception e) {
            Util.rollback();
            e.printStackTrace();
        } finally {
            Util.closeEntityManager();
        }

    }

    public List<Aluno> list(){
        EntityManager list = Util.getEntityManager();
        List<Aluno> alunos = list.createQuery("select c from Aluno as c", Aluno.class).getResultList();
        Util.closeEntityManager();
        return alunos;
    }

    public List<Aluno> ListPag(int pagina, int tamanhoPagina) {
        return null;
    }

    public void delete(Connection connection, int id){
        try {
            String delete = "delete from aluno where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        }
        
    }

    public void update(Connection connection, Aluno aluno){
        try {
            String update = "update aluno set matricula = ?, cpf = ?, nome = ?, email = ?, telefone = ? where id = ?";
            PreparedStatement preparedStatement;
            if(aluno.getId() == 0){
                System.out.println("Este Id não existe");
                return;
            }else{
                preparedStatement = connection.prepareStatement(update);
                preparedStatement.setInt(6, aluno.getId());
            }
            preparedStatement.setString(1, aluno.getMatricula());
            preparedStatement.setString(2, aluno.getCpf());
            preparedStatement.setString(3, aluno.getNome());
            preparedStatement.setString(4, aluno.getEmail());
            preparedStatement.setString(5, aluno.getTelefone());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new DAOException("Operação não realizada com sucesso.", e);
        }
    }



}