package src;
// inserisco SOLO parametri e metodi relativi all'Immagine, cosa vuole Immagine di
// diverso dalle altre classi?
//luminosità
public class Immagine extends Multimedia{
  int luminosita;


    public Immagine(String t, int lum){
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
     System.out.println("titolo Immagine: "+ this.getTitolo());
     //system.out del titolo
     //ciclo for che mi stampa tanti asterischi quanto è il numero della luminosita
     System.out.print("luminosità: ");
     for (int i = 0; i < luminosita; i++){
         System.out.print("*");
     }
System.out.println(" ");

 };

 public void play(){
     System.out.println("questa Immagine non è riproducibiel");
 }





}
