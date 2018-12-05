 public class EqualsTest{
        public static void main(String[] args) {
            Object o1 = new Object();
            Object o2 = new Object();
            System.out.println(o1.equals(o2));
            o2=o1;
            System.out.println(o1.equals(o2));
            String s1 = new String("TestString");
            String s2 = new String("TestString");
            System.out.println(s1==s2);
            System.out.println(s1.equals(s2));
        }
    }

