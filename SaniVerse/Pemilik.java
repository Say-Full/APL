import java.util.ArrayList;

public class Pemilik implements Observable
{
    private ArrayList<Observer> paraPelanggan;

    public Pemilik()
    {
        paraPelanggan = new ArrayList<>();
    }

    @Override
    public void tambahObserver(Observer observer)
    {
        paraPelanggan.add(observer);
    }

    @Override
    public void hapusObserver(Observer observer)
    {
        paraPelanggan.remove(observer);
    }

    @Override
    public void beritahu(String info)
    {
        for(Observer pelanggan : paraPelanggan) {
            pelanggan.perbarui(info);
        }
    }
}