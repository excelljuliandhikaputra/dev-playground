# Topic 02 — Variables & Data Types / Topik 02 — Variabel & Tipe Data

EN: Learning how to store values in variables and work with Python's basic data types.
ID: Belajar menyimpan nilai di variabel dan mengolah tipe data dasar Python.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `variables_basics.py` | Lesson code: variables, naming rules, data types, operators, f-strings, casting, string methods, `input()` | Kode pembelajaran: variabel, aturan penamaan, tipe data, operator, f-string, casting, method string, `input()` |
| `variables_exercises_unsolved.py` | 9 exercises, **unsolved** | 9 soal latihan, **belum dikerjakan** |
| `variables_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python variables_basics.py
python variables_exercises_unsolved.py
```

EN: Compare your output with the "Expected output" written in each exercise.
ID: Bandingkan hasilmu dengan "Expected output" yang tertulis di setiap soal.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Introduce yourself | Perkenalan diri | variables, f-string |
| 2 | Check data types | Cek tipe data | `type()` |
| 3 | Use all 7 operators | Pakai 7 operator | `+ - * / // % **` |
| 4 | Shopping with discount | Belanja dengan diskon | arithmetic |
| 5 | Convert types | Konversi tipe | `int()`, `str()` |
| 6 | Play with a string | Mengolah string | `.upper()`, `len()`, slicing |
| 7 | Swap two variables | Tukar dua variabel | reassignment |
| 8 | Seconds to h/m/s (challenge) | Detik ke jam/menit/detik (tantangan) | `//`, `%` |
| 9 | BMI calculator (challenge) | Kalkulator BMI (tantangan) | `:.2f` formatting |

## Key Takeaways / Poin Penting

- Name variables in `snake_case` and make the name describe the value.
  Beri nama variabel dengan `snake_case` dan pastikan namanya menjelaskan isinya.
- `/` always returns a float; `//` drops the decimal; `%` gives the remainder.
  `/` selalu menghasilkan float; `//` membuang desimal; `%` memberi sisa bagi.
- `input()` always returns a `str`. Cast it with `int()` or `float()` before doing math.
  `input()` selalu menghasilkan `str`. Ubah dengan `int()` atau `float()` sebelum dihitung.
- Never hardcode answers. Print from variables so the output updates when the data changes.
  Jangan hardcode jawaban. Cetak dari variabel supaya output ikut berubah saat datanya berubah.
