import java.util.ArrayList;

public class Fitur
{
    private ArrayList<PapanARDecorator> fitur;

    public Fitur()
    {
        fitur = new ArrayList<>();
    }

    public void tambahFitur(PapanARDecorator fiturTambahan)
    {
        fitur.add(fiturTambahan);
    }

    public int totalHarga()
    {
        int total = 0;

        for(PapanARDecorator f : fitur) {
            total += f.getHarga();
        }

        return total;
    }

    public boolean cariFitur(PapanARDecorator suatuFitur)
    {
        if(fitur.contains(suatuFitur)) {
            return true;
        }
        else {
            return false;
        }
    }
}
