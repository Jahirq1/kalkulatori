public class Konvertimi {
    Memoria memorie = new Memoria();
    public double gjejkm(double m){
        double rezultati = m/1000;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }

    public double gjejmetra(double m){
        double rezultati = m*1000;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }
    public double gjejmetra1(double m){
        double rezultati = m/100;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }
    public double gjejcm(double m){
        double rezultati = m*100;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }
    public double gjejmetra2(double m){
        double rezultati = m/1000;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }
    public double gjejmm(double m){
        double rezultati = m*100;
        memorie.shtonememorie(rezultati);
        return rezultati;
    }



    public void shtonememorie(double vleraere){
        memorie.shtonememorie(vleraere);

    }
    public double vleramemories(){
        return memorie.vleramemories();
    }
    public void pastrimi(){
        memorie.pastrimi();
    }

}
