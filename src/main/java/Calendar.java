import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Calendar {
    private static Object Month;

    @SuppressWarnings("ControlFlowStatementWithoutBraces")
    public static void main(String[] args) {
        LocalDate lt = LocalDate.now();
        System.out.println("Today date: " + lt);
        int dayNumber;

        java.time.Month s = lt.getMonth();

        String end = "no";

            switch (lt.getMonth()) {
                case JANUARY:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in January");
                    break;
                case FEBRUARY:
                    boolean leapYear = lt.isLeapYear();
                    if (leapYear == true) {
                        dayNumber = 29;
                        System.out.println("Its Leap Year" + "Hello in TODO list in February");
                    } else {
                        dayNumber = 28;
                        System.out.println("Hello in TODO list in February");
                        break;
                    }
                case MARCH:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in March");
                    break;
                case APRIL:
                    dayNumber = 30;
                    System.out.println("Hello in TODO list in April");
                    break;
                case MAY:
                    dayNumber = 31;



                    System.out.println("Hello in TODO list in May");
                    break;
                case JUNE:
                    dayNumber = 30;
                    System.out.println("Hello in TODO list in June");
                    break;
                case JULY:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in July");
                    break;
                case AUGUST:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in August");
                    break;
                case SEPTEMBER:
                    dayNumber = 30;
                    System.out.println("Hello in TODO list in September");
                    break;
                case OCTOBER:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in October");
                    break;
                case NOVEMBER:
                    dayNumber = 30;
                    System.out.println("Hello in TODO list in November");
                    break;
                case DECEMBER:
                    dayNumber = 31;
                    System.out.println("Hello in TODO list in December");
                    break;
            }
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many tasks do you want to write?");
        int numberTasks= scanner.nextInt();

            DayOfWeek d = lt.getDayOfWeek();

            switch (lt.getDayOfWeek()) {

                case MONDAY:
                    System.out.println("Its Monday");
                    System.out.println("Write tasks for Monday");
                    break;
                case TUESDAY:
                    System.out.println("Its Tuesday");
                    System.out.println("How many tasks do you want to write");
                    break;
                case WEDNESDAY:
                    System.out.println("Its Wenesday");
                    System.out.println("Write tasks for Wednesday");
                    break;
                case THURSDAY:
                    System.out.println("Its Thursday");
                    System.out.println("Write tasks for Thursday");
                    break;
                case FRIDAY:
                    System.out.println("Its Friday");
                    System.out.println("Write tasks for Friday");
                    break;
                case SATURDAY:
                    System.out.println("Its Saturday");
                    System.out.println("Write tasks for Saturday");
                    break;
                case SUNDAY:
                    System.out.println("Its Sunday");
                    System.out.println("Write tasks for Sunday");
                    break;
            }

            for (int i=0; i<numberTasks;i++);{
            Scanner Tasks = new Scanner(System.in);

            String phrase1;
            phrase1 =Tasks.nextLine();


        }












        //   Scanner scanner = new Scanner(System.in);
        //   String week = scanner.nextLine();
        //  week.toUpperCase();


    }
}

