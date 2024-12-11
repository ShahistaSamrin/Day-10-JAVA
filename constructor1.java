/*  shahi 564  */
class constructor1{
    int c;
    String b;
    constructor1(int c,String b)
    {
        this.c=c;
        this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
class Main{
    public static void main(String args[]){
        constructor1 s=new constructor1(564,"shahi");
        s.display();
    }
}