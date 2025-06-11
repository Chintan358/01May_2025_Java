package impclasses;

public class I004_StringBuffer_Builder {

    public static void main(String[] args) {
    //sync - slow
        double startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Hello");
        for(int i=1;i<=1000000;i++)
        {
            sb.append("java");
        }
        //System.out.println(sb);
        double endTime = System.currentTimeMillis();
    //async - faster
        double startTime1 = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("Hello");
        for(int i=1;i<=1000000;i++)
        {
            sb1.append("java");
        }
       // System.out.println(sb1);
        double endTime1 = System.currentTimeMillis();
        System.out.println("time takne by buffer : "+(endTime-startTime));
        System.out.println("time takne by builder : "+(endTime1-startTime1));


    }
}
