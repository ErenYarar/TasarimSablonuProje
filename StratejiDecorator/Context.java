public class Context 
{
    private Iletisim iletisim;
   
    public void setIletisim(Iletisim iletisim) 
    {
        this.iletisim = iletisim;
    }
    public void bilgiGonder()
    {
        iletisim.Gonder();
    }
}
