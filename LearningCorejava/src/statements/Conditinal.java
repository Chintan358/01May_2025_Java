package statements;

public class Conditinal {

    public static void main(String[] args) {

//        int age = 10;
//        if(age<18)
//        {
//            System.out.println("You are not elegeble for voting");
//        }
//        else {
//            System.out.println("You are elegeble for voting");
//        }

        int a = 1000;
        int b = 200;
        int c = 30;

        if(a>b) {
            if(a>c)
            {
                System.out.println("A is greater");
            }
            else
            {
                System.out.println("C is greater");
            }
        }
        else {
            if(b>c)
            {
                System.out.println("B is greater");
            }
            else {
                System.out.println("C is greater");
            }
        }


        //grade
        //total marks :
        //91 - 100 : A
        //71 - 90 : B
        //51 - 70 : C
        // 35- 50 : D
        //0 -35 : F
        //invalid marks

    }


}
