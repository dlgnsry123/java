import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timeLabel){
		this.timerLabel = timerLabel;
	}
@Override
public void run(){
	int n=0;
	while(true){
		timerLabel.setText(Interger.toString(n));
		n++;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			return;
		}
	}
}