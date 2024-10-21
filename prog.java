import java.time.*; // est utilisé pour utiliser les dates/heures 
import java.util.Scanner; //Ceci est utilisé pour obtenir une Entrer

public class prog{
	public static void main(String[] args) {

		Scanner scanner;
        String nom; //Chaîne de Caractère
        String prenom; //Chaîne de Caractère


        scanner= new Scanner(System.in); //ouvrir la saisie de l'utilisateur.
        System.out.println("Veuillez saisir votre nom"); //Afficher "veuillez saisir votre nom"
        nom = scanner.nextLine(); //récupérer la saisie qu'a rentrer l'utilisateur.
		
        scanner = new Scanner(System.in); //ouvrir la saisie de l'utilisateur.
        System.out.println("Veuillez saisir votre prénom"); //Afficher "veuillez saisir votre prénom"
        prenom = scanner.nextLine(); //récupérer la saisie qu'a rentrer l'utilisateur.



	    Scanner Birthdate = new Scanner(System.in); //ouvrir la saisie de l'utilisateur (aaaaa - mm-jj)
		System.out.println("Date de naissance (format : aaaa-mm-jj)"); //Afficher "veuillez saisir votre Date de naissance"
	    String date = Birthdate.next(); //récupérer la saisie qu'a rentrer l'utilisateur.
	    
	    
		LocalDate dateOfBirth = LocalDate.parse(date); //Convertir la chaine d'Entrer en format date.
		LocalDate Today = LocalDate.now(); //Obtenir la date aujourd'hui.
		Period period = Period.between(Today, dateOfBirth); // Faire la différence entre les deux dates.
		int age  = Math.abs(period.getYears()); //Isoler le nombre d'année pour obtenir le formation d'âge approprié.
        System.out.println("Date de naissance: " + dateOfBirth); //Afficher la date de naissance obtenue. 

		if(age>=18){ //Si age est supérieur ou égal à 18 ans 
			Scanner choseJob = new Scanner(System.in); //ouvrir la saisie de l'utilisateur.
			System.out.println("Entrer votre Métier"); //Afficher "Entrer votre Métier"
			String job = choseJob.next();//Récupérer la saisie de l'utilisateur.  
			System.out.println("ton métier est "+ job); //Afficher "Ton métier est" + la donnée saisie par l'utilisateur.
			System.out.println("Mon Nom et Prénom est " + nom + " " + prenom + ", ma date de naissance est le " + dateOfBirth + " ce qui me fait" + age + " ans et " + "mon métier est " + job);
			//Je récupère tout les données récolté ça donnera ex "Mon nom est prénom est "BIEHLER" "Caroline" ,ma date de naissance est le "2000-09-16" ce qui me fait "24" ans et mon métier est "stagiaire".

        } else{
            Scanner chosecolor = new Scanner(System.in); //ouvrir la saisie de l'utilisateur.
			System.out.println("Entrer une couleur"); //Afficher "Entrer votre couleur préférer"
			String color = chosecolor.next();  //Récupérer la saisie de l'utilisateur.
			System.out.println("ta couleur est "+ color); //Afficher "Ton métier est" + la donnée saisie par l'utilisateur.
			System.out.println("Mon Nom et Prénom est " + nom + " " + prenom + ", ma date de naissance est le " + dateOfBirth + " ce qui me fait" + age + " ans et " + " ma couleur préférer est le " + color);
			//Je récupère tout les données récolté ça donnera ex "Mon nom est prénom est "BIEHLER" "Caroline" ,ma date de naissance est le "2000-09-16" ce qui me fait "24" ans et mon métier est "stagiaire".

			scanner.close(); //Fermer la saisie utilisateur
		}
	}
}

