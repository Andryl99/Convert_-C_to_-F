
import java.util.Scanner;
public class source {

	public static void main(String[] args) {
		
		// On appelle la fonction Scanner
		Scanner sc = new Scanner(System.in); 
		
		char nouvelleConversion = 'O';
		
		double celsiusEntres = (0);
		double celsiusToFahrenheit;
		celsiusToFahrenheit = ((9/5) * celsiusEntres) +32;
		
		
		// On lance le d�but de l'application avec une question permettant de personnaliser l'exp�rience
		System.out.println("Bienvenue au convertisseur ! \nVeuillez entrer votre nom");
		
		// On r�cup�re le nom entr� par l'utilisateur
		String prenom = sc.nextLine();
		
		
		// On met en place la boucle qui permet de revenir � une nouvelle conversion si l'utilisateur le souhaite
		while (nouvelleConversion == 'O'){
			
			
			System.out.println("Ok " + prenom + " quelle conversion voulez vous effectuer ?\n\t-1 Convertir des degr�s Celsius en degr�s Fahrenheit\n\t-2 Convertir des degr�s Fahrenheit en degr�s Celsius \nEntrez le nombre correspondant. ");
			
			// On r�cup�re la demande de conversion avec un sc.nextInt
			int reponse1 = sc.nextInt();
			
			//on cr�� la premi�re condition Celsius vers Fahrenheit
			if (reponse1 <= 1) {
				System.out.println("Veuillez saisir les degr�s Celsius � convertir :");
				
				// on r�cup�re les degr�s � convertir dans une variable double
				double celsiusAConvertir = sc.nextDouble();
				
				
				// on calcul la conversion, on affiche le r�sultat et on propose de recommencer
				double celsiusConvertis = ((9 * celsiusAConvertir)/5) +32;
				System.out.println(celsiusAConvertir + "�C correspondent � "+celsiusConvertis+"�F\nSouhaitez-vous faire une autre conversion ? (Oui/Non)");
				sc.nextLine();
				
				//on renvoie la r�ponse dans la variable nouveelleConversion, qui relance la boucle si n�cessaire
				nouvelleConversion = sc.nextLine().charAt(0);
			}
			// et la seconde Fahr vers celsius
			if (reponse1 == 2) {
				System.out.println("Veuillez saisir les degr�s Fahrenheit � convertir :");
				
				// on r�cup�re les degr�s � convertir dans une variable double
				double fahrAConvertir = sc.nextDouble();
				double fahrConvertis = ((fahrAConvertir - 32) * 5) /9 ;
				System.out.println(fahrAConvertir + "�F correspondent � "+fahrConvertis+"�F\nSouhaitez-vous faire une autre conversion ? (oui/non)");
				sc.nextLine();
				nouvelleConversion = sc.nextLine().charAt(0);
			}
		}
		
		System.out.println("Merci " +prenom+" d'avoir utilis� le convertisseur, bonne journ�e !");

		

	}
	
	

}
