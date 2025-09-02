package InnerClasses.StaticNestedClass;

public class Computer {
    private String brand;
    private String model;
     OperatingSystem os;
    private USB usb=null;
    public Computer(String brand, String model,String osName){
        this.brand=brand;
        this.model=model;
        this.os=new OperatingSystem(osName);
    }
    public void insertUSB(USB usb){
        this.usb=usb;
    }
    class OperatingSystem{
        private String osName;
        public OperatingSystem(String osName){
            this.osName=osName;
        }
        public void displayInfo(){
            System.out.println("Compter Model:"+model+",OS:"+osName);
        }
        public void playMusic(){
            if(usb!=null){
                System.out.println("Music started playing from "+usb.name);
            }else{
                System.out.println("USB not inserted 'Source not found'");
            }
        }
    }
    static class USB{
        private String type;
        private String name;

        public USB(String type,String name) {
            this.type = type;
            this.name = name;
        }

        public void displayInfo(){
            System.out.println("USB name:"+name+",USB type:"+type);
        }
    }
}
