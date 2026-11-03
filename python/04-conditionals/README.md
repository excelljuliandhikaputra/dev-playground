# Topic 04 — Conditionals / Topik 04 — Percabangan

EN: Learning how a program makes decisions with `if`, `elif`, `else`, and logical operators.
ID: Belajar cara program mengambil keputusan dengan `if`, `elif`, `else`, dan operator logika.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `conditionals_basics.py` | Lesson code: comparison operators, `if` / `else` / `elif`, `and` / `or` / `not`, nested if, `in`, conditional expression, common mistakes | Kode pembelajaran: operator perbandingan, `if` / `else` / `elif`, `and` / `or` / `not`, if bersarang, `in`, ekspresi kondisional, kesalahan umum |
| `conditionals_exercises_unsolved.py` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `conditionals_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python conditionals_basics.py
python conditionals_exercises_unsolved.py
```

EN: Compare your output with the "Expected output" written in each exercise.
ID: Bandingkan hasilmu dengan "Expected output" yang tertulis di setiap soal.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Pass or fail | Lulus atau tidak | `if` / `else`, `>=` |
| 2 | UNAIR letter grade and grade point | Huruf mutu dan bobot UNAIR | `if` / `elif` / `else` chain |
| 3 | Even or odd | Genap atau ganjil | `%`, conditional expression |
| 4 | Largest of three (no `max()`) | Angka terbesar dari tiga (tanpa `max()`) | comparisons, tuple unpacking |
| 5 | Final exam attendance (75%) | Syarat kehadiran UAS (75%) | `>=`, `:.2f` |
| 6 | Login check | Cek login | nested if, `.lower()` |
| 7 | Course registration | Pendaftaran kelas | `in` / `not in` with a dict |
| 8 | Discount and free shipping | Diskon dan gratis ongkir | `and`, `or` |
| 9 | Leap year (challenge) | Tahun kabisat (tantangan) | `%`, combined `and` / `or` |
| 10 | BMI category and advice (challenge) | Kategori BMI dan saran (tantangan) | `elif` ranges, `**`, nested logic |

## Key Takeaways / Poin Penting

- `=` stores a value, `==` compares two values.
  `=` menyimpan nilai, `==` membandingkan dua nilai.
- The `if` line ends with `:` and its block is indented. The indentation IS the block.
  Baris `if` diakhiri `:` dan bloknya menjorok. Indentasi itulah bloknya.
- An `if` / `elif` chain stops at the FIRST true condition, so order your checks from highest to lowest.
  Rantai `if` / `elif` berhenti di kondisi benar PERTAMA, jadi urutkan pengecekan dari yang tertinggi ke terendah.
- Write the full comparison on both sides: `day == "Sat" or day == "Sun"`, not `day == "Sat" or "Sun"`.
  Tulis perbandingan lengkap di kedua sisi: `day == "Sat" or day == "Sun"`, bukan `day == "Sat" or "Sun"`.
- Check a key with `in` before reading `dict[key]`, and cast `input()` to `int` before comparing it with a number.
  Cek key dengan `in` sebelum membaca `dict[key]`, dan ubah `input()` ke `int` sebelum dibandingkan dengan angka.
