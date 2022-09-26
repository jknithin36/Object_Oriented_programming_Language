class Phone{
  public void call(){
    System.out.println("Phone-call");
  }
  public void sms(){
    System.out.println("Going sms");
  }
}

interface ICamera{
  void click();
  void record();
}
interface IMusicPlayer{
  void play();
  void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicPlayer{
  public void videoCall(){
    System.out.println("Videocall Connecting");
  }
  public void click(){
    System.out.println("capturing Photo");
  }
  public void record(){
    System.out.println("Recording video");
  }
  public void play(){
    System.out.println("Music Playing");
  }
  public void stop(){
    System.out.println("Music stoped");
  }
}


public class cellPhone {
  public static void main(String[]args){
    SmartPhone s = new SmartPhone();
    s.call();
    s.click();
    s.sms();
    s.record();
    s.videoCall();
    s.play();
    s.stop();
  }
}
