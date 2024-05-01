import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Konvertimi konvertimi = new Konvertimi();
        Scanner sc = new Scanner(System.in);
       while(true) {
           System.out.println("zgjedhe distancen qe deshironi te konvertoni");
           System.out.println("1. nga metra ne kilometra ");
           System.out.println("2. nga kilometra ne metra ");
           System.out.println("3. nga metra ne centimetra ");
           System.out.println("4. nga centimetra ne metra ");
           System.out.println("5. nga metra ne milimetra ");
           System.out.println("6. nga milimetra ne metra ");
           System.out.println("7. dil ");
           System.out.println("8. funksionet e memories ");

           System.out.println("zgjidhni nje nga opsionet");
           int zgjidhni = sc.nextInt();
           if (zgjidhni == 7) {
               System.out.println("keni mbyllur konvertuesin ");
               break;
           }
           double rezultati = 0.0;
           double m;
           switch (zgjidhni) {
               case 1:
                   System.out.print("Metra ne km ");
                   m = sc.nextDouble();
               rezultati = konvertimi.gjejkm(m);
                break;
                case 2:
                    System.out.println("km ne metra ");
                    m = sc.nextDouble();
                    rezultati = konvertimi.gjejmetra(m);
                    break;
                    case 3:
                        System.out.println("centimetra ne metra ");
                        m = sc.nextDouble();
                        rezultati= konvertimi.gjejmetra1(m);

                        break;
                        case 4:
                            System.out.println("metra ne centimetra ");
                            m = sc.nextDouble();
                           rezultati = konvertimi.gjejcm(m);

                            case 5:
                                System.out.println("milimetra ne metra ");
                                m = sc.nextDouble();
                                rezultati = konvertimi.gjejmetra2(m);

                                case 6:
                                    System.out.println("metra ne milimetra ");
                                    m = sc.nextDouble();
                                    rezultati = konvertimi.gjejmm(m);
                                    break;
               case 8:
                   funksionetememories(sc,konvertimi);
                  continue;
               default:
                   System.out.println("keni shtypur nje vler te gabuar provo perseri ");
                continue;
           }
           System.out.println("rezultati eshte : "+rezultati);
       }
    }
    private static void funksionetememories(Scanner sc, Konvertimi konvertimi) {
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
                konvertimi.gjejkm(vlera);
                System.out.println("vlera u shtua ne memorie ");
                break;
            case 2:
                konvertimi.pastrimi();
                System.out.println("memoria u pastrua ");
                break;
            case 3:
                double vleraememories = konvertimi.vleramemories();
                System.out.println("vlera memorie " + vleraememories);
                break;
            default:
                System.out.println("keni vendosur nje vler te gabuar");
        }
    }

}