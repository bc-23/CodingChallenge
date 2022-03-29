 public class Locker {
 public static void main(String[] args) {
  boolean[] locker = new boolean[101];
    for(int i = 1; i <locker.length; i++){
   for(int j = i; j < locker.length; j+=i){
    if (locker[j] == false){
     locker[j] = true;
    }else
    {
     locker[j] = false;
    }
   }
  }
  for(int i = 0; i <= locker.length; i++){
   System.out.println(locker[i] + " " + i);
  }
 }
}
 
