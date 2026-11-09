# Topic 07 — Methods / Topik 07 — Method

EN: Learning how to write my own reusable methods with parameters, return values, and overloading.
ID: Belajar membuat method sendiri yang bisa dipakai ulang, dengan parameter, nilai kembalian, dan overloading.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `MethodsBasics.java` | Lesson code: `void` methods, parameters, `return`, boolean/String results, arrays as parameters, overloading, scope, methods calling methods | Kode pembelajaran: method `void`, parameter, `return`, hasil boolean/String, array sebagai parameter, overloading, scope, method memanggil method lain |
| `MethodsExercisesUnsolved.java` | 10 method exercises, **unsolved**, with an automatic checker | 10 soal method, **belum dikerjakan**, dengan checker otomatis |
| `MethodsExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java MethodsBasics.java
java MethodsExercisesUnsolved.java
```

EN: The checker at the bottom prints `[TODO]`, `[FAIL]` or `[PASS]` for every exercise, plus your score. A `[FAIL]` shows the call, the expected value, and what your method returned.
ID: Checker di bagian bawah mencetak `[TODO]`, `[FAIL]` atau `[PASS]` untuk setiap soal, beserta skormu. `[FAIL]` menampilkan pemanggilannya, nilai yang diharapkan, dan nilai yang dikembalikan method-mu.

> [!IMPORTANT]
> EN: In Java, the **class name must match the file name**. If you save your answers as `MethodsExercisesSolved.java`, rename the class inside to `MethodsExercisesSolved` too.
>
> ID: Di Java, **nama class harus sama dengan nama file**. Kalau jawabanmu disimpan sebagai `MethodsExercisesSolved.java`, ganti juga nama class di dalamnya menjadi `MethodsExercisesSolved`.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Greet a name | Menyapa sebuah nama | return a `String` |
| 2 | Is it even? | Apakah genap? | return a `boolean`, `%` |
| 3 | Largest of three (no `Math.max`) | Terbesar dari tiga (tanpa `Math.max`) | `if` / `else if` with `return` |
| 4 | Score to UNAIR grade | Nilai ke grade UNAIR | `else if` chain, every path returns |
| 5 | Price with/without discount | Harga dengan/tanpa diskon | overloading, `100.0` vs `100` |
| 6 | Count vowels | Hitung huruf vokal | loop over `charAt`, `toLowerCase` |
| 7 | Sum of an array | Jumlah isi array | `int[]` parameter |
| 8 | Average (reuse `sumArray`) | Rata-rata (pakai ulang `sumArray`) | method calling method, empty array |
| 9 | Prime number (challenge) | Bilangan prima (tantangan) | loop + early `return` |
| 10 | Weighted GPA (challenge) | IPK berbobot SKS (tantangan) | reuse `scoreToGrade`, helper method, rounding |

## Python vs Java

| | Python | Java |
|---|---|---|
| Define | `def add(a, b):` | `public static int add(int a, int b) { ... }` |
| Types | not written | every parameter + the return type / setiap parameter + tipe return |
| No result | returns `None` | `void` |
| Default parameter | `def price(p, disc=0):` | overloading: `price(int p)` calls `price(p, 0)` |
| Return many values | `return a, b` (tuple) | one value only / hanya satu nilai (array, or objects in Topic 09) |
| Order in the file | define before the call runs | any order inside the class / urutan bebas di dalam class |
| Description | docstring `"""..."""` | comment above the method / komentar di atas method |

## Key Takeaways / Poin Penting

- A method is written once and called many times; `return` sends a value back and ends the method.
  Method ditulis sekali dan dipanggil berkali-kali; `return` mengirim nilai kembali dan mengakhiri method.
- `void` means "returns nothing"; any other type means every path MUST `return` that type.
  `void` artinya "tidak mengembalikan apa-apa"; tipe lain berarti setiap jalur WAJIB `return` tipe itu.
- Overloading = same name, different parameters. It replaces Python's default parameters.
  Overloading = nama sama, parameter berbeda. Ini pengganti default parameter di Python.
- Variables are local to their `{ }`. Primitive arguments are copied; arrays are shared.
  Variabel hanya hidup di `{ }`-nya. Argumen primitif disalin; array dipakai bersama.
- Small methods that call each other (like `average` using `sumArray`) keep code short and easy to fix.
  Method kecil yang saling memanggil (seperti `average` memakai `sumArray`) membuat kode ringkas dan mudah diperbaiki.
