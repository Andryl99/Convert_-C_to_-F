
import java.util.Scanner;
public class code_source {

	public static void main(String[] args) {
		
		// On appelle la fonction Scanner
		Scanner sc = new Scanner(System.in); 
		
		char nouvelleConversion = 'O';
				
		
		// On lance le début de l'application avec une question permettant de personnaliser l'expérience
		System.out.println("Bienvenue au convertisseur ! \nVeuillez entrer votre nom");
		
		// On récupère le nom entré par l'utilisateur
		String prenom = sc.nextLine();
		
		
		// On met en place la boucle qui permet de revenir à une nouvelle conversion si l'utilisateur le souhaite
		while (nouvelleConversion == 'O' || nouvelleConversion == 'o'){
			
			
			System.out.println("Ok " + prenom + " quelle conversion voulez vous effectuer ?");
			System.out.println("\t-1 Convertir des degrés Celsius en degrés Fahrenheit");
			System.out.println("\t-2 Convertir des degrés Fahrenheit en degrés Celsius \n \n \tEntrez le chiffre correspondant. ");
			
			// On récupère la demande de conversion avec un sc.nextInt
			int reponse1 = sc.nextInt();
			
			while (reponse1 != 1 && reponse1 != 2) {
				System.out.println("Je n'ai pas compris votre demande, veuillez entrer le chiffre correspondant :");
				System.out.println("\t-1 Convertir des degrés Celsius en degrés Fahrenheit\n\t-2 Convertir des degrés Fahrenheit en degrés Celsius");
				reponse1 = sc.nextInt();
			}
			
			//on créé la première condition Celsius vers Fahrenheit
			if (reponse1 <= 1) {
				System.out.println("Veuillez saisir les degrés Celsius à convertir :");
				
				// on récupère les degrés à convertir dans une variable double
				double celsiusAConvertir = sc.nextDouble();
				
				
				// on calcul la conversion, on affiche le résultat et on propose de recommencer
				double celsiusConvertis = ((9 * celsiusAConvertir)/5) +32;
				System.out.println(celsiusAConvertir + "°C correspondent à "+celsiusConvertis+"°F\nSouhaitez-vous faire une autre conversion ? (Oui/Non)");
				sc.nextLine();
				
				//on renvoie la réponse dans la variable nouveelleConversion, qui relance la boucle si nécessaire
				nouvelleConversion = sc.nextLine().charAt(0);
			}
			// et la seconde Fahr vers celsius
			if (reponse1 == 2) {
				System.out.println("Veuillez saisir les degrés Fahrenheit à convertir :");
				
				// on récupère les degrés à convertir dans une variable double
				double fahrAConvertir = sc.nextDouble();
				double fahrConvertis = ((fahrAConvertir - 32) * 5) /9 ;
				System.out.println(fahrAConvertir + "°F correspondent à "+fahrConvertis+"°F\nSouhaitez-vous faire une autre conversion ? (oui/non)");
				sc.nextLine();
				nouvelleConversion = sc.nextLine().charAt(0);
			}
		}
		
		System.out.println("Merci " +prenom+" d'avoir utilisé le convertisseur, bonne journée !");

		

	}
	
	

}
