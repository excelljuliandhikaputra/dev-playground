# Topic 06 — Functions / Topik 06 — Fungsi

EN: Learning how to write reusable blocks of code with `def`, parameters, and `return`.
ID: Belajar menulis blok kode yang bisa dipakai ulang dengan `def`, parameter, dan `return`.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `functions_basics.py` | Lesson code: `def`, parameters, `return` vs `print`, early return, default parameters, multiple return values, local vs global scope, docstrings, functions calling functions | Kode pembelajaran: `def`, parameter, `return` vs `print`, early return, parameter default, mengembalikan banyak nilai, scope lokal vs global, docstring, fungsi memanggil fungsi |
| `functions_exercises_unsolved.py` | 10 exercises with an automatic checker, **unsolved** | 10 soal latihan dengan checker otomatis, **belum dikerjakan** |
| `functions_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python functions_basics.py
python functions_exercises_unsolved.py
```

EN: The checker at the bottom of the exercise file tests every function with several different inputs and prints `[TODO]`, `[FAIL]`, or `[PASS]` for each exercise, plus your score.
ID: Checker di bagian bawah file latihan menguji setiap fungsi dengan beberapa input berbeda lalu menampilkan `[TODO]`, `[FAIL]`, atau `[PASS]` untuk setiap soal, beserta skormu.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Make a username | Membuat username | `return`, `.lower()`, `str()` |
| 2 | Celsius to Fahrenheit | Celsius ke Fahrenheit | `return` a calculation |
| 3 | Is the number even? | Apakah angkanya genap? | return `True` / `False` |
| 4 | Largest of three (no `max()`) | Terbesar dari tiga (tanpa `max()`) | `if` / `elif` / `else` in a function |
| 5 | Score to UNAIR grade | Nilai ke huruf mutu UNAIR | `return` from `if` / `elif` |
| 6 | Price after discount | Harga setelah diskon | default parameter |
| 7 | Count vowels | Menghitung huruf vokal | loop + counter in a function |
| 8 | Attendance status | Status kehadiran | returning multiple values |
| 9 | Is it prime? (challenge) | Apakah bilangan prima? (tantangan) | loop + early return |
| 10 | Weighted GPA (challenge) | IPK berbobot SKS (tantangan) | list of dicts, reusing your own function |

## Key Takeaways / Poin Penting

- `def` only defines a function; it runs when you call it with `( )`.
  `def` hanya mendefinisikan fungsi; fungsinya baru berjalan saat dipanggil dengan `( )`.
- `print()` shows a value; `return` gives it back so it can be stored and reused. No `return` means `None`.
  `print()` menampilkan nilai; `return` mengembalikannya supaya bisa disimpan dan dipakai lagi. Tanpa `return` hasilnya `None`.
- `return` ends the function immediately. Return `False` / `True` for "none found" only AFTER the loop finishes.
  `return` langsung menghentikan fungsi. Return `False` / `True` untuk "tidak ketemu" hanya SETELAH loop selesai.
- Default parameters make arguments optional and must come after the parameters without a default.
  Parameter default membuat argumen jadi opsional dan harus ditulis setelah parameter tanpa default.
- Variables created inside a function are local. Send data in with parameters and get it out with `return`.
  Variabel yang dibuat di dalam fungsi bersifat lokal. Kirim data masuk lewat parameter dan ambil keluar lewat `return`.
- Test with several different inputs, including edge cases like `0`, `[]`, or `is_prime(9)`.
  Uji dengan beberapa input berbeda, termasuk kasus khusus seperti `0`, `[]`, atau `is_prime(9)`.
