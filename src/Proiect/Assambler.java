package Proiect;

public class Assambler {
	
	private PCBuilder pcBuilder;
	
	public Assambler(PCBuilder pcBuilder) {
		this.pcBuilder = pcBuilder;
	}
	
	public PC getPC()
	{
		return this.pcBuilder.getPC();
	}
	
	//Asamblare PC	
	public void AssemblyPC()
	{
		this.pcBuilder.buildPlacaVideo();
		this.pcBuilder.buildPlacaDeBaza();
		this.pcBuilder.buildProcesor();
		this.pcBuilder.buildRam();
		this.pcBuilder.buildStocare();
		this.pcBuilder.buildSursa();
		this.pcBuilder.buildTipRacire();
	}
	
	//Asamblare PC CUSTOM
	public void AssemblyCustomPC(String p1,String p2,String p3,String p4,String p5,String p6,String p7)
	{
		this.pcBuilder.buildPlacaVideo(p1);
		this.pcBuilder.buildPlacaDeBaza(p2);
		this.pcBuilder.buildProcesor(p3);
		this.pcBuilder.buildRam(p4);
		this.pcBuilder.buildStocare(p5);
		this.pcBuilder.buildSursa(p6);
		this.pcBuilder.buildTipRacire(p7);
	}
	
}
