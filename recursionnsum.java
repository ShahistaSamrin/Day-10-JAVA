/*  55 */
class recursionnsum{
    int sum(int n)
    {
        if(n==0)return 0;
        return n+sum(n-1);
    }
    public static void main(String args[]){
        recursionnsum ob=new recursionnsum();
        int res=ob.sum(10);
        System.out.println(res);
    }
}