class Solution {
    public boolean checkDivisibility(int n) {
    int sum=0;
    int prod=1;
    int res=0;
    int temp=n;
     while(n>0){
        int m=n%10;
        sum+=m;
        prod*=m;
        n/=10;
     }
     res=sum+prod;
     if(temp%res==0)
        return true;
     else
        return false;   

    }
}