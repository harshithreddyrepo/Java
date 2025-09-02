package Collections.Map.WeakHashMap.GarbageCollection;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
       Phone phone=new Phone("Apple","16 pro-max");  // Strong Reference**
        System.out.println(phone);
        WeakReference<Phone> phoneWeakReference=new WeakReference<>(new Phone("Samsung","S23 fe"));
        System.out.println(phoneWeakReference.get());
//        try {
//            Thread.sleep(100000);
//        }catch (Exception ignored){
//
//        }
        System.gc();
        System.out.println(phone);
        System.out.println(phoneWeakReference.get());

    }
}
class  Phone{
    private String brand;
    private String model;
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + "'" +
                ", model='" + model + "'" +
                '}';
    }
}
