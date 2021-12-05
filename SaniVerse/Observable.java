public interface Observable
{
    public void tambahObserver(Observer observer);
    public void hapusObserver(Observer observer);
    public void beritahu(String info);
}
