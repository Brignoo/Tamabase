package it.unibs.fp.tamabase;

public class Tamagotchi {
	
	private static final int DEFAULT = 80;
	
	private static final int MAX_SAZIETA = 100;
	private static final int MIN_SAZIETA = 0;
	private static final int MAX_SODDISFAZIONE = 100;
	private static final int MIN_SODDISFAZIONE = 0;
	
	private static final int PUNTI_BISCOTTO = 1;
	private static final int PUNTI_CAREZZA = 1;
	
	private static final int FELICITA_SAZIETA = 80;
	private static final int FELICITA_SODDISFAZIONE = 80;
	private static final int TRISTEZZA_SAZIETA = 30;
	private static final int TRISTEZZA_SODDISFAZIONE = 30;
	
	private int soddisfazione;
	private int sazieta;
	private String nome;
	
	public Tamagotchi( String nome, int soddisfazione, int sazieta ) {
		
		this.nome = nome;
		this.soddisfazione = soddisfazione;
		this.sazieta = sazieta;
	}

	public int getSoddisfazione() {
		return soddisfazione;
	}

	public int getSazieta() {
		return sazieta;
	}
	
	public void accarezza( int n ) {
		
		this.soddisfazione +=  n * PUNTI_CAREZZA;
		this.soddisfazione = Math.min(this.soddisfazione, MAX_SODDISFAZIONE );
		
		this.sazieta -= 5;
		this.sazieta = Math.max(this.sazieta, MIN_SAZIETA );
	}
	
	public void nutri( int n ) {
		
		this.sazieta +=  n * PUNTI_BISCOTTO;
		this.sazieta = Math.min(this.sazieta, MAX_SAZIETA );
		
		this.soddisfazione -= 5;
		this.soddisfazione = Math.max(this.soddisfazione, MIN_SODDISFAZIONE );
	}
	
	public String isFelice() {
		
		if( this.sazieta > FELICITA_SAZIETA && this.soddisfazione > FELICITA_SODDISFAZIONE ) {
			
			return ": )";
		}
		else if( this.sazieta < TRISTEZZA_SAZIETA || this.soddisfazione < TRISTEZZA_SODDISFAZIONE ) {
			
			return ": (";
		}
		else {
			
			return ": |";
		}
	}

	public String toString() {
		
		return "\n" + "Sazietà: " + this.sazieta + "/" + MAX_SAZIETA +
			   "\n" + "Soddisfazione: " + this.soddisfazione + "/" + MAX_SODDISFAZIONE  +
			   "\n" + "\t" + isFelice() + "\n";
	}
}
