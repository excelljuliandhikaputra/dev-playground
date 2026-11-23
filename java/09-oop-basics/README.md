# Topic 09 — OOP Basics: Classes & Objects / Topik 09 — Dasar OOP: Class & Object

EN: Learning how to write my own classes and create objects with fields, constructors, and methods.
ID: Belajar membuat class sendiri dan membuat object yang punya field, constructor, dan method.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `ClassesAndObjectsBasics.java` | Lesson code: class vs object, fields and default values, constructor, `this`, instance methods, `toString()`, many objects, array and `ArrayList` of objects, many classes in one file | Kode pembelajaran: class vs object, field dan nilai default, constructor, `this`, method instance, `toString()`, banyak object, array dan `ArrayList` berisi object, banyak class dalam satu file |
| `ClassesAndObjectsExercisesUnsolved.java` | 9 exercises with an automatic checker, **unsolved** | 9 soal latihan dengan checker otomatis, **belum dikerjakan** |
| `ClassesAndObjectsExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java ClassesAndObjectsBasics.java
java ClassesAndObjectsExercisesUnsolved.java
```

EN: The checker prints `[TODO]` (not started), `[FAIL]` (wrong answer, with expected vs got), or `[PASS]` for every exercise, then your score.
ID: Checker mencetak `[TODO]` (belum dikerjakan), `[FAIL]` (salah, lengkap dengan expected vs got), atau `[PASS]` untuk setiap soal, lalu skormu.

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `ClassesAndObjectsExercisesSolved.java`, rename the public class too. In this course every class lives inside the main class as `static class ...` so each file is self-contained and VS Code doesn't report duplicate classes. In real projects each class gets its own file (`Student.java`) and the word `static` isn't needed there.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `ClassesAndObjectsExercisesSolved.java`, ganti juga nama public class-nya. Di kursus ini setiap class tinggal di dalam class utama sebagai `static class ...` supaya setiap file berdiri sendiri dan VS Code tidak melaporkan class ganda. Di proyek sungguhan setiap class punya file sendiri (`Student.java`) dan kata `static` tidak diperlukan di sana.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Course with `describe()` | Mata kuliah dengan `describe()` | constructor, `this`, method returning `String` |
| 2 | Rectangle area and perimeter | Luas dan keliling persegi panjang | fields, methods returning `double` / `boolean` |
| 3 | Attendance counter | Penghitung presensi | `void` methods changing fields, independent objects |
| 4 | Bank account with no overdraft | Rekening tanpa saldo minus | methods that check, change, and return `boolean` |
| 5 | Student average and UNAIR grade | Rata-rata dan nilai huruf UNAIR | `int[]` field, methods calling methods, `toString()` |
| 6 | Shopping cart item | Item keranjang belanja | `toString()` |
| 7 | Shopping cart | Keranjang belanja | `ArrayList` of objects inside a class |
| 8 | Classroom top student and pass rate (challenge) | Mahasiswa terbaik dan persentase lulus (tantangan) | returning an object, `null`, percentage |
| 9 | Library search (challenge) | Pencarian di perpustakaan (tantangan) | two classes working together, `equalsIgnoreCase`, `contains` |

## Python vs Java

| | Python | Java |
|---|---|---|
| Define a class | `class Student:` | `class Student { ... }` |
| Fields | created in `__init__`: `self.name = name` | declared at the top of the class: `String name;` |
| Constructor | `def __init__(self, name):` | `Student(String name) { ... }` (class name, no return type) |
| The object itself | `self` (written as the first parameter) | `this` (automatic, not a parameter) |
| Create an object | `s = Student("Ana")` | `Student s = new Student("Ana");` |
| Method | `def average(self):` | `double average() { ... }` (return type required) |
| Text for printing | `def __str__(self):` | `public String toString() { ... }` |
| "No object" | `None` | `null` |
| Where classes live | anywhere in the file | inside the main class as `static class Subject { ... }` (this course); own file `Subject.java` (real projects) |

## Key Takeaways / Poin Penting

- A class is the blueprint; `new` creates an object from it, and every object has its own fields.
  Class adalah cetak biru; `new` membuat object darinya, dan setiap object punya field sendiri.
- A constructor has the class name and no return type; use `this.name = name;` to save a parameter.
  Constructor bernama sama dengan class dan tanpa tipe return; pakai `this.name = name;` untuk menyimpan parameter.
- Fields you don't set get defaults: `0`, `0.0`, `false`, or `null`. Using a `null` object crashes the program.
  Field yang tidak diisi mendapat nilai default: `0`, `0.0`, `false`, atau `null`. Memakai object `null` membuat program crash.
- `Wallet b = a;` doesn't copy the object; both names point to the same one. `==` checks "same object", not "same data".
  `Wallet b = a;` tidak menyalin object; kedua nama menunjuk object yang sama. `==` mengecek "object yang sama", bukan "data yang sama".
- Write `public String toString()` so `println(object)` prints something readable.
  Tulis `public String toString()` supaya `println(object)` mencetak teks yang mudah dibaca.
