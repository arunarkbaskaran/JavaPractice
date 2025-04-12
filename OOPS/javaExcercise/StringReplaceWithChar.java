package javaExcercise;
public class StringReplaceWithChar {
    public static void main(String args[])
    {
        String n="Java Application";
        String outputString="";
        int count=0;
        for(int i=0;i<n.length();i++)
        {
            String temp=String.valueOf(n.charAt(i));
            if(temp.equalsIgnoreCase("a"))
            {
                count=count+1;
                for(int j=1;j<=count;j++)
                {outputString=outputString+"@";
                }
            }
            else
            {
            outputString=outputString+temp;
             }
        }
        System.out.println("Output : "+outputString);
    }
}
