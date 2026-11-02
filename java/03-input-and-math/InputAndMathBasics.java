/*
 * Topic 03 - Input & Math
 * Topik 03 - Input & Matematika
 * ==============================
 * EN: Topics covered in this lesson file.
 * ID: Topik yang dibahas di file ini.
 *
 *     1. Importing Scanner                    | Mengimpor Scanner
 *     2. Reading from the keyboard            | Membaca input dari keyboard
 *     3. Demo: a Scanner that reads a String  | Demo: Scanner yang membaca String
 *     4. next() vs nextLine()                 | next() vs nextLine()
 *     5. The nextInt() + nextLine() trap      | Jebakan nextInt() + nextLine()
 *     6. Math.pow, Math.sqrt, Math.PI         | Math.pow, Math.sqrt, Math.PI
 *     7. Math.abs, Math.max, Math.min         | Math.abs, Math.max, Math.min
 *     8. Rounding: round, ceil, floor         | Pembulatan: round, ceil, floor
 *     9. Compound assignment (+= -= ...)      | Operator gabungan (+= -= ...)
 *    10. ++ and --                            | ++ dan --
 *
 * Run this file / Jalankan file ini:
 *     java InputAndMathBasics.java
 *
 * EN: This file does NOT wait for you to type anything. The real keyboard
 *     code is shown in comments, and the demos read from a String instead.
 * ID: File ini TIDAK menunggu kamu mengetik apa pun. Kode keyboard yang asli
 *     ditulis sebagai komentar, dan demonya membaca dari String.
 */

// ---------------------------------------------------------------------------
// 1. Importing Scanner
// EN: Scanner is the tool that reads input. It is not loaded automatically,
//     so you must IMPORT it. The import line goes at the very top of the
//     file, ABOVE the class. (Python's input() needs no import.)
// ID: Scanner adalah alat untuk membaca input. Scanner tidak otomatis
//     tersedia, jadi harus di-IMPORT dulu. Baris import ditulis paling atas,
//     DI ATAS class. (input() di Python tidak perlu import.)
// ---------------------------------------------------------------------------
import java.util.Scanner;

public class InputAndMathBasics {

    public static void main(String[] args) {

        // -------------------------------------------------------------------
        // 2. Reading from the keyboard
        // EN: Create ONE Scanner connected to the keyboard (System.in) and
        //     reuse it for every input in the program.
        //       nextLine()   -> a whole line of text (can contain spaces)
        //       next()       -> one word (stops at a space)
        //       nextInt()    -> an int
        //       nextDouble() -> a double
        //     Use print (not println) for the question, so the user types on
        //     the same line.
        //     The code below is commented out so this file never waits.
        //     Copy it into a new file if you want to try it for real.
        // ID: Buat SATU Scanner yang terhubung ke keyboard (System.in), lalu
        //     pakai ulang untuk semua input di program.
        //       nextLine()   -> satu baris teks penuh (boleh ada spasi)
        //       next()       -> satu kata (berhenti di spasi)
        //       nextInt()    -> sebuah int
        //       nextDouble() -> sebuah double
        //     Pakai print (bukan println) untuk pertanyaannya, supaya user
        //     mengetik di baris yang sama.
        //     Kode di bawah sengaja dijadikan komentar supaya file ini tidak
        //     menunggu input. Salin ke file baru kalau mau mencobanya langsung.
        // -------------------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        //
        // System.out.print("Enter your name: ");
        // String name = input.nextLine();
        //
        // System.out.print("Enter your age: ");
        // int age = input.nextInt();
        //
        // System.out.print("Enter your GPA: ");
        // double gpa = input.nextDouble();
        //
        // System.out.println("Hi " + name + ", next year you will be " + (age + 1) + ".");
        // input.close();    // close it when you are completely done / tutup kalau sudah selesai
        //
        // What you see in the terminal / Yang terlihat di terminal:
        //     Enter your name: Excell
        //     Enter your age: 20
        //     Enter your GPA: 3.75
        //     Hi Excell, next year you will be 21.
        //
        // EN: nextDouble() follows your laptop's language settings. With
        //     Indonesian settings it expects a COMMA (3,75) and crashes with
        //     InputMismatchException if you type 3.75. If that happens, type
        //     a comma instead.
        // ID: nextDouble() mengikuti pengaturan bahasa laptopmu. Kalau memakai
        //     pengaturan Indonesia, nextDouble() mengharapkan KOMA (3,75) dan
        //     error InputMismatchException kalau kamu mengetik 3.75. Kalau
        //     itu terjadi, ketik pakai koma.
        //
        // EN: VS Code may warn "Resource leak: 'input' is never closed".
        //     It's only a warning. input.close() at the end of main removes it.
        // ID: VS Code mungkin memberi peringatan "Resource leak: 'input' is
        //     never closed". Itu hanya peringatan. input.close() di akhir main
        //     akan menghilangkannya.


        // -------------------------------------------------------------------
        // 3. Demo: a Scanner that reads a String
        // EN: A TRICK just for this lesson: instead of System.in, we give the
        //     Scanner a String. Each \n acts like the user pressing Enter.
        //     The Scanner reads it exactly as if someone typed:
        //         Excell  [Enter]
        //         20      [Enter]
        //         3.75    [Enter]
        //     This way the file runs without waiting for you.
        //     In real programs you always use new Scanner(System.in).
        // ID: TRIK khusus untuk pelajaran ini: alih-alih System.in, Scanner
        //     diberi sebuah String. Setiap \n berperan seperti user menekan
        //     Enter. Scanner membacanya persis seperti ada yang mengetik:
        //         Excell  [Enter]
        //         20      [Enter]
        //         3.75    [Enter]
        //     Dengan begitu file ini berjalan tanpa menunggu kamu.
        //     Di program sungguhan, selalu pakai new Scanner(System.in).
        // -------------------------------------------------------------------
        Scanner demo = new Scanner("Excell\n20\n3.75\n");

        String demoName = demo.nextLine();                  // "Excell"
        int demoAge = demo.nextInt();                       // 20
        double demoGpa = Double.parseDouble(demo.next());   // 3.75

        System.out.println("Name: " + demoName);            // Name: Excell
        System.out.println("Age next year: " + (demoAge + 1));   // Age next year: 21
        System.out.println("GPA: " + demoGpa);              // GPA: 3.75
        demo.close();

        // EN: Why Double.parseDouble(demo.next()) and not demo.nextDouble()?
        //     Because of the comma/dot problem from section 2. parseDouble
        //     (Topic 02) ALWAYS uses a dot, so this demo runs on every laptop.
        // ID: Kenapa Double.parseDouble(demo.next()) dan bukan demo.nextDouble()?
        //     Karena masalah koma/titik di bagian 2. parseDouble (Topik 02)
        //     SELALU memakai titik, jadi demo ini jalan di laptop mana pun.


        // -------------------------------------------------------------------
        // 4. next() vs nextLine()
        // EN: next() reads ONE word and stops at the first space.
        //     nextLine() reads the WHOLE line, spaces included.
        // ID: next() membaca SATU kata dan berhenti di spasi pertama.
        //     nextLine() membaca SATU BARIS PENUH, termasuk spasinya.
        // -------------------------------------------------------------------
        Scanner wordDemo = new Scanner("Discrete Mathematics\n");
        String firstWord = wordDemo.next();
        System.out.println("next(): " + firstWord);          // next(): Discrete
        wordDemo.close();

        Scanner lineDemo = new Scanner("Discrete Mathematics\n");
        String wholeLine = lineDemo.nextLine();
        System.out.println("nextLine(): " + wholeLine);      // nextLine(): Discrete Mathematics
        lineDemo.close();


        // -------------------------------------------------------------------
        // 5. The nextInt() + nextLine() trap
        // EN: When you type 1 and press Enter, the input is "1\n".
        //     nextInt() takes the 1 but LEAVES the \n (the Enter) behind.
        //     The next nextLine() sees that leftover \n, thinks the line is
        //     finished, and returns an EMPTY String "".
        //     (Python doesn't have this problem: input() always reads a full line.)
        // ID: Saat kamu mengetik 1 lalu Enter, inputnya adalah "1\n".
        //     nextInt() mengambil angka 1 tapi MENINGGALKAN \n (Enter-nya).
        //     nextLine() berikutnya melihat sisa \n itu, mengira barisnya sudah
        //     selesai, lalu mengembalikan String KOSONG "".
        //     (Python tidak punya masalah ini: input() selalu membaca satu baris penuh.)
        // -------------------------------------------------------------------
        Scanner trapDemo = new Scanner("1\nDiscrete Mathematics\n");
        int trapSemester = trapDemo.nextInt();               // 1
        String trapCourse = trapDemo.nextLine();             // "" (EMPTY! / KOSONG!)
        System.out.println("Semester " + trapSemester + ", course: [" + trapCourse + "]");
        // Semester 1, course: []
        trapDemo.close();

        // EN: Fix A: after nextInt(), call nextLine() once to throw away the Enter.
        // ID: Solusi A: setelah nextInt(), panggil nextLine() sekali untuk membuang Enter-nya.
        Scanner fixDemo = new Scanner("1\nDiscrete Mathematics\n");
        int fixSemester = fixDemo.nextInt();
        fixDemo.nextLine();                                  // throw away "\n" / buang "\n"
        String fixCourse = fixDemo.nextLine();
        System.out.println("Semester " + fixSemester + ", course: [" + fixCourse + "]");
        // Semester 1, course: [Discrete Mathematics]
        fixDemo.close();

        // EN: Fix B: read EVERYTHING with nextLine() and convert numbers yourself.
        // ID: Solusi B: baca SEMUANYA dengan nextLine() lalu ubah angkanya sendiri.
        Scanner parseDemo = new Scanner("1\nDiscrete Mathematics\n");
        int parseSemester = Integer.parseInt(parseDemo.nextLine());
        String parseCourse = parseDemo.nextLine();
        System.out.println("Semester " + parseSemester + ", course: [" + parseCourse + "]");
        // Semester 1, course: [Discrete Mathematics]
        parseDemo.close();


        // -------------------------------------------------------------------
        // 6. Math.pow, Math.sqrt, Math.PI
        // EN: Java has no ** operator. Use Math.pow(base, exponent).
        //     Math.sqrt(x) = square root. Math.PI = 3.14159...
        //     No import needed for Math. pow and sqrt ALWAYS give a double.
        // ID: Java tidak punya operator **. Pakai Math.pow(basis, pangkat).
        //     Math.sqrt(x) = akar kuadrat. Math.PI = 3.14159...
        //     Math tidak perlu di-import. pow dan sqrt SELALU menghasilkan double.
        // -------------------------------------------------------------------
        System.out.println(Math.pow(2, 10));        // 1024.0
        System.out.println(Math.sqrt(144));         // 12.0
        System.out.println(Math.PI);                // 3.141592653589793

        double radius = 7;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle area: %.2f%n", circleArea);   // Circle area: 153.94 (or/atau 153,94)

        // int cube = Math.pow(2, 3);        -> ERROR: pow gives a double / pow menghasilkan double
        int cube = (int) Math.pow(2, 3);     // OK: cast it / di-cast dulu
        System.out.println(cube);            // 8
        // System.out.println(2 ^ 3);        -> prints 1, NOT 8! ^ is not power in Java
        //                                      mencetak 1, BUKAN 8! ^ bukan pangkat di Java


        // -------------------------------------------------------------------
        // 7. Math.abs, Math.max, Math.min
        // EN: abs = distance from zero (removes the minus sign).
        //     max / min take exactly TWO values. For three values, put one
        //     Math.max inside another.
        // ID: abs = jarak dari nol (menghilangkan tanda minus).
        //     max / min menerima tepat DUA nilai. Untuk tiga nilai, taruh
        //     Math.max di dalam Math.max yang lain.
        // -------------------------------------------------------------------
        int scoreBefore = 85;
        int scoreAfter = 72;
        System.out.println(Math.abs(scoreAfter - scoreBefore));     // 13 (not -13 / bukan -13)
        System.out.println(Math.max(scoreBefore, scoreAfter));      // 85
        System.out.println(Math.min(scoreBefore, scoreAfter));      // 72

        int thirdScore = 91;
        System.out.println(Math.max(Math.max(scoreBefore, scoreAfter), thirdScore));   // 91


        // -------------------------------------------------------------------
        // 8. Rounding: round, ceil, floor
        // EN: Math.round(x) -> nearest whole number (.5 goes up). Gives a long.
        //     Math.ceil(x)  -> always UP   (ceiling = langit-langit). Gives a double.
        //     Math.floor(x) -> always DOWN (floor = lantai).          Gives a double.
        //     Trick for 2 decimals: Math.round(x * 100) / 100.0
        //     (Python can do round(x, 2). Java's Math.round can't.)
        // ID: Math.round(x) -> bilangan bulat terdekat (.5 dibulatkan ke atas). Hasilnya long.
        //     Math.ceil(x)  -> selalu ke ATAS.  Hasilnya double.
        //     Math.floor(x) -> selalu ke BAWAH. Hasilnya double.
        //     Trik 2 desimal: Math.round(x * 100) / 100.0
        //     (Python bisa round(x, 2). Math.round di Java tidak bisa.)
        // -------------------------------------------------------------------
        double average = 83.456;
        System.out.println(Math.round(average));                // 83
        System.out.println(Math.round(83.5));                   // 84
        System.out.println(Math.ceil(average));                 // 84.0
        System.out.println(Math.floor(average));                // 83.0
        System.out.println(Math.round(average * 100) / 100.0);  // 83.46

        // System.out.println(Math.round(average * 100) / 100);
        //     -> prints 83, because whole / whole cuts the decimal (Topic 02).
        //        Divide by 100.0, not 100.
        //     -> mencetak 83, karena bulat / bulat memotong desimal (Topik 02).
        //        Bagi dengan 100.0, bukan 100.

        // EN: ceil is perfect for "how many do I need?": 10 people, 4 per car.
        // ID: ceil cocok untuk "butuh berapa?": 10 orang, 4 orang per mobil.
        int people = 10;
        int seatsPerCar = 4;
        int carsNeeded = (int) Math.ceil(people / (double) seatsPerCar);   // 10 / 4.0 = 2.5 -> 3.0 -> 3
        System.out.println("Cars needed: " + carsNeeded);                  // Cars needed: 3


        // -------------------------------------------------------------------
        // 9. Compound assignment
        // EN: Short ways to update a variable using its own value.
        //       x += 5   is the same as   x = x + 5
        //     Same idea for -= *= /= %=  (Python has these too.)
        // ID: Cara singkat mengubah variabel memakai nilainya sendiri.
        //       x += 5   sama dengan   x = x + 5
        //     Begitu juga -= *= /= %=  (Python juga punya.)
        // -------------------------------------------------------------------
        int balance = 100000;
        balance += 50000;                  // allowance / uang saku
        System.out.println(balance);       // 150000
        balance -= 30000;                  // lunch / makan siang
        System.out.println(balance);       // 120000
        balance *= 2;
        System.out.println(balance);       // 240000
        balance /= 3;
        System.out.println(balance);       // 80000
        balance %= 7000;                   // remainder of 80000 / 7000 / sisa bagi 80000 / 7000
        System.out.println(balance);       // 3000


        // -------------------------------------------------------------------
        // 10. ++ and --
        // EN: ++ adds 1, -- subtracts 1. Perfect for counters.
        //     Python has no ++ (it uses += 1).
        //     For now, always write them on their own line (count++;).
        //     Putting them inside a bigger expression is confusing, avoid it.
        // ID: ++ menambah 1, -- mengurangi 1. Cocok untuk penghitung.
        //     Python tidak punya ++ (Python memakai += 1).
        //     Untuk sekarang, selalu tulis di barisnya sendiri (count++;).
        //     Menaruhnya di dalam ekspresi yang lebih besar itu membingungkan, hindari.
        // -------------------------------------------------------------------
        int visitors = 0;
        visitors++;
        visitors++;
        visitors++;
        System.out.println(visitors);      // 3
        visitors--;
        System.out.println(visitors);      // 2
    }
}
