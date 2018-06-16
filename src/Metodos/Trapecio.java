package Metodos;
public class Trapecio {
    String cad="";
    Evaluador je = new Evaluador();
    public double TrapecioSim(double a,double b,String fun){
        cad="("+(b-a)+")("+(je.Ecu(fun,a)+je.Ecu(fun, b))+")/2";
        return je.Ecu(cad, 0);
    }
    public double TrapecioCom(double a,double b,String fun, int n){
        double h;
        
            h=(b-a)/n;
            for (double i=a+h; i <=(b-h) ; i=i+h) {
            if (i!=a+h) {
                cad+="+"+je.Ecu(fun,i);
            }else{
                cad+=je.Ecu(fun, i);
            }
        }
            cad="("+h+")("+je.Ecu(fun,a)+"+2("+cad+")+"+je.Ecu(fun, b)+")/2";
        return je.Ecu(cad, 0);
    }
    
    public double Tra(double a,double b,String fun,double h){cad="";
        if (h==(b-a)) {
            TrapecioSim(a, b, fun);
        }else{
            for (double i=a+h; i <=(b-h) ; i=i+h) {
            if (i!=a+h) {
                cad+="+"+je.Ecu(fun, i);
            }else{
                cad+=je.Ecu(fun, i);
            }
        }
            cad="("+h+")("+je.Ecu(fun,a)+"+2("+cad+") +"+je.Ecu(fun, b)+")/2";
        }
        return je.Ecu(cad,0);
    }
}
