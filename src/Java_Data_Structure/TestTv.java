package Java_Data_Structure;

public class TestTv {
   public  static  void main(String[] args){
       TV tv1 = new TV();
       tv1.turnOn();
       tv1.setChannel(30);
       tv1.setVolumeLevel(3);

       // Tv2
       TV tv2 = new TV();
       tv2.turnOn();
       tv2.channelUp();
       tv2.channelUp();
       tv2.volumeUp();

       System.out.println("Tv's channel is " + tv1.channel + " volume level is "+ tv1.volumeLevel);
       System.out.println("Tv's channel is " + tv2.channel + " volume level is "+ tv2.volumeLevel);


   }
}
