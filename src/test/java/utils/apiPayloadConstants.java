package utils;

public class apiPayloadConstants {
   public static String createEmployeePayload() {
       String createEmployeePayLoad = "   {\n" +
               "          \n" +
               "             \"emp_firstname\": \"John\",\n" +
               "  \"emp_lastname\": \"Cina\",\n" +
               "  \"emp_middle_name\": \"dd\",\n" +
               "  \"emp_gender\": \"F\",\n" +
               "  \"emp_birthday\": \"2021-07-16\",\n" +
               "  \"emp_status\": \"Employee\",\n" +
               "  \"emp_job_title\": \"Cloud Architect\"\n" +
               "        }";

       return createEmployeePayLoad;
   }
}
