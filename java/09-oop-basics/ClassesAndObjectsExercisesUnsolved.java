/*
 * Topic 09 - Classes & Objects Exercises (UNSOLVED)
 * Topik 09 - Latihan Class & Object (BELUM DIKERJAKAN)
 * =====================================================
 * EN - How to use:
 *     1. Scroll down PAST the checker to the exercise classes.
 *        Fill in every part marked // TODO.
 *     2. Run:  java ClassesAndObjectsExercisesUnsolved.java
 *     3. The checker in main() tests your classes:
 *        [TODO] = not started, [FAIL] = wrong answer, [PASS] = correct
 *
 * ID - Cara pakai:
 *     1. Scroll ke bawah MELEWATI checker sampai ke class-class soal.
 *        Isi setiap bagian yang bertanda // TODO.
 *     2. Jalankan:  java ClassesAndObjectsExercisesUnsolved.java
 *     3. Checker di main() menguji class buatanmu:
 *        [TODO] = belum dikerjakan, [FAIL] = jawaban salah, [PASS] = benar
 *
 * Where are the classes? / Di mana class-class soalnya?
 *     EN: main() with the checker comes first. Your exercise classes live
 *         INSIDE the main class as `static class ...`, below the checker,
 *         so the file is self-contained and VS Code doesn't report
 *         duplicate classes. In real projects each class gets its own file
 *         (Student.java) and the word static isn't needed there.
 *         Accept `static` for now; Topic 10 explains it.
 *     ID: main() berisi checker ada di paling atas. Class-class soal tinggal
 *         DI DALAM class utama sebagai `static class ...`, di bawah checker,
 *         supaya file ini berdiri sendiri dan VS Code tidak melaporkan class
 *         ganda. Di proyek sungguhan setiap class punya file sendiri
 *         (Student.java) dan kata static tidak diperlukan di sana.
 *         Terima dulu kata `static`; Topik 10 menjelaskannya.
 *
 * Rules / Aturan:
 *     - Only use Topic 01-09 material (no private, no extends, and no
 *       `static` of your own: the given `static class` lines are the only ones).
 *       Hanya pakai materi Topik 01-09 (belum boleh private, extends, dan
 *       `static` buatan sendiri: hanya baris `static class` yang diberikan).
 *     - NO HARDCODING: the checker tests every class with several different
 *       objects, so a fixed answer will fail.
 *       JANGAN HARDCODE: checker menguji setiap class dengan beberapa object
 *       berbeda, jadi jawaban yang ditulis mati pasti gagal.
 *     - Don't change the checker, and don't rename the given classes, fields,
 *       methods, or parameters. You MAY add your own extra methods.
 *       Jangan ubah checker, dan jangan ganti nama class, field, method, atau
 *       parameter yang sudah diberikan. Kamu BOLEH menambah method sendiri.
 *     - Exercise 7 uses your CartItem (Exercise 6) and Exercise 8 uses your
 *       Student (Exercise 5). Finish those first.
 *       Soal 7 memakai CartItem (Soal 6) dan Soal 8 memakai Student (Soal 5).
 *       Selesaikan yang itu dulu.
 *
 * Self-check / Cek sendiri:
 *     EN: You may make your own objects at the start of main() (above the
 *         checker), e.g. a Student with your own scores, print the results
 *         and check them by hand. If your class only works for the checker's
 *         objects, something is hardcoded.
 *     ID: Kamu boleh membuat object sendiri di awal main() (di atas checker),
 *         misalnya Student dengan nilaimu sendiri, cetak hasilnya, lalu cek
 *         manual. Kalau class-mu hanya benar untuk object di checker, berarti
 *         ada yang di-hardcode.
 *     EN: If the program crashes (e.g. NullPointerException), read the line
 *         number in the error message: it points to the line that broke.
 *         Often it's a field you forgot to fill in the constructor.
 *     ID: Kalau program crash (misal NullPointerException), baca nomor baris
 *         di pesan error-nya: itu menunjuk baris yang bermasalah. Biasanya
 *         ada field yang lupa diisi di constructor.
 *
 * IMPORTANT / PENTING:
 *     EN: When you save your answers as ClassesAndObjectsExercisesSolved.java,
 *         rename the public class below to ClassesAndObjectsExercisesSolved too.
 *     ID: Saat menyimpan jawaban sebagai ClassesAndObjectsExercisesSolved.java,
 *         ganti juga nama public class di bawah menjadi ClassesAndObjectsExercisesSolved.
 */
import java.util.ArrayList;

public class ClassesAndObjectsExercisesUnsolved {

    public static void main(String[] args) {

        // EN: You may test your own objects here.
        // ID: Kamu boleh mencoba object buatanmu sendiri di sini.



        // -------------------------------------------------------------------
        // CHECKER - do not edit below this line / jangan ubah bagian di bawah ini
        // Each row: { what was called, what your code gave, expected value }
        // Setiap baris: { yang dipanggil, hasil kodemu, nilai yang diharapkan }
        // -------------------------------------------------------------------
        System.out.println("=============================================");
        System.out.println("  Topic 09 - Classes & Objects Exercises");
        System.out.println("=============================================");
        int score = 0;

        // ----- Exercise 1: Course -----
        Course calculus = new Course("Calculus", 3);
        Course english = new Course("English", 2);
        Course orientation = new Course("Campus Orientation", 1);
        String[][] cases1 = {
            { "calculus.name", "" + calculus.name, "Calculus" },
            { "english.credits", "" + english.credits, "2" },
            { "calculus.describe()", calculus.describe(), "Calculus (3 credits)" },
            { "english.describe()", english.describe(), "English (2 credits)" },
            { "orientation.describe()", orientation.describe(), "Campus Orientation (1 credit)" },
        };
        score += check(1, "Course", cases1);

        // ----- Exercise 2: Rectangle -----
        Rectangle board = new Rectangle(4.0, 2.5);
        Rectangle tile = new Rectangle(3.0, 3.0);
        Rectangle desk = new Rectangle(1.2, 0.6);
        String[][] cases2 = {
            { "board.width", num(board.width), "4.0" },
            { "board.area()", num(board.area()), "10.0" },
            { "board.perimeter()", num(board.perimeter()), "13.0" },
            { "board.isSquare()", "" + board.isSquare(), "false" },
            { "tile.area()", num(tile.area()), "9.0" },
            { "tile.perimeter()", num(tile.perimeter()), "12.0" },
            { "tile.isSquare()", "" + tile.isSquare(), "true" },
            { "desk.area()", num(desk.area()), "0.72" },
            { "desk.perimeter()", num(desk.perimeter()), "3.6" },
        };
        score += check(2, "Rectangle", cases2);

        // ----- Exercise 3: Counter -----
        Counter present = new Counter("Present");
        Counter late = new Counter("Late");
        present.increment();
        present.increment();
        present.increment();
        late.increment();
        String presentAfterThree = "" + present.count;
        String lateAfterOne = "" + late.count;
        present.reset();
        String[][] cases3 = {
            { "present.label", "" + present.label, "Present" },
            { "present.count after 3x increment()", presentAfterThree, "3" },
            { "late.count after 1x increment()", lateAfterOne, "1" },
            { "present.count after present.reset()", "" + present.count, "0" },
            { "late.count after present.reset()", "" + late.count, "1" },
        };
        score += check(3, "Counter", cases3);

        // ----- Exercise 4: BankAccount -----
        BankAccount excellAccount = new BankAccount("Excell", 100000);
        BankAccount budiAccount = new BankAccount("Budi", 20000);
        String[][] cases4 = {
            { "excellAccount.owner", "" + excellAccount.owner, "Excell" },
            { "excellAccount.balance", "" + excellAccount.balance, "100000" },
            { "excellAccount.deposit(50000)", "" + excellAccount.deposit(50000), "true" },
            { "excellAccount.balance", "" + excellAccount.balance, "150000" },
            { "excellAccount.deposit(-5000)", "" + excellAccount.deposit(-5000), "false" },
            { "excellAccount.withdraw(200000)", "" + excellAccount.withdraw(200000), "false" },
            { "excellAccount.balance", "" + excellAccount.balance, "150000" },
            { "excellAccount.withdraw(30000)", "" + excellAccount.withdraw(30000), "true" },
            { "excellAccount.balance", "" + excellAccount.balance, "120000" },
            { "budiAccount.withdraw(20000)", "" + budiAccount.withdraw(20000), "true" },
            { "budiAccount.balance", "" + budiAccount.balance, "0" },
            { "budiAccount.withdraw(1)", "" + budiAccount.withdraw(1), "false" },
            { "budiAccount.withdraw(0)", "" + budiAccount.withdraw(0), "false" },
        };
        score += check(4, "BankAccount", cases4);

        // ----- Exercise 5: Student -----
        int[] anaScores = {88, 92, 79};
        int[] budiScores = {70, 65, 81};
        int[] citraScores = {60, 45, 52};
        int[] dinaScores = {85, 84, 85};
        int[] ekoScores = {40, 55, 38};
        Student ana = new Student("Ana", "434251001", anaScores);
        Student budi = new Student("Budi", "434251002", budiScores);
        Student citra = new Student("Citra", "434251003", citraScores);
        Student dina = new Student("Dina", "434251004", dinaScores);
        Student eko = new Student("Eko", "434251005", ekoScores);
        String[][] cases5 = {
            { "ana.id", "" + ana.id, "434251001" },
            { "ana.average()", num(ana.average()), "86.33" },
            { "budi.average()", num(budi.average()), "72.0" },
            { "dina.average()", num(dina.average()), "84.67" },
            { "ana.grade()", ana.grade(), "A" },
            { "budi.grade()", budi.grade(), "BC" },
            { "citra.grade()", citra.grade(), "D" },
            { "dina.grade()", dina.grade(), "AB" },
            { "eko.grade()", eko.grade(), "E" },
            { "ana.toString()", ana.toString(), "Ana (434251001) - A" },
            { "citra.toString()", citra.toString(), "Citra (434251003) - D" },
        };
        score += check(5, "Student", cases5);

        // ----- Exercise 6: CartItem -----
        CartItem notebook = new CartItem("Notebook", 25000, 3);
        CartItem pen = new CartItem("Pen", 4500, 4);
        CartItem bread = new CartItem("Bread", 15000, 1);
        String[][] cases6 = {
            { "notebook.price", "" + notebook.price, "25000" },
            { "notebook.subtotal()", "" + notebook.subtotal(), "75000" },
            { "pen.subtotal()", "" + pen.subtotal(), "18000" },
            { "bread.subtotal()", "" + bread.subtotal(), "15000" },
            { "notebook.toString()", notebook.toString(), "Notebook x3 = 75000" },
            { "pen.toString()", pen.toString(), "Pen x4 = 18000" },
        };
        score += check(6, "CartItem", cases6);

        // ----- Exercise 7: ShoppingCart -----
        ShoppingCart weeklyCart = new ShoppingCart();
        weeklyCart.addItem(notebook);
        weeklyCart.addItem(pen);
        weeklyCart.addItem(bread);
        ShoppingCart quickCart = new ShoppingCart();
        quickCart.addItem(pen);
        ShoppingCart emptyCart = new ShoppingCart();
        String[][] cases7 = {
            { "weeklyCart.totalQuantity()", "" + weeklyCart.totalQuantity(), "8" },
            { "weeklyCart.total()", "" + weeklyCart.total(), "108000" },
            { "quickCart.totalQuantity()", "" + quickCart.totalQuantity(), "4" },
            { "quickCart.total()", "" + quickCart.total(), "18000" },
            { "emptyCart.totalQuantity()", "" + emptyCart.totalQuantity(), "0" },
            { "emptyCart.total()", "" + emptyCart.total(), "0" },
        };
        score += check(7, "ShoppingCart", cases7);

        // ----- Exercise 8: Classroom (Challenge) -----
        Classroom classA = new Classroom("PDB-A");
        classA.addStudent(budi);
        classA.addStudent(citra);
        classA.addStudent(ana);
        classA.addStudent(dina);
        Classroom classB = new Classroom("PDB-B");
        classB.addStudent(citra);
        classB.addStudent(eko);
        classB.addStudent(budi);
        Classroom classC = new Classroom("PDB-C");
        Student topA = classA.topStudent();
        Student topB = classB.topStudent();
        Student topC = classC.topStudent();
        String[][] cases8 = {
            { "classA.name", "" + classA.name, "PDB-A" },
            { "classA.topStudent().name", topA == null ? "null" : topA.name, "Ana" },
            { "classB.topStudent().name", topB == null ? "null" : topB.name, "Budi" },
            { "classC.topStudent() (empty class)", topC == null ? "null" : topC.name, "null" },
            { "classA.passRate()", num(classA.passRate()), "75.0" },
            { "classB.passRate()", num(classB.passRate()), "33.33" },
            { "classC.passRate() (empty class)", num(classC.passRate()), "0.0" },
        };
        score += check(8, "Classroom", cases8);

        // ----- Exercise 9: Book + Library (Challenge) -----
        Book algoBook = new Book("Introduction to Algorithms", "Thomas H. Cormen", 2009);
        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 2008);
        Book unlocked = new Book("Algorithms Unlocked", "Thomas H. Cormen", 2013);
        Book discrete = new Book("Discrete Mathematics and Its Applications", "Kenneth H. Rosen", 2018);
        Book laskar = new Book("Laskar Pelangi", "Andrea Hirata", 2005);
        Library campusLibrary = new Library();
        campusLibrary.addBook(algoBook);
        campusLibrary.addBook(cleanCode);
        campusLibrary.addBook(unlocked);
        campusLibrary.addBook(discrete);
        Library homeShelf = new Library();
        homeShelf.addBook(laskar);
        homeShelf.addBook(cleanCode);
        Book found1 = campusLibrary.findByTitle("clean code");
        Book found2 = campusLibrary.findByTitle("ALGORITHMS UNLOCKED");
        Book found3 = campusLibrary.findByTitle("Laskar Pelangi");
        Book found4 = homeShelf.findByTitle("laskar pelangi");
        String[][] cases9 = {
            { "algoBook.author", "" + algoBook.author, "Thomas H. Cormen" },
            { "campusLibrary.findByTitle(\"clean code\").author", found1 == null ? "null" : found1.author, "Robert C. Martin" },
            { "campusLibrary.findByTitle(\"ALGORITHMS UNLOCKED\").year", found2 == null ? "null" : "" + found2.year, "2013" },
            { "campusLibrary.findByTitle(\"Laskar Pelangi\")", found3 == null ? "null" : found3.title, "null" },
            { "homeShelf.findByTitle(\"laskar pelangi\").author", found4 == null ? "null" : found4.author, "Andrea Hirata" },
            { "campusLibrary.searchTitles(\"algorithm\")", "" + campusLibrary.searchTitles("algorithm"), "[Introduction to Algorithms, Algorithms Unlocked]" },
            { "campusLibrary.searchTitles(\"MATH\")", "" + campusLibrary.searchTitles("MATH"), "[Discrete Mathematics and Its Applications]" },
            { "homeShelf.searchTitles(\"code\")", "" + homeShelf.searchTitles("code"), "[Clean Code]" },
            { "homeShelf.searchTitles(\"python\")", "" + homeShelf.searchTitles("python"), "[]" },
        };
        score += check(9, "Book + Library", cases9);

        System.out.println("=============================================");
        System.out.println("  Score: " + score + " / 9");
        if (score == 9) {
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

    // EN: Rounds a double to 2 decimals so 0.7199999 and 0.72 count as equal.
    // ID: Membulatkan double ke 2 desimal supaya 0.7199999 dan 0.72 dianggap sama.
    static String num(double value) {
        return "" + (Math.round(value * 100) / 100.0);
    }


    // #######################################################################
    //                    EXERCISES START HERE / SOAL MULAI DI SINI
    // #######################################################################


    // =======================================================================
    // Exercise 1 / Soal 1: Course
    // EN: Finish the constructor so it saves both parameters into the fields
    //     (use `this.`). Then make describe() return the course like this:
    //         "Calculus (3 credits)"
    //     When credits is exactly 1, write "credit" (no s):
    //         "Campus Orientation (1 credit)"
    // ID: Lengkapi constructor supaya menyimpan kedua parameter ke field
    //     (pakai `this.`). Lalu buat describe() mengembalikan mata kuliah
    //     seperti contoh di atas. Kalau credits tepat 1, tulis "credit" (tanpa s).
    //
    // Example / Contoh:
    //     Course calculus = new Course("Calculus", 3);
    //     calculus.name        -> "Calculus"
    //     calculus.describe()  -> "Calculus (3 credits)"
    // =======================================================================
    static class Course {
        String name;
        int credits;

        Course(String name, int credits) {
            // TODO
        }

        String describe() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 2 / Soal 2: Rectangle
    // EN: Finish the constructor, then:
    //     - area()      returns width * height
    //     - perimeter() returns 2 * (width + height)
    //     - isSquare()  returns true if width and height are equal
    // ID: Lengkapi constructor, lalu:
    //     - area()      mengembalikan width * height (luas)
    //     - perimeter() mengembalikan 2 * (width + height) (keliling)
    //     - isSquare()  mengembalikan true kalau width dan height sama (persegi)
    //
    // Example / Contoh:
    //     Rectangle board = new Rectangle(4.0, 2.5);
    //     board.area()       -> 10.0
    //     board.perimeter()  -> 13.0
    //     board.isSquare()   -> false
    // =======================================================================
    static class Rectangle {
        double width;
        double height;

        Rectangle(double width, double height) {
            // TODO
        }

        double area() {
            // TODO
            return 0.0;
        }

        double perimeter() {
            // TODO
            return 0.0;
        }

        boolean isSquare() {
            // TODO
            return false;
        }
    }


    // =======================================================================
    // Exercise 3 / Soal 3: Counter
    // EN: A tally counter for attendance. The constructor saves the label and
    //     the count starts at 0.
    //     - increment() adds 1 to count
    //     - reset()     sets count back to 0
    //     Every Counter object must keep its OWN count.
    // ID: Penghitung untuk presensi. Constructor menyimpan label dan count
    //     dimulai dari 0.
    //     - increment() menambah count sebanyak 1
    //     - reset()     mengembalikan count ke 0
    //     Setiap object Counter harus menyimpan count-nya SENDIRI.
    //
    // Example / Contoh:
    //     Counter present = new Counter("Present");
    //     present.increment();
    //     present.increment();
    //     present.count    -> 2
    //     present.reset();
    //     present.count    -> 0
    // =======================================================================
    static class Counter {
        String label;
        int count;

        Counter(String label) {
            // TODO
        }

        void increment() {
            // TODO
        }

        void reset() {
            // TODO
        }
    }


    // =======================================================================
    // Exercise 4 / Soal 4: BankAccount
    // EN: Finish the constructor (owner and starting balance), then:
    //     - deposit(amount): if amount is more than 0, add it to balance and
    //       return true. Otherwise change nothing and return false.
    //     - withdraw(amount): if amount is more than 0 AND not more than the
    //       balance, subtract it and return true. Otherwise change nothing and
    //       return false (no overdraft / saldo tidak boleh minus).
    // ID: Lengkapi constructor (pemilik dan saldo awal), lalu:
    //     - deposit(amount): kalau amount lebih dari 0, tambahkan ke balance
    //       dan kembalikan true. Kalau tidak, jangan ubah apa pun dan kembalikan false.
    //     - withdraw(amount): kalau amount lebih dari 0 DAN tidak lebih besar
    //       dari balance, kurangi balance dan kembalikan true. Kalau tidak,
    //       jangan ubah apa pun dan kembalikan false.
    //
    // Example / Contoh:
    //     BankAccount acc = new BankAccount("Excell", 100000);
    //     acc.deposit(50000)    -> true    (balance 150000)
    //     acc.withdraw(200000)  -> false   (balance stays 150000 / tetap 150000)
    // =======================================================================
    static class BankAccount {
        String owner;
        int balance;

        BankAccount(String owner, int balance) {
            // TODO
        }

        boolean deposit(int amount) {
            // TODO
            return false;
        }

        boolean withdraw(int amount) {
            // TODO
            return false;
        }
    }


    // =======================================================================
    // Exercise 5 / Soal 5: Student
    // EN: Finish the constructor, then:
    //     - average()  returns the average of all scores as a double
    //                  (careful: int / int cuts the decimals)
    //     - grade()    returns the UNAIR letter grade of the average:
    //                  A >= 85, AB >= 80, B >= 75, BC >= 70, C >= 65, D >= 50, else E
    //                  (84.67 is AB, not A: don't round the average)
    //     - toString() returns  name (id) - grade,  e.g. "Ana (434251001) - A"
    //     Hint: grade() and toString() can call your other methods.
    // ID: Lengkapi constructor, lalu:
    //     - average()  mengembalikan rata-rata semua nilai sebagai double
    //                  (hati-hati: int / int memotong desimal)
    //     - grade()    mengembalikan huruf nilai UNAIR dari rata-rata:
    //                  A >= 85, AB >= 80, B >= 75, BC >= 70, C >= 65, D >= 50, selain itu E
    //                  (84.67 itu AB, bukan A: jangan bulatkan rata-ratanya)
    //     - toString() mengembalikan  nama (id) - grade,  misal "Ana (434251001) - A"
    //     Petunjuk: grade() dan toString() boleh memanggil method lain buatanmu.
    //
    // Example / Contoh:
    //     int[] anaScores = {88, 92, 79};
    //     Student ana = new Student("Ana", "434251001", anaScores);
    //     ana.average()   -> 86.33333333333333
    //     ana.grade()     -> "A"
    //     ana.toString()  -> "Ana (434251001) - A"
    // =======================================================================
    static class Student {
        String name;
        String id;
        int[] scores;

        Student(String name, String id, int[] scores) {
            // TODO
        }

        double average() {
            // TODO
            return 0.0;
        }

        String grade() {
            // TODO
            return "";
        }

        public String toString() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 6 / Soal 6: CartItem
    // EN: One line in a shopping cart. Finish the constructor, then:
    //     - subtotal() returns price * quantity
    //     - toString() returns  name xQuantity = subtotal,  e.g. "Notebook x3 = 75000"
    // ID: Satu baris di keranjang belanja. Lengkapi constructor, lalu:
    //     - subtotal() mengembalikan price * quantity
    //     - toString() mengembalikan  nama xJumlah = subtotal,  misal "Notebook x3 = 75000"
    //
    // Example / Contoh:
    //     CartItem pen = new CartItem("Pen", 4500, 4);
    //     pen.subtotal()   -> 18000
    //     pen.toString()   -> "Pen x4 = 18000"
    // =======================================================================
    static class CartItem {
        String name;
        int price;
        int quantity;

        CartItem(String name, int price, int quantity) {
            // TODO
        }

        int subtotal() {
            // TODO
            return 0;
        }

        public String toString() {
            // TODO
            return "";
        }
    }


    // =======================================================================
    // Exercise 7 / Soal 7: ShoppingCart
    // EN: A cart holds an ArrayList of CartItem objects (Exercise 6).
    //     - The constructor creates the EMPTY list (items = new ArrayList<>();)
    //       If you forget this, items stays null and addItem() crashes.
    //     - addItem(item)    adds one CartItem to the list
    //     - totalQuantity()  returns the sum of the quantity of every item
    //     - total()          returns the sum of subtotal() of every item
    //     An empty cart returns 0 for both.
    // ID: Keranjang menyimpan ArrayList berisi object CartItem (Soal 6).
    //     - Constructor membuat list KOSONG (items = new ArrayList<>();)
    //       Kalau lupa, items tetap null dan addItem() akan crash.
    //     - addItem(item)    menambahkan satu CartItem ke list
    //     - totalQuantity()  mengembalikan jumlah quantity semua item
    //     - total()          mengembalikan jumlah subtotal() semua item
    //     Keranjang kosong mengembalikan 0 untuk keduanya.
    //
    // Example / Contoh:
    //     ShoppingCart cart = new ShoppingCart();
    //     cart.addItem(new CartItem("Notebook", 25000, 3));
    //     cart.addItem(new CartItem("Pen", 4500, 4));
    //     cart.totalQuantity()  -> 7
    //     cart.total()          -> 93000
    // =======================================================================
    static class ShoppingCart {
        ArrayList<CartItem> items;

        ShoppingCart() {
            // TODO
        }

        void addItem(CartItem item) {
            // TODO
        }

        int totalQuantity() {
            // TODO
            return 0;
        }

        int total() {
            // TODO
            return 0;
        }
    }


    // =======================================================================
    // Exercise 8 / Soal 8 (Challenge): Classroom
    // EN: A classroom holds an ArrayList of Student objects (Exercise 5).
    //     - The constructor saves the name and creates the EMPTY list.
    //     - addStudent(student) adds one Student to the list
    //     - topStudent() returns the Student OBJECT with the highest average().
    //       If the class is empty, return null.
    //     - passRate() returns the percentage (0-100) of students whose
    //       average() is 65 or more (grade C or better). Empty class -> 0.0
    //       Watch out for int / int when you calculate the percentage.
    // ID: Kelas menyimpan ArrayList berisi object Student (Soal 5).
    //     - Constructor menyimpan nama dan membuat list KOSONG.
    //     - addStudent(student) menambahkan satu Student ke list
    //     - topStudent() mengembalikan OBJECT Student dengan average() tertinggi.
    //       Kalau kelasnya kosong, kembalikan null.
    //     - passRate() mengembalikan persentase (0-100) mahasiswa yang average()-nya
    //       65 ke atas (minimal C). Kelas kosong -> 0.0
    //       Hati-hati dengan int / int saat menghitung persentase.
    //
    // Example / Contoh (with the students from the checker / memakai mahasiswa di checker):
    //     classA has budi (72.0), citra (52.33), ana (86.33), dina (84.67)
    //     classA.topStudent().name  -> "Ana"
    //     classA.passRate()         -> 75.0   (3 of 4 / 3 dari 4)
    // =======================================================================
    static class Classroom {
        String name;
        ArrayList<Student> students;

        Classroom(String name) {
            // TODO
        }

        void addStudent(Student student) {
            // TODO
        }

        Student topStudent() {
            // TODO
            return null;
        }

        double passRate() {
            // TODO
            return 0.0;
        }
    }


    // =======================================================================
    // Exercise 9 / Soal 9 (Challenge): Book + Library
    // EN: Book only needs its constructor (title, author, year).
    //     Library holds an ArrayList of Book objects.
    //     - The Library constructor creates the EMPTY list.
    //     - addBook(book) adds one Book
    //     - findByTitle(title) returns the Book whose title matches, IGNORING
    //       upper/lower case. If no book matches, return null.
    //     - searchTitles(keyword) returns a NEW ArrayList<String> with the
    //       titles that CONTAIN the keyword, ignoring case, in the order the
    //       books were added. No match -> an empty list (not null).
    //     Hint: equalsIgnoreCase(), toLowerCase(), contains() from Topic 08.
    // ID: Book cukup diisi constructor-nya (title, author, year).
    //     Library menyimpan ArrayList berisi object Book.
    //     - Constructor Library membuat list KOSONG.
    //     - addBook(book) menambahkan satu Book
    //     - findByTitle(title) mengembalikan Book yang judulnya cocok, TANPA
    //       memedulikan huruf besar/kecil. Kalau tidak ada, kembalikan null.
    //     - searchTitles(keyword) mengembalikan ArrayList<String> BARU berisi
    //       judul yang MENGANDUNG keyword (huruf besar/kecil diabaikan), urut
    //       sesuai urutan buku ditambahkan. Tidak ada -> list kosong (bukan null).
    //     Petunjuk: equalsIgnoreCase(), toLowerCase(), contains() dari Topik 08.
    //
    // Example / Contoh:
    //     library.findByTitle("clean code").author  -> "Robert C. Martin"
    //     library.findByTitle("Unknown Book")       -> null
    //     library.searchTitles("algorithm")
    //         -> [Introduction to Algorithms, Algorithms Unlocked]
    // =======================================================================
    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            // TODO
        }
    }

    static class Library {
        ArrayList<Book> books;

        Library() {
            // TODO
        }

        void addBook(Book book) {
            // TODO
        }

        Book findByTitle(String title) {
            // TODO
            return null;
        }

        ArrayList<String> searchTitles(String keyword) {
            // TODO
            return null;
        }
    }
}
