package overriding;

public class hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara (default)");
    }

   
    public static void infoStatik() {
        System.out.println("Info statik dari Animal");
    }

    
    public final void infoFinal() {
        System.out.println("Info final dari Animal");
    }
}

class Anjing extends hewan {
    @Override
    public void suara() {
        System.out.println("Anjing: gonggong!");
    }

   
    public static void infoStatik() {
        System.out.println("Info statik dari Anjing");
    }
}
