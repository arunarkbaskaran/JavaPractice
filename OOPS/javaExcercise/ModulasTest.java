package javaExcercise;
public class ModulasTest {
    public static void main(String args[]) {
    int num = 4567;
    recursion(num);
}
public static void recursion(int temp)
{
    if(temp>10)
    {
        System.out.print(temp%10);
        temp=temp/10;
        recursion(temp);
    }
    else {
        System.out.print(temp);
    }
}
}
