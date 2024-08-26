//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     PrimerCorte Pc =new PrimerCorte();
     SegundoCorte Sc = new SegundoCorte();
     TercerCorte Tc= new TercerCorte();
     Pc.NotasPrimerCorte();
     Pc.NotaTarea();
     Pc.NotaQuiz();
     Pc.NotaParcial();

    Sc.NotasSegundoCorte();
        Sc.NotaTarea();
        Sc.NotaQuiz();
        Sc.NotaParcial();


        Tc.NotasTercerCorte();
        Tc.NotaTarea();
        Tc.NotaQuiz();
        Tc.NotaParcial();


        double Definitiva= Tc.TercerCalculo()+Sc.SegundoCalculo()+Pc.PrimerCalculo();
        System.out.println(Definitiva);
        if (Definitiva>=30 & Definitiva<=50){
            System.out.println("Aprobado");
        }else if (Definitiva >= 19 & Definitiva < 30){
            System.out.println("Habilita");
        }else if (Definitiva>=0 & Definitiva<19){
            System.out.println("Reprueba");
        }else  {
        System.out.println("Error en las notas ingresadas");}
    }
    }
