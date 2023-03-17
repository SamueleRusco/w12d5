package src;
// inserisco SOLO parametri e metodi relativi all'immagine, cosa vuole immagine di
// diverso dalle altre classi?
//luminosità
public class immagine extends Multimedia{
  int luminosita;


    public immagine(String t, int lum){
        //super sostituisce this.
        super(t);
        this.luminosita = lum;

    };

 void alzaLuminosita(int n){
     this.luminosita = this.luminosita + n;

 };
 void abbassaLuminosita(int n){
     this.luminosita = this.luminosita - n;
 };

 void show(){
     System.out.println("titolo immagine: "+ this.titolo);
     //system.out del titolo
     //ciclo for che mi stampa tanti asterischi quanto è il numero della luminosita
     System.out.print("luminosità: ");
     for (int i = 0; i < luminosita; i++){
         System.out.print("*");
     }
System.out.println(" ");

 };





}
