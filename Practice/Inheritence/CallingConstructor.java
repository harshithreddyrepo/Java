package Practice.Inheritence;

class NageshwarRao{
    NageshwarRao() {
        System.out.println("Nagarjunaaaaa");
    }
}
class Nagarjuna extends NageshwarRao{
    Nagarjuna(){
        System.out.println("Nana garu");
    }
}
class NagaChaitanya extends Nagarjuna{
    NagaChaitanya(){
        System.out.println("Hmmmmmmm");
    }
}
public class CallingConstructor {
    public static void main(String[] args) {
        NagaChaitanya obj = new NagaChaitanya();
    }
}

//Conclusion:Whenever we create an object of the subclass, all the superclasses should be constructed.Such that all
// the constructors are called in the sequence.
