package Metodos;
public class diferenciasAtras {
    double vec[];
    String cad="";
    Evaluador E = new Evaluador();
    public double Der1pAt(double x,double h,String fun){
        cad="";
        cad="("+(E.Ecu(fun,(x)) -E.Ecu(fun,x-h))+")"+"/h";
        return E.Ecu(cad,h);
        
    }
    public double Der1sAt(double x,double h,String fun){
        cad="";
        vec=new double [3];
        vec[0]=3*E.Ecu(fun,(x));
        vec[1]=-4*(E.Ecu(fun,(x-h)));
        vec[2]=E.Ecu(fun,(x-2*h));
        
        cad="("+vec[0]+"+"+vec[1]+"+"+vec[2]+")"+"/(2h)";
        return E.Ecu(cad, h);
    }
}
