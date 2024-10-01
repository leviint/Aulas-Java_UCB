public class Aluno extends Pessoa {

    private String curso;

    //construtor
    public Aluno(String nome, int idade, String curso){
        super(nome, idade);
        this.curso = curso;
    }

    //encapsulamento
    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    //método sobrescrito
    @Override
    public void apresentar(){
        super.apresentar();
        System.out.println("Curso: " + curso);
    }

}
