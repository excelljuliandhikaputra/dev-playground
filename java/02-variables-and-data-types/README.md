# Topic 02 — Variables & Data Types / Topik 02 — Variabel & Tipe Data

EN: Learning how Java stores values in typed variables and works with numbers and text.
ID: Belajar cara Java menyimpan nilai di variabel bertipe dan mengolah angka serta teks.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `VariablesBasics.java` | Lesson code: declaring variables, primitive types, String, camelCase, `final`, operators, casting, String methods, `printf` | Kode pembelajaran: deklarasi variabel, tipe primitif, String, camelCase, `final`, operator, casting, method String, `printf` |
| `VariablesExercisesUnsolved.java` | 9 exercises, **unsolved** | 9 soal latihan, **belum dikerjakan** |
| `VariablesExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java VariablesBasics.java
java VariablesExercisesUnsolved.java
```

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `VariablesExercisesSolved.java`, rename the class too.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `VariablesExercisesSolved.java`, ganti juga nama class-nya.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Introduce yourself | Perkenalan diri | `String`, `int`, `+` |
| 2 | Pick the right types | Pilih tipe yang tepat | `int`, `double`, `String`, `boolean`, `char` |
| 3 | Operators on a and b | Operator pada a dan b | `+ - * / %`, `( )`, casting |
| 4 | Shopping with discount | Belanja dengan diskon | `int` vs `double` division |
| 5 | Convert types | Konversi tipe | `Integer.parseInt`, `(int)`, `Double.parseDouble` |
| 6 | Play with a String | Mengolah String | `toUpperCase`, `length`, `charAt` |
| 7 | Swap two variables | Tukar dua variabel | reassignment |
| 8 | Seconds to h/m/s (challenge) | Detik ke jam/menit/detik (tantangan) | `/`, `%` on `int` |
| 9 | BMI calculator (challenge) | Kalkulator BMI (tantangan) | `printf("%.2f")` |

## Python vs Java

| | Python | Java |
|---|---|---|
| Declare | `age = 20` | `int age = 20;` |
| Naming | `target_gpa` (snake_case) | `targetGpa` (camelCase) |
| Boolean | `True` / `False` | `true` / `false` |
| `17 / 5` | `3.4` | `3` (int division / pembagian bulat) |
| Power | `2 ** 3` | `Math.pow(2, 3)` (Topic 03) |
| Text → int | `int("85")` | `Integer.parseInt("85")` |
| Last character | `text[-1]` | `text.charAt(text.length() - 1)` |
| 2 decimals | `f"{x:.2f}"` | `System.out.printf("%.2f%n", x);` |

## Key Takeaways / Poin Penting

- Every variable has a fixed type, written before its name.
  Setiap variabel punya tipe tetap yang ditulis sebelum namanya.
- `int / int` cuts the decimal. Use a `double` (e.g. `100.0`) or casting to keep it.
  `int / int` memotong desimal. Pakai `double` (misal `100.0`) atau casting supaya tetap ada.
- After text, `+` joins instead of adds. Wrap calculations in `( )`.
  Setelah ada teks, `+` menggabung, bukan menjumlah. Bungkus perhitungan dengan `( )`.
- Use camelCase for variables and `UPPER_SNAKE_CASE` for `final` constants.
  Pakai camelCase untuk variabel dan `UPPER_SNAKE_CASE` untuk konstanta `final`.
