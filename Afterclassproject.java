import java.util.ArrayList;
import java.util.List;

class Digits
{
    private List<Integer> digitList;


    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();

        if (num == 0)
        {
            digitList.add(new Integer(0));
        }
        while (num > 0)
        {
            digitList.add(0, new Integer(num % 10)); 
            num /= 10;
        }
    }
}
class Afterclassproject {
    public static void main(String[] args) {
        Digits s = new Digits(3);
        System.out.println(s.Digits());
    }
}
