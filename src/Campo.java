import javax.swing.JOptionPane;

public class Campo {
	Aplicacion encap = new Aplicacion();
	double ladoA=1;
	double ladoB=1;
	
	public Campo() {}

	public void ingresarDatos() {
			encap.setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud de lado A")));
			encap.setLadoB(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud de lado B")));
	}
	public Campo(double ladoA, double ladoB) {
		ladoA=encap.getLadoA();
		ladoB=encap.getLadoB();
	}

	public void calcularArea() {
		double resultado;
		resultado= encap.getLadoA() * encap.getLadoB();
		
		System.out.println("El resultado es: "+resultado);
	}
}
