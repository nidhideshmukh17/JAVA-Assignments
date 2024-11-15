public class Main {
    public static void main(String[] args) {

        /*Maths m1 = new Maths();
        Maths m2 = new Maths();
        Maths m3 = new Maths();*/

        Maths  m1 = Maths.getInstance();
        System.out.println(m1.add(100, 200));

        Maths  m2 = Maths.getInstance();
        System.out.println(m2.sub(300, 55));

        Maths  m3 = Maths.getInstance();
        System.out.println(m3.add(120, 200));

        System.out.println(m1 == m2);

    }
}
