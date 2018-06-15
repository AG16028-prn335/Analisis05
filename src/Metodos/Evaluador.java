package Metodos;

import org.nfunk.jep.JEP;

public class Evaluador {
    JEP j = new JEP();

    public Evaluador() {
        j.addComplex();
        j.addStandardConstants();
        j.addStandardFunctions();
        j.setImplicitMul(true);
        
    }
    
    public double Ecu(String s,double n){
        j.addVariable("x", n);
        j.addVariable("h", n);
        j.parseExpression(s);
        if (j.hasError()) {
            System.out.println("Ecuancion no entendible:\n" + j.getErrorInfo());
        }
        return j.getValue();
    }
}
