package Assignment4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Form {
    Date signUpDate, currentDate;
    String stringStartDate, stringEndDate;
    Date startDate, endDate;

    public void rangeKyc(String inputSignUpDate, String inputCurrentDate) {
        try {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate = dateFormatter.parse(inputCurrentDate);

            if (signUpDate.after(currentDate)) {
                System.out.println("No range");
            } else {
                startDate = signUpDate;

                startDate.setYear(currentDate.getYear());

                Calendar calendar = Calendar.getInstance();

                calendar.setTime(startDate);

                calendar.add(Calendar.DATE, -30);
                startDate = calendar.getTime();

                calendar.add(Calendar.DATE, 60);
                endDate = calendar.getTime();

                if (endDate.after(currentDate)) {
                    endDate = currentDate;
                }
            }
            stringStartDate = dateFormatter.format(startDate);
            stringEndDate = dateFormatter.format(endDate);
            System.out.println(stringStartDate + " " + stringEndDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

