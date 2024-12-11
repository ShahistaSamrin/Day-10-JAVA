/*  Hello Shahista 345  */
class constructor{
    int c;
    String b;
    constructor()
    {
        this.c=345;
        this.b="Hello Shahista";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
class Main{
    public static void main(String args[]){
        constructor s=new constructor();
        s.display();
    }
}