public class Main 
{
    public static void main(String[] args) 
    {
        //Strategy Tasarim Şablonu
        Context context=new Context();
        context.setIletisim(new Email());
        context.bilgiGonder();
        context.setIletisim(new Sms());
        context.bilgiGonder();
        
        System.out.println("*************************");
        
        //Observer Tasarim Şablonu
        OgrenciOne o1 = new OgrenciOne();
        OgrenciTwo o2 = new OgrenciTwo();
        OgrenciThree o3 = new OgrenciThree();

        MesajYayan my = new MesajYayan();
         
        my.ekle(o1);
        my.ekle(o2);
        my.bildirUpdate(new Mesaj("1.Mesaj: ilk dersiniz pusulaya yüklenmiştir."));   
        
        System.out.println("*************************");
        
        //Decorator Tasarim Şablonu
        String kimden = "Öğretmen";
        String kime = "Öğrenci";
        IMail standartMail = new Mailsms(kimden, kime);
        IMail amblemliMail = new AmblemDekorator(standartMail, " 'Beykent Üniversitesi' ");
        amblemliMail.Gonder();
        
        
        System.out.println("*************************");
        
        my.cikart(o1);
        my.ekle(o3);
        my.bildirUpdate(new Mesaj("2.Mesaj: ikinci dersiniz pusulaya yüklenmiştir.")); 
        
    }
}
