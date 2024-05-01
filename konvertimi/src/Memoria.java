public class Memoria {
    private double vlera;
    public void shtonememorie(double vleraere){
        vlera+=vleraere;
    }
    public double vleramemories(){
        return vlera;
    }
    public void pastrimi(){
        vlera=0.0;
    }
}
