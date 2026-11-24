# Topic 10 — OOP Advanced / Topik 10 — OOP Lanjutan

EN: Learning how to protect data with encapsulation, share code with inheritance, and treat different objects the same way with polymorphism, abstract classes, and interfaces.
ID: Belajar melindungi data dengan enkapsulasi, berbagi kode dengan pewarisan, dan memperlakukan object berbeda dengan cara yang sama lewat polimorfisme, abstract class, dan interface.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `OopAdvancedBasics.java` | Lesson code: `private` fields, getters/setters with validation, `static` fields and methods, `extends` and `super(...)`, `@Override`, polymorphism, abstract class, interface, Python vs Java class syntax | Kode pembelajaran: field `private`, getter/setter dengan validasi, field dan method `static`, `extends` dan `super(...)`, `@Override`, polimorfisme, abstract class, interface, sintaks class Python vs Java |
| `OopAdvancedExercisesUnsolved.java` | 8 exercises with an automatic checker, **unsolved** | 8 soal latihan dengan checker otomatis, **belum dikerjakan** |
| `OopAdvancedExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java OopAdvancedBasics.java
java OopAdvancedExercisesUnsolved.java
```

EN: The checker prints `[TODO]` (not started), `[FAIL]` (wrong answer, with expected vs got), or `[PASS]` for every exercise, then your score.
ID: Checker mencetak `[TODO]` (belum dikerjakan), `[FAIL]` (salah, lengkap dengan expected vs got), atau `[PASS]` untuk setiap soal, lalu skormu.

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `OopAdvancedExercisesSolved.java`, rename the public class too. In this course every class lives inside the main class as `static class ...` (also `static abstract class ...` and `interface ...`) so each file is self-contained and VS Code doesn't report duplicate classes. In real projects each class gets its own file (`Shape.java`) and the word `static` isn't needed there.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `OopAdvancedExercisesSolved.java`, ganti juga nama public class-nya. Di kursus ini setiap class tinggal di dalam class utama sebagai `static class ...` (juga `static abstract class ...` dan `interface ...`) supaya setiap file berdiri sendiri dan VS Code tidak melaporkan class ganda. Di proyek sungguhan setiap class punya file sendiri (`Shape.java`) dan kata `static` tidak diperlukan di sana.

> [!NOTE]
> EN: Because the exercise classes are nested, Java technically lets `main()` read their `private` fields. Don't rely on that: always use getters and methods (the checker does too). That's also why the encapsulation demo `SecureStudentCard` in the basics file is the one class written outside the main class: there, `private` really blocks access.
>
> ID: Karena class-class soal ada di dalam class utama, secara teknis Java mengizinkan `main()` membaca field `private`-nya. Jangan andalkan itu: selalu pakai getter dan method (checker juga begitu). Itu juga alasan demo enkapsulasi `SecureStudentCard` di file basics menjadi satu-satunya class yang ditulis di luar class utama: di sana `private` benar-benar memblokir akses.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Bank account with private balance | Rekening dengan saldo private | `private`, getters, validated changes |
| 2 | Student score that only accepts 0-100 | Nilai mahasiswa yang hanya menerima 0-100 | setter with validation, constructor calling a setter |
| 3 | Queue ticket machine | Mesin tiket antrean | `static` field vs instance field, static methods |
| 4 | Person, Student, Lecturer | Person, Student, Lecturer | `extends`, `super(...)`, `@Override`, `super.introduce()` |
| 5 | Circle and rectangle from an abstract Shape | Lingkaran dan persegi panjang dari Shape abstract | abstract class, `Math.PI` |
| 6 | Tuition fee and canteen order | Biaya kuliah dan pesanan kantin | `interface`, `implements` |
| 7 | Total and largest area (challenge) | Total dan luas terbesar (tantangan) | polymorphism over a `Shape[]`, static methods |
| 8 | Employee salaries (challenge) | Gaji karyawan (tantangan) | abstract class, multi-level inheritance, `super.monthlySalary()` |

## Python vs Java

| | Python | Java |
|---|---|---|
| Private field | `self._balance` (a convention, still reachable) | `private int balance;` (blocked by the compiler) |
| Getter / setter | plain methods (or `@property`) | `getBalance()`, `setScore(int score)` |
| Shared by all objects | class attribute: `count = 0` in the class body | `static int count = 0;` |
| Inheritance | `class Student(Person):` | `class Student extends Person { ... }` |
| Parent constructor | `super().__init__(name)` | `super(name);` (first line of the constructor) |
| Override a method | define it again | define it again + `@Override` |
| Call parent's version | `super().introduce()` | `super.introduce()` |
| Abstract class | `from abc import ABC, abstractmethod` | `abstract class Shape` + `abstract double area();` |
| Interface | no keyword (duck typing) | `interface Payable` + `implements Payable` |
| Parent variable, child object | any variable holds anything | `Person p = new Student(...);` (type must be the parent or the same class) |

## Key Takeaways / Poin Penting

- Make fields `private` and change them only through methods that check the value first.
  Jadikan field `private` dan ubah hanya lewat method yang mengecek nilainya dulu.
- A `static` field has one copy shared by all objects; a normal field has one copy per object.
  Field `static` hanya punya satu salinan untuk semua object; field biasa punya satu salinan per object.
- A child calls `super(...)` first, inherits public methods, and can replace them with `@Override`.
  Class anak memanggil `super(...)` lebih dulu, mewarisi method public, dan bisa menggantinya dengan `@Override`.
- The variable type decides what you can call; the real object decides which version runs.
  Tipe variabel menentukan method apa yang boleh dipanggil; object aslinya menentukan versi mana yang dijalankan.
- Abstract class = "is a" with shared code; interface = "can do", a promise of methods.
  Abstract class = "adalah" dengan kode bersama; interface = "bisa", janji berisi daftar method.
