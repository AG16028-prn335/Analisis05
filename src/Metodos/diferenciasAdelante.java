package Metodos;

public class diferenciasAdelante {
    double vec[];
    String cad="";
    Evaluador E = new Evaluador();
    diferenciasCentradas c = new diferenciasCentradas();
    
    public double Der1P(double x,double h,String fun){
        cad="";
        cad="("+(E.Ecu(fun,(x+h)) -E.Ecu(fun,x))+")"+"/h";
        return E.Ecu(cad,h);
    }
    
    public double Der1S(double x,double h,String fun){
        cad="";
        vec=new double [3];
        vec[0]=-E.Ecu(fun,(x+2*h));
        vec[1]=4*(E.Ecu(fun,(x+h)));
        vec[2]=-3*E.Ecu(fun,(x));
        for (int i = 0; i < vec.length; i++) {
            cad+=vec[i];
        }
        cad="("+vec[0]+"+"+vec[1]+"+"+vec[2]+")"+"/(2h)";
        return E.Ecu(cad, h);
    }
    
    public void Richarson(double h,double x,String fun,int fil,double de){
        fil=fil+2;
        double rich[][]= new double[fil][fil+1];
        rich[0][0]=h;
        for (int i = 1; i <fil; i++) {
            rich[i][0]=(rich[i-1][0])/2;
        }
        for (int i = 0; i < fil; i++) {
            if (de==1.1 || de==1.2) {
                if (de==1.1) {
                    rich[i][1]=c.Der1pC(x,rich[i][0],fun);
                }else{
                    rich[i][1]=c.Der1sC(x,rich[i][0],fun);
                }
            }else{
                if (de ==2.1) {
                    rich[i][1]=c.Der2pC(x,rich[i][0],fun);
                }else{
                    rich[i][1]=c.Der2sC(x,rich[i][0],fun);
                }
            }
        }
        int n=1;
        for (int i = 1; i <fil; i++) {
            for (int j = n; j <fil; j++) {
               cad="((4)"+rich[j][i]+"/3)-("+rich[j-1][i]+"/3)";
               rich[j][i+1]=E.Ecu(cad,0);
            }
            n++;
        }
        for (int i = 0; i <fil; i++) {
            for (int j =0; j <fil+1; j++) {
                System.out.print(rich[i][j]+"|\t");
            }
            System.out.println("");
        }
            System.out.println("res: "+rich[fil-1][fil]);
    }
    
}
