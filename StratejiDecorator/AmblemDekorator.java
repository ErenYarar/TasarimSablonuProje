public class AmblemDekorator extends Dekorator
{
    private String amblem;
    public AmblemDekorator(IMail mail, String amblem) 
    {
        super(mail);
        this.amblem = amblem;
    }
    @Override
    public void Gonder()
    {
        super.Gonder();
        System.out.println(amblem + " amblemi email'e eklendi!");
    }
}
