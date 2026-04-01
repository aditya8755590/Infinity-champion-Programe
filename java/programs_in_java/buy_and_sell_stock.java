public class buy_and_sell_stock {
        public static void main(String[] args) {
        int a[] ={7,3,8,2,1};
        int buy=a[0];
        int profit=0;
        for(int i=0;i<a.length;i++) {
        if(a[i]<buy) {
        buy=a[i];
        }
        else if(a[i]-profit>buy){
        profit = a[i]-buy;
        }
        }
        System.out.println(profit);
    
}
}
