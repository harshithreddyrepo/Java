package InnerClasses.StaticNestedClass;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer("ASUS","notebook 14","windows 11");
        computer.os.displayInfo();
        computer.os.playMusic();
        Computer.USB usb1=new Computer.USB("type c","USB1");
        computer.insertUSB(usb1);
        computer.os.playMusic();
        Computer.USB usb2=new Computer.USB("type b","USB2");
        computer.insertUSB(usb2);
        computer.os.playMusic();
    }
}
