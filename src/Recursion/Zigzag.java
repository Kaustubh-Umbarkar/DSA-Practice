package Recursion;

public class Zigzag {
    public static void main(String[] args) {
zig(2);
    }
    public static void zig(int n)
    {
        if(n==0)
            return;
        System.out.println("Pre"+n);
        zig(n-1);
        System.out.println("In"+n);
        zig(n-1);
        System.out.println("Post"+n);
    }
}
