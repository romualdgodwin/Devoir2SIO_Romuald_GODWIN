package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;
    private int hauteur;

    public Forage(String idCaptage, int diametre, int hauteur) {
        super(idCaptage);
        this.diametre = diametre;
        this.hauteur = hauteur;
    }

    public Forage(String idCaptage) {
        super(idCaptage);
    }

    @Override
    public double GetVolume() {
        return 0;
    }

    @Override
    public String GetDescription()
    {
        return super.GetDescription()+ "Volume = "+ diametre +" * "+ hauteur +" * "+ Math.PI;
    }

    @Override
    public int compareTo(Captage o) {
        return 0;
    }
}
