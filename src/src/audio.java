package src;

public class audio extends Multimedia {
int volume;

    public audio(String t, int vol) {
        super(t);
        this.volume = vol;
    }


    void alzaVolume(int n){
        this.volume = this.volume + n;

    };
    void abbassaVolume(int n){

        this.volume = this.volume - n;
    };
    void show() {

        System.out.println("titolo audio: "+ this.titolo);
        //system.out del titolo
        //ciclo for che mi stampa tanti asterischi quanto è il numero della luminosita


        System.out.print("volume: ");
        for (int i = 0; i < volume; i++) {
            System.out.print("!");
        }
        System.out.println("");


    }


}
