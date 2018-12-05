package com.company;

public class Main {

    public static void main(String[] args) {

        Method test = new MethodCall();
        System.out.println(test.Meth());
        System.out.println(test.Meth());

        Method test2 = new MethodCall();
        System.out.println(test2.Meth());
        System.out.println(MethodCall.count);

        /* Array a = new MyArray();
        System.out.println(a.Add(3));
        System.out.println(a.Add(23));
        System.out.println(a.Add(34));
        System.out.println(a.Add(7));
        System.out.println(a.Add(8));
        System.out.println(a.Get(3));*/

        /*System.out.println("");
	    Array b = new Array_1();
        System.out.println(b.Add(3));
        System.out.println(b.Add(23));
        System.out.println(b.Add(34));
        System.out.println(b.Add(7));
        //System.out.println(b.Add(8));
        System.out.println(b.Get(2));*/
    }
}
