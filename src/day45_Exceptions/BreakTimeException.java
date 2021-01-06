package day45_Exceptions;

import java.time.LocalTime;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("Time for 15 minutes of break!");
    }

    public BreakTimeException(String msg){
        super(msg);
    }




}
