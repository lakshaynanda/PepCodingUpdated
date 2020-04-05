import java.util.*;
public class hashmap 
{
    public static void basicFunction()
    {
        HashMap<String,Integer> Coronareport=new HashMap<>();
        Coronareport.put("USA",291545);
        Coronareport.put("SPAIN",124736);
        Coronareport.put("ITALY",119872);
        Coronareport.put("INDIA",3082);
        System.out.println(Coronareport);
        if(Coronareport.containsKey("USA"))
        {
            System.out.println(Coronareport.get("USA"));
        }
        System.out.println(Coronareport.getOrDefault("USA", 100));
        System.out.println(Coronareport.keySet());
        
    }
    public static void freeMap(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            // if(!map.containsKey(ch))
            // {
            //     map.put(ch,1);
            // }
            // else{
            //     map.put(ch,map.get(ch)+1);
            // }
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        System.out.println(map);
        for(char ch:map.keySet())
        {
            System.out.println(ch+" -> "+map.get(ch));
        }
    }
    public static void freqMapofIDX(String str)
    {
        HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            map.putIfAbsent(ch, ArrayList<>());
            map.get(ch).add(i);
        }
        for(char ch: map.keySet())
        {
            System.out.println(ch+" -> "+ map.get(ch));
        }
    }
    public static void intersectionSimple(int[] one,int[] two)
    {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int ele:one)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele:two)
        {
            if(map.containsKey(ele))
            {
                System.out.print(ele+" ");
                map.remove(ele);
            }
        }

    }
    public static void intersection2(int[] one,int[] two)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:one)
        {
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        for(int ele:two)
        {
            if(map.containsKey(ele))
            {
                System.out.print(ele+" ");
                map.remove(ele);
            }
        }
    }
    public static void main(String args[])
    {
        // basicFunction();
        String str="ajvgdsvcuvkavcqyukvyccbiwd";
        freeMap(str);
    }
}