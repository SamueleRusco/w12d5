package src;

import java.sql.SQLOutput;

public class Video extends Multimedia{

    int luminosita;
    int volume;
    int durata;

    public Video(String t, int lum, int volume, int durataVideo){
        super(t);
        this.luminosita = lum;
        this.volume = volume;
        this.durata = durataVideo;
    }

    void alzaLuminosita(int n){
        this.luminosita = this.luminosita + n;

    };
    void abbassaLuminosita(int n){

        this.luminosita = this.luminosita - n;
    };
    void alzaVolume(int n){
        this.volume = this.volume + n;

    };
    void abbassaVolume(int n){

        this.volume = this.volume - n;
    };



   public void show() {
        System.out.println("titolo video: "+ this.getTitolo());
        //system.out del titolo
        //ciclo for che mi stampa tanti asterischi quanto è il numero della luminosita
        System.out.print("luminosità: ");
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print("volume: ");
        for (int i = 0; i < volume; i++) {
            System.out.print("0");
        }
        System.out.println("");


    }
    public void play(){
        System.out.println("inizio riproduzione del video: " + this.getTitolo());

       for(int i = 0; i < this.durata; i++){
            System.out.print("!");

       };
        System.out.println("");

    };

}
