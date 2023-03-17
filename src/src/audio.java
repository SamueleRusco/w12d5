package src;

public class Audio extends Multimedia {
int volume;

int durata;

    public Audio(String t, int vol, int dur) {
        super(t);
        this.volume = vol;
        this.durata = dur;
    }


    void alzaVolume(int n){
        this.volume = this.volume + n;

    };
    void abbassaVolume(int n){

        this.volume = this.volume - n;
    };
    void show() {

        System.out.println("titolo Audio: "+ this.getTitolo());
        //system.out del titolo
        //ciclo for che mi stampa tanti asterischi quanto è il numero della luminosita


        System.out.print("volume: ");
        for (int i = 0; i < volume; i++) {
            System.out.print("!");
        }
        System.out.println("");


    }
    public void play(){
        System.out.println("inizio riproduzione dell'audio: " + this.getTitolo());

        for(int i = 0; i < this.durata; i++){
            System.out.print("!");

        };
        System.out.println("");

    };



}
