package PackageB;
import PackageA.SuperclassExample; 
public class SubClassExample extends SuperclassExample{
    public int x;
    public SubClassExample(int x){
        super(x);
        this.x*=10;
    }
    public void PrintShow()
    {
        System.out.println("SubClass variable x="+x);
    }
    

}
