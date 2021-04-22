package huerto;

import java.util.ArrayList;
import java.util.List;

import huerto.macetas.Maceta;
import huerto.macetas.MacetaRectangular;
import huerto.macetas.MacetaTubular;
import huerto.plantas.Acelga;
import huerto.plantas.Hinojo;
import huerto.plantas.Perejil;
import huerto.plantas.TomateCherry;
import huerto.plantas.Zanahoria;

public class Sistema {
	
	private static final int NUM_ZANAHORIAS = 5;

	public static void main(String[] args) {
		Huerto miHuerto = new Huerto("Mi primer huerto");
		Maceta cuadrada = new MacetaRectangular("Cuadradita", 20, 20, 20);
		Maceta botella = new MacetaTubular("Botella", 25, 15);
		Maceta maceton = new MacetaTubular("Macetón", 40, 40);
		miHuerto.addMaceta(cuadrada);
		miHuerto.addMaceta(botella);
		miHuerto.addMaceta(maceton);
		
		System.out.println("Mi huerto nuevito: " + miHuerto);
		
		IPlanta tomatitos = new TomateCherry("tomatitos");
		IPlanta acelga = new Acelga("hojas verdes");
		IPlanta zanahoria = new Zanahoria("larguita");
		IPlanta perejil = new Perejil("verdito");
		IPlanta hinojo = new Hinojo("hijo sin ojo");
		List<Zanahoria> zanahorias = new ArrayList<>();
		for (int i = 0; i < NUM_ZANAHORIAS; i++) {
			Zanahoria z = new Zanahoria("z" + i);
			zanahorias.add(z);
		}
		
		IMaceta macetaTomatitos = miHuerto.plantar(tomatitos);
		pintaResultadoPlantar(tomatitos, macetaTomatitos);

		IMaceta macetaAcelga = miHuerto.plantar(acelga);
		pintaResultadoPlantar(acelga, macetaAcelga);

		IMaceta macetaZanahoria = miHuerto.plantar(zanahoria);
		pintaResultadoPlantar(zanahoria, macetaZanahoria);

		IMaceta macetaPerejil = miHuerto.plantar(perejil);
		pintaResultadoPlantar(perejil, macetaPerejil);

		IMaceta macetaHinojo = miHuerto.plantar(hinojo);
		pintaResultadoPlantar(hinojo, macetaHinojo);

		for (Zanahoria z : zanahorias) {
			IMaceta macetaZ = miHuerto.plantar(z);
			pintaResultadoPlantar(z, macetaZ);
		}
		
		System.out.println("Mi huerto con muchas plantas: " + miHuerto);
	}

	private static void pintaResultadoPlantar(IPlanta tomatitos,
			IMaceta macetaTomatitos) {
		if (macetaTomatitos != null) {
			System.out.println("He plantado " + tomatitos.getNombre() + " en " + macetaTomatitos.getNombre());
		} else {
			System.out.println("No he podido plantar " + tomatitos.getNombre());
		}
	}
}
