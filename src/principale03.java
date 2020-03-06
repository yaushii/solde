import java.util.Scanner;


public class principale03 {

	public static void main(String[] args) {
// varaibles
		int codeSolde;
		double prixArticle, prixSolde;
		
		Scanner clavier = new Scanner (System.in);
		System.out.print("Entré le prix non-soldé : ");
		prixArticle = clavier.nextDouble();
		System.out.print("Entrer le code solde: \n 1 = -20% \n 2 = -80% \n 3 = -50%");
		codeSolde = clavier.nextInt();
		
		/*calcul les solde avec des If et Else
		 * if (codeSolde == 1){
			prixSolde = 0.8 * prixArticle;
			System.out.print("Le prix de l'article soldé a -20% est " + prixSolde + " €. ");
		}else if (codeSolde == 2){
			prixSolde = 0.2 * prixArticle;
			System.out.print("Le prix de l'article soldé à 80% est " + prixSolde + "€");
		}
		else { 
			prixSolde = 0.5 * prixArticle;
			System.out.print("Le prix de l'article soldé à -50% est de " + prixSolde + "€");
			
		}*/
		switch(codeSolde){
		case 1:
			prixSolde = 0.8*prixArticle;
			System.out.print("Le prix de l'article soldé a -20% est " + prixSolde + " €. ");
			break;
		case 2:
			prixSolde = 0.2*prixArticle;
			System.out.print("Le prix de l'article soldé a -80% est " + prixSolde + " €. ");
			break;
			
		case 3:
			prixSolde = 0.5*prixArticle;
			System.out.print("Le prix de l'article soldé a -50% est " + prixSolde + " €. ");
			break; 
		}
		
		
		clavier.close();
		
	}

}
