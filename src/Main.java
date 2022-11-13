public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int numberI = 20;
        byte numberB = 10;
        short numberS = 100;
        long numberL = 200;
        float numberF = 1.5F;
        double numberD = 43.598;
        System.out.println("Значение переменной namberI с типом int равно " + numberI);
        System.out.println("Значение переменной namberB с типом byte равно " + numberB);
        System.out.println("Значение переменной namberS с типом short равно " + numberS);
        System.out.println("Значение переменной namberL с типом long равно " + numberL);
        System.out.println("Значение переменной namberF с типом float равно " + numberF);
        System.out.println("Значение переменной namberD с типом double равно " + numberD);

        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        boolean h = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        System.out.println("Задача 3");
        byte pupilsLP = 23;
        byte pupilsAS = 27;
        byte pupilsEA = 30;
        short sheetsOfPaper = 480;
        int totalStudents = pupilsLP + pupilsAS + pupilsEA ;
        int sheetsPerStudent = sheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");

        System.out.println("Задача 4");
        byte performance = 16;
        byte time = 2;
        int performanceOneMinute = performance / time ;
        byte minute20 = 20;
        int performance20Minute = performanceOneMinute * minute20;
        byte day = 1;
        int hoursInDay = day * 24;
        int minuteInHours = hoursInDay * 60;
        int performanceOneDay = minuteInHours * performanceOneMinute;
        byte day3 = 3;
        int minuteInHours3 = day3 * minuteInHours;
        int performance3Day = minuteInHours3 * performanceOneMinute;
        byte month = 1;
        int  daysInMonth = month * 30;
        int minuteInHours30 = daysInMonth * minuteInHours;
        int performance30Day = minuteInHours30 *performanceOneMinute;
        System.out.println("За " + minute20 + " минут работы, машина произвела бутылок " + performance20Minute + " штук.");
        System.out.println("За " + day + " день работы, машина произвела бутылок " + performanceOneDay + " штук.");
        System.out.println("За " + day3 + " дня работы, машина произвела бутылок " + performance3Day + " штук.");
        System.out.println("За " + month + " месяц работы, машина произвела бутылок " + performance30Day + " штук.");



    }
}