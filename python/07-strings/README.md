# Topic 07 — Strings / Topik 07 — String

EN: Learning how to clean, split, search, check, and format text with Python's string methods.
ID: Belajar merapikan, memotong, mencari, mengecek, dan memformat teks dengan method string di Python.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `strings_basics.py` | Lesson code: immutability, `strip`, `title`, `capitalize`, `split`, `join`, `find`, `startswith` / `endswith`, `count`, `replace`, `isdigit` / `isalpha`, looping over characters, f-string alignment, multi-line strings | Kode pembelajaran: immutability, `strip`, `title`, `capitalize`, `split`, `join`, `find`, `startswith` / `endswith`, `count`, `replace`, `isdigit` / `isalpha`, perulangan per karakter, perataan f-string, string multi-baris |
| `strings_exercises_unsolved.py` | 10 exercises with an automatic checker, **unsolved** | 10 soal latihan dengan checker otomatis, **belum dikerjakan** |
| `strings_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python strings_basics.py
python strings_exercises_unsolved.py
```

EN: The checker at the bottom of the exercise file tests every function with several different inputs and prints `[TODO]`, `[FAIL]`, or `[PASS]` for each exercise, plus your score.
ID: Checker di bagian bawah file latihan menguji setiap fungsi dengan beberapa input berbeda lalu menampilkan `[TODO]`, `[FAIL]`, atau `[PASS]` untuk setiap soal, beserta skormu.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Count the words in a sentence | Menghitung kata dalam kalimat | `split()`, `len()` |
| 2 | Clean a messy name | Merapikan nama yang berantakan | `strip()`, `title()` |
| 3 | Count a letter (any case) | Menghitung huruf (besar/kecil sama) | `lower()`, `count()` |
| 4 | Censor a word | Menyensor kata | `replace()`, `"*" * n` |
| 5 | Initials from a full name | Inisial dari nama lengkap | `split()`, loop, building a string |
| 6 | Domain of an email | Domain dari email | `find()`, slicing, the `-1` case |
| 7 | Validate a student ID (NIM) | Validasi NIM | `isdigit()`, `len()`, default parameter |
| 8 | Palindrome check | Cek palindrom | `lower()`, `replace()`, `[::-1]` |
| 9 | Receipt line (challenge) | Baris struk belanja (tantangan) | f-string alignment `:<` `:>`, slicing |
| 10 | Capitalize every word by hand (challenge) | Kapitalisasi setiap kata secara manual (tantangan) | looping over characters, `upper()` / `lower()` |

## Key Takeaways / Poin Penting

- Strings are immutable: methods return a NEW string, so save the result (`name = name.strip()`).
  String bersifat immutable: method mengembalikan string BARU, jadi simpan hasilnya (`name = name.strip()`).
- `split()` with no argument handles extra spaces; `split(" ")` leaves empty strings behind.
  `split()` tanpa argumen bisa menangani spasi berlebih; `split(" ")` menyisakan string kosong.
- `find()` returns `-1` when nothing is found, while `index()` crashes. Always handle the `-1` case.
  `find()` mengembalikan `-1` kalau tidak ketemu, sedangkan `index()` error. Selalu tangani kasus `-1`.
- Check text with `isdigit()` before converting it with `int()`.
  Cek teks dengan `isdigit()` sebelum mengubahnya dengan `int()`.
- In f-strings, `:<`, `:>`, `:^` set alignment and width. The width is a minimum, so slice long text yourself.
  Di f-string, `:<`, `:>`, `:^` mengatur perataan dan lebar. Lebarnya minimum, jadi potong sendiri teks yang terlalu panjang.
