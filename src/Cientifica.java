
public class Cientifica {
	public static double total;

	public static void main(String[] args) {
		
		

	}

	public double suma(double numero1, double numero2) {
		total = numero1 + numero2;
		return total;
	}

	public double resta(double numero1, double numero2) {
		total = numero1 - numero2;
		return total;
	}

	public double multiplicacion(double numero1, double numero2) {
		if (numero1 == 1 || numero2 == 1) {
			throw new ArithmeticException("Es una idiotez multiplicar por 1, porque da lo mismo");
		}
		return total;
	}

	public double division(double numero1, double numero2) {
		total = numero1 / numero2;
		return total;
	}

	public void tiempoTranscurrido() {
			try {
				Thread.sleep(200);
			} catch (InterruptedException meesperoalapelicula) {
				// TODO Auto-generated catch block
			
			}
			
		}
	public static void limpiar() {
		total=0;
	}
}

	
