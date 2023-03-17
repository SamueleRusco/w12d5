package src;

import java.util.ArrayList;
import java.util.List;
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
            System.out.println("Immagine/video/audio");

            switch () {
                case Immagine:
                    created = "'Immagine";
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

        List<Multimedia> arrayDiCose = new ArrayList<>();
      /* arrayDiCose.add(new Immagine("asd", 4) );
        arrayDiCose.add(new Audio("asdAudio", 2, 3) );
        arrayDiCose.add(new Video("asdVideo", 2,3, 2) );*/
        while (arrayDiCose.size() != 2) {
            System.out.println("che tipo di file vuoi creare?\nImmagine/video/audio");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.println("inserisci nome Immagine");
                    String nomeImmagine = scanner.nextLine();
                    System.out.println("inserisci luminosità");
                    int lumImg = scanner.nextInt();
                    scanner.nextLine();
                    arrayDiCose.add(new Immagine(nomeImmagine, lumImg));

                    break;
                case 2:
                    System.out.println("inserisci noem video");
                    String nomeVideo = scanner.nextLine();
                    System.out.println("inserisci durata");
                    int durataVideo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("inserisci luminosità");
                    int lumVid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("inserisci Volume");
                    int volVideo = scanner.nextInt();
                    scanner.nextLine();

                    arrayDiCose.add(new Video(nomeVideo, lumVid, volVideo, durataVideo));
                    break;
                case 3:
                    System.out.println("inserisci nome audio");
                    String nomeAudio = scanner.nextLine();
                    System.out.println("inserisci Durata");
                    int durataAudio = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("inserisci Volume");
                    int volAudio = scanner.nextInt();
                    scanner.nextLine();
                    arrayDiCose.add(new Audio(nomeAudio, volAudio, durataAudio));

                    break;
                default:
                    System.out.println("inserisci un tipo valido");
                    creaElemento();

            }

        }
        System.out.println("l'array è pieno");
        System.out.println("quale file vuoi riprodurre? (1 a 5)");
arrayDiCose.forEach(m -> {
    m.play();
});

    }



}