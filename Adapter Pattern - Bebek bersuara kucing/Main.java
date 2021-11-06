public class Main
{
    public static void main(String[] args)
    {
        KucingAnggora cicing = new KucingAnggora();
        cicing.suara();

        BebekAylesbury ayle = new BebekAylesbury();
        ayle.kwek();

        BebekBersuaraKucingAdapter aylecing = new BebekBersuaraKucingAdapter(cicing);
        aylecing.kwek();
    }    
}

