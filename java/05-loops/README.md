# Topic 05 — Loops / Topik 05 — Perulangan (Loop)

EN: Learning how to repeat code with `for`, `while`, and `do-while`, and how to control loops with `break` and `continue`.
ID: Belajar mengulang kode dengan `for`, `while`, dan `do-while`, serta mengatur loop dengan `break` dan `continue`.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `LoopsBasics.java` | Lesson code: `for`, counting down and steps, accumulator and counter, looping over a String with `charAt`, `while`, `do-while` (with a menu demo), `break` / `continue`, nested loops, star patterns, common mistakes | Kode pembelajaran: `for`, hitung mundur dan langkah, akumulator dan penghitung, loop pada String dengan `charAt`, `while`, `do-while` (dengan demo menu), `break` / `continue`, loop bersarang, pola bintang, kesalahan umum |
| `LoopsExercisesUnsolved.java` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `LoopsExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java LoopsBasics.java
java LoopsExercisesUnsolved.java
```

EN: Compare your output with the "Expected output" in each exercise, then try the "More checks" values. If the program never stops, you wrote an infinite loop: press `Ctrl + C`.
ID: Bandingkan hasilmu dengan "Expected output" di setiap soal, lalu coba nilai "More checks". Kalau program tidak pernah berhenti, berarti ada loop tanpa akhir: tekan `Ctrl + C`.

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `LoopsExercisesSolved.java`, rename the class too.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `LoopsExercisesSolved.java`, ganti juga nama class-nya.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Multiplication table | Tabel perkalian | `for` |
| 2 | Sum, count, and average of a range | Jumlah, banyak, dan rata-rata suatu rentang | accumulator, counter |
| 3 | FizzBuzz 1-15 | FizzBuzz 1-15 | `for` + `else if` + `%` |
| 4 | Count the vowels | Hitung huruf vokal | `charAt`, `\|\|`, counter |
| 5 | Reverse a word and check palindrome | Balik kata dan cek palindrom | backwards loop, building a String |
| 6 | Savings goal | Target tabungan | `while` |
| 7 | Digit count and digit sum | Banyak digit dan jumlah digit | `do-while`, `%`, `/=` |
| 8 | Clean up a class code | Rapikan kode kelas | `continue`, `break` |
| 9 | Star pyramid (challenge) | Piramida bintang (tantangan) | nested loops |
| 10 | Prime numbers (challenge) | Bilangan prima (tantangan) | nested loops, `boolean` flag, `break` |

## Python vs Java

| | Python | Java |
|---|---|---|
| Count 1 to 5 | `for i in range(1, 6):` | `for (int i = 1; i <= 5; i++) { ... }` |
| Count 0 to 4 | `for i in range(5):` | `for (int i = 0; i < 5; i++) { ... }` |
| Count down | `for i in range(5, 0, -1):` | `for (int i = 5; i >= 1; i--) { ... }` |
| Each character | `for ch in text:` | `for (int i = 0; i < text.length(); i++) { char ch = text.charAt(i); }` |
| while | `while x < 10:` | `while (x < 10) { ... }` |
| Run at least once | `while True:` + `break` | `do { ... } while (x < 10);` |
| Same line printing | `print(i, end=" ")` | `System.out.print(i + " ");` |
| Add 1 | `count += 1` | `count++;` |

## Key Takeaways / Poin Penting

- `for` when you know how many rounds, `while` when you only know when to stop, `do-while` when the body must run at least once.
  `for` kalau tahu berapa putaran, `while` kalau hanya tahu kapan berhenti, `do-while` kalau isinya harus jalan minimal sekali.
- Declare accumulators and counters BEFORE the loop, and update them INSIDE it.
  Deklarasikan akumulator dan penghitung SEBELUM loop, lalu ubah nilainya DI DALAM loop.
- String indexes go from `0` to `length() - 1`, so use `i < text.length()`.
  Indeks String berjalan dari `0` sampai `length() - 1`, jadi pakai `i < text.length()`.
- Something in a `while` loop must change, or it never ends.
  Harus ada yang berubah di dalam loop `while`, kalau tidak loop-nya tidak pernah berhenti.
- `break` stops the whole loop; `continue` skips only the current round.
  `break` menghentikan seluruh loop; `continue` hanya melewati putaran saat ini.
