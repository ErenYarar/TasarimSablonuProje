public class OgrenciThree implements Observer 
{
    @Override
    public void update(Mesaj m) {
        System.out.println("Mimarlık Ögrencisi = " + " '" + m.getMesajicerik() + "' "  + " bildirimini aldı...");
    }
}
