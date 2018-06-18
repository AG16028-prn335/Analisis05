package Metodos;

public class Simpson {
    double h;
    double v[];
    String cad;
    String cad1;
    String cad2;
    String cad3;
    Evaluador je = new Evaluador();
    public double Simp1S(double a, double b,String fun){
        h=(b-a)/(2);
        cad="";
        cad="("+h+")("+je.Ecu(fun,a)+"+(4)("+je.Ecu(fun,(a+h))+")+"+je.Ecu(fun,b)+")/3";
        return je.Ecu(cad,0);
    }
    
    public double Sim1Co(double a,double b,String fun ,int n){
        h=(b-a)/(2*n);
        cad="";
        cad1="";
        cad2="";
        v= new double[(2*n)+1];
        for (int i = 0; i < v.length; i++) {
            v[i]=je.Ecu(fun,(a+h*i));
        }
        for (int i = 1; i < v.length -1; i++) {
            if (i%2==0) {
                cad1+="+"+v[i];
            }else{
                cad2+="+"+v[i];
            }
        }
        cad="(("+h+")("+(v[0]+v[v.length-1])+")/3) +(((2)"+h+")("+cad1+")/3) +(((4)"+h+")("+cad2+")/3)";
        return je.Ecu(cad, 0);
    }
    
    public double Sim3S(double a, double b,String fun){
        h=(b-a)/(3);
        cad="";
        cad="(3*"+h+")("+je.Ecu(fun,a)+"+(3*"+je.Ecu(fun,(a+h))+") + (3*"+je.Ecu(fun,(a+2*h))+")+"+je.Ecu(fun,b)+")/8";
        return je.Ecu(cad,0);
    }
    
    public double Sim3Co(double a,double b, String fun ,int n){
        h=(b-a)/(3*n);
        cad="";
        cad1="";
        cad2="";
        cad3="";
        v= new double[(3*n)+1];
        for (int i = 0; i < v.length; i++) {
            v[i]=je.Ecu(fun,(a+h*i));
        }
        n=1;
        for (int i = 1; i < v.length-1; i++) {
            switch(n){
                case 1:
                    cad2+="+"+v[i];
                    n=2;
                    break;
                case 2:
                    cad3+="+"+v[i];
                    n=3;
                    break;
                case 3:
                    cad1+="+"+v[i];
                    n=1;
                    break;
            }
        }
        cad="(3*"+h+")("+(v[0]+v[v.length-1])+")/8 +(3*"+h+")("+cad1+")/4 + (9*"+h+")("+cad2+")/8 + (9*"+h+")("+cad3+")/8";
        return je.Ecu(cad,0);
    }
}
