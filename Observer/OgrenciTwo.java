public class OgrenciTwo implements Observer 
{
    @Override
    public void update(Mesaj m) {
        System.out.println("İnşaat Ogrencisi = " + " '" + m.getMesajicerik() + "' "  + " bildirimini aldı...");
    }
}
