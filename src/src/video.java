package src;

public class video extends Multimedia{

    int luminosita;
    int volume;



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

    public video(String t, int lum, int volume){
        super(t);
        this.luminosita = lum;
        this.volume = volume;
    }

    void show() {
        System.out.println("titolo video: "+ this.titolo);
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

}
