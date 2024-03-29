package Proiect;

/**
 * 
 * @author Roberto
 *
 */
public class OfficeAsus implements PCBuilder {

  private PC pc;

  public OfficeAsus() {
    this.pc = new PC();
  }

  // Predefinire componente

  @Override
  public void buildProcesor() {
    // TODO Auto-generated method stub
    pc.setProcesor("Intel i5-11400");
  }

  @Override
  public void buildPlacaVideo() {
    // TODO Auto-generated method stub
    pc.setPlacaVideo("Integrata");
  }

  @Override
  public void buildPlacaDeBaza() {
    // TODO Auto-generated method stub
    pc.setPlacaDeBaza("Intel H510");
  }

  @Override
  public void buildRam() {
    // TODO Auto-generated method stub
    pc.setRam("16 GB");
  }

  @Override
  public void buildTipRacire() {
    // TODO Auto-generated method stub
    pc.setTipRacire("2 x Cooler");
  }

  @Override
  public void buildSursa() {
    // TODO Auto-generated method stub
    pc.setSursa("Dedicata 300W");
  }

  @Override
  public void buildStocare() {
    // TODO Auto-generated method stub
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
