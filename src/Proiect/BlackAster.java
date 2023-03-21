package Proiect;

/**
 * 
 * @author Roberto
 *
 */
public class BlackAster implements PCBuilder {

  private PC pc;

  public BlackAster() {
    this.pc = new PC();
  }

  // Predefinire componente
  @Override
  public void buildProcesor() {
    // TODO Auto-generated method stub
    pc.setProcesor("Intel I9-13900K");
  }

  @Override
  public void buildPlacaVideo() {
    // TODO Auto-generated method stub
    pc.setPlacaVideo("GeForce RTX 4090");
  }

  @Override
  public void buildPlacaDeBaza() {
    // TODO Auto-generated method stub
    pc.setPlacaDeBaza("Intel Z790");
  }

  @Override
  public void buildRam() {
    // TODO Auto-generated method stub
    pc.setRam("64 GB");
  }

  @Override
  public void buildTipRacire() {
    // TODO Auto-generated method stub
    pc.setTipRacire("Lichid");
  }

  @Override
  public void buildSursa() {
    // TODO Auto-generated method stub
    pc.setSursa("Dedicata 1200W");
  }

  public void buildStocare() {
    pc.setStocare("SSD 1TB");

  }

  public PC getPC() {
    return this.pc;
  }

  @Override
  public void buildProcesor(String Procesor) {

  }

  @Override
  public void buildPlacaVideo(String PlacaV) {

  }

  @Override
  public void buildPlacaDeBaza(String PlacaB) {

  }

  @Override
  public void buildRam(String Ram) {

  }

  @Override
  public void buildTipRacire(String TipRacire) {

  }

  @Override
  public void buildSursa(String Sursa) {

  }

  @Override
  public void buildStocare(String Stocare) {

  }

}
