package unico;

public class Ejercicio18 {

	public static void main(String[] args) {

		/*
		 * Implementa un método que permita calcular la energía cinética de un cuerpo,
		 * sabiendo que, la energía cinética de un cuerpo es aquella que posee debido
		 * a su movimiento. La energía cinética de una masa puntual depende de su masa
		 * (m), y de su velocidad (v). Así:
		 */

		String mes;
		String dias;

		Util.escribirLn("Programa conocer los días de un mes.");
		mes = Util.leerString("Introduzca un mes: ");
		
		dias = diasMes(mes);
		Util.escribir(dias);
	}

	public static String diasMes(String mes) {
		String dias;
		
		switch (mes) {
		case "enero", "1", "marzo", "3", "mayo", "5", "julio", "7", "agosto", "8", "octubre", "10", "diciembre", "12": dias = "31 días"; break;
		case "febrero", "2": dias = "28 días"; break;
		case "abril", "4", "junio", "6", "septiembre", "9", "novimebre", "11": dias = "30 días"; break;
		default: dias = "Error. Recuerda introducir el mes en minúscula o el número del mes.";
		}

		return dias;
	}
}
