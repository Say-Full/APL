public class Diplodocus extends PapanARDecorator
{
    public Diplodocus(PapanAR papanAR)
    {
        super(papanAR);
    }    

    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Diplodocus");
    }

    public int getHarga()
    {
        return 400000;
    }
}
