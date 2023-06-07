
public class Aplicacion{
	private double ladoA;
	private double ladoB;
	
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		if (this.ladoA<0) {
			this.ladoA = ladoA;
		}else {
			System.out.println("El lado A no puede ser menor a 0");
		}

	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		if (this.ladoB<0) {
			this.ladoB = ladoB;
		}else {
			System.out.println("El lado B no puede ser menor a 0");
		}
	}

}
