package src;
//qua ci metto solo roba in comune, anziché fare copiaincolla per TUTTE le classi le inserisco qua dentro
//(super)
public abstract class Multimedia {
private String titolo ;

  public abstract void play();

  public String getTitolo() {
    return titolo;
  }

  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  //multimedia è super
public Multimedia(String t){
  this.titolo = t;

}


}
