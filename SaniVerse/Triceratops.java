public class Triceratops extends PapanARDecorator
{
    public Triceratops(PapanAR papanAR)
    {
        super(papanAR);
    }    

    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Triceratops");
    }

    public int getHarga()
    {
        return 500000;
    }
}
