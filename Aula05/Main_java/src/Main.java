import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Aluno aluno1 = new Aluno("Jozefina", 1, "1234", "História");
        //System.out.println(aluno1.getCurso());
        //System.out.println(aluno1.getNome());
        pessoas.add(aluno1);
       // System.out.println(pessoas.getFirst().getNome());
        //System.out.println(pessoas.getFirst().getId());
        //System.out.println(pessoas.getFirst().getSenha());


    //Aluno aluno2 = (Aluno) pessoas.getFirst();
       // System.out.println(aluno2.getCurso());

        Professor prof1 = new Professor("Gleimon", 2, "Rb9*4--Lol","BD");
        pessoas.add(prof1);

        Aluno aluno3 = new Aluno("Flash", pessoas.size()+1, "onibus", "React de videos de k pop");
        pessoas.add(aluno3);

        Professor prof2 = new Professor("Tia Vera", 4, "3,14", "Matematica");
        pessoas.add(prof2);

        Estagiario est = new Estagiario("Culpado de Tudo", 5, "12", "ADS", "Limpar Banheiro");
        pessoas.add(est);



        for(Pessoa p: pessoas){
            System.out.println("___________");
            System.out.println(pessoas.indexOf(p));
            System.out.println(p.getNome());
            System.out.println(p.getId());
            System.out.println(p.getSenha());
            if( p.getClass() == Aluno.class){
//                System.out.println(p.getNome() + " é um aluno");
                Aluno a1 = (Aluno) p;
                System.out.println(a1.getCurso());
            }else if(p instanceof Professor){
                Professor p1 = (Professor) p;
                System.out.println(p1.getArea());

                }else {
                Estagiario e1 = (Estagiario) p;
                System.out.println(e1.getFuncao());
                System.out.println(e1.getCurso());
            }
            }

        }

    }
