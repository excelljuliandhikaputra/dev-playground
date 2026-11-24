/*
 * Topic 10 - OOP Advanced Exercises (UNSOLVED)
 * Topik 10 - Latihan OOP Lanjutan (BELUM DIKERJAKAN)
 * ===================================================
 * EN - How to use:
 *     1. Scroll down PAST the checker to the exercise classes.
 *        Fill in every part marked // TODO.
 *     2. Run:  java OopAdvancedExercisesUnsolved.java
 *     3. The checker in main() tests your classes:
 *        [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
 *
 * ID - Cara pakai:
 *     1. Scroll ke bawah MELEWATI checker sampai ke class-class soal.
 *        Isi setiap bagian yang bertanda // TODO.
 *     2. Jalankan:  java OopAdvancedExercisesUnsolved.java
 *     3. Checker di main() menguji class buatanmu:
 *        [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
 *
 * Where are the classes? / Di mana class-class soalnya?
 *     EN: main() with the checker comes first. Your exercise classes live
 *         INSIDE the main class as `static class ...`, below the checker,
 *         so the file is self-contained and VS Code doesn't report
 *         duplicate classes. In real projects each class gets its own file
 *         (Shape.java) and the word static isn't needed there.
 *     ID: main() berisi checker ada di paling atas. Class-class soal tinggal
 *         DI DALAM class utama sebagai `static class ...`, di bawah checker,
 *         supaya file ini berdiri sendiri dan VS Code tidak melaporkan class
 *         ganda. Di proyek sungguhan setiap class punya file sendiri
 *         (Shape.java) dan kata static tidak diperlukan di sana.
 *
 * Private fields + nested classes / Field private + class di dalam class:
 *     EN: Because the classes are nested, Java technically lets main()
 *         read their private fields (e.g. account.balance). Don't do that:
 *         always use getters and methods. The checker only uses those.
 *     ID: Karena class-nya ada di dalam class utama, secara teknis Java
 *         mengizinkan main() membaca field private-nya (misal account.balance).
 *         Jangan lakukan itu: selalu pakai getter dan method. Checker juga
 *         hanya memakai getter dan method.
 *
 * Rules / Aturan:
 *     - Only use Topic 01-10 material.
 *       Hanya pakai materi Topik 01-10.
 *     - NO HARDCODING: the checker tests every class with several different
 *       objects, so a fixed answer will fail.
 *       JANGAN HARDCODE: checker menguji setiap class dengan beberapa object
 *       berbeda, jadi jawaban yang ditulis mati pasti gagal.
 *     - Don't change the checker, and don't rename the given classes, fields,
 *       methods, or parameters. Keep every field `private`. You MAY add your
 *       own extra methods.
 *       Jangan ubah checker, dan jangan ganti nama class, field, method, atau
 *       parameter yang sudah diberikan. Semua field tetap `private`. Kamu
 *       BOLEH menambah method sendiri.
 *     - The super(...) lines in the child constructors are given so the file
 *       compiles. Keep them and write your code below them.
 *       Baris super(...) di constructor anak sudah diberikan supaya file bisa
 *       di-compile. Jangan dihapus, tulis kodemu di bawahnya.
 *     - Exercise 7 uses your Shape classes from Exercise 5. Finish that first.
 *       Soal 7 memakai class Shape dari Soal 5. Selesaikan itu dulu.
 *
 * Self-check / Cek sendiri:
 *     EN: You may make your own objects at the start of main() (above the
 *         checker), print the results and check them by hand. If your class
 *         only works for the checker's objects, something is hardcoded.
 *     ID: Kamu boleh membuat object sendiri di awal main() (di atas checker),
 *         cetak hasilnya, lalu cek manual. Kalau class-mu hanya benar untuk
 *         object di checker, berarti ada yang di-hardcode.
 *     EN: If the program crashes (e.g. NullPointerException), read the line
 *         number in the error message: it points to the line that broke.
 *     ID: Kalau program crash (misal NullPointerException), baca nomor baris
 *         di pesan error-nya: itu menunjuk baris yang bermasalah.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as OopAdvancedExercisesSolved.java,
 *         rename the public class below to OopAdvancedExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai OopAdvancedExercisesSolved.java,
 *         ganti juga nama public class di bawah menjadi OopAdvancedExercisesSolved.
 */
public class OopAdvancedExercisesUnsolved {

    public static void main(String[] args) {

        // EN: You may test your own objects here.
        // ID: Kamu boleh mencoba object buatanmu sendiri di sini.



        // -------------------------------------------------------------------
        // CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
        // Each row: { what was called, what your code gave, expected value }
        // Setiap baris: { yang dipanggil, hasil kodemu, nilai yang diharapkan }
        // -------------------------------------------------------------------
        System.out.println("=============================================");
        System.out.println("  Topic 10 - OOP Advanced Exercises");
        System.out.println("=============================================");
        int score = 0;

        // ----- Exercise 1: BankAccount -----
        BankAccount excellAccount = new BankAccount("Excell", 100000);
        BankAccount budiAccount = new BankAccount("Budi", -5000);
        excellAccount.setOwner("   ");
        String ownerAfterBlank = excellAccount.getOwner();
        budiAccount.setOwner("Budi Santoso");
        String ownerAfterRename = budiAccount.getOwner();
        String[][] cases1 = {
            { "excellAccount.getBalance()", "" + excellAccount.getBalance(), "100000" },
            { "budiAccount.getBalance() (started with -5000)", "" + budiAccount.getBalance(), "0" },
            { "excellAccount.getOwner() after setOwner(\"   \")", "" + ownerAfterBlank, "Excell" },
            { "budiAccount.getOwner() after setOwner(\"Budi Santoso\")", "" + ownerAfterRename, "Budi Santoso" },
            { "excellAccount.deposit(-1000)", "" + excellAccount.deposit(-1000), "false" },
            { "excellAccount.deposit(25000)", "" + excellAccount.deposit(25000), "true" },
            { "excellAccount.getBalance()", "" + excellAccount.getBalance(), "125000" },
            { "excellAccount.withdraw(200000)", "" + excellAccount.withdraw(200000), "false" },
            { "excellAccount.withdraw(25000)", "" + excellAccount.withdraw(25000), "true" },
            { "excellAccount.getBalance()", "" + excellAccount.getBalance(), "100000" },
            { "budiAccount.deposit(30000)", "" + budiAccount.deposit(30000), "true" },
            { "budiAccount.withdraw(30000)", "" + budiAccount.withdraw(30000), "true" },
            { "budiAccount.withdraw(0)", "" + budiAccount.withdraw(0), "false" },
            { "budiAccount.getBalance()", "" + budiAccount.getBalance(), "0" },
        };
        score += check(1, "BankAccount", cases1);

        // ----- Exercise 2: StudentScore -----
        StudentScore anaScore = new StudentScore("Ana", 88);
        StudentScore budiScore = new StudentScore("Budi", 120);
        String anaStart = "" + anaScore.getScore();
        String anaStartGrade = anaScore.getGrade();
        String budiStart = "" + budiScore.getScore();
        anaScore.setScore(150);
        String anaAfter150 = "" + anaScore.getScore();
        anaScore.setScore(-5);
        String anaAfterMinus5 = "" + anaScore.getScore();
        anaScore.setScore(72);
        String anaAfter72 = "" + anaScore.getScore();
        String anaGrade72 = anaScore.getGrade();
        budiScore.setScore(100);
        String budiGrade100 = budiScore.getGrade();
        budiScore.setScore(65);
        String budiGrade65 = budiScore.getGrade();
        budiScore.setScore(64);
        String budiGrade64 = budiScore.getGrade();
        budiScore.setScore(0);
        String budiAfter0 = "" + budiScore.getScore();
        String budiGrade0 = budiScore.getGrade();
        String[][] cases2 = {
            { "anaScore.getName()", "" + anaScore.getName(), "Ana" },
            { "new StudentScore(\"Ana\", 88) -> getScore()", anaStart, "88" },
            { "new StudentScore(\"Ana\", 88) -> getGrade()", "" + anaStartGrade, "A" },
            { "new StudentScore(\"Budi\", 120) -> getScore()", budiStart, "0" },
            { "anaScore.getScore() after setScore(150)", anaAfter150, "88" },
            { "anaScore.getScore() after setScore(-5)", anaAfterMinus5, "88" },
            { "anaScore.getScore() after setScore(72)", anaAfter72, "72" },
            { "anaScore.getGrade() with 72", "" + anaGrade72, "BC" },
            { "budiScore.getGrade() with 100", "" + budiGrade100, "A" },
            { "budiScore.getGrade() with 65", "" + budiGrade65, "C" },
            { "budiScore.getGrade() with 64", "" + budiGrade64, "D" },
            { "budiScore.getScore() after setScore(0)", budiAfter0, "0" },
            { "budiScore.getGrade() with 0", "" + budiGrade0, "E" },
        };
        score += check(2, "StudentScore", cases2);

        // ----- Exercise 3: QueueTicket (static) -----
        String totalBefore = "" + QueueTicket.getTotalTickets();
        QueueTicket ticket1 = new QueueTicket();
        QueueTicket ticket2 = new QueueTicket();
        QueueTicket ticket3 = new QueueTicket();
        String totalAfterThree = "" + QueueTicket.getTotalTickets();
        QueueTicket.resetAll();
        String totalAfterReset = "" + QueueTicket.getTotalTickets();
        QueueTicket ticket4 = new QueueTicket();
        String[][] cases3 = {
            { "QueueTicket.getTotalTickets() before any ticket", totalBefore, "0" },
            { "ticket1.getNumber()", "" + ticket1.getNumber(), "1" },
            { "ticket2.getNumber()", "" + ticket2.getNumber(), "2" },
            { "ticket3.getNumber()", "" + ticket3.getNumber(), "3" },
            { "QueueTicket.getTotalTickets() after 3 tickets", totalAfterThree, "3" },
            { "QueueTicket.getTotalTickets() after resetAll()", totalAfterReset, "0" },
            { "ticket4.getNumber() (first ticket after reset)", "" + ticket4.getNumber(), "1" },
            { "ticket3.getNumber() (old ticket keeps its number)", "" + ticket3.getNumber(), "3" },
            { "QueueTicket.getTotalTickets() at the end", "" + QueueTicket.getTotalTickets(), "1" },
        };
        score += check(3, "QueueTicket", cases3);

        // ----- Exercise 4: Person -> Student / Lecturer -----
        Person guest = new Person("Sari");
        Student excellStudent = new Student("Excell", "D4 Informatics Engineering");
        Lecturer rinaLecturer = new Lecturer("Dr. Rina", "Discrete Mathematics");
        Person someone = new Student("Dina", "D3 Accounting");
        Person teacher = new Lecturer("Mr. Agus", "Calculus");
        String[][] cases4 = {
            { "guest.getName()", "" + guest.getName(), "Sari" },
            { "guest.introduce()", "" + guest.introduce(), "Hi, I'm Sari." },
            { "excellStudent.getName()", "" + excellStudent.getName(), "Excell" },
            { "excellStudent.getProgram()", "" + excellStudent.getProgram(), "D4 Informatics Engineering" },
            { "excellStudent.introduce()", "" + excellStudent.introduce(), "Hi, I'm Excell. I study D4 Informatics Engineering." },
            { "rinaLecturer.getSubject()", "" + rinaLecturer.getSubject(), "Discrete Mathematics" },
            { "rinaLecturer.introduce()", "" + rinaLecturer.introduce(), "Hi, I'm Dr. Rina. I teach Discrete Mathematics." },
            { "someone.introduce()  (Person someone = new Student(...))", "" + someone.introduce(), "Hi, I'm Dina. I study D3 Accounting." },
            { "teacher.introduce()  (Person teacher = new Lecturer(...))", "" + teacher.introduce(), "Hi, I'm Mr. Agus. I teach Calculus." },
        };
        score += check(4, "Person / Student / Lecturer", cases4);

        // ----- Exercise 5: abstract Shape -> Circle / Rectangle -----
        Circle bigCircle = new Circle(5);
        Circle smallCircle = new Circle(1);
        Rectangle board = new Rectangle(4, 2.5);
        Shape square = new Rectangle(2, 2);
        String[][] cases5 = {
            { "bigCircle.area()", num(bigCircle.area()), "78.54" },
            { "bigCircle.perimeter()", num(bigCircle.perimeter()), "31.42" },
            { "smallCircle.area()", num(smallCircle.area()), "3.14" },
            { "smallCircle.perimeter()", num(smallCircle.perimeter()), "6.28" },
            { "board.area()", num(board.area()), "10.0" },
            { "board.perimeter()", num(board.perimeter()), "13.0" },
            { "square.area()  (Shape square = new Rectangle(2, 2))", num(square.area()), "4.0" },
            { "bigCircle.isBiggerThan(board)", "" + bigCircle.isBiggerThan(board), "true" },
            { "board.isBiggerThan(bigCircle)", "" + board.isBiggerThan(bigCircle), "false" },
            { "board.isBiggerThan(smallCircle)", "" + board.isBiggerThan(smallCircle), "true" },
            { "smallCircle.isBiggerThan(square)", "" + smallCircle.isBiggerThan(square), "false" },
        };
        score += check(5, "Shape / Circle / Rectangle", cases5);

        // ----- Exercise 6: interface Payable -----
        Payable fullFee = new TuitionFee(5000000, 0);
        Payable partFee = new TuitionFee(5000000, 25);
        Payable smallFee = new TuitionFee(4200000, 10);
        Payable lunch = new CanteenOrder("Fried rice", 15000, 2);
        Payable drinks = new CanteenOrder("Iced tea", 5000, 3);
        String[][] cases6 = {
            { "fullFee.amountToPay()", "" + fullFee.amountToPay(), "5000000" },
            { "partFee.amountToPay()", "" + partFee.amountToPay(), "3750000" },
            { "smallFee.amountToPay()", "" + smallFee.amountToPay(), "3780000" },
            { "fullFee.description()", "" + fullFee.description(), "Tuition fee (no scholarship)" },
            { "partFee.description()", "" + partFee.description(), "Tuition fee (scholarship 25%)" },
            { "lunch.amountToPay()", "" + lunch.amountToPay(), "30000" },
            { "drinks.amountToPay()", "" + drinks.amountToPay(), "15000" },
            { "lunch.description()", "" + lunch.description(), "Fried rice x2" },
            { "drinks.description()", "" + drinks.description(), "Iced tea x3" },
        };
        score += check(6, "Payable", cases6);

        // ----- Exercise 7: ShapeStats (Challenge) -----
        Shape[] garden = { new Circle(1), new Rectangle(4, 2.5), new Circle(2) };
        Shape[] tiles = { new Rectangle(1, 1), new Rectangle(2, 0.5), new Rectangle(3, 2) };
        Shape[] nothing = {};
        Shape gardenLargest = ShapeStats.largest(garden);
        Shape tilesLargest = ShapeStats.largest(tiles);
        Shape nothingLargest = ShapeStats.largest(nothing);
        String[][] cases7 = {
            { "ShapeStats.totalArea(garden)", num(ShapeStats.totalArea(garden)), "25.71" },
            { "ShapeStats.totalArea(tiles)", num(ShapeStats.totalArea(tiles)), "8.0" },
            { "ShapeStats.totalArea(nothing)", num(ShapeStats.totalArea(nothing)), "0.0" },
            { "ShapeStats.largest(garden).area()", gardenLargest == null ? "null" : num(gardenLargest.area()), "12.57" },
            { "ShapeStats.largest(garden) == garden[2]", "" + (gardenLargest == garden[2]), "true" },
            { "ShapeStats.largest(tiles).area()", tilesLargest == null ? "null" : num(tilesLargest.area()), "6.0" },
            { "ShapeStats.largest(nothing)", nothingLargest == null ? "null" : num(nothingLargest.area()), "null" },
        };
        score += check(7, "ShapeStats", cases7);

        // ----- Exercise 8: Employee hierarchy (Challenge) -----
        Employee rina = new FullTimeEmployee("Rina", 6000000);
        Employee budiPart = new PartTimeEmployee("Budi", 50000, 60);
        Employee sari = new PartTimeEmployee("Sari", 40000, 90);
        Employee dewi = new Manager("Dewi", 9000000, 4);
        Employee[] staff = { rina, budiPart, sari, dewi };
        Employee[] smallTeam = { budiPart, dewi };
        Employee[] noStaff = {};
        String[][] cases8 = {
            { "rina.getName()", "" + rina.getName(), "Rina" },
            { "rina.monthlySalary()", "" + rina.monthlySalary(), "6500000" },
            { "budiPart.monthlySalary()  (60 hours)", "" + budiPart.monthlySalary(), "3000000" },
            { "sari.monthlySalary()  (90 hours)", "" + sari.monthlySalary(), "4000000" },
            { "dewi.getName()", "" + dewi.getName(), "Dewi" },
            { "dewi.monthlySalary()", "" + dewi.monthlySalary(), "10500000" },
            { "rina.toString()", "" + rina.toString(), "Rina: Rp 6500000" },
            { "dewi.toString()", "" + dewi.toString(), "Dewi: Rp 10500000" },
            { "Employee.totalPayroll(staff)", "" + Employee.totalPayroll(staff), "24000000" },
            { "Employee.totalPayroll(smallTeam)", "" + Employee.totalPayroll(smallTeam), "13500000" },
            { "Employee.totalPayroll(noStaff)", "" + Employee.totalPayroll(noStaff), "0" },
        };
        score += check(8, "Employee hierarchy", cases8);

        System.out.println("=============================================");
        System.out.println("  Score: " + score + " / 8");
        if (score == 8) {
            System.out.println("  All exercises passed. Push it to GitHub!");
        }
        System.out.println("=============================================");
    }

    // EN: Compares every row: { call, got, expected }.
    //     If ALL results still look like an empty stub (0, 0.0, false, null, "")
    //     the exercise is [TODO]. Otherwise every row must match for [PASS].
    // ID: Membandingkan setiap baris: { panggilan, hasil, harapan }.
    //     Kalau SEMUA hasil masih seperti stub kosong (0, 0.0, false, null, "")
    //     soalnya [TODO]. Selain itu semua baris harus cocok supaya [PASS].
    static int check(int number, String title, String[][] cases) {
        boolean untouched = true;
        for (String[] row : cases) {
            if (!isStubValue("" + row[1])) {
                untouched = false;
            }
        }
        if (untouched) {
            System.out.printf("[TODO] Exercise %2d: %s%n", number, title);
            return 0;
        }
        for (String[] row : cases) {
            String got = "" + row[1];
            if (!got.equals(row[2])) {
                System.out.printf("[FAIL] Exercise %2d: %s%n", number, title);
                System.out.println("         " + row[0]);
                System.out.println("         expected: " + row[2]);
                System.out.println("         got:      " + got);
                return 0;
            }
        }
        System.out.printf("[PASS] Exercise %2d: %s%n", number, title);
        return 1;
    }

    static boolean isStubValue(String value) {
        return value.equals("") || value.equals("null") || value.equals("0")
                || value.equals("0.0") || value.equals("false");
    }

    // EN: Rounds a double to 2 decimals so 78.5398... and 78.54 count as equal.
    // ID: Membulatkan double ke 2 desimal supaya 78.5398... dan 78.54 dianggap sama.
    static String num(double value) {
        return "" + (Math.round(value * 100) / 100.0);
    }


    // #######################################################################
    //                    EXERCISES START HERE / SOAL MULAI DI SINI
    // #######################################################################


    // =======================================================================
    // Exercise 1 / Soal 1: BankAccount (encapsulation / enkapsulasi)
    // EN: The fields are private, so the only way in is through the methods.
    //     - Constructor: save owner. If initialBalance is negative, start at 0.
    //     - getOwner(), getBalance(): return the fields.
    //     - setOwner(newOwner): ignore a blank name (use isBlank()).
    //     - deposit(amount): only amount > 0 is accepted -> add it, return true.
    //       Otherwise change nothing and return false.
    //     - withdraw(amount): only amount > 0 AND amount <= balance is accepted
    //       -> subtract it, return true. Otherwise return false.
    //     There is NO setBalance(): money only moves through deposit/withdraw.
    // ID: Field-nya private, jadi satu-satunya jalan masuk adalah lewat method.
    //     - Constructor: simpan owner. Kalau initialBalance negatif, mulai dari 0.
    //     - getOwner(), getBalance(): kembalikan field-nya.
    //     - setOwner(newOwner): abaikan nama kosong (pakai isBlank()).
    //     - deposit(amount): hanya amount > 0 yang diterima -> tambahkan, return true.
    //       Selain itu jangan ubah apa pun dan return false.
    //     - withdraw(amount): hanya amount > 0 DAN amount <= balance yang diterima
    //       -> kurangi, return true. Selain itu return false.
    //     TIDAK ADA setBalance(): uang hanya berpindah lewat deposit/withdraw.
    //
    // Example / Contoh:
    //     BankAccount acc = new BankAccount("Budi", -5000);
    //     acc.getBalance()      -> 0
    //     acc.deposit(30000)    -> true   (balance 30000)
    //     acc.withdraw(50000)   -> false  (balance stays 30000 / tetap 30000)
    // =======================================================================
    static class BankAccount {
        private String owner;
        private int balance;

        BankAccount(String owner, int initialBalance) {
            // TODO
        }

        public String getOwner() {
            // TODO
            return null;
        }

        public int getBalance() {
            // TODO
            return 0;
        }

        public void setOwner(String newOwner) {
            // TODO
        }

        public boolean deposit(int amount) {
            // TODO
            return false;
        }

        public boolean withdraw(int amount) {
            // TODO
            return false;
        }
    }


    // =======================================================================
    // Exercise 2 / Soal 2: StudentScore (setter with validation / setter dengan validasi)
    // EN: - setScore(score): accept only 0-100. Outside that range, keep the
    //       OLD score (do nothing).
    //     - The constructor saves the name and calls setScore(score), so an
    //       invalid starting score leaves the score at 0.
    //     - getName(), getScore(): return the fields.
    //     - getGrade(): UNAIR letter grade of the score:
    //       A >= 85, AB >= 80, B >= 75, BC >= 70, C >= 65, D >= 50, else E
    // ID: - setScore(score): hanya terima 0-100. Di luar itu, simpan nilai
    //       yang LAMA (jangan lakukan apa-apa).
    //     - Constructor menyimpan nama dan memanggil setScore(score), jadi nilai
    //       awal yang tidak valid membuat score tetap 0.
    //     - getName(), getScore(): kembalikan field-nya.
    //     - getGrade(): huruf nilai UNAIR dari score:
    //       A >= 85, AB >= 80, B >= 75, BC >= 70, C >= 65, D >= 50, selain itu E
    //
    // Example / Contoh:
    //     StudentScore ana = new StudentScore("Ana", 88);
    //     ana.setScore(150);     // ignored / diabaikan
    //     ana.getScore()   -> 88
    //     ana.getGrade()   -> "A"
    // =======================================================================
    static class StudentScore {
        private String name;
        private int score;

        StudentScore(String name, int score) {
            // TODO
        }

        public String getName() {
            // TODO
            return null;
        }

        public int getScore() {
            // TODO
            return 0;
        }

        public void setScore(int score) {
            // TODO
        }

        public String getGrade() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 3 / Soal 3: QueueTicket (static)
    // EN: A queue machine at the academic office. totalTickets is static, so
    //     ONE counter is shared by every ticket. number belongs to EACH ticket.
    //     - Constructor: add 1 to totalTickets, then give THIS ticket that number.
    //     - getNumber(): this ticket's number (it never changes).
    //     - getTotalTickets() (static): how many tickets since the last reset.
    //     - resetAll() (static): a new day, set totalTickets back to 0.
    //       Old tickets keep their numbers.
    //     Careful: if `number` were static too, every ticket would show the
    //     same number.
    // ID: Mesin antrean di bagian akademik. totalTickets bersifat static, jadi
    //     SATU penghitung dipakai bersama semua tiket. number milik SETIAP tiket.
    //     - Constructor: tambah 1 ke totalTickets, lalu berikan nomor itu ke tiket INI.
    //     - getNumber(): nomor tiket ini (tidak pernah berubah).
    //     - getTotalTickets() (static): jumlah tiket sejak reset terakhir.
    //     - resetAll() (static): hari baru, kembalikan totalTickets ke 0.
    //       Tiket lama tetap menyimpan nomornya.
    //     Hati-hati: kalau `number` juga static, semua tiket akan menampilkan
    //     nomor yang sama.
    //
    // Example / Contoh:
    //     QueueTicket a = new QueueTicket();
    //     QueueTicket b = new QueueTicket();
    //     a.getNumber()                   -> 1
    //     b.getNumber()                   -> 2
    //     QueueTicket.getTotalTickets()   -> 2
    // =======================================================================
    static class QueueTicket {
        private static int totalTickets = 0;
        private int number;

        QueueTicket() {
            // TODO
        }

        public int getNumber() {
            // TODO
            return 0;
        }

        public static int getTotalTickets() {
            // TODO
            return 0;
        }

        public static void resetAll() {
            // TODO
        }
    }


    // =======================================================================
    // Exercise 4 / Soal 4: Person -> Student / Lecturer (inheritance + @Override)
    // EN: - Person: save the name, getName(), introduce() returns
    //       "Hi, I'm <name>."
    //     - Student extends Person: save program, getProgram(), and override
    //       introduce() to return  super.introduce() + " I study <program>."
    //     - Lecturer extends Person: save subject, getSubject(), and override
    //       introduce() to return  super.introduce() + " I teach <subject>."
    //     Use super.introduce() instead of writing "Hi, I'm" again.
    //     The name is private in Person: in the children use getName() if needed.
    // ID: - Person: simpan nama, getName(), introduce() mengembalikan
    //       "Hi, I'm <name>."
    //     - Student extends Person: simpan program, getProgram(), lalu override
    //       introduce() supaya mengembalikan  super.introduce() + " I study <program>."
    //     - Lecturer extends Person: simpan subject, getSubject(), lalu override
    //       introduce() supaya mengembalikan  super.introduce() + " I teach <subject>."
    //     Pakai super.introduce(), jangan menulis "Hi, I'm" lagi.
    //     name bersifat private di Person: di class anak pakai getName() kalau perlu.
    //
    // Example / Contoh:
    //     Person p = new Lecturer("Dr. Rina", "Discrete Mathematics");
    //     p.introduce()   -> "Hi, I'm Dr. Rina. I teach Discrete Mathematics."
    // =======================================================================
    static class Person {
        private String name;

        Person(String name) {
            // TODO
        }

        public String getName() {
            // TODO
            return null;
        }

        public String introduce() {
            // TODO
            return "";
        }
    }

    static class Student extends Person {
        private String program;

        Student(String name, String program) {
            super(name);    // given / sudah diberikan
            // TODO
        }

        public String getProgram() {
            // TODO
            return null;
        }

        @Override
        public String introduce() {
            // TODO
            return "";
        }
    }

    static class Lecturer extends Person {
        private String subject;

        Lecturer(String name, String subject) {
            super(name);    // given / sudah diberikan
            // TODO
        }

        public String getSubject() {
            // TODO
            return null;
        }

        @Override
        public String introduce() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 5 / Soal 5: abstract Shape -> Circle / Rectangle
    // EN: Shape is abstract: area() and perimeter() have no body there.
    //     - Circle: area = Math.PI * radius * radius, perimeter = 2 * Math.PI * radius
    //       (Math.PI is a static constant: 3.14159...)
    //     - Rectangle: area = width * height, perimeter = 2 * (width + height)
    //     - isBiggerThan(other) in Shape: return true if THIS shape's area()
    //       is bigger than other.area(). Write it ONCE in Shape; it works for
    //       every child because area() is polymorphic.
    // ID: Shape bersifat abstract: area() dan perimeter() tidak punya isi di sana.
    //     - Circle: luas = Math.PI * radius * radius, keliling = 2 * Math.PI * radius
    //       (Math.PI adalah konstanta static: 3.14159...)
    //     - Rectangle: luas = width * height, keliling = 2 * (width + height)
    //     - isBiggerThan(other) di Shape: return true kalau area() bentuk INI
    //       lebih besar dari other.area(). Tulis SEKALI di Shape; otomatis berlaku
    //       untuk semua anak karena area() bersifat polimorfik.
    //
    // Example / Contoh:
    //     Shape c = new Circle(5);
    //     c.area()                                -> 78.53981633974483
    //     c.isBiggerThan(new Rectangle(4, 2.5))   -> true
    // =======================================================================
    static abstract class Shape {
        public abstract double area();

        public abstract double perimeter();

        public boolean isBiggerThan(Shape other) {
            // TODO
            return false;
        }
    }

    static class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            // TODO
        }

        @Override
        public double area() {
            // TODO
            return 0.0;
        }

        @Override
        public double perimeter() {
            // TODO
            return 0.0;
        }
    }

    static class Rectangle extends Shape {
        private double width;
        private double height;

        Rectangle(double width, double height) {
            // TODO
        }

        @Override
        public double area() {
            // TODO
            return 0.0;
        }

        @Override
        public double perimeter() {
            // TODO
            return 0.0;
        }
    }


    // =======================================================================
    // Exercise 6 / Soal 6: interface Payable
    // EN: Two unrelated classes promise the same two methods.
    //     - TuitionFee: amountToPay() = fee minus the scholarship part.
    //       Multiply FIRST, then divide:  fee * percent / 100
    //       (percent / 100 with ints is 0!)
    //       description(): "Tuition fee (scholarship 25%)", or
    //                      "Tuition fee (no scholarship)" when the percent is 0.
    //     - CanteenOrder: amountToPay() = price * quantity
    //       description(): "Fried rice x2"
    // ID: Dua class yang tidak berhubungan menjanjikan dua method yang sama.
    //     - TuitionFee: amountToPay() = biaya dikurangi bagian beasiswa.
    //       Kalikan DULU, baru bagi:  fee * percent / 100
    //       (percent / 100 dengan int hasilnya 0!)
    //       description(): "Tuition fee (scholarship 25%)", atau
    //                      "Tuition fee (no scholarship)" kalau persennya 0.
    //     - CanteenOrder: amountToPay() = price * quantity
    //       description(): "Fried rice x2"
    //
    // Example / Contoh:
    //     Payable fee = new TuitionFee(5000000, 25);
    //     fee.amountToPay()   -> 3750000
    //     fee.description()   -> "Tuition fee (scholarship 25%)"
    // =======================================================================
    interface Payable {
        int amountToPay();

        String description();
    }

    static class TuitionFee implements Payable {
        private int feePerSemester;
        private int scholarshipPercent;

        TuitionFee(int feePerSemester, int scholarshipPercent) {
            // TODO
        }

        @Override
        public int amountToPay() {
            // TODO
            return 0;
        }

        @Override
        public String description() {
            // TODO
            return "";
        }
    }

    static class CanteenOrder implements Payable {
        private String menu;
        private int price;
        private int quantity;

        CanteenOrder(String menu, int price, int quantity) {
            // TODO
        }

        @Override
        public int amountToPay() {
            // TODO
            return 0;
        }

        @Override
        public String description() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 7 / Soal 7 (Challenge): ShapeStats (static + polymorphism)
    // EN: Two static methods that work on an array of ANY shapes (Exercise 5).
    //     You don't need to know if a shape is a Circle or a Rectangle:
    //     just call area().
    //     - totalArea(shapes): the sum of area() of every shape. Empty -> 0.0
    //     - largest(shapes): the Shape OBJECT with the biggest area().
    //       Empty array -> null. Hint: isBiggerThan() from Exercise 5.
    // ID: Dua method static yang bekerja pada array berisi bentuk APA SAJA (Soal 5).
    //     Kamu tidak perlu tahu apakah bentuknya Circle atau Rectangle:
    //     cukup panggil area().
    //     - totalArea(shapes): jumlah area() semua bentuk. Kosong -> 0.0
    //     - largest(shapes): OBJECT Shape dengan area() terbesar.
    //       Array kosong -> null. Petunjuk: isBiggerThan() dari Soal 5.
    //
    // Example / Contoh:
    //     Shape[] garden = { new Circle(1), new Rectangle(4, 2.5), new Circle(2) };
    //     ShapeStats.totalArea(garden)        -> 25.707963267948966
    //     ShapeStats.largest(garden).area()   -> 12.566370614359172  (the Circle(2))
    // =======================================================================
    static class ShapeStats {

        public static double totalArea(Shape[] shapes) {
            // TODO
            return 0.0;
        }

        public static Shape largest(Shape[] shapes) {
            // TODO
            return null;
        }
    }


    // =======================================================================
    // Exercise 8 / Soal 8 (Challenge): Employee hierarchy
    // EN: Every employee is paid differently (amounts in Rupiah, int).
    //     - Employee (abstract): save the name, getName().
    //       monthlySalary() is abstract.
    //       toString() returns "<name>: Rp <monthlySalary()>", e.g. "Rina: Rp 6500000"
    //       totalPayroll(staff) (static): sum of monthlySalary() of all. Empty -> 0
    //     - FullTimeEmployee: baseSalary + ALLOWANCE
    //     - PartTimeEmployee: hourlyRate * hoursWorked, BUT hours above
    //       NORMAL_HOURS (80) are overtime and paid DOUBLE the rate.
    //       90 hours at 40000 -> 80 * 40000 + 10 * 80000 = 4000000
    //     - Manager extends FullTimeEmployee: the full-time salary
    //       (use super.monthlySalary()) + teamSize * BONUS_PER_MEMBER
    // ID: Setiap karyawan dibayar dengan cara berbeda (dalam Rupiah, int).
    //     - Employee (abstract): simpan nama, getName().
    //       monthlySalary() bersifat abstract.
    //       toString() mengembalikan "<nama>: Rp <monthlySalary()>", misal "Rina: Rp 6500000"
    //       totalPayroll(staff) (static): jumlah monthlySalary() semua. Kosong -> 0
    //     - FullTimeEmployee: baseSalary + ALLOWANCE
    //     - PartTimeEmployee: hourlyRate * hoursWorked, TAPI jam di atas
    //       NORMAL_HOURS (80) adalah lembur dan dibayar DUA KALI lipat.
    //       90 jam dengan tarif 40000 -> 80 * 40000 + 10 * 80000 = 4000000
    //     - Manager extends FullTimeEmployee: gaji full-time
    //       (pakai super.monthlySalary()) + teamSize * BONUS_PER_MEMBER
    //
    // Example / Contoh:
    //     Employee dewi = new Manager("Dewi", 9000000, 4);
    //     dewi.monthlySalary()  -> 10500000   (9000000 + 500000 + 4 * 250000)
    //     dewi.toString()       -> "Dewi: Rp 10500000"
    // =======================================================================
    static abstract class Employee {
        private String name;

        Employee(String name) {
            // TODO
        }

        public String getName() {
            // TODO
            return null;
        }

        public abstract int monthlySalary();

        @Override
        public String toString() {
            // TODO
            return "";
        }

        public static int totalPayroll(Employee[] staff) {
            // TODO
            return 0;
        }
    }

    static class FullTimeEmployee extends Employee {
        public static final int ALLOWANCE = 500000;
        private int baseSalary;

        FullTimeEmployee(String name, int baseSalary) {
            super(name);    // given / sudah diberikan
            // TODO
        }

        @Override
        public int monthlySalary() {
            // TODO
            return 0;
        }
    }

    static class PartTimeEmployee extends Employee {
        public static final int NORMAL_HOURS = 80;
        private int hourlyRate;
        private int hoursWorked;

        PartTimeEmployee(String name, int hourlyRate, int hoursWorked) {
            super(name);    // given / sudah diberikan
            // TODO
        }

        @Override
        public int monthlySalary() {
            // TODO
            return 0;
        }
    }

    static class Manager extends FullTimeEmployee {
        public static final int BONUS_PER_MEMBER = 250000;
        private int teamSize;

        Manager(String name, int baseSalary, int teamSize) {
            super(name, baseSalary);    // given / sudah diberikan
            // TODO
        }

        @Override
        public int monthlySalary() {
            // TODO
            return 0;
        }
    }
}
