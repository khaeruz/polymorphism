package overriding;


interface Pembicara {
    void sapa();
}

class Guru implements Pembicara {
    @Override
    public void sapa() {
        System.out.println("Guru: Selamat pagi, siswa!");
    }
}

class Siswa implements Pembicara {
    @Override
    public void sapa() {
        System.out.println("Siswa: Selamat pagi, Pak/Bu!");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Pembicara p1 = new Guru();
        Pembicara p2 = new Siswa();

        p1.sapa(); 
        p2.sapa(); 
    }
}

