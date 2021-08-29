import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.sql.*;
import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;


public class Calendar {
    private static Object Month;
    private static String day;
    private static JavaIOFileDescriptorAccess list;

    @SuppressWarnings("ControlFlowStatementWithoutBraces")
    public static <query> void main(String[] args) throws SQLException {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many tasks do you want to write?");
        int numberTasks = scanner.nextInt();

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
                System.out.println("Write hour with  tasks for Sunday");
                break;
        }

        Scanner Tasks = null;
        String query = "";
        Map<Integer, String> tasks = new HashMap<>();
        for (int i = numberTasks - 1; i >= 0; i--) {
            Tasks = new Scanner(System.in);
            Integer a = i;
            String phrase1;
            phrase1 = Tasks.nextLine();

            tasks.put(a, phrase1);

        }

        for (Map.Entry<Integer, String> m : tasks.entrySet()) {
            String s1 = m.getValue();
            System.out.println(s1);
            String[] share = m.getValue().split(","); // dzieli wyrażenie
            // usuwa spacje


            query = "INSERT INTO tasks (date,time,name) VALUES ( ?,?,?)";


            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDoList", "postgres", "Marty.950");

                 PreparedStatement preparedStatement = conn.prepareStatement(query)) {

                preparedStatement.setDate(1, (Date.valueOf(LocalDate.now())));
                preparedStatement.setTime(2, (Time.valueOf(share[0].replaceAll(" ", ""))));
                preparedStatement.setString(3, share[1]);

                int row = preparedStatement.executeUpdate();

                System.out.println(row);

            }
            final String SQL_SELECT = "SELECT  time, name, status, date  FROM tasks WHERE date = CURRENT_DATE  ";

            try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ToDoList", "postgres", "Marty.950");

                 PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {



                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                    Time time = resultSet.getTime("time");
                    String name = resultSet.getString("name");
                    String status = resultSet.getString("status");



                    List<String> obj = new ArrayList<String>(Arrays.<String>asList(String.valueOf(time), name, status));

                    System.out.println(obj);


                }

            }


        }


    }


    //   Scanner scanner = new Scanner(System.in);
    //   String week = scanner.nextLine();
    //  week.toUpperCase();


}


