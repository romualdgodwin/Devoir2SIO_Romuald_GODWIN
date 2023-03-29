package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private int longueur;

    private int largeur;

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public Cuve(String idCaptage, int longueur, int largeur) {
        super(idCaptage);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Cuve(String idCaptage) {
        super(idCaptage);
    }

    @Override
    public double GetVolume() {
        return 0;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription()+ "Volume = "+ longueur +" * "+ largeur;
    }

    @Override
    public int compareTo(Captage o) {
        return 0;
    }


}
