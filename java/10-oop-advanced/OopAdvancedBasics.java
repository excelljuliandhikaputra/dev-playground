/*
 * Topic 10 - OOP Advanced
 * Topik 10 - OOP Lanjutan
 * =========================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Encapsulation: private fields          | Enkapsulasi: field private
 *     2. Getters and setters with validation    | Getter dan setter dengan validasi
 *     3. static fields and methods              | Field dan method static
 *     4. Inheritance: extends and super(...)    | Pewarisan: extends dan super(...)
 *     5. @Override (and the secret of toString) | @Override (dan rahasia toString)
 *     6. Polymorphism: parent type, child object| Polimorfisme: tipe induk, object anak
 *     7. Abstract class                         | Abstract class
 *     8. Interface (intro)                      | Interface (pengenalan)
 *     9. Python vs Java class syntax            | Sintaks class Python vs Java
 *
 * Run this file / Jalankan file ini:
 *     java OopAdvancedBasics.java
 *
 * EN: Like Topic 09, every class lives INSIDE the main class as
 *     `static class ...`, below main(). One exception: SecureStudentCard
 *     (section 1) is written OUTSIDE, at the very bottom. Section 1 says why.
 * ID: Seperti Topik 09, setiap class tinggal DI DALAM class utama sebagai
 *     `static class ...`, di bawah main(). Satu pengecualian: SecureStudentCard
 *     (bagian 1) ditulis DI LUAR, paling bawah. Bagian 1 menjelaskan alasannya.
 */
public class OopAdvancedBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. Encapsulation: private fields
        // EN: In Topic 09 anyone could write  account.balance = -999999;
        //     Encapsulation means: hide the fields (private) and let other
        //     code reach them ONLY through methods that you control.
        //       private     -> only code INSIDE this class can use it
        //       public      -> any code can use it
        //       (no keyword)-> code in the same folder/package (Topic 09 style)
        //     (Java also has `protected`; you'll meet it later.)
        // ID: Di Topik 09 siapa pun bisa menulis  account.balance = -999999;
        //     Enkapsulasi artinya: sembunyikan field (private) dan biarkan kode
        //     lain mengaksesnya HANYA lewat method yang kamu kendalikan.
        //       private        -> hanya kode DI DALAM class ini yang bisa memakai
        //       public         -> semua kode bisa memakai
        //       (tanpa keyword)-> kode di folder/package yang sama (gaya Topik 09)
        //     (Java juga punya `protected`; nanti kamu akan bertemu dengannya.)
        // -------------------------------------------------------------------
        SecureStudentCard card = new SecureStudentCard("Excell", "434251001", 3.6);
        System.out.println(card.getName());       // Excell
        System.out.println(card.getGpa());        // 3.6

        // card.gpa = 9.9;                -> ERROR: gpa has private access in SecureStudentCard
        // System.out.println(card.name); -> ERROR: name has private access in SecureStudentCard
        //                                   (field private tidak bisa diakses dari luar class)
        //
        // NOTE / CATATAN:
        // EN: SecureStudentCard is written OUTSIDE the main class (bottom of
        //     the file) on purpose. Java lets an outer class read the private
        //     fields of classes nested inside it, so with a nested class the
        //     two ERROR lines above would NOT be errors. In real projects every
        //     class has its own file, and then private always blocks access.
        // ID: SecureStudentCard sengaja ditulis DI LUAR class utama (paling
        //     bawah file). Java mengizinkan class luar membaca field private
        //     milik class yang ada di dalamnya, jadi kalau class-nya di dalam,
        //     dua baris ERROR di atas TIDAK akan error. Di proyek sungguhan
        //     setiap class punya file sendiri, dan private selalu memblokir akses.


        // -------------------------------------------------------------------
        // 2. Getters and setters with validation
        // EN: getX() READS a private field, setX(value) CHANGES it.
        //     The setter is the "security guard": it checks the value first
        //     and refuses bad data. A boolean getter is usually named isX().
        //     No setter at all = read-only from outside (like studentId).
        //     Tip: the constructor can call the setter, so the same check runs
        //     when the object is created.
        // ID: getX() MEMBACA field private, setX(nilai) MENGUBAHNYA.
        //     Setter adalah "satpam": mengecek nilainya dulu dan menolak data
        //     yang salah. Getter boolean biasanya diberi nama isX().
        //     Tanpa setter = hanya bisa dibaca dari luar (seperti studentId).
        //     Tips: constructor boleh memanggil setter, supaya pengecekan yang
        //     sama juga berjalan saat object dibuat.
        // -------------------------------------------------------------------
        card.setGpa(3.75);
        System.out.println(card.getGpa());          // 3.75

        card.setGpa(9.9);                           // Invalid GPA 9.9, must be 0.0 - 4.0. Ignored.
        System.out.println(card.getGpa());          // 3.75 (unchanged / tidak berubah)
        System.out.println(card.isHonorStudent());  // true

        card.setName("   ");                        // Name can't be blank. Ignored.
        System.out.println(card.getName());         // Excell
        System.out.println(card.getStudentId());    // 434251001
        // card.setStudentId("999");   -> ERROR: there is no such method (read-only)
        //                                tidak ada method itu (hanya bisa dibaca)

        SecureStudentCard newcomer = new SecureStudentCard("Budi", "434251002", 4.5);
        // Invalid GPA 4.5, must be 0.0 - 4.0. Ignored.   (printed by the constructor / dicetak oleh constructor)
        System.out.println(newcomer.getGpa());      // 0.0


        // -------------------------------------------------------------------
        // 3. static fields and methods
        // EN: A normal field belongs to EACH object (every visitor has a name).
        //     A `static` field belongs to the CLASS: there is ONE copy shared
        //     by all objects (one total counter for all visitors).
        //     A static method is called on the class name, no object needed.
        //     You already used static members: Math.sqrt(), Math.PI,
        //     Integer.parseInt(), and `public static void main`.
        //     `static final` = a shared constant.
        // ID: Field biasa dimiliki SETIAP object (setiap pengunjung punya nama).
        //     Field `static` dimiliki CLASS: hanya ada SATU salinan yang dipakai
        //     bersama semua object (satu penghitung total untuk semua pengunjung).
        //     Method static dipanggil lewat nama class, tanpa perlu object.
        //     Kamu sudah pernah memakai anggota static: Math.sqrt(), Math.PI,
        //     Integer.parseInt(), dan `public static void main`.
        //     `static final` = konstanta milik bersama.
        // -------------------------------------------------------------------
        System.out.println(CampusVisitor.getTotalVisitors());  // 0 (no object yet / belum ada object)
        CampusVisitor visitorAna = new CampusVisitor("Ana");
        CampusVisitor visitorBudi = new CampusVisitor("Budi");
        CampusVisitor visitorCitra = new CampusVisitor("Citra");
        System.out.println(CampusVisitor.getTotalVisitors());  // 3
        System.out.println(visitorBudi.getGreeting());         // Welcome to UNAIR, Budi!
        System.out.println(visitorCitra.getGreeting());        // Welcome to UNAIR, Citra!
        System.out.println(CampusVisitor.CAMPUS);               // UNAIR
        System.out.println(Math.PI);                            // 3.141592653589793

        // EN: Inside a static method there is no `this` (no object), so it
        //     can't use normal fields like name:
        // ID: Di dalam method static tidak ada `this` (tidak ada object), jadi
        //     tidak bisa memakai field biasa seperti name:
        //     static int getTotalVisitors() { return name.length(); }
        //         -> ERROR: non-static variable name cannot be referenced from a static context
        //
        // EN: Now you know the `static` in `static class CampusVisitor`: the
        //     nested class belongs to the main CLASS itself, so the static
        //     main() can use it without creating a main-class object first.
        // ID: Sekarang kamu tahu arti `static` di `static class CampusVisitor`:
        //     class di dalam itu milik CLASS utama, jadi main() yang static bisa
        //     memakainya tanpa membuat object class utama terlebih dulu.


        // -------------------------------------------------------------------
        // 4. Inheritance: extends and super(...)
        // EN: `class Car extends Vehicle` means a Car IS A Vehicle. Car gets
        //     every public method of Vehicle for free and can add its own.
        //     The child's constructor calls the parent's constructor with
        //     super(...), and it must be the FIRST line.
        //     Private fields of the parent are still private: the child uses
        //     the parent's getters (getPlateNumber()) to read them.
        // ID: `class Car extends Vehicle` artinya Car ADALAH Vehicle. Car
        //     mendapat semua method public milik Vehicle secara gratis dan
        //     boleh menambah method sendiri.
        //     Constructor anak memanggil constructor induk dengan super(...),
        //     dan harus ditulis di baris PERTAMA.
        //     Field private milik induk tetap private: anak memakai getter
        //     induk (getPlateNumber()) untuk membacanya.
        // -------------------------------------------------------------------
        Motorcycle scooter = new Motorcycle("L 4321 CD");
        Car familyCar = new Car("L 1234 AB", 7);
        Vehicle tricycle = new Vehicle("L 5555 XY", 3);

        System.out.println(scooter.getPlateNumber());   // L 4321 CD  (inherited / diwarisi dari Vehicle)
        System.out.println(scooter.getWheels());        // 2
        System.out.println(familyCar.getSeats());       // 7          (Car's own method / method milik Car)

        // Car(String plateNumber, int seats) { this.seats = seats; }
        //     -> ERROR: Vehicle has no empty constructor, so you MUST call super(plateNumber, 4)
        //               Vehicle tidak punya constructor kosong, jadi WAJIB memanggil super(plateNumber, 4)
        // Inside Car:  return plateNumber;
        //     -> ERROR: plateNumber has private access in Vehicle (use getPlateNumber())


        // -------------------------------------------------------------------
        // 5. @Override (and the secret of toString)
        // EN: A child can REPLACE a parent's method by writing a method with
        //     the same name and parameters. Put @Override above it: if you
        //     make a typo, Java gives an error instead of silently making a
        //     new method. super.method() calls the parent's version.
        //     The secret: every class secretly `extends Object`, and Object
        //     already has `public String toString()`. That is why in Topic 09
        //     toString() had to be public: you were overriding it!
        // ID: Anak bisa MENGGANTI method induk dengan menulis method bernama
        //     dan berparameter sama. Tulis @Override di atasnya: kalau ada
        //     salah ketik, Java memberi error, bukan diam-diam membuat method
        //     baru. super.method() memanggil versi milik induk.
        //     Rahasianya: setiap class diam-diam `extends Object`, dan Object
        //     sudah punya `public String toString()`. Karena itu di Topik 09
        //     toString() wajib public: kamu sedang meng-override-nya!
        // -------------------------------------------------------------------
        System.out.println(tricycle.parkingFee());    // 3000 (Vehicle's version / versi Vehicle)
        System.out.println(scooter.parkingFee());     // 2000 (Motorcycle overrides / di-override Motorcycle)
        System.out.println(familyCar.parkingFee());   // 5000 (Car overrides / di-override Car)

        System.out.println(tricycle.describe());      // L 5555 XY (3 wheels)
        System.out.println(familyCar.describe());     // L 1234 AB (4 wheels), 7 seats  (uses super.describe())
        System.out.println(familyCar);                // L 1234 AB (4 wheels), 7 seats  (toString() -> describe())

        // @Override
        // public int parkingfee() { ... }   -> ERROR: method does not override a method
        //                                      (typo: lowercase f / salah ketik: f kecil)


        // -------------------------------------------------------------------
        // 6. Polymorphism: parent type, child object
        // EN: A Vehicle variable can hold ANY kind of Vehicle (Car, Motorcycle).
        //     When you call a method, the version of the REAL object runs.
        //     Rule: the VARIABLE type decides what you can CALL,
        //           the OBJECT type decides which version RUNS.
        //     This lets one loop handle many different types.
        // ID: Variabel bertipe Vehicle bisa menyimpan Vehicle JENIS APA SAJA
        //     (Car, Motorcycle). Saat method dipanggil, versi milik object
        //     ASLINYA yang dijalankan.
        //     Aturan: tipe VARIABEL menentukan method apa yang BOLEH DIPANGGIL,
        //             tipe OBJECT menentukan versi mana yang DIJALANKAN.
        //     Dengan ini satu loop bisa menangani banyak tipe berbeda.
        // -------------------------------------------------------------------
        Vehicle someVehicle = new Car("W 9999 ZZ", 5);
        System.out.println(someVehicle.parkingFee());  // 5000 (Car's version runs / versi Car yang jalan)
        // someVehicle.getSeats();  -> ERROR: the variable type Vehicle has no getSeats()
        //                             tipe variabel Vehicle tidak punya getSeats()
        // Car wrongCar = new Vehicle("L 1 A", 4);
        //     -> ERROR: a Vehicle is not always a Car (child type can't hold a parent object)
        //               Vehicle belum tentu Car (tipe anak tidak bisa menyimpan object induk)

        Vehicle[] parkingLot = { scooter, familyCar, tricycle, someVehicle, new Motorcycle("L 7777 EF") };
        int totalFee = 0;
        for (Vehicle vehicle : parkingLot) {
            System.out.println(vehicle + " -> " + vehicle.parkingFee());
            totalFee += vehicle.parkingFee();
        }
        // L 4321 CD (2 wheels) -> 2000
        // L 1234 AB (4 wheels), 7 seats -> 5000
        // L 5555 XY (3 wheels) -> 3000
        // W 9999 ZZ (4 wheels), 5 seats -> 5000
        // L 7777 EF (2 wheels) -> 2000
        System.out.println("Total parking fee: " + totalFee);   // Total parking fee: 17000


        // -------------------------------------------------------------------
        // 7. Abstract class
        // EN: Some parents are only an IDEA: there is no "plain lesson", only
        //     theory lessons and lab lessons. Mark such a class `abstract`.
        //     - You can't create it with `new`.
        //     - An abstract method has NO body. Every child MUST override it.
        //     - It can still have fields, a constructor, and normal methods,
        //       and those normal methods may call the abstract one.
        //     In this example: 1 credit of theory = 50 minutes per week,
        //     1 credit of lab = 170 minutes per week.
        // ID: Ada induk yang hanya berupa KONSEP: tidak ada "pelajaran biasa",
        //     yang ada hanya kelas teori dan kelas praktikum. Tandai class
        //     seperti itu dengan `abstract`.
        //     - Tidak bisa dibuat dengan `new`.
        //     - Method abstract TIDAK punya isi. Setiap anak WAJIB meng-override-nya.
        //     - Tetap boleh punya field, constructor, dan method biasa, dan
        //       method biasa itu boleh memanggil method abstract-nya.
        //     Di contoh ini: 1 SKS teori = 50 menit per minggu,
        //     1 SKS praktikum = 170 menit per minggu.
        // -------------------------------------------------------------------
        Lesson algorithms = new TheoryLesson("Algorithms", 3);
        Lesson programmingLab = new LabLesson("Programming Lab", 2);
        System.out.println(algorithms.minutesPerWeek());   // 150
        System.out.println(algorithms.summary());          // Algorithms: 3 credits, 150 minutes/week
        System.out.println(programmingLab.summary());      // Programming Lab: 2 credits, 340 minutes/week

        // Lesson plain = new Lesson("Something", 2);
        //     -> ERROR: Lesson is abstract; cannot be instantiated
        // class SeminarLesson extends Lesson { ... }   (without minutesPerWeek())
        //     -> ERROR: SeminarLesson is not abstract and does not override abstract method minutesPerWeek()


        // -------------------------------------------------------------------
        // 8. Interface (intro)
        // EN: An interface is a list of methods a class PROMISES to have.
        //     `class Laptop implements Chargeable` = "a Laptop can be charged".
        //     Unrelated classes (Laptop, Phone) can share one interface.
        //     - Interface methods have no body and are automatically public,
        //       so the class must write them with `public`.
        //     - A class can extend only ONE class, but implement MANY interfaces.
        //     - Abstract class = "is a" (TheoryLesson IS a Lesson).
        //       Interface      = "can do" (Laptop CAN be charged).
        // ID: Interface adalah daftar method yang DIJANJIKAN oleh sebuah class.
        //     `class Laptop implements Chargeable` = "Laptop bisa di-charge".
        //     Class yang tidak berhubungan (Laptop, Phone) bisa berbagi satu interface.
        //     - Method interface tidak punya isi dan otomatis public, jadi
        //       class-nya wajib menulisnya dengan `public`.
        //     - Sebuah class hanya bisa extends SATU class, tapi boleh
        //       implements BANYAK interface.
        //     - Abstract class = "adalah" (TheoryLesson ADALAH Lesson).
        //       Interface      = "bisa" (Laptop BISA di-charge).
        // -------------------------------------------------------------------
        Chargeable[] devices = { new Laptop(40), new Phone(15), new Phone(80) };
        for (Chargeable device : devices) {
            device.charge(60);      // 60 minutes / 60 menit
            System.out.println(device.getBatteryPercent() + "%");
        }
        // 70%   (Laptop: +1% every 2 minutes / +1% setiap 2 menit)
        // 75%   (Phone:  +1% every minute / +1% setiap menit)
        // 100%  (never above 100 / tidak pernah lebih dari 100)

        // Chargeable thing = new Chargeable();   -> ERROR: an interface can't be created with new
        //                                           interface tidak bisa dibuat dengan new


        // -------------------------------------------------------------------
        // 9. Python vs Java class syntax
        // EN: The same idea in both languages. In Python, a leading underscore
        //     (_name) only ASKS others not to touch it; Java's `private` is
        //     enforced by the compiler.
        // ID: Konsep yang sama di kedua bahasa. Di Python, garis bawah di depan
        //     (_name) hanya MEMINTA orang lain tidak menyentuhnya; `private`
        //     di Java benar-benar dijaga oleh compiler.
        //
        //     Python                                  Java
        //     class Person:                           class Person {
        //         count = 0                               private static int count = 0;
        //                                                 private String name;
        //         def __init__(self, name):               Person(String name) {
        //             self._name = name                       this.name = name;
        //             Person.count += 1                       count++;
        //                                                 }
        //         def introduce(self):                    public String introduce() {
        //             return f"Hi, I'm {self._name}"          return "Hi, I'm " + name;
        //                                                 }
        //                                             }
        //
        //     class Student(Person):                  class Student extends Person {
        //         def __init__(self, name, nim):          private String nim;
        //             super().__init__(name)              Student(String name, String nim) {
        //             self.nim = nim                          super(name);
        //                                                     this.nim = nim;
        //                                                 }
        //         def introduce(self):                    @Override
        //             return super().introduce() + "!"    public String introduce() {
        //                                                     return super.introduce() + "!";
        //                                                 }
        //                                             }
        // -------------------------------------------------------------------
        System.out.println("Done! Scroll down to see the classes.");
    }


    // =======================================================================
    // The classes below are used by main() above. They live INSIDE the main
    // class as `static class ...` so this file is self-contained and VS Code
    // doesn't report duplicate classes. In real projects each class gets its
    // own file (Vehicle.java) and the word static isn't needed there.
    // Class-class di bawah ini dipakai oleh main() di atas. Semuanya tinggal
    // DI DALAM class utama sebagai `static class ...` supaya file ini berdiri
    // sendiri dan VS Code tidak melaporkan class ganda. Di proyek sungguhan
    // setiap class punya file sendiri (Vehicle.java) dan kata static tidak
    // diperlukan di sana.
    // =======================================================================

    // ----- Section 3: static -----
    static class CampusVisitor {
        static final String CAMPUS = "UNAIR";     // shared constant / konstanta bersama
        private static int totalVisitors = 0;     // ONE copy for the whole class / SATU salinan untuk seluruh class
        private String name;                      // one copy PER object / satu salinan PER object

        CampusVisitor(String name) {
            this.name = name;
            totalVisitors++;                      // every new visitor adds 1 / setiap pengunjung baru menambah 1
        }

        public String getGreeting() {
            return "Welcome to " + CAMPUS + ", " + name + "!";
        }

        public static int getTotalVisitors() {
            return totalVisitors;
        }
    }


    // ----- Sections 4-6: inheritance, @Override, polymorphism -----
    static class Vehicle {
        private String plateNumber;
        private int wheels;

        Vehicle(String plateNumber, int wheels) {
            this.plateNumber = plateNumber;
            this.wheels = wheels;
        }

        public String getPlateNumber() {
            return plateNumber;
        }

        public int getWheels() {
            return wheels;
        }

        public int parkingFee() {
            return 3000;
        }

        public String describe() {
            return plateNumber + " (" + wheels + " wheels)";
        }

        @Override
        public String toString() {
            return describe();           // calls the REAL object's describe() / memanggil describe() milik object aslinya
        }
    }

    static class Motorcycle extends Vehicle {
        Motorcycle(String plateNumber) {
            super(plateNumber, 2);       // parent constructor, FIRST line / constructor induk, baris PERTAMA
        }

        @Override
        public int parkingFee() {
            return 2000;
        }
    }

    static class Car extends Vehicle {
        private int seats;               // only cars have seats here / di sini hanya mobil yang punya seats

        Car(String plateNumber, int seats) {
            super(plateNumber, 4);
            this.seats = seats;
        }

        public int getSeats() {
            return seats;
        }

        @Override
        public int parkingFee() {
            return 5000;
        }

        @Override
        public String describe() {
            return super.describe() + ", " + seats + " seats";   // reuse the parent's version / pakai ulang versi induk
        }
    }


    // ----- Section 7: abstract class -----
    static abstract class Lesson {
        private String title;
        private int credits;

        Lesson(String title, int credits) {
            this.title = title;
            this.credits = credits;
        }

        public String getTitle() {
            return title;
        }

        public int getCredits() {
            return credits;
        }

        // EN: no body, every child must write it / ID: tanpa isi, setiap anak wajib menulisnya
        public abstract int minutesPerWeek();

        public String summary() {
            return title + ": " + credits + " credits, " + minutesPerWeek() + " minutes/week";
        }
    }

    static class TheoryLesson extends Lesson {
        TheoryLesson(String title, int credits) {
            super(title, credits);
        }

        @Override
        public int minutesPerWeek() {
            return getCredits() * 50;
        }
    }

    static class LabLesson extends Lesson {
        LabLesson(String title, int credits) {
            super(title, credits);
        }

        @Override
        public int minutesPerWeek() {
            return getCredits() * 170;
        }
    }


    // ----- Section 8: interface -----
    interface Chargeable {
        int getBatteryPercent();
        void charge(int minutes);
    }

    static class Laptop implements Chargeable {
        private int batteryPercent;

        Laptop(int batteryPercent) {
            this.batteryPercent = batteryPercent;
        }

        @Override
        public int getBatteryPercent() {
            return batteryPercent;
        }

        @Override
        public void charge(int minutes) {
            batteryPercent = Math.min(100, batteryPercent + minutes / 2);
        }
    }

    static class Phone implements Chargeable {
        private int batteryPercent;

        Phone(int batteryPercent) {
            this.batteryPercent = batteryPercent;
        }

        @Override
        public int getBatteryPercent() {
            return batteryPercent;
        }

        @Override
        public void charge(int minutes) {
            batteryPercent = Math.min(100, batteryPercent + minutes);
        }
    }
}


// ===========================================================================
// Sections 1-2: encapsulation / enkapsulasi
// EN: The ONLY class written outside the main class (see the note in
//     section 1): here `private` really blocks main() from the fields.
// ID: SATU-SATUNYA class yang ditulis di luar class utama (lihat catatan di
//     bagian 1): di sini `private` benar-benar memblokir main() dari field-nya.
// ===========================================================================
class SecureStudentCard {
    private String name;
    private String studentId;        // getter only = read-only / hanya getter = hanya bisa dibaca
    private double gpa;

    SecureStudentCard(String name, String studentId, double gpa) {
        this.name = name;
        this.studentId = studentId;
        setGpa(gpa);                 // reuse the validation / pakai ulang validasinya
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            System.out.println("Name can't be blank. Ignored.");
        } else {
            this.name = name;
        }
    }

    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Invalid GPA " + gpa + ", must be 0.0 - 4.0. Ignored.");
        } else {
            this.gpa = gpa;
        }
    }
}
