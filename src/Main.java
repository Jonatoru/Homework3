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

        System.out.println("Задача 5");
        byte totalCans = 120;
        byte cansOfWhite1 = 2;
        byte cansOfBrown1 = 4;
        int justOneClass = cansOfWhite1 + cansOfBrown1 ;
        int totalClasses = totalCans / justOneClass;
        int cansOfWhite = cansOfWhite1 * totalClasses;
        int cansOfBrown = cansOfBrown1 * totalClasses;
        System.out.println("В школе, где " + totalClasses +" классов, нужно " + cansOfWhite +" банок белой краски и " + cansOfBrown +" банок коричневой краски.");

        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 200;
        byte iceCreamSundae = 2;
        byte rawEggs = 4;
        byte gramsBananas1 = 80;
        byte gramsMilk1 = 105;
        byte gramsIceCreamSundae1 = 100;
        byte gramsRawEggs1 = 70;
        int numberOfServingsMilk = milk / 100;
        int numberOfGramsBananas = bananas * gramsBananas1;
        int numberOfGramsMilk = numberOfServingsMilk * gramsMilk1;
        int numberOfGramsIceCreamSundae = iceCreamSundae * gramsIceCreamSundae1;
        int numberOfGramsRawEggs = rawEggs * gramsRawEggs1;
        int totalGrams = numberOfGramsBananas + numberOfGramsMilk + numberOfGramsIceCreamSundae + numberOfGramsRawEggs;
        float kilogramToGram = 1000;
        float totalKilogram = totalGrams / kilogramToGram;
        System.out.println("Общий вес продукта " + totalGrams + " грамм, либо " + totalKilogram + " килограмм.");

        System.out.println("Задача 7");
        byte needToResetKg = 7;
        short gramsPerDay1 = 250;
        short gramsPerDay2 = 500;
        short KgToGram = 1000;
        int needToResetGram = needToResetKg * KgToGram;
        int onlyDaysWillPass1 = needToResetGram / gramsPerDay1;
        int onlyDaysWillPass2 = needToResetGram / gramsPerDay2;
        System.out.println(onlyDaysWillPass1 + " дней поданобиться, чтобы сбросить " + needToResetKg + " кг, если ежедневно сбрасывать по " + gramsPerDay1 + " грамм.");
        System.out.println(onlyDaysWillPass2 + " дней понадобиться, чтобы сбросить " + needToResetKg + " кг, если ежедневно сбрасывать по " + gramsPerDay2 + " грамм.");
        int[] days = {onlyDaysWillPass1,onlyDaysWillPass2};
        int averageDays = 0;
        for (int m : days){
            averageDays +=m;
        }
            System.out.println("В среднем дней понадобиться: " + averageDays / days.length + " для того, чтобы сбросить " + needToResetKg + " кг.");

        System.out.println("Задача 8");
        int salaryMisha = 67760;
        int salaryDenis = 83690;
        int salaryKrystina = 76230;
        byte increasePercentage = 10;
        int percentageMisha10 = salaryMisha * increasePercentage / 100;
        int percentageDenis10 = salaryDenis * increasePercentage / 100;
        int percentageKrystina10 = salaryKrystina * increasePercentage / 100;
        int salaryNewMisha = salaryMisha + percentageMisha10;
        int salaryNewDenis = salaryDenis + percentageDenis10;
        int salaryNewKrystina = salaryKrystina + percentageKrystina10;
        int monthsOfTheYear = 12;
        int salaryYearMisha = salaryMisha * monthsOfTheYear;
        int salaryYearDenis = salaryDenis * monthsOfTheYear;
        int salaryYearKrystina = salaryKrystina * monthsOfTheYear;
        int salaryYearNewMisha = salaryNewMisha * monthsOfTheYear;
        int salaryYearNewDenis = salaryNewDenis * monthsOfTheYear;
        int salaryYearNewKrystina = salaryNewKrystina * monthsOfTheYear;
        int differenceSalaryYearMisha = salaryYearNewMisha - salaryYearMisha;
        int differenceSalaryYearDenis = salaryYearNewDenis - salaryYearDenis;
        int differenceSalaryYearKrystina = salaryYearNewKrystina - salaryYearKrystina;
        System.out.println("Миша теперь получает " + salaryNewMisha + " рублей в месяц. Годовой доход вырос на " + differenceSalaryYearMisha + " рублей.");
        System.out.println("Денис теперь получает " + salaryNewDenis + " рублей в месяц. Годовой доход вырос на " + differenceSalaryYearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryNewKrystina + " рублей в месяц. Годовой доход вырос на " + differenceSalaryYearKrystina + " рублей.");

    }
}