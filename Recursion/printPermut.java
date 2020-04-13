import java.util.*;

public class printPermut {
    public static void pp1(String ques, String asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String left=ques.substring(0, i);
            String right=ques.substring(i+1);
            String roq=left+right;
            pp1(roq, asf+ch);
        }
    }
    public static void pp1SB(StringBuilder ques, StringBuilder asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            ques.deleteCharAt(i);
            asf.append(ch);
            pp1SB(ques, asf);
            asf.deleteCharAt(asf.length()-1);
            ques.insert(i,ch);
        }
    }
    public static void pp2(String ques, String asf)
    {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        char ch = ques.charAt(0);
        String roq=ques.substring(1);
        for (int i = 0; i <= asf.length(); i++) {
            String left=asf.substring(0, i);
            String right=asf.substring(i);
            
            pp2(roq, left+ch+right);
        }
    }
    public static void pp2SB(StringBuilder ques, StringBuilder asf) {
        if (ques.length() == 0) {
            System.out.println(asf);
            return;
        }
        char ch = ques.charAt(0);
        ques.deleteCharAt(0);
        for (int i = 0; i <= asf.length(); i++) {
            asf.insert(i, ch);
            pp2SB(ques, asf);
            asf.deleteCharAt(i);       
        }
        ques.insert(0,ch);
    }

    public static void main(String args[]) {
        pp2SB(new StringBuilder("abc"),new StringBuilder(""));
        // pp2("abc", "");
    }

}