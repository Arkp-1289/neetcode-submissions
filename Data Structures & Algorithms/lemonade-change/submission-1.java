class Solution {
    public boolean lemonadeChange(int[] bills) {

        int n=bills.length;
        int five=0,ten=0,twenty =0;

        for (int i=0;i<n;i++){
            if (bills[i]==20){
                if (ten<=0){
                    if (five<3){return false;}
                    five-=3;
                } else{
                    if (five<1){return false;}
                    ten--;
                    five--;
                }
                twenty++;


            } else if (bills[i]==10){
                if (five<=0){return false;}
                five--;
                ten++;
                
            } else{
                five++;
            }
        }
        return true;
        
    }
}