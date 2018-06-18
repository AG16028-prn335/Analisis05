package analisis05;

import Metodos.MEtodo3y5Puntos;
import Metodos.Rosemberg;
import Metodos.Simpson;
import Metodos.Trapecio;
import Metodos.diferenciasAdelante;
import javax.swing.JOptionPane;

public class Analisis05 {

    public static void main(String[] args) {
        Rosemberg r = new Rosemberg();
        JOptionPane.showMessageDialog(null, r.Ros(1,1.4,"sin(x)",0.2, 2));
    }
    
}
