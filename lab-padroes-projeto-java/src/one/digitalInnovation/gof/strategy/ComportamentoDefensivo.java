package one.digitalInnovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {
	
	@Override
	public void mover() {
		System.err.println("Movendo-se defensivo...");
	}
	
}
