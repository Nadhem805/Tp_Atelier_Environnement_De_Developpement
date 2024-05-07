package metier;
public class TestMetier{
	

public static void main(String[] args){
	
	ImcMetierImpI metier=new ImcMetierImpI();
	double taille=1.2;
	int poids=65;
	double imc=metier.calculerImc(poids,taille);
	System.out.println("sont imc = " + imc);
	
	
}
}