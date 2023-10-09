import java.io.*;
import java.util.Arrays;
public class SumOfTriplate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();
		int sum = Integer.parseInt(br.readLine());
		int n=arr.length;
		int count=0;
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++)
					if(arr[i]+arr[j]+arr[k] == sum) {
						System.out.println(i+" "+j+" "+k+" "+" :- "+arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
						break;
						
					}
		if(count!=0)
			System.out.println("The sum of triplets : "+count);
		else
			System.out.println(-1);
		br.close();
	}

}
