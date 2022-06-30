import java.util.*;

public class No_2740 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		
		int[][] A= new int[N][M];

		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				A[i][j]=sc.nextInt();
			}
		}
		
		M=sc.nextInt();
		int K=sc.nextInt();
		
		int[][] B= new int[M][K];
		
		
		for(int i=0;i<M;i++) {
			for(int j=0;j<K;j++) {
				B[i][j]=sc.nextInt();
			}
		}
		
		int[][] C=new int[N][K];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				for(int z = 0; z < M; z++) {
					C[i][j]+=A[i][z] * B[z][j];
				}
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				System.out.print(C[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
