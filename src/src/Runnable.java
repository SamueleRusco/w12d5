package src;

import java.util.Scanner;
// qua nel main chiederò di inserire il titolo, inserisco la logica principale
public class Runnable {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        creaElemento();
        /*img1.show();
        vid1.show();
        aud1.show();*/

           /* System.out.println("che tipo di file vuoi creare?");
            System.out.println("immagine/video/audio");

            switch () {
                case immagine:
                    created = "'immagine";
                    break;
                case video:
                    created = " video";
                    break;
                case audio:
                    created = " audio";
                    break;
                default:
                    System.out.println("inserisci un tipo valido");

            }
            System.out.println("hai creato un " + created);*/






        /* inserisci le variabili*/
    }

    //play(scanner.value???)

    private static void creaElemento() {
        System.out.println("che tipo di file vuoi creare?\nimmagine/video/audio");
        int scelta = scanner.nextInt();
        scanner.nextLine();


        switch (scelta) {
            case 1:
                System.out.println("inserisci nome immagine");
                String nomeImmagine = scanner.nextLine();
                System.out.println("inserisci luminosità");
                int lumImg = scanner.nextInt();
                scanner.nextLine();
                immagine img = new immagine(nomeImmagine, lumImg);

                break;
            case 2:
                System.out.println("inserisci noem video");
                String nomeVideo = scanner.nextLine();

                System.out.println("inserisci luminosità");
                int lumVid = scanner.nextInt();
                scanner.nextLine();

                System.out.println("inserisci Volume");
                int volVideo = scanner.nextInt();
                scanner.nextLine();

                video vid = new video(nomeVideo, lumVid, volVideo);
                break;
            case 3:
                System.out.println("inserisci nome audio");
                String nomeAudio = scanner.nextLine();
                System.out.println("inserisci Volume");
                int volAudio = scanner.nextInt();
                scanner.nextLine();
                audio aud = new audio(nomeAudio, volAudio);

                break;
            default:
                System.out.println("inserisci un tipo valido");
                creaElemento();

        }


    }

}