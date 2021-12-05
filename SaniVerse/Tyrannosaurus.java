public class Tyrannosaurus extends PapanARDecorator
{
    public Tyrannosaurus(PapanAR papanAR)
    {
        super(papanAR);
    }    

    @Override
    public void gambar()
    {
        super.gambar();
        System.out.print(" Tyrannosaurus");
    }

    public int getHarga()
    {
        return 300000;
    }
}
