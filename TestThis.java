package com.programming.Jav;

public class TestThis {
    public static void main(String[] args) {
        ThisKW t=new ThisKW(10,"Megha",500f);
        ThisKW t1=new ThisKW(10,"Megha",500f);
        t.display();t1.display();

        ThisUse tu=new ThisUse(10,"Megha",500f);
        ThisUse tu1=new ThisUse(11,"Singh",1000f);
        tu.display();
        tu1.display();
        tu.n();
    }
}
