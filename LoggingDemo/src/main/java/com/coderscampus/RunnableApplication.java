package com.coderscampus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableApplication
{
  static Logger log = LoggerFactory.getLogger(RunnableApplication.class);
  
  public static void main (String[] args)
  {
    /*log.trace("trace level message"); // level 1 (least important/impactful)
    log.debug("debug level message"); // level 2
    log.info("info level message"); // level 3
    log.warn("warn level message"); // level 4 
    log.error("error level message"); // level 5 (most important/impactful)*/
    
    log.trace("about to initialize x");
    int x = 1;
    log.trace("x has been initialized");
    log.debug("x = " + x);
    
    for (int i = 0; i < 10 ; i++)
    {
      log.trace("i = " + i);
      x += x;
      log.debug("x = " + x);
      
      if (x > 1000)
      {
        log.error("x is too big it's set to: " + x);
      }
      else if (x > 100)
      {
        log.warn("x is getting too big it's set to: " + x);
      }
    }
    
    log.info("Final value of x is: " + x);
    
  }
}
