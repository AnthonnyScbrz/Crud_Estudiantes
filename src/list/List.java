package list;
    import main.Main;
    import model.Student;
    import output.Output;
    import java.util.Map;

public class List {

        public static void listarEstudiantes(){
            Main.iterate = Main.students.entrySet().iterator();

            if(!Main.iterate.hasNext()){
                Output.studentEmpty();
            }

            Output.tableHeader();
            while(Main.iterate.hasNext()){
                Map.Entry<Integer, Student> entrada = Main.iterate.next();
                Integer id = entrada.getKey();
                Student student = entrada.getValue();
                Output.tableBody(id,student.getFullName(),student.getFirstCurse(),student.getFirstScore(),student.getSecondCurse(),student.getSecondScore());
            }
            Output.tableEnds();

        }

}
