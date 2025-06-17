package collections;

import java.util.HashMap;

public class C014_WordCount {
    public static void main(String[] args) {


        String str = "Hello java Hello Tops Tops";

        String words[] = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++)
        {
           if(map.get(words[i])==null)
           {
               map.put(words[i],1);
           }
           else {
               int d = map.get(words[i]);
               d++;
               map.put(words[i],d);

           }
        }

        System.out.println(map);

    }
}
