# Topic 03 — Input & Math / Topik 03 — Input & Matematika

EN: Learning how to read keyboard input with `Scanner` and calculate with the `Math` class and shortcut operators.
ID: Belajar membaca input keyboard dengan `Scanner` dan menghitung dengan class `Math` serta operator singkat.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `InputAndMathBasics.java` | Lesson code: `import`, `Scanner` (`nextLine`, `next`, `nextInt`, `nextDouble`), the `nextInt()` + `nextLine()` trap, `Math.pow/sqrt/PI/abs/max/min/round/ceil/floor`, `+= -= *= /= %=`, `++ --` | Kode pembelajaran: `import`, `Scanner` (`nextLine`, `next`, `nextInt`, `nextDouble`), jebakan `nextInt()` + `nextLine()`, `Math.pow/sqrt/PI/abs/max/min/round/ceil/floor`, `+= -= *= /= %=`, `++ --` |
| `InputAndMathExercisesUnsolved.java` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `InputAndMathExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java InputAndMathBasics.java
java InputAndMathExercisesUnsolved.java
```

EN: The basics file never waits for input (its demos read from a String). In the exercises, 1-7 use given variables and 8-10 read from the keyboard, so once you have written them the program waits for you to type after Exercise 7. To test all three input exercises in one run, type: `Excell`, `2006`, `1`, `Discrete Mathematics`, `3`, `125000`, `3` (press Enter after each).

ID: File basics tidak pernah menunggu input (demonya membaca dari String). Di latihan, soal 1-7 memakai variabel yang diberikan dan soal 8-10 membaca dari keyboard, jadi setelah kamu mengerjakannya, program akan menunggu kamu mengetik setelah Soal 7. Untuk menguji ketiga soal input sekaligus, ketik: `Excell`, `2006`, `1`, `Discrete Mathematics`, `3`, `125000`, `3` (tekan Enter setiap selesai satu nilai).

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `InputAndMathExercisesSolved.java`, rename the class too.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `InputAndMathExercisesSolved.java`, ganti juga nama class-nya.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Walk around or across a field | Lewat pinggir atau menyeberang lapangan | `Math.pow`, `Math.sqrt` |
| 2 | Round a score four ways | Bulatkan nilai dengan empat cara | `Math.round`, `floor`, `ceil`, 2-decimal trick |
| 3 | Quiz score statistics | Statistik nilai kuis | `Math.max`, `Math.min`, `Math.abs` |
| 4 | How many buses? | Butuh berapa bus? | `Math.ceil`, casting |
| 5 | Shopping cart running total | Total belanja berjalan | `+=`, `-=`, `*=` |
| 6 | Attendance counter | Penghitung kehadiran | `++`, `--`, 2-decimal trick |
| 7 | Round garden | Taman berbentuk lingkaran | `Math.PI`, `printf("%.2f")` |
| 8 | Greeting with age (input) | Sapaan dengan umur (input) | `Scanner`, `nextLine`, `nextInt` |
| 9 | Favorite course & study time (challenge, input) | Mata kuliah favorit & waktu belajar (tantangan, input) | `nextInt()` + `nextLine()` trap, `/`, `%` |
| 10 | Split the bill (challenge, input) | Patungan bayar tagihan (tantangan, input) | `Scanner`, `Math.ceil`, casting |

## Python vs Java

| | Python | Java |
|---|---|---|
| Read a line | `name = input("Name: ")` | `System.out.print("Name: ");`<br>`String name = input.nextLine();` |
| Read an int | `age = int(input())` | `int age = input.nextInt();` |
| Setup needed | none / tidak ada | `import java.util.Scanner;`<br>`Scanner input = new Scanner(System.in);` |
| Leftover Enter trap | no / tidak ada | yes: `nextInt()` then `nextLine()` |
| Power | `2 ** 10` | `Math.pow(2, 10)` → `1024.0` |
| Square root | `math.sqrt(144)` (needs `import math`) | `Math.sqrt(144)` (no import / tanpa import) |
| Max / min / abs | `max(a, b)`, `min(a, b)`, `abs(x)` | `Math.max(a, b)`, `Math.min(a, b)`, `Math.abs(x)` |
| Round to 2 decimals | `round(x, 2)` | `Math.round(x * 100) / 100.0` |
| Round up / down | `math.ceil(x)`, `math.floor(x)` | `Math.ceil(x)`, `Math.floor(x)` (give a `double`) |
| Pi | `math.pi` | `Math.PI` |
| Add 1 | `count += 1` | `count++;` (or `count += 1;`) |

## Key Takeaways / Poin Penting

- Create ONE `Scanner` on `System.in` and reuse it. Use `print` for the question so the answer is typed on the same line.
  Buat SATU `Scanner` untuk `System.in` lalu pakai ulang. Pakai `print` untuk pertanyaannya supaya jawabannya diketik di baris yang sama.
- `nextInt()` leaves the Enter behind. Call `nextLine()` once after it, or read everything with `nextLine()` and use `Integer.parseInt`.
  `nextInt()` meninggalkan sisa Enter. Panggil `nextLine()` sekali sesudahnya, atau baca semuanya dengan `nextLine()` lalu pakai `Integer.parseInt`.
- `nextDouble()` follows the laptop's language settings: with Indonesian settings, type `3,75` instead of `3.75`.
  `nextDouble()` mengikuti pengaturan bahasa laptop: dengan pengaturan Indonesia, ketik `3,75`, bukan `3.75`.
- `Math.pow`, `Math.sqrt`, `Math.ceil`, and `Math.floor` return a `double`; cast with `(int)` when you need a whole number.
  `Math.pow`, `Math.sqrt`, `Math.ceil`, dan `Math.floor` menghasilkan `double`; cast dengan `(int)` kalau butuh bilangan bulat.
- `x += 5` means `x = x + 5`, and `count++` adds 1. Python has no `++`.
  `x += 5` artinya `x = x + 5`, dan `count++` menambah 1. Python tidak punya `++`.
