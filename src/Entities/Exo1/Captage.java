package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    private String idCaptage;





    public Captage(String idCaptage) {
        this.idCaptage = idCaptage;
    }

    public String getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Captage o) {
        return 0;
    }
}
