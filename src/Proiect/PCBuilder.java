package Proiect;

public interface PCBuilder {
	
	public void buildProcesor();
	public void buildPlacaVideo();
	public void buildPlacaDeBaza();
	public void buildRam();
	public void buildTipRacire();
	public void buildSursa(); 
	public void buildStocare();

	
	public PC getPC();
	public void buildProcesor(String Procesor);
	public void buildPlacaVideo(String PlacaV);
	public void buildPlacaDeBaza(String PlacaB);
	public void buildRam(String Ram);
	public void buildTipRacire(String TipRacire);
	public void buildSursa(String Sursa);
	public void buildStocare(String Stocare);
}
