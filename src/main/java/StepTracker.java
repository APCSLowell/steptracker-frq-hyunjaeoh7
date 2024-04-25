import java.util.ArrayList;
public class StepTracker
{
 int act, actdy;
 ArrayList <Integer> days;
 public StepTracker(int active){
  act = active;
  actdy = 0;
  days = new ArrayList <Integer>();
 }
 
 public int activeDays(){
  return actdy;
 }

 public double averageSteps(){
  double avg = 0.0;
  if(days.size() == 0){
   return avg;
  }
  for(int i = 0; i < days.size(); i++){
   avg += days.get(i);
  }
  return avg / (double)days.size();
 }

 public void addDailySteps(int steps){
  days.add(steps);
  if(steps >= act){
   actdy++;
  }
 }
} 
