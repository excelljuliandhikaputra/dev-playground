# Topic 01 — print() / Topik 01 — print()

EN: Learning the very first Python statement: printing text to the screen.
ID: Belajar statement Python paling pertama: menampilkan teks ke layar.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `print_basics.py` | Lesson code: printing text, multiple values + `sep`, `end`, escape characters | Kode pembelajaran: mencetak teks, banyak nilai + `sep`, `end`, karakter escape |
| `print_exercises_unsolved.py` | 6 exercises, **unsolved** — write your own `print()` code under each one | 6 soal latihan, **belum dikerjakan** — tulis kode `print()` sendiri di bawah tiap soal |
| `print_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python print_basics.py
python print_exercises_unsolved.py
```

EN: Compare your output with the "Expected output" written in each exercise.
ID: Bandingkan hasilmu dengan "Expected output" yang tertulis di setiap soal.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Print a greeting | Cetak sapaan | `print()` |
| 2 | Print A, B, C separated by ` \| ` | Cetak A, B, C dipisah ` \| ` | `sep` |
| 3 | Two prints on one line | Dua print di satu baris | `end` |
| 4 | Two lines in one print | Dua baris dalam satu print | `\n` |
| 5 | Small ID card | Kartu identitas kecil | `\t` |
| 6 | Draw a box (challenge) | Gambar kotak (tantangan) | `\n` + combining |

## Key Takeaways / Poin Penting

- `print()` always adds a newline (`\n`) at the end unless you change `end`.
  `print()` selalu menambahkan baris baru (`\n`) di akhir, kecuali `end` diubah.
- `sep` controls what goes BETWEEN values; `end` controls what goes AFTER the whole print.
  `sep` mengatur pemisah ANTAR nilai; `end` mengatur apa yang ditambahkan SETELAH print selesai.
- Escape characters (`\n`, `\t`) let you format text without multiple print() calls.
  Karakter escape (`\n`, `\t`) memungkinkan kamu merapikan teks tanpa banyak print() terpisah.
