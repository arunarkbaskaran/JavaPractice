package Interview;

public class PassingCars {

	public static void main(String[] args) {
		

	}
	public static int solution(int[] A) {
        int[] arr = {0, 1, 0, 1, 1};
        int count=0;
        int lastFoundZero=0;
        int lastFoundOne=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==0)
            {
            	lastFoundZero=i;
                for(int j=i+1;j<A.length;j++)
                {
                    if(A[j]==1)
                    {
                        count++;
                    }
                }
            }
            else{
            	lastFoundOne++;
            }
        }
        System.out.println("Count : "+count);
        return count;
    }

}
