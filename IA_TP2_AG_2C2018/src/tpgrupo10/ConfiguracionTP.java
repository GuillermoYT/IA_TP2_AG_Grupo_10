package tpgrupo10;

import main.java.ar.edu.utn.frba.ia.ag.Configuracion;
import main.java.ar.edu.utn.frba.ia.ag.cruzamiento.BinomialAzar;
import main.java.ar.edu.utn.frba.ia.ag.mutacion.MutacionSimple;
import main.java.ar.edu.utn.frba.ia.ag.paro.AptitudMinima;
import main.java.ar.edu.utn.frba.ia.ag.seleccion.Ruleta;


public class ConfiguracionTP extends Configuracion {
	
	public ConfiguracionTP() {
		
		super(new AptitudMinima(10), // criterio de paro
				10000, // cantIndividuosIniciales
				new Ruleta(), // seleccion
				new BinomialAzar(), // cruzamiento
				new MutacionSimple(0)); // mutacion
	}
	
}
