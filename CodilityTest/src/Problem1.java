
public class Problem1 {
	public static void main(String args[]){
		int a[] = {-1,3,-4,5,1,-6,2,1};
		Solution s = new Solution();
		int result = s.solution(a);
		System.out.println("result:"+result);
	}
}
class Solution {
    public int solution(int[] A) {
        int result = -1;
        for(int i=0;i<A.length;i++){
            int p = i;
            int lowerSum = 0;
            int higherSum = 0;
            if(p > 0 && p < A.length-1){
                for(int j=0;j<p;j++){
                    lowerSum = lowerSum + A[i];
                }
                
                for(int k=p+1;k<A.length;k++){
                    higherSum = higherSum + A[k];
                }
                
                if(lowerSum == higherSum){
                    return p;
                }
            }else if (p==0){
                lowerSum = 0;
                for(int  l=1;l<A.length;l++){
                    lowerSum = lowerSum + A[l];
                }
                if(lowerSum == 0){
                    return p;
                }
            }else if (p==A.length-1){
                lowerSum = 0;
                for(int m=0;m<A.length-1;m++){
                    lowerSum = lowerSum + A[m];
                }
                if(lowerSum ==0){
                    return p;
                }
            }
        }
        return result;
    }
}
/*class Solution {
    public int solution(int[] a) {
        int equilibriumIndex=-1;
         
        for(int i=0;i<a.length;i++){
            int p = i;
            int lowerSum = 0;
            int higherSum = 0;
            System.out.println("P:"+p);
            if(p > 0 && p < a.length-1){
                
                for(int j=0;j<p;j++){
                    lowerSum = lowerSum+a[j];
                }
             
                for(int k=p+1;k<a.length;k++){
                    higherSum = higherSum+a[k];
                }
                System.out.println("lower:"+lowerSum+":higher:"+higherSum);
                if(lowerSum == higherSum){
                	return p;
                }else{
                	p = -1;
                }
            }else if(p==0) {
            	lowerSum = 0;
            	for (int l=1;l<a.length;l++){
            		lowerSum = lowerSum + a[l];
            		System.out.println("lower:"+lowerSum);
            	}
            	//System.out.println("lower:"+lowerSum);
            	if(lowerSum == 0){
            		return p;
            	}else{
            		p = -1;
            	}
                     
            }else if(p==a.length-1){
            	lowerSum = 0;
            	for(int m=0;m<a.length-1;m++){
            		lowerSum = lowerSum + a[m];
            	}
            	if(lowerSum == 0){
            		return p;
            	}else{
            		p = -1;
            	}
            }
        }
        return equilibriumIndex;
    }
}*/