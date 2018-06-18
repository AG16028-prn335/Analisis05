
package Metodos;

public class MEtodo3y5Puntos {
    String cad="";
    Evaluador je = new Evaluador();
    public double for3(double x,double h,String fun){
        cad="";
        cad="("+"(-3)"+je.Ecu(fun,x)+"+(4)"+je.Ecu(fun,(x+h))+"-"+je.Ecu(fun,(x+2*h))+")/(2h)";
        return je.Ecu(cad,h);
    }
    public double for5(double x,double h,String fun,int n){
        cad="";
        if (n==1) {
            cad="((-25)"+je.Ecu(fun,x)+"+(48)"+je.Ecu(fun,(x+h))+"-(36)"+je.Ecu(fun,(x+2*h))+"+(16)"+je.Ecu(fun,(x+3*h))+"-(3)"+je.Ecu(fun,(x+4*h))+")/(12h)";
        }else{
            cad="("+je.Ecu(fun,(x-2*h))+"-(8)"+je.Ecu(fun,(x-h))+"+(8)"+je.Ecu(fun,(x+h))+"-"+je.Ecu(fun,(x+2*h))+")/(12h)";
        }
        return je.Ecu(cad, h);
    }
}
