public class CodingExercises1 {
    public static void main(String args[]) {
        /*
        This section will contain a few different coding exercise of the course that I am following. Here we
        can test our different methods.
         */
    }
    // This will contain all the methods required for all the coding exercises


//    // 1.Speed Converter
//    public static long toMilesPerHour(double kilometresPerHour){
//        if (kilometresPerHour<0){
//            return -1; // This indicates invalid value.
//        }else {
//            double milesPerHour = kilometresPerHour/1.609 ;
//            return Math.round(milesPerHour);
//        }
//    }
//
//    public static void printConversion(double kilometresPerHour){
//        if (kilometresPerHour<0){
//            System.out.println("Invalid Value");
//        }else{
//            long milesPerHour = toMilesPerHour(kilometresPerHour);
//            System.out.println(kilometresPerHour+" km/h = "+milesPerHour+" mi/h");
//        }
//    }


    // 2.MegaBytes Converter


//    // 3.Barking Dog
//    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//        if (barking) {
//            if ((hourOfDay < 0) || (hourOfDay > 23)) {
//                return false;
//            } else if ((hourOfDay < 8) || (hourOfDay > 22)) {
//                return true;
//            }
//        }
//        return false;
//    }


//    // 4.Leap Year Calculator
//    public static boolean isLeapYear(int year){
//        if ((year<1) || (year>9999)){
//            return false;
//        }else {
//            if (year%4==0){
//                if (year%100==0){
//                    if (year%400==0){
//                        return true;
//                    }
//                }else {
//                    return true;
//                }
//            }else{
//                return false;
//            }
//        }
//        return false;
//    }


//    // 5. Decimal Comparator
//    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
//        int x1 = (int)(x*1000);
//        int y1 = (int)(y*1000);
//        if (x1==y1){
//            return true;
//        }
//        return false;
//    }


    // 6.Equal Sum Checker


    // 7.Has Teen Value


    // 8. Area Calculator


//    // 9. Minutes to Years and Days Calculator
//    public static void printYearsAndDays(long minutes){
//        if (minutes<0){
//            System.out.println("Invalid Value");
//        }else{
//            long minutesDays = ((minutes/60)/24);
//            long years = minutesDays/365L;
//            long days = minutesDays%365L;
//            System.out.println(minutes+" min = "+years+" y and "+days+" d");
//        }
//
//    }


    // 10.Equality Printer


//    // 11. Playing Cat
//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if (summer) {
//            if ((25 <= temperature) && (temperature <= 45)) {
//                return true;
//            }
//        } else {
//            if ((25 <= temperature) && (temperature <= 35)) {
//                return true;
//            }
//        }
//        return false;
//    }


}