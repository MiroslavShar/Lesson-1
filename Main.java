public class Main {
    public static void main(String[] args){

        // Примитивные типы

        byte example1 = 8;
        short example2 = 16;
        int example3 = 32;
        long example4 = 64;
        double example5 = 64;
        char example6 = 's';
        boolean example7 = true;
        // example1 = example1 * 100;
        // example2 = example2 * 1000;

        // Ссылочные типы

        Byte ex1;
        Short ex2;
        Integer ex3;
        Long ex4;
        Double ex5;
        Character ex6;
        Boolean ex7;

        // Отличия примитивных от ссылочных

        // Классы оболочки + Автоупаковка

        Byte e1 = new Byte("9");
        Short e2 = new Short("9");
        Integer e3 = new Integer("9");
        Long e4 = new Long("9");
        Double e5 = new Double(7.0);
        Character e6 = new Character('r');
        Boolean e7 = new Boolean(true);
        Float e8 = new Float("9.12");

        // Приведение типов

        byte bt = Byte.parseByte("100");
        short sh = Short.parseShort("100");
        int in = Integer.parseInt("1");
        long lg = Long.parseLong("100");
        float fl = Float.parseFloat("19.95");
        double db = Double.parseDouble("19.9876");
        char chr = e6.charValue();

        // Автораспаковка
        byte newE1 = e1;
        short newE2 = e2;
        int newE3 = e3;
        long newE4 = e4;
        float newE8 = e8;
        double newE5 = e5;
        char newE6 = e6;
        boolean newE7 = e7;

        System.out.println("Int "+ onClick(3));
        System.out.println("Long "+ night(4));
        System.out.println("Float " + raduisFloat(4));
        System.out.println("Double Radius =  "+ radius(4));

    }
    public static int onClick(int i){
        int kot = i;
        for (int b = 0; b < 20; b++){
            kot *= kot;
        }
        return (kot);
    }
    public static long night(long z){
        long sk = z;
        for (int b = 0; b < 100; b++){
            sk += sk;
        }
        return sk;
    }

    public static double radius(double x){
        double pi = 3.1416;
        double r = x;
        double res = pi * r * r;
        return res;
    }

    public static float raduisFloat(float f){
        float pi = 3.14F;
        float r = f;
        float res = pi * r * r;
        return res;
    }


}
