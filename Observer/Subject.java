public interface Subject 
{
    public void ekle(Observer o);
    public void cikart(Observer o);
    public void bildirUpdate(Mesaj m);
}
