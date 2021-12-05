public class Pelanggan implements Observer
{
    private String namaPelanggan;

    public Pelanggan(String namaPelanggan)
    {
        this.namaPelanggan = namaPelanggan;
    }

    @Override
    public void perbarui(String info)
    {
        System.out.println(this.namaPelanggan + ", ada informasi baru nih dari SaniVerse : " + info);
    }
}