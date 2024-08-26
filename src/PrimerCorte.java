import java.util.Scanner;

public class PrimerCorte {
    public int getTarea() {
        return tarea;
    }

    public void setTarea(int tarea) {
        this.tarea = tarea;
    }

    public int getQuiz() {
        return quiz;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getParcial() {
        return parcial;
    }

    public void setParcial(int parcial) {
        this.parcial = parcial;
    }

    private int tarea;
    private int quiz;
    private int parcial;
    Scanner teclado = new Scanner(System.in);
    PrimerCorte(){};
    public void NotasPrimerCorte (){
        System.out.println("Ingrese las notas del primer corte");
    }
    public void NotaTarea (){
        System.out.println("Ingrese la nota de la tarea");
        tarea=teclado.nextInt();
    }
    public void NotaQuiz (){
        System.out.println("Ingrese la nota de la Quiz");
        quiz=teclado.nextInt();
    }
    public void NotaParcial (){
        System.out.println("Ingrese la nota de la Parcial");
        parcial=teclado.nextInt();
    }
    public  double PrimerCalculo(){
         double suma= tarea*0.1+quiz*0.1+parcial*0.15;
         return suma;
    }
}
