package it.unisa.mathchallenger.status;

public class Domanda {

	private int	num_domanda;
	private String domanda;
	private float  risposta1, risposta2, risposta3, risposta4;

	public Domanda() {}

	public float getRisposta(int i) {
		switch (i) {
			case 0:
				return risposta1;
			case 1:
				return risposta2;
			case 2:
				return risposta3;
			case 3:
				return risposta4;
			default:
				throw new RuntimeException("Numero risposta non valida: " + i);
		}
	}

	public String getDomanda() {
		return domanda;
	}

	public int getNumeroDomanda() {
		return num_domanda;
	}

	public void setDomanda(String d) {
		domanda = d;
	}

	public void setRisposta(float r, int i) {
		switch (i) {
			case 0:
				risposta1 = r;
				break;
			case 1:
				risposta2 = r;
				break;
			case 2:
				risposta3 = r;
				break;
			case 3:
				risposta4 = r;
				break;
			default:
				throw new RuntimeException("Numero risposta non valida: " + i);
		}
		
	}

	public void setNumeroDomanda(int i) {
		num_domanda = i;
	}
}
