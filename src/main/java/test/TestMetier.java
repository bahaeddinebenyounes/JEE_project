package test;
import java.util.List;


import metier.MetierImpl;
import metier.Vetement;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Vetement> prods = metier.getVetementsParMotCle("ch");
		for (Vetement p : prods)
		System.out.println(p.getNomVetement());
		}
	}

