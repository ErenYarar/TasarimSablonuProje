public class OgrenciOne implements Observer 
{
    @Override
    public void update(Mesaj m) {
        System.out.println("Yazılım Ogrencisi = " + " '" + m.getMesajicerik() + "' "  + " bildirimini aldı...");
    }
}
