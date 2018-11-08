import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<String>();
        Circle circleObject = new Circle();
        Date dateObject = new Date();
        Loan loanObject = new Loan();
        alist.add(String.valueOf(circleObject));
        alist.add(String.valueOf(dateObject));
        alist.add(String.valueOf(loanObject));

        for(int i=0;i<alist.size();i++)
        {
            System.out.println(alist.toString());
        }



    }




}
