package Get-Me-Up;

import java.util.Calendar;



public class GetMeUpAlarm{
	
	// Constructor, called when object is first created and initialized all values.
	public GetMeUpAlarm(String AlarmTime, String AlarmOcc){
		
		//date currentDateTime = new date();
		setAlarm(getLongTime(alarmTime, AlarmOcc))
	}
	
	private GetLongTime(String AlarmTime, String AlarmOcc){
	    String str = AlarmOcc + " " + AlarmTime;
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH:mm");
	    Date date = df.parse(str);
	    long epoch = date.getTime();
	    return epoch;
	}
	
	private setAlarm(long AlarmMilli) {
		AlarmCal = Calendar.getInstance(timezone Europe/London) 
		AlarmCal.setTimeInMillis(AlarmMilli)
	}
	
	public boolean getAlarmSet() {
		return AlarmCal.isSet()
	}
}

