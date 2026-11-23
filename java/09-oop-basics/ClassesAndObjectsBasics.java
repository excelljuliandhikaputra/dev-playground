/*
 * Topic 09 - OOP Basics: Classes & Objects
 * Topik 09 - Dasar OOP: Class & Object
 * ========================================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Class vs object                    | Class vs object
 *     2. Fields and default values          | Field dan nilai default
 *     3. Constructor                        | Constructor
 *     4. The `this` keyword                 | Keyword `this`
 *     5. Instance methods                   | Method instance
 *     6. toString(): printing an object     | toString(): mencetak object
 *     7. Many objects from one class        | Banyak object dari satu class
 *     8. Array of objects                   | Array berisi object
 *     9. ArrayList of objects               | ArrayList berisi object
 *    10. Where do the classes live?         | Di mana class-class ditulis?
 *
 * Run this file / Jalankan file ini:
 *     java ClassesAndObjectsBasics.java
 *
 * EN: The classes used in this lesson (Laptop, StudentProfile, Wallet,
 *     Subject) are written INSIDE the main class, below main(), as
 *     `static class ...`. Section 10 explains why.
 * ID: Class yang dipakai di pelajaran ini (Laptop, StudentProfile, Wallet,
 *     Subject) ditulis DI DALAM class utama, di bawah main(), sebagai
 *     `static class ...`. Bagian 10 menjelaskan alasannya.
 */
import java.util.ArrayList;

public class ClassesAndObjectsBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 1. Class vs object
        // EN: A class is a BLUEPRINT. It describes what something HAS (fields)
        //     and what it CAN DO (methods). An object is one real thing made
        //     from that blueprint with the keyword `new`.
        //     Think: class = the design of the KTM (student card),
        //            object = one real card with one student's data on it.
        //     You already used objects: String, Scanner and ArrayList are
        //     classes made by Java. Now you write your OWN classes.
        // ID: Class adalah CETAK BIRU. Class menjelaskan apa yang DIMILIKI
        //     (field) dan apa yang BISA DILAKUKAN (method). Object adalah satu
        //     benda nyata yang dibuat dari cetak biru itu dengan keyword `new`.
        //     Bayangkan: class = desain KTM (kartu mahasiswa),
        //                object = satu kartu asli berisi data satu mahasiswa.
        //     Kamu sudah pernah memakai object: String, Scanner, dan ArrayList
        //     adalah class buatan Java. Sekarang kamu membuat class SENDIRI.
        //
        //     Format:  ClassName variableName = new ClassName();
        //     Use a dot to reach a field: variableName.fieldName
        //     Pakai titik untuk mengakses field: namaVariabel.namaField
        // -------------------------------------------------------------------
        Laptop myLaptop = new Laptop();       // one object of class Laptop / satu object dari class Laptop
        myLaptop.owner = "Excell";
        myLaptop.ramGb = 8;
        myLaptop.isCharging = true;

        System.out.println(myLaptop.owner);           // Excell
        System.out.println(myLaptop.ramGb + " GB");   // 8 GB
        System.out.println(myLaptop.isCharging);      // true


        // -------------------------------------------------------------------
        // 2. Fields and default values
        // EN: Fields are variables that live INSIDE an object. They are
        //     declared at the top of the class (see class Laptop below).
        //     If you don't give a field a value, Java fills in a default:
        //       int / double -> 0 / 0.0     boolean -> false
        //       String (and every other object type) -> null
        //     null means "no object here yet".
        // ID: Field adalah variabel yang tinggal DI DALAM object. Field
        //     dideklarasikan di bagian atas class (lihat class Laptop di bawah).
        //     Kalau field tidak diberi nilai, Java mengisi nilai default:
        //       int / double -> 0 / 0.0     boolean -> false
        //       String (dan semua tipe object lain) -> null
        //     null artinya "belum ada object di sini".
        // -------------------------------------------------------------------
        Laptop spareLaptop = new Laptop();
        System.out.println(spareLaptop.owner);        // null
        System.out.println(spareLaptop.ramGb);        // 0
        System.out.println(spareLaptop.isCharging);   // false

        // Laptop noLaptop = null;
        // System.out.println(noLaptop.owner);   -> CRASH: NullPointerException
        //     EN: null has no fields, there is nothing to read.
        //     ID: null tidak punya field, tidak ada yang bisa dibaca.
        // Laptop oops;
        // oops.ramGb = 16;                      -> ERROR: oops has no object yet (forgot `new`)
        //                                          oops belum punya object (lupa `new`)


        // -------------------------------------------------------------------
        // 3. Constructor
        // EN: Setting fields one by one (like section 1) is long and easy to
        //     forget. A CONSTRUCTOR fills the fields while the object is made.
        //     Rules: same name as the class, NO return type (not even void).
        //     `new StudentProfile(...)` runs the constructor once.
        //     If a class has no constructor at all, Java gives it an empty one.
        //     That is why `new Laptop()` worked above.
        // ID: Mengisi field satu per satu (seperti bagian 1) itu panjang dan
        //     gampang lupa. CONSTRUCTOR mengisi field saat object dibuat.
        //     Aturan: namanya sama dengan nama class, TANPA tipe return (void pun tidak).
        //     `new StudentProfile(...)` menjalankan constructor satu kali.
        //     Kalau class sama sekali tidak punya constructor, Java memberinya
        //     constructor kosong. Karena itu `new Laptop()` di atas bisa jalan.
        // -------------------------------------------------------------------
        StudentProfile excell = new StudentProfile("Excell", "D4 Informatics Engineering", 1);
        System.out.println(excell.name);        // Excell
        System.out.println(excell.program);     // D4 Informatics Engineering
        System.out.println(excell.semester);    // 1

        // StudentProfile ghost = new StudentProfile();
        //     -> ERROR: StudentProfile only has a constructor with 3 parameters
        //               StudentProfile hanya punya constructor dengan 3 parameter
        // StudentProfile mixed = new StudentProfile(1, "Excell", "D4");
        //     -> ERROR: wrong order/types, must be (String, String, int)
        //               urutan/tipe salah, harus (String, String, int)


        // -------------------------------------------------------------------
        // 4. The `this` keyword
        // EN: Inside a class, `this` means "the object I am working on now".
        //     In the constructor the PARAMETER and the FIELD often have the
        //     same name, so `this.name` (field) = `name` (parameter).
        //     Look at the StudentProfile constructor at the bottom of the file.
        // ID: Di dalam class, `this` artinya "object yang sedang diproses".
        //     Di constructor, PARAMETER dan FIELD sering punya nama yang sama,
        //     jadi `this.name` (field) = `name` (parameter).
        //     Lihat constructor StudentProfile di bagian bawah file.
        //
        //     Common mistake / Kesalahan umum:
        //         name = name;        -> no error, but the field stays null!
        //                                (the parameter is copied into itself)
        //                                tidak error, tapi field tetap null!
        //                                (parameter disalin ke dirinya sendiri)
        //         this.name = name;   -> correct / benar
        // -------------------------------------------------------------------
        StudentProfile budi = new StudentProfile("Budi", "D4 Informatics Engineering", 3);
        System.out.println(budi.name + " is in semester " + budi.semester);   // Budi is in semester 3


        // -------------------------------------------------------------------
        // 5. Instance methods
        // EN: Methods written inside a class WITHOUT `static` belong to each
        //     object. Call them with object.method(). Inside the method you can
        //     use the object's fields directly (name, semester, ...).
        //     - introduce()   returns a String
        //     - nextSemester() is void: it CHANGES a field, returns nothing
        //     - status()      calls another method of the same object (isFinalYear())
        //     Python note: Python writes `self` as the first parameter.
        //     Java doesn't; `this` is there automatically.
        // ID: Method yang ditulis di dalam class TANPA `static` dimiliki oleh
        //     setiap object. Panggil dengan object.method(). Di dalam method,
        //     field object bisa langsung dipakai (name, semester, ...).
        //     - introduce()   mengembalikan String
        //     - nextSemester() bertipe void: MENGUBAH field, tidak mengembalikan apa-apa
        //     - status()      memanggil method lain dari object yang sama (isFinalYear())
        //     Catatan Python: Python menulis `self` sebagai parameter pertama.
        //     Java tidak; `this` sudah ada otomatis.
        // -------------------------------------------------------------------
        System.out.println(excell.introduce());
        // Hi, I'm Excell from D4 Informatics Engineering (semester 1).

        excell.nextSemester();                    // semester: 1 -> 2
        System.out.println(excell.semester);      // 2
        System.out.println(excell.isFinalYear()); // false
        System.out.println(excell.status());      // Excell still has 6 semesters to go.

        // introduce();               -> ERROR: whose introduction? Needs an object: excell.introduce()
        //                               perkenalan siapa? Butuh object: excell.introduce()
        // excell.introduce;          -> ERROR: a method call needs ( )
        //                               memanggil method butuh ( )


        // -------------------------------------------------------------------
        // 6. toString(): printing an object
        // EN: println(object) prints whatever the object's toString() returns.
        //     Without your own toString(), Java prints something like
        //     ClassesAndObjectsBasics$Laptop@1b6d3586
        //     (class name + a code that changes every run).
        //     Write it exactly like this:  public String toString() { ... }
        //     It MUST start with `public`. Accept that for now; Topic 10
        //     (@Override) explains why.
        // ID: println(object) mencetak apa pun yang dikembalikan toString()
        //     milik object itu. Tanpa toString() buatanmu, Java mencetak sesuatu
        //     seperti ClassesAndObjectsBasics$Laptop@1b6d3586
        //     (nama class + kode yang berubah tiap run).
        //     Tulis persis seperti ini:  public String toString() { ... }
        //     WAJIB diawali `public`. Terima dulu saja; Topik 10 (@Override)
        //     menjelaskan alasannya.
        // -------------------------------------------------------------------
        System.out.println(excell);              // Excell (D4 Informatics Engineering, semester 2)
        System.out.println("Student: " + budi);  // Student: Budi (D4 Informatics Engineering, semester 3)
        System.out.println(myLaptop);            // something like ClassesAndObjectsBasics$Laptop@1b6d3586
                                                 // (no toString / tidak punya toString)

        // String toString() { ... }   (without public)
        //     -> ERROR: "attempting to assign weaker access privileges"
        //               (lupa `public`)


        // -------------------------------------------------------------------
        // 7. Many objects from one class
        // EN: Each object has its OWN copy of the fields. Changing one wallet
        //     does not change another wallet.
        //     BUT: `Wallet sameWallet = myWallet;` does NOT copy the object.
        //     It makes a second name for the SAME object.
        //     == on objects asks "is this the SAME object?", not "same data?".
        // ID: Setiap object punya salinan field SENDIRI. Mengubah satu dompet
        //     tidak mengubah dompet lain.
        //     TAPI: `Wallet sameWallet = myWallet;` TIDAK menyalin object.
        //     Itu hanya membuat nama kedua untuk object yang SAMA.
        //     == pada object bertanya "apakah ini object yang SAMA?", bukan
        //     "apakah datanya sama?".
        // -------------------------------------------------------------------
        Wallet myWallet = new Wallet("Excell", 50000);
        Wallet friendWallet = new Wallet("Budi", 20000);

        myWallet.topUp(25000);
        System.out.println(myWallet.balance);              // 75000
        System.out.println(friendWallet.balance);          // 20000 (not changed / tidak berubah)
        System.out.println(friendWallet.canAfford(30000)); // false
        System.out.println(myWallet.canAfford(30000));     // true

        Wallet sameWallet = myWallet;        // second name, SAME object / nama kedua, object SAMA
        sameWallet.topUp(5000);
        System.out.println(myWallet.balance);              // 80000 (changed too! / ikut berubah!)
        System.out.println(sameWallet == myWallet);        // true  (same object / object yang sama)

        Wallet twinWallet = new Wallet("Excell", 80000);
        System.out.println(twinWallet == myWallet);        // false (same data, different objects)
                                                           //        (data sama, object berbeda)


        // -------------------------------------------------------------------
        // 8. Array of objects
        // EN: An array can hold objects, just like it holds int or String.
        //     subjects[1] is a Subject object, so subjects[1].name works.
        //     The for-each loop gives you one object per round.
        // ID: Array bisa menyimpan object, sama seperti menyimpan int atau String.
        //     subjects[1] adalah object Subject, jadi subjects[1].name bisa dipakai.
        //     Loop for-each memberikan satu object di setiap putaran.
        // -------------------------------------------------------------------
        Subject[] subjects = {
            new Subject("Discrete Mathematics", 72),
            new Subject("Algorithms", 88),
            new Subject("English", 81),
            new Subject("Pancasila", 60)
        };
        System.out.println(subjects.length);          // 4
        System.out.println(subjects[1].name);         // Algorithms
        System.out.println(subjects[3].isPassed());   // false

        int passedCount = 0;
        Subject best = subjects[0];                   // start with the first one / mulai dari yang pertama
        for (Subject s : subjects) {
            System.out.println(s);                    // uses toString() / memakai toString()
            if (s.isPassed()) {
                passedCount++;
            }
            if (s.score > best.score) {
                best = s;
            }
        }
        // Discrete Mathematics: 72 (passed)
        // Algorithms: 88 (passed)
        // English: 81 (passed)
        // Pancasila: 60 (not passed)
        System.out.println("Passed: " + passedCount + " of " + subjects.length);   // Passed: 3 of 4
        System.out.println("Best: " + best.name + " (" + best.score + ")");         // Best: Algorithms (88)


        // -------------------------------------------------------------------
        // 9. ArrayList of objects
        // EN: ArrayList<Subject> grows and shrinks, like in Topic 06.
        //     get(i) gives the object, so get(i).name reads its field.
        //     Printing the whole list calls toString() of every object.
        // ID: ArrayList<Subject> bisa bertambah dan berkurang, seperti di Topik 06.
        //     get(i) memberikan object-nya, jadi get(i).name membaca field-nya.
        //     Mencetak seluruh list memanggil toString() setiap object.
        // -------------------------------------------------------------------
        ArrayList<Subject> semesterTwo = new ArrayList<>();
        semesterTwo.add(new Subject("Calculus", 77));
        semesterTwo.add(new Subject("Basic Programming", 90));
        Subject academicEnglish = new Subject("Academic English", 64);
        semesterTwo.add(academicEnglish);

        System.out.println(semesterTwo.size());          // 3
        System.out.println(semesterTwo.get(1).name);     // Basic Programming

        semesterTwo.get(2).score = 66;                   // remedial exam / ujian perbaikan
        System.out.println(academicEnglish.isPassed());  // true (it's the SAME object / object yang SAMA)

        int totalScore = 0;
        for (Subject s : semesterTwo) {
            totalScore += s.score;
        }
        System.out.println("Total: " + totalScore);      // Total: 233

        semesterTwo.remove(academicEnglish);             // remove that object / hapus object itu
        System.out.println(semesterTwo);
        // [Calculus: 77 (passed), Basic Programming: 90 (passed)]


        // -------------------------------------------------------------------
        // 10. Where do the classes live?
        // EN: A file run with `java FileName.java` has ONE public class with
        //     the same name as the file, and main() is inside it.
        //     In this course every other class lives INSIDE that main class as
        //     `static class ...` (see the bottom of this file), so each file is
        //     self-contained and VS Code doesn't report duplicate classes.
        //     In real projects each class gets its own file (Student.java) and
        //     the word static isn't needed there.
        //     Accept the word `static` for now; Topic 10 explains it.
        // ID: File yang dijalankan dengan `java NamaFile.java` punya SATU public
        //     class yang namanya sama dengan nama file, dan main() ada di dalamnya.
        //     Di kursus ini setiap class lain tinggal DI DALAM class utama itu
        //     sebagai `static class ...` (lihat bagian bawah file ini), supaya
        //     setiap file berdiri sendiri dan VS Code tidak melaporkan class ganda.
        //     Di proyek sungguhan setiap class punya file sendiri (Student.java)
        //     dan kata static tidak diperlukan di sana.
        //     Terima dulu kata `static`; Topik 10 menjelaskannya.
        //
        //     Python vs Java (the same class / class yang sama).
        //     Java side as it looks in its own file Subject.java.
        //     Sisi Java seperti di file sendiri Subject.java.
        //
        //     Python                                  Java
        //     class Subject:                          class Subject {
        //                                                 String name;
        //                                                 int score;
        //         def __init__(self, name, score):        Subject(String name, int score) {
        //             self.name = name                        this.name = name;
        //             self.score = score                      this.score = score;
        //                                                 }
        //         def is_passed(self):                    boolean isPassed() {
        //             return self.score >= 65                 return score >= 65;
        //                                                 }
        //                                             }
        //     s = Subject("English", 81)              Subject s = new Subject("English", 81);
        // -------------------------------------------------------------------
        System.out.println("Done! Scroll down to see the classes.");
    }


    // =======================================================================
    // The classes below are used by main() above.
    // Class-class di bawah ini dipakai oleh main() di atas.
    // They live INSIDE the main class as `static class ...` (see section 10).
    // Semuanya tinggal DI DALAM class utama sebagai `static class ...` (lihat bagian 10).
    // =======================================================================

    // EN: Fields only, no constructor, no methods (sections 1, 2, 6).
    // ID: Hanya field, tanpa constructor, tanpa method (bagian 1, 2, 6).
    static class Laptop {
        String owner;
        int ramGb;
        boolean isCharging;
    }


    // EN: Fields + constructor + methods + toString (sections 3-6).
    // ID: Field + constructor + method + toString (bagian 3-6).
    static class StudentProfile {
        // fields: what every student profile HAS / apa yang DIMILIKI setiap profil
        String name;
        String program;
        int semester;

        // constructor: same name as the class, no return type
        // constructor: namanya sama dengan class, tanpa tipe return
        StudentProfile(String name, String program, int semester) {
            this.name = name;            // field = parameter
            this.program = program;
            this.semester = semester;
        }

        // methods: what every student profile CAN DO / apa yang BISA DILAKUKAN
        String introduce() {
            return "Hi, I'm " + name + " from " + program + " (semester " + semester + ").";
        }

        void nextSemester() {
            semester++;                  // changes THIS object's field / mengubah field object INI
        }

        boolean isFinalYear() {
            return semester >= 7;        // D4 = 8 semesters / D4 = 8 semester
        }

        String status() {
            // EN: a method can call another method of the same object
            // ID: method bisa memanggil method lain dari object yang sama
            if (isFinalYear()) {
                return name + " is in the final year.";
            }
            return name + " still has " + (8 - semester) + " semesters to go.";
        }

        public String toString() {
            return name + " (" + program + ", semester " + semester + ")";
        }
    }


    // EN: Used in section 7 to show that every object has its own data.
    // ID: Dipakai di bagian 7 untuk menunjukkan setiap object punya data sendiri.
    static class Wallet {
        String owner;
        int balance;

        Wallet(String owner, int balance) {
            this.owner = owner;
            this.balance = balance;
        }

        void topUp(int amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        boolean canAfford(int price) {
            return price <= balance;
        }
    }


    // EN: Used in sections 8 and 9 (array and ArrayList of objects).
    // ID: Dipakai di bagian 8 dan 9 (array dan ArrayList berisi object).
    static class Subject {
        String name;
        int score;

        Subject(String name, int score) {
            this.name = name;
            this.score = score;
        }

        boolean isPassed() {
            return score >= 65;          // passing = C or better / lulus = minimal C
        }

        public String toString() {
            String result = isPassed() ? "passed" : "not passed";
            return name + ": " + score + " (" + result + ")";
        }
    }
}
