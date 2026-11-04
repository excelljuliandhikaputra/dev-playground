# Topic 05 — Loops / Topik 05 — Perulangan

EN: Learning how to repeat code with `for` and `while`, and how to collect results while looping.
ID: Belajar mengulang kode dengan `for` dan `while`, serta mengumpulkan hasil selama perulangan.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `loops_basics.py` | Lesson code: `for`, `range()`, looping over strings and dicts, accumulator and counter (`+=`), building lists, `while`, `break` / `continue`, `enumerate()`, nested loops, common mistakes | Kode pembelajaran: `for`, `range()`, loop pada string dan dict, akumulator dan penghitung (`+=`), membuat list, `while`, `break` / `continue`, `enumerate()`, loop bersarang, kesalahan umum |
| `loops_exercises_unsolved.py` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `loops_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python loops_basics.py
python loops_exercises_unsolved.py
```

EN: Compare your output with the "Expected output" written in each exercise.
ID: Bandingkan hasilmu dengan "Expected output" yang tertulis di setiap soal.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Multiplication table | Tabel perkalian | `for`, `range()` |
| 2 | Quiz total and average (no `sum()`) | Total dan rata-rata kuis (tanpa `sum()`) | accumulator, counter |
| 3 | Passed, failed, absent | Lulus, gagal, absen | counters, `.append()`, `continue` |
| 4 | FizzBuzz | FizzBuzz | `range()`, `%`, `if` / `elif` order |
| 5 | Best and worst quiz (no `max()`) | Kuis terbaik dan terburuk (tanpa `max()`) | `enumerate()`, tracking a value |
| 6 | Semester credits | Total SKS semester | `dict.items()`, accumulator |
| 7 | Saving for a new phone | Menabung untuk HP baru | `while` |
| 8 | Reverse a word and count vowels | Membalik kata dan menghitung vokal | looping over a string |
| 9 | Triangle and pyramid (challenge) | Segitiga dan piramida (tantangan) | nested loops, `end=""` |
| 10 | Prime numbers (challenge) | Bilangan prima (tantangan) | nested loops, flag, `break` |

## Key Takeaways / Poin Penting

- `range(a, b)` stops BEFORE `b`. To include `b`, write `range(a, b + 1)`.
  `range(a, b)` berhenti SEBELUM `b`. Supaya `b` ikut, tulis `range(a, b + 1)`.
- Accumulator pattern: create it before the loop, update it inside, use it after.
  Pola akumulator: buat sebelum loop, perbarui di dalam loop, pakai setelah loop.
- Use `for` when you know what to loop over, and `while` when you only know when to stop.
  Pakai `for` kalau sudah tahu apa yang mau diulang, dan `while` kalau hanya tahu kapan harus berhenti.
- A `while` loop needs something inside it that changes the condition, otherwise it never ends.
  `while` loop butuh sesuatu di dalamnya yang mengubah kondisi, kalau tidak loop-nya tidak pernah selesai.
- `break` stops the whole loop, `continue` skips only the current round.
  `break` menghentikan seluruh loop, `continue` hanya melewati putaran saat ini.
- Python has no `++`. Write `count += 1`.
  Python tidak punya `++`. Tulis `count += 1`.
