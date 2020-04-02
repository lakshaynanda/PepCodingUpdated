import java.util.ArrayList;
public class kepad
{
    public static ArrayList<String> keypad(String ques,String[] st)
    {
        if(ques.length()==0)
        {
            ArrayList<String> baseres=new ArrayList<>();
            baseres.add("");
            return baseres;
        }
        char f = ques.charAt(0);
        int fn = f-'0';
        String roq=ques.substring(1);
        String code=st[fn];
        ArrayList<String> ans=new ArrayList<>();
        ArrayList<String> recans=keypad(roq,st);
        for(int i=0;i<code.length();i++)
        {
            for(String str:recans)
            {
                ans.add(code.charAt(i)+str);
            }
        }
        return ans;
        
    }
    public static void main(String args[])
    {
        String[] st={"?.",",;","abc","def","ghi","jkl","mno","pqrs","tuvw","xyz"};
        String ques="478";
        ArrayList<String> myans=keypad(ques,st);
        System.out.println(myans);
        
    }
}