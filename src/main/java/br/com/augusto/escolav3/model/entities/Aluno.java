package br.com.augusto.escolav3.model.entities;

/**
 *
 * @author Neves
 */
public class Aluno {
    
     private int id;
    private int matricula;
    private String nome;

    public Aluno(int id, int matricula, String nome) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "id: "+ this.id + " | " +
               "nome: "+ this.nome + " | " +
               "matricula: "+ this.matricula ;
    }
    
}
