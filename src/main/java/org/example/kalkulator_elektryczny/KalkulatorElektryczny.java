package org.example.kalkulator_elektryczny;

public class KalkulatorElektryczny {

    public double obliczNapiecie(double I, double R){
        return I*R;
    }
    public double obliczNatezenie(double U, double R){
        return U/R;
    }
    public double obliczOpor(double U, double I){
        return U/I;
    }

    public double szeregowo(double R1, double R2){
        return R1+R2;
    }
    public double szeregowo(double R1, double R2, double R3){
        return R1+R2+R3;
    }

    public double rownolegle(double R1, double R2){
        return 1/(1/R1 + 1/R2);
    }
    public double rownolegle(double R1, double R2, double R3){
        return 1/(1/R1 + 1/R2 + 1/R3);
    }

    double obliczMoc(double U, double I){
        return U*I;
    }
    double obliczMoc(double U, double I, double t){
        return U*I*t;
    }
}
