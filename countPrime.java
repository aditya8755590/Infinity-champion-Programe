class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1) return 0;
 // by using sleve algorithem 
        int arr[]=new int[n];
        int e=2;
        
        while(e<n){

        if(arr[e]==-1) {
            e++;
            continue;
            }

        for(int i=e+e;i<n;i+=e){
           arr[i]=-1;
        }
        e++;
        }

        int ans=0;
        for(int i=2;i<n;i++){
            if(arr[i]!=-1) ans++;
        }
        return ans;
    }
}