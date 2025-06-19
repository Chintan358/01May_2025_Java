package collections;

import java.util.HashMap;

public class C015_CharCount {
    public static void main(String[] args) {


        String str = "Hello java Hello @ Tops Tops";

        char ch[] = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<ch.length;i++)
        {
           if(map.get(ch[i])==null)
           {
               map.put(ch[i],1);
           }
           else {
               int d = map.get(ch[i]);
               d++;
               map.put(ch[i],d);

           }
        }

        System.out.println(map);

    }
}
