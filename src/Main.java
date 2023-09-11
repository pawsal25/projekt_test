public class Main {
    public static void main(String[] args) {

//
//        System.out.print("Nasza Lekcja");
//        System.out.println("Hej!");

        //liczby

        int i = 9;
        Integer integer = 9;

        Long l = 9L;
        long l2 = 9L;

        double d = 2.6;
        Double d2 = 2.3;

        //True False

        boolean b = true;
        Boolean b2 = true;

        //

        String s = "To Jest Tekst. ";
        String s2 = " a to jest drugi tekst. ";
//
//        System.out.print(s);
//        System.out.println(s2);

//        int a = i + integer;
//        System.out.print(i + "+" + integer + "=" + a)
//
//        double dwynik = d - d2;
//        System.out.print(d + "-" + d2 + "=" + dwynik);

//        double potega = Math.pow(d, 2);
//        potega = Math.round(potega * 100.0) / 100.0;
//        System.out.print(d + " ^ 2 = " + potega);

//        System.out.println(s.toUpperCase());
//        System.out.println(s.toLowerCase());

        String non = "";
        String non1 = "tekst non1";
        String non2 = null;

//        System.out.println(non.isEmpty());
//        System.out.println(non1.isEmpty());
//        System.out.println(non2.isEmpty());

//        if (non != null) {
//            System.out.println("Nie jest Nullem");
//        } else {
//            System.out.println("Jest Nullem");
//        }
//
//        if (non2 != null) {
//            System.out.println("Nie jest Nullem");
//        } else {
//            System.out.println("Jest Nullem");
//        }
        if (non != null && !non.isEmpty()) {
            System.out.println(non.toUpperCase());
        } else if (non == null){
            System.out.println("Jest Nullem");
        } else {
            System.out.println("Jest Puste");
        }


        if (non1 != null && !non1.isEmpty()) {
            System.out.println(non1.toUpperCase());
        } else if (non1 == null){
            System.out.println("Jest Nullem");
        } else {
            System.out.println("Jest Puste");
        }


        if (non2 != null && !non2.isEmpty()) {
            System.out.println(non2.toUpperCase());
        } else if (non2 == null){
            System.out.println("Jest Nullem");
        } else {
            System.out.println("Jest Puste");
        }
    }
}