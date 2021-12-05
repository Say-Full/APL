public abstract class PapanARDecorator implements PapanAR
{
    protected PapanAR papanAR;
    
    public PapanARDecorator(PapanAR papanAR)
    {
        this.papanAR = papanAR;
    }

    @Override
    public void gambar()
    {
        this.papanAR.gambar();
    }

    public abstract int getHarga();
}
