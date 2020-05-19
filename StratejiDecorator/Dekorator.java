public abstract class Dekorator implements IMail
{      
    private IMail mail;
    public Dekorator(IMail mail)
    {
        this.mail = mail;
    }
    public void Gonder()
    {
       
        mail.Gonder();
    }
}
