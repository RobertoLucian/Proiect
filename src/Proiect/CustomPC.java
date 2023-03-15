package Proiect;

/**
 * 
 * @author Roberto
 *
 */
public class CustomPC implements PCBuilder {
	
	private PC pc;
	
	public CustomPC()
	{
		this.pc = new PC();
	}
	
	//Functii de build pentru PC cu parametru
	
	@Override
	public void buildProcesor(String Procesor) {
		pc.setProcesor(Procesor);
		
	}

	@Override
	public void buildPlacaVideo(String PlacaV) {
		pc.setPlacaVideo(PlacaV);
		
	}

	@Override
	public void buildPlacaDeBaza(String PlacaB) {
		pc.setPlacaDeBaza(PlacaB);
		
	}

	@Override
	public void buildRam(String Ram) {
		pc.setRam(Ram);
		
	}

	@Override
	public void buildTipRacire(String TipRacire) {
		pc.setTipRacire(TipRacire);
		
	}

	@Override
	public void buildSursa(String Sursa) {
		pc.setSursa(Sursa);
		
	}

	@Override
	public void buildStocare(String Stocare) {
		pc.setStocare(Stocare);
		
	}

	@Override
	public PC getPC() {
		return this.pc;
	}


	//Functii de build pentru PC fara parametru
	@Override
	public void buildProcesor() {
		pc.setProcesor("");
		
	}


	@Override
	public void buildPlacaVideo() {
		pc.setPlacaVideo("");
		
	}


	@Override
	public void buildPlacaDeBaza() {
	    pc.setPlacaDeBaza("");
		
	}


	@Override
	public void buildRam() {
		pc.setRam("");
		
	}


	@Override
	public void buildTipRacire() {
		pc.setTipRacire("");
		
	}


	@Override
	public void buildSursa() {
		pc.setSursa("");
		
	}


	@Override
	public void buildStocare() {
	    pc.setStocare("");
		
	}


	

}
