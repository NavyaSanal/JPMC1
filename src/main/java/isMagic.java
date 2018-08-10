import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class isMagic {
    public String checkMagic(int a,int b) {

        for (int i = 100; i < 1000; i++)
        {
            int pos = 0;
            String s = Integer.toString(i);
            Set<Character> mySet = new HashSet<Character>();
            char[] charsDigit = s.toCharArray();
            int repeted =0;

            for (int j = 0; j < charsDigit.length; j++)
            {
                pos = (pos + charsDigit[pos]) % charsDigit.length;
                if (mySet.contains(charsDigit[pos])){
                    System.out.println("Number is not magic number:" + s);
                    break;

                }else{
                    mySet.add(charsDigit[pos]);
                }

            }
            if (pos == 0 && charsDigit.length == mySet.size())
            {
                System.out.println("Number is magic number:" + s);
                //return true;
            }
            else
            {
                System.out.println("Number is not a magic number");
                //return false;
            }

        }
        return null;

    }
    public static void main(String[] args)
    {
        isMagic im = new isMagic();
        im.checkMagic(100,1000);

    }
}
