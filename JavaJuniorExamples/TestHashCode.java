public class TestHashCode{
        public static void main(String[] args) {
        String s1 = new String("testString");
        String s2 = new String("testString");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        }
 
    }