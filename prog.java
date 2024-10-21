import java.time.*; // This is used to utilize dates/times
import java.util.Scanner; // This is used to obtain input

public class prog{
	public static void main(String[] args) {

		Scanner scanner;
        String nom;
        String prenom;

        scanner= new Scanner(System.in);
        System.out.println("Veuillez saisir votre nom");
        nom = scanner.nextLine();
        scanner= new Scanner(System.in);
        System.out.println("Veuillez saisir votre prénom");
        prenom = scanner.nextLine();

	    Scanner Birthdate = new Scanner(System.in); 
		System.out.println("Date de naissance (aaaa-mm-jj)");
	    String date = Birthdate.next(); 
	    
	    
		LocalDate dateOfBirth = LocalDate.parse(date); 
		LocalDate Today = LocalDate.now(); 
		Period period = Period.between(Today, dateOfBirth); 
		int age  = Math.abs(period.getYears()); 
        
        System.out.println("Date de naissance: " + dateOfBirth);  

		if(age>=18){
			Scanner choix = new Scanner(System.in);  
			System.out.println("Entrée un métier");
			String dateStr = choix.next();  
			System.out.println("ton métier est "+ dateStr);
			System.out.println("Nom : " + nom + "Prénom : " + prenom + "date de naissance : " + dateOfBirth + "age : " + age + " ans " + "métier : " + dateStr );


        } else{
            Scanner autre = new Scanner(System.in);  
			System.out.println("Entrée une couleur");
			String dateAutre = autre.next();  
			System.out.println("ta couleur est "+ dateAutre);
			System.out.println("Nom : " + nom + "Prénom : " + prenom + "date de naissance : " + dateOfBirth + "age : " + age + " ans "+ "Couleur : " + dateAutre );
        }
	}
}

