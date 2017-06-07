package com.citi.otc.instruction.schedules;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Dawson on 2017/6/3.
 */

@Service
public class MonetResponseHandler   {

    public void  handleResponseHeader(){
          System.out.println( "Hello citi ::"  +  new Date());
    }


}
