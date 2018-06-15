package analisis05;

import Metodos.MEtodo3y5Puntos;
import Metodos.Rosemberg;
import Metodos.Simpson;
import Metodos.Trapecio;
import Metodos.diferenciasAdelante;

public class Analisis05 {

    public static void main(String[] args) {
        //diferenciasAdelante e = new diferenciasAdelante();
        //e.Richarson(1.2,0, "e^x",2,2.1);
        //MEtodo3y5Puntos s= new MEtodo3y5Puntos();
        //s.for3(3, 0.1, "ln(x)sin(x)");
        //Simpson s = new Simpson();
        //System.out.println(s.Sim3Co(0,2, "(x)(e^x)",5));
        //Rosemberg r = new Rosemberg();
        //r.Ros(1, 2, "ln(x)",0.5, 2 );
        Trapecio t= new Trapecio();
        System.out.println(t.TrapecioCom(0,1.2,"(e^x)cos(x)", 6));
    }
    
}
