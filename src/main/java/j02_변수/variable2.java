package j02_변수;

public class variable2 {
    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리자료형: " + checkFlag);
        checkFlag = true;
        System.out.println("논리자료형: " + checkFlag);

        char name1 = '권';
        char name2 = '용';
        System.out.println("" + name1 + name2);
        System.out.println(Integer.toHexString(name1));

        int width = 100;
        int width2 = 200;

        System.out.println(width + width2);

        String width3 = "100";
        String width4 = "200";

        System.out.println(width3 + width4);

        double dnum = 3.4;
        double dnum2 = 4.5;

        System.out.println(dnum + dnum2);

        System.out.println("-------형변환---------");

        //업캐스팅
        //문자 - 정수 - 실수
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(((int)c1) + 10);
        int n1 = (int) c1;
        System.out.println(n1);
        double d1 = (double) n1;
        System.out.println(d1);


        //다운캐스팅
        //실수 - 정수 - 문자

        int n2 = (int) d1;
        System.out.println(n2);

        char c2 = (char) n2;
        System.out.println(c2);






    }
}
