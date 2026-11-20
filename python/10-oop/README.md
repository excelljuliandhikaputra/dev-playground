# Topic 10 — Object-Oriented Programming / Topik 10 — Pemrograman Berorientasi Objek

EN: Learning how to build your own types with classes, so data and the actions on it live together.
ID: Belajar membuat tipe data sendiri dengan class, supaya data dan aksinya tersimpan bersama.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `oop_basics.py` | Lesson code: `class`, `__init__`, `self`, attributes, methods, `__str__`, list of objects, class vs instance attributes, `_protected` naming, inheritance, `super()`, overriding | Kode pembelajaran: `class`, `__init__`, `self`, atribut, method, `__str__`, list berisi objek, atribut class vs instance, penamaan `_protected`, inheritance, `super()`, overriding |
| `oop_exercises_unsolved.py` | 9 exercises, **unsolved**, with a built-in checker | 9 soal latihan, **belum dikerjakan**, dilengkapi checker otomatis |
| `oop_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python oop_basics.py
python oop_exercises_unsolved.py
```

EN: The checker creates objects from your classes and prints `[TODO]`, `[FAIL]`, `[PASS]` or `[RULE]` for each exercise and your score. The file runs even while the classes are still empty.
ID: Checker membuat objek dari class-mu lalu mencetak `[TODO]`, `[FAIL]`, `[PASS]` atau `[RULE]` untuk setiap soal beserta skormu. File ini tetap bisa dijalankan walaupun class-nya masih kosong.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Rectangle area and perimeter | Luas dan keliling persegi panjang | `class`, `__init__`, `self`, methods |
| 2 | Student scores and average | Nilai dan rata-rata mahasiswa | list attribute, method changing data |
| 3 | Student grade and text | Huruf mutu dan teks mahasiswa | method calling method, `__str__` |
| 4 | Bank account rules | Aturan rekening bank | `_balance`, return `True`/`False` |
| 5 | Transfer between accounts | Transfer antar rekening | objects working together |
| 6 | Count created courses | Menghitung course yang dibuat | class attribute vs instance attribute |
| 7 | Person, Lecturer, Undergraduate | Person, Lecturer, Undergraduate | inheritance, `super()`, overriding |
| 8 | Classroom of students (challenge) | Kelas berisi mahasiswa (tantangan) | list of objects, returning an object |
| 9 | Shapes and total area (challenge) | Bangun datar dan total luas (tantangan) | polymorphism |

## Python vs Java

| | Python | Java |
|---|---|---|
| Define a class | `class Book:` | `class Book { ... }` |
| Constructor | `def __init__(self, title):` | `Book(String title) { ... }` |
| This object | `self.title` | `this.title` |
| Text of an object | `def __str__(self):` | `public String toString()` |
| Hidden data | `self._balance` (convention only / hanya kesepakatan) | `private double balance;` (enforced / dipaksa compiler) |
| Inheritance | `class Lecturer(Person):` | `class Lecturer extends Person` |
| Call the parent | `super().__init__(name)` | `super(name);` |

## Key Takeaways / Poin Penting

- A class is a blueprint; each object made from it keeps its own attributes.
  Class adalah cetakan; setiap objek yang dibuat darinya menyimpan atributnya sendiri.
- Every method's first parameter is `self`, and attributes are always written as `self.name`.
  Parameter pertama setiap method adalah `self`, dan atribut selalu ditulis sebagai `self.name`.
- `__str__` must return a string; `print(obj)` then shows it.
  `__str__` harus me-return string; lalu `print(obj)` akan menampilkannya.
- Change a class attribute through the class name (`Course.total_courses += 1`), not through `self`.
  Ubah atribut class lewat nama class-nya (`Course.total_courses += 1`), bukan lewat `self`.
- A child class calls `super().__init__(...)` and can override methods; a loop over mixed objects then uses each object's own version (polymorphism).
  Class anak memanggil `super().__init__(...)` dan bisa meng-override method; loop atas objek campuran lalu memakai versi milik masing-masing objek (polimorfisme).
