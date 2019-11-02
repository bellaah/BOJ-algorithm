import java.util.Arrays;
import java.util.Scanner;

/*
 * https://www.acmicpc.net/problem/2309
 */
public class boj_2309_1006 {
	static int totalDwarfNum = 9,realDwarfNum = 7, totalWeight = 100;
	static boolean isFirst = true;
	static int[] dwarf = new int[totalDwarfNum];
	static int[] combinationTemp =  new int[realDwarfNum];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] CombinationArray = new int[totalDwarfNum];
		
		for(int i=0; i<totalDwarfNum; i++) {
			dwarf[i] = sc.nextInt();
		}
		
		combination(CombinationArray, totalDwarfNum, realDwarfNum, 0, 0);
	}
	
	public static void combination(int[] combArr, int n, int r, int index, int target){   
		if(!isFirst) {
			return;
		}
        if(r == 0){
        	int sum = 0;
        	
            for(int i=0; i<index; i++){
            	combinationTemp[i] = dwarf[combArr[i]];
            	sum += combinationTemp[i];
            }
            
            if(sum == totalWeight) {
            	Arrays.sort(combinationTemp);
            
            	for(int i=0; i<index; i++){
            		System.out.println(combinationTemp[i]);
                }
            	isFirst = false;
            }
        }else if(target == n){ 
            return;
        }else{
            combArr[index] = target;
            combination(combArr, n, r-1, index+1, target+1);
            combination(combArr, n, r, index, target+1); 
        }
    }
}
