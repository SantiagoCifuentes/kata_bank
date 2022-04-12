package VO;

import java.time.LocalDate;

public class Date
{
  private  LocalDate date;

    public static Date dateoOf(LocalDate date1){
        return  new Date(date1);
    }

    public Date(LocalDate date) {
        this.date = date;
    }
}
