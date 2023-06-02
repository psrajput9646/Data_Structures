package com.ArraysFiles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateLogic {
    public static void main(String[] args) throws ParseException {
        //2023-06-02T02:46:26.824Z
        String localtoutc = getLocalToUTCDate(new Date());
        System.out.println(localtoutc);


        ArrayList<String> dateutc=new ArrayList<>();
        addedActivityCompletionDate(dateutc);


        Date date = getUTCToLocalDate(dateutc.get(0));
        Date date1 = getUTCToLocalDate(dateutc.get(1));

        System.out.println("date : "+date);

        long n=getDifferenceDays(date,date1);
        System.out.println(n);

       boolean status= getActivityValidation(dateutc);
        System.out.println(status);

        Date d1=getDatevalue("2023-06-01T11:52:51.370Z");
        Date d2=getDatevalue("2023-06-02T02:46:26.824Z");

        long n1=getDifferenceDays(d1,d2);
        System.out.println(n1);
    }


    private static boolean getActivityValidation(ArrayList<String> dateutc) {
        int n=6;
        String endDate="2023-05-31T20:35:20.316Z";
        for (int i = 0; i < dateutc.size(); i++) {
          Date d1=getUTCToLocalDate(dateutc.get(i));
            Date d2=getUTCToLocalDate(endDate);
            if (getDifferenceDays(d1,d2)<6){
              return true;
            }
        }
        return false;
    }

    private static void addedActivityCompletionDate(ArrayList<String> dateutc) {
        dateutc.add("2023-05-20T20:35:20.316Z");
        dateutc.add("2023-05-21T21:35:19.316Z");
        dateutc.add("2023-05-31T20:35:20.316Z");

    }

    public static long getDifferenceDays(Date d1, Date d2) {
        long diff = d2.getTime() - d1.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public static Date getUTCToLocalDate(String date) {
        Date inputDate = new Date();
        if (date != null && !date.isEmpty()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            try {
                inputDate = simpleDateFormat.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            String datelocal=simpleDateFormat1.format(inputDate);
           // System.out.println("datelocal : "+datelocal);
        }
        return inputDate;
    }

    //convert Local Date to UTC
    public static String getLocalToUTCDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date time = calendar.getTime();
        SimpleDateFormat outputFmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
      //  outputFmt.setTimeZone(TimeZone.getTimeZone("UTC")); //2023-06-01T20:19:44.500Z
        //2023-06-02T01:52:00.545Z
        return outputFmt.format(time);
    }

    public static Date getDatevalue(String b) throws ParseException {
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        Date datelocal=simpleDateFormat1.parse(b);
        return  datelocal;
    }
}
