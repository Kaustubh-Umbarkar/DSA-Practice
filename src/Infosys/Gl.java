package Infosys;

public class Gl {
    public static void main(String[] args) {
        int total=7;
        int se=3;
       int i=1;
       int n=1;
       int de=1;
        while(i<=se)
        {
            n=n*total;
            de=de*i;
            i=i+1;
            total=total-1;
        }
        int c=n/de;
        System.out.println(c);
    }
}
