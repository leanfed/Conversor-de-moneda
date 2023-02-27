package conversor;


public class Convertir {
	
	public static double convertir(String monedaOrigen, String monedaDestino, double cantidadConvertir ) {
		
		double valorMonedaOrigen = elegirMoneda(monedaOrigen);
		double valorMonedaDestino = elegirMoneda(monedaDestino);		
		
		elegirMoneda(monedaDestino);	
		
		double ResultadoMonedaDestino = valorMonedaDestino * cantidadConvertir/valorMonedaOrigen;		
		
		return ResultadoMonedaDestino = (double) Math.round(ResultadoMonedaDestino * 100d)/100;		
		
		//System.out.println("---La cantidad de:"+ monedaOrigen + "  " + cantidadConvertir +" Equivalen a " + monedaDestino + " " + ResultadoMonedaDestino + "---");

		
	}
	
	
	
	static double elegirMoneda(String moneda) {
		
		double valorMoneda = 0;
		
		switch (moneda) {
		
		case "ARS":
			valorMoneda = 168.65;
			
			break;		
		case "USD":
			valorMoneda = 1;			
			break;
		case "EUR":
			valorMoneda = 0.95;			
			break;
			
		case "REAL":
			valorMoneda = 5.22;			
			break;
		case "MXN":
			valorMoneda = 19.39;			
			break;
		case "YEN":
			valorMoneda = 134.32;			
			break;
			
		case "YUAN":
			valorMoneda = 7.02;			
			break;			
		case "RUBLO":
			valorMoneda = 62.50;			
			break;
		case "LIB":
			valorMoneda = 0.81;			
			break;
			
		default:
			System.out.println("Valor incorrecto");
			break;
		}
		return valorMoneda;

	}
		
	}
	
	
	

