package Metodos;
public class Rosemberg {
    Trapecio t = new Trapecio();
    Evaluador je = new Evaluador();
    public void Ros(double a ,double b, String fun,double h,int n){
        n+=1;
        double v[][]= new double[n][n+1];
        String cad;
        //poner las h
        v[0][0]=h;
        for (int i = 1; i <n; i++) {
            v[i][0]=v[i-1][0]/2;
        }
        //poner trapecio
        for (int i = 0; i <n; i++) {
            v[i][1]=t.Tra(a, b, fun,v[i][0]);
        }
         double y=4;
        for (int i = 2; i < n+1; i++) {
            for (int j = i; j <(n+1); j++) {
                cad="(("+y+")("+v[j-1][i-1]+")-("+v[j-2][i-1]+"))/("+(y-1)+")";
                v[j-1][i]=je.Ecu(cad, 0);
            }
            y*=y;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n+1; j++) {
                System.out.print(v[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}