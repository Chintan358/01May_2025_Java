package impclasses;

public class I003_StringPractical {
    public static void main(String[] args) {

<<<<<<< HEAD
        String str = "sun rises in east gfg";
=======
        String str = "sun rises in east";
>>>>>>> 7903638b9c755a8784da33ced387e7493e7106a7

        //east in rises sun
        //tsae ni sesir nus
        //nus sesir ni tsae
        //east rises in sun


<<<<<<< HEAD
        String words[] = str.split(" ");

        for(int i=words.length-1;i>=0;i--)
        {
            System.out.print(words[i]+" ");
        }

        System.out.println();

        char ch[] = str.toCharArray();

        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }

        System.out.println();

        for(int i=0;i<words.length;i++)
        {
            char c[]= words[i].toCharArray();
            for(int j=c.length-1;j>=0;j--)
            {
                System.out.print(c[j]);
            }
            System.out.print(" ");
        }

        System.out.println();

        String temp = words[0];
        words[0] = words[words.length-1];
        words[words.length-1] = temp;

        for(int i=0;i<words.length;i++)
        {
            System.out.print(words[i]+" ");
        }

        System.out.println();

        for(int i=0;i<words.length;i++)
        {
            System.out.println(words[i]+" : "+words[i].length());
        }

=======
>>>>>>> 7903638b9c755a8784da33ced387e7493e7106a7

    }
}
