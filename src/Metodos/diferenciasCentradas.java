package Metodos;
public class diferenciasCentradas {
    double vec[];
    String cad="";
    Evaluador E = new Evaluador();
    public double Der1pC(double x,double h,String fun){
        cad="";
        cad="("+(E.Ecu(fun,(x+h)) -E.Ecu(fun,x-h))+")"+"/2h";
        return E.Ecu(cad,h);
        
    }
    public double Der1sC(double x,double h,String fun){
        cad="";
        vec=new double [4];
        vec[0]=-E.Ecu(fun,(x+2*h));
        vec[1]=8*(E.Ecu(fun,(x+h)));
        vec[2]=-8*E.Ecu(fun,(x-h));
        vec[3]=E.Ecu(fun, (x-2*h));
        
        cad="("+vec[0]+"+"+vec[1]+"+"+vec[2]+"+"+vec[3]+")"+"/(12h)";
        return E.Ecu(cad, h);
    }
    
    public double Der2pC(double x,double h,String fun){
        cad="";
        vec=new double [3];
        vec[0]=E.Ecu(fun,(x+h));
        vec[1]=-2*E.Ecu(fun,x);
        vec[2]=E.Ecu(fun, (x-h));
        
        cad="("+vec[0]+"+"+vec[1]+"+"+vec[2]+")"+"/(h^2)";
        return E.Ecu(cad, h);
    }
    
    public double Der2sC(double x,double h,String fun){
        cad="";
        vec=new double [5];
        vec[0]=-E.Ecu(fun,(x+2*h));
        vec[1]=16*(E.Ecu(fun,(x+h)));
        vec[2]=-30*E.Ecu(fun,x);
        vec[3]=16*E.Ecu(fun,(x-h));
        vec[4]=-E.Ecu(fun, (x-2*h));
        
        cad="("+vec[0]+"+"+vec[1]+"+"+vec[2]+"+"+vec[3]+"+"+vec[4]+")"+"/(12h^2)";
        return E.Ecu(cad, h);
    }
}