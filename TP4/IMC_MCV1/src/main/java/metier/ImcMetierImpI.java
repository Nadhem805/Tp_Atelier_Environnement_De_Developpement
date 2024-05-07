package metier;
public class ImcMetierImpI implements IImcMetier{
	
	@Override
	
	public double calculerImc(int poids,double taille)
	{
		double imc=poids/(taille*taille);
		return imc;
	}
}