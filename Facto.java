public class Facto implements FactoInterface{
    public int facto(int n){
        int temp=1;
        if(n==0)
            return 1;
        else if(n<0)
            return -1;
        else{
            while(n!=1){
                temp*=n;
                n-=1;
        }
        return temp;
    }
}
}
