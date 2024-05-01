import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kalkulatori kalkulatori = new Kalkulatori();
        while (true) {
            System.out.println("Kalkulatori i avancuar");
            System.out.println("1. mbledhja (+)");
            System.out.println("2. Zbritja (-)");
            System.out.println("3. Shumzimi (*)");
            System.out.println("4. Pjestimi (/)");
            System.out.println("5. Rrenja katrore (√)");
            System.out.println("6. funksionet e memories");

            System.out.println("7. Dil");
            System.out.print("zgjidhni nje nga opsionet (1/2/3/4/5/6/7) ");
            int zgjidhni = sc.nextInt();
            if (zgjidhni == 7) {
                System.out.println("Dolet nga kalkulatori ");
                break;
            }
            double rezultati = 0.0;
            double nr1, nr2;
            switch (zgjidhni) {
                case 1:
                    System.out.println("vendosni numrin e pare ");
                    nr1 = sc.nextDouble();
                    System.out.println("vendosni numrin e dyt ");
                    nr2 = sc.nextDouble();
                    rezultati = kalkulatori.gjejshumen(nr1, nr2);
                    break;
                case 2:
                    System.out.println("vendosni numrin e pare ");
                    nr1 = sc.nextDouble();
                    System.out.println("vendosni numrin e dyt ");
                    nr2 = sc.nextDouble();
                    rezultati = kalkulatori.gjejdiferencen(nr1, nr2);
                    break;
                case 3:
                    System.out.println("vendosni numrin e pare ");
                    nr1 = sc.nextDouble();
                    System.out.println("vendosni numrin e dyt ");
                    nr2 = sc.nextDouble();
                    rezultati = kalkulatori.gjejshumezimin(nr1, nr2);
                    break;
                case 4:
                    try {
                        System.out.println("vendosni numrin e pare ");
                        nr1 = sc.nextDouble();
                        System.out.println("vendosni numrin e dyt ");
                        nr2 = sc.nextDouble();
                        rezultati = kalkulatori.gjejspjestimin(nr1, nr2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case 5:
                    try {
                        System.out.println("vendosni numrin e pare ");
                        nr1 = sc.nextDouble();
                        rezultati = kalkulatori.rrenjakatrore(nr1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case 6:
                    funksionetememories(sc, kalkulatori);
                    continue;

                default:
                    System.out.println("keni shtypur nje vler te gabuar provo perseri ");
                    continue;
            }
            System.out.println("rezultati eshte : "+rezultati);
        }
    }

    private static void funksionetememories(Scanner sc, Kalkulatori kalkulatori) {
        System.out.println("funksionet e memories ");
        System.out.println("1. shtimi ne memori (M+)");
        System.out.println("2. pastrimi ne memorie (MC)");
        System.out.println("3. vlera e memories (MR)");
        System.out.print(" vendosni nje vlerë qe deshironi (1/2/3): ");
        int zgjedhjamemories = sc.nextInt();
        switch (zgjedhjamemories) {
            case 1:
                System.out.println("vendosni vleren qe doni te shtoni ne memorie : ");
                double vlera = sc.nextDouble();
                kalkulatori.shtonememori(vlera);
                System.out.println("vlera u shtua ne memorie ");
                break;
            case 2:
                kalkulatori.pastrimi();
                System.out.println("memoria u pastrua ");
                break;
            case 3:
                double vleraememories = kalkulatori.vleraememories();
                System.out.println("vlera memorie " + vleraememories);
                break;
            default:
                System.out.println("keni vendosur nje vler te gabuar");
        }
    }

}