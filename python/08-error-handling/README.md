# Topic 08 — Error Handling / Topik 08 — Penanganan Error

EN: Learning how to catch errors with try/except so a program doesn't crash on bad data, and how to raise your own errors.
ID: Belajar menangkap error dengan try/except supaya program tidak crash karena data yang salah, dan cara memunculkan error sendiri.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `error_handling_basics.py` | Lesson code: reading a traceback, `try`/`except`, common error types, `as error`, `else`/`finally`, `raise`, safe functions, validation loop | Kode pembelajaran: membaca traceback, `try`/`except`, jenis error umum, `as error`, `else`/`finally`, `raise`, fungsi aman, loop validasi |
| `error_handling_exercises_unsolved.py` | 10 exercises, **unsolved**, with a built-in checker | 10 soal latihan, **belum dikerjakan**, dilengkapi checker otomatis |
| `error_handling_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python error_handling_basics.py
python error_handling_exercises_unsolved.py
```

EN: The checker at the bottom of the exercise file prints `[TODO]`, `[FAIL]`, `[PASS]` or `[RULE]` for each exercise and your score.
ID: Checker di bagian bawah file latihan mencetak `[TODO]`, `[FAIL]`, `[PASS]` atau `[RULE]` untuk setiap soal beserta skormu.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Convert text to int safely | Mengubah teks ke int dengan aman | `ValueError` |
| 2 | Divide without crashing | Membagi tanpa crash | `ZeroDivisionError` |
| 3 | Look up course credits | Mencari SKS mata kuliah | `KeyError` |
| 4 | Get a list item safely | Mengambil item list dengan aman | `IndexError` |
| 5 | Add up credits typed as text | Menjumlah SKS yang salah ketik jadi teks | `TypeError` |
| 6 | Divide two texts | Membagi dua teks | several `except` blocks |
| 7 | Validate a score | Validasi nilai | `raise ValueError` |
| 8 | Average of messy data | Rata-rata data yang berantakan | try/except inside a loop, counting |
| 9 | Validate a registration form (challenge) | Validasi formulir pendaftaran (tantangan) | `KeyError` + `ValueError`, list of messages |
| 10 | Split a fee with a log (challenge) | Membagi biaya dengan log (tantangan) | `try`/`except`/`else`/`finally` order |

## Key Takeaways / Poin Penting

- Read a traceback from the bottom: the last line names the error type and the reason.
  Baca traceback dari bawah: baris terakhir menyebutkan jenis error dan alasannya.
- Put only the risky line(s) in `try`, and catch a specific error like `except ValueError:`.
  Taruh hanya baris yang berisiko di `try`, dan tangkap error yang spesifik seperti `except ValueError:`.
- `else` runs only when there was no error; `finally` always runs.
  `else` hanya jalan kalau tidak ada error; `finally` selalu jalan.
- Use `raise ValueError("message")` when a value has the right type but makes no sense (e.g. a score of 150).
  Pakai `raise ValueError("pesan")` kalau nilainya bertipe benar tapi tidak masuk akal (misalnya nilai 150).
- Never hide errors with a bare `except: pass`; it also hides your own bugs.
  Jangan pernah menyembunyikan error dengan `except: pass`; bug-mu sendiri juga ikut tersembunyi.
