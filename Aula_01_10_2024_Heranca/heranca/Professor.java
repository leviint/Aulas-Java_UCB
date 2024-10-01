public class Professor extends Pessoa {

    private String disciplina;

    //construtor
    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    //encapsulamento
    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    //métodos
    

}
