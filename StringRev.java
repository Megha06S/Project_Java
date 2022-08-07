package com.programming.Jav;

public class StringRev {

    public void StrRev( String str)
    {

        String revStr="";
       int size=str.length();
        for(int i=size-1;i>=0;i--)
        {
            revStr=revStr+str.charAt(i);
        }
        System.out.println(revStr);
    }


    public static void main(String[] args) {

        StringRev s=new StringRev();
        s.StrRev("Megha");

    }

    public static class Palindrome {

        public void checkPalindrome()
        {
            int rem, sum=0, temp;
            int num=2122;
            temp=num;
            while(num>0)
            {
                rem=num%10;
                sum=(sum*10)+rem;
                num=num/10;
            }

            if(temp==sum)
                System.out.println("com.programming.Jav.StringRev.Palindrome");
            else
                System.out.println("Not palindrome");
        }

        public static void main(String []args)
        {
            Palindrome p=new Palindrome();
            p.checkPalindrome();
        }
    }
}
