package common

import java.text.SimpleDateFormat
import java.util.Date

object DateUtils {

    def getTimeInDay(date:Date):String={

      val dateFormate = new SimpleDateFormat("yyyy-MM-dd")
      if(date!=null){
        dateFormate.format(date)
      }else{
        ""
      }


    }
}
