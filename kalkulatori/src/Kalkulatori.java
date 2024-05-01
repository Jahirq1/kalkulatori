public class Kalkulatori {
    Memory memorie = new Memory();

    public double gjejshumen(double nr1, double nr2) {
        double rezultati = nr1 + nr2;
        memorie.shtonememori(rezultati);
        return rezultati;
    }

    public double gjejdiferencen(double nr1, double nr2) {
        double rezultati = nr1 - nr2;
        memorie.shtonememori(rezultati);
        return rezultati;
    }

    public double gjejshumezimin(double nr1, double nr2) {
        double rezultati = nr1 * nr2;
        memorie.shtonememori(rezultati);
        return rezultati;
    }

    public double gjejspjestimin(double nr1, double nr2) {
        if (nr2 != 0) {
            double rezultati = nr1 / nr2;
            memorie.shtonememori(rezultati);
            return rezultati;
        } else {
            return 0.0;
        }
    }

    public double rrenjakatrore(double nr1) {
        if (nr1 >= 0) {
            double rezultati = Math.sqrt(nr1);
            memorie.shtonememori(rezultati);
            return rezultati;
        } else {
            return 0.0;
        }
    }
    public void shtonememori(double vleraere){
        memorie.shtonememori(vleraere);

    }
    public double vleraememories(){
        return memorie.vleraememories();
    }
    public void pastrimi(){
        memorie.pastrimi();
    }
}
