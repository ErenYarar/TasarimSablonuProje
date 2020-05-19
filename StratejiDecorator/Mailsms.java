public class Mailsms implements IMail
{
    private String kimden;
    private String kime;
    public Mailsms(String kimden,String kime)
    {
        this.kimden = kimden;
        this.kime = kime;
    }
    public void Gonder()
    {
        System.out.println("Mail ve Sms " + kimden + " kişisinden " + kime + " kişine gidiyor.");
    }
}
