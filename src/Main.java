import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.naming.InitialContext;

import Classes.Pelicula;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pelicula> topPeliculas = new ArrayList<Pelicula>();
		initializeFilms(topPeliculas);
		File file = new File("Jenkinsfile");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(getNextYearText(topPeliculas));
			bw.close();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public static void initializeFilms(ArrayList<Pelicula> lista) {
		Pelicula avatar = new Pelicula("Avatar",1000000000, 100000, 10000);
		Pelicula avengersEndgame = new Pelicula("Avengers: Endgame",810000000, 90000, 9000);
		Pelicula avatarWater = new Pelicula("Avatar: The way of water", 64000000, 80000, 8000);
		Pelicula titanic = new Pelicula("Titanic",490000000, 70000, 7000);
		Pelicula starWars = new Pelicula("Star Wars The Force Awakens", 360000000 , 60000, 6000);
		Pelicula avengersInfinity = new Pelicula("Avengers: Infinity War", 250000000, 50000, 5000);
		Pelicula spiderman = new Pelicula("Spiderman: No Way Home", 160000000 , 40000, 4000);
		Pelicula jurassicWorld = new Pelicula("Jurassic World", 90000000, 30000, 3000);
		Pelicula thelionking = new Pelicula("The Lion King", 40000000, 20000, 2000);
		Pelicula theAvengers = new Pelicula("Avengers: Endgame", 10000000, 10000, 1000);
		
		lista.add(avatar);
		lista.add(avengersEndgame);
		lista.add(avatarWater);
		lista.add(titanic);
		lista.add(starWars);
		lista.add(avengersInfinity);
		lista.add(spiderman);
		lista.add(jurassicWorld);
		lista.add(thelionking);
		lista.add(theAvengers);
		
	}
	
	public static String getNextYearText(ArrayList<Pelicula> lista) {
		String text = "pipeline {"
				+ "\nagent any"
				+ "\nstages{"
				+ "\nstage('Mostrar Info'){"
				+ "\nsteps{"
				+ "\nprintln \"\"\"" ;
		
		for(int i=0; i<lista.size(); i++) {
			String titulo = "Titulo: "+lista.get(i).getTitulo()+", Ganancia Bruta 2023: "+lista.get(i).getPrevisionGananciaBruta() + ", Ganancia Neta 2023: "+lista.get(i).getPrevisionGananciaNeta()+"\n";
			text += titulo;
		}
		
		text += "\"\"\"\n}\n}\n}\n}";
		return text;
	}
}
