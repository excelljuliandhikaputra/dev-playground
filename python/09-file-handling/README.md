# Topic 09 — File Handling / Topik 09 — Mengolah File

EN: Learning how to read and write text and CSV files so data stays saved after the program ends.
ID: Belajar membaca dan menulis file teks dan CSV supaya data tetap tersimpan setelah program selesai.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `file_handling_basics.py` | Lesson code: `pathlib` file location, `open()` with `with`, modes `r`/`w`/`a`, `read`/`readline`/`readlines`/`write`, processing lines, `csv.reader`, `csv.DictReader`, `csv.writer`, `FileNotFoundError` | Kode pembelajaran: lokasi file dengan `pathlib`, `open()` dengan `with`, mode `r`/`w`/`a`, `read`/`readline`/`readlines`/`write`, mengolah baris, `csv.reader`, `csv.DictReader`, `csv.writer`, `FileNotFoundError` |
| `file_handling_exercises_unsolved.py` | 10 exercises, **unsolved**, with a built-in checker | 10 soal latihan, **belum dikerjakan**, dilengkapi checker otomatis |
| `file_handling_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |
| `students.txt` | Sample data: 8 names, one per line | Data contoh: 8 nama, satu per baris |
| `new_students.txt` | Sample data: 5 names (some also in `students.txt`) | Data contoh: 5 nama (sebagian juga ada di `students.txt`) |
| `scores.csv` | Sample data: header `name,course,score` + 9 rows | Data contoh: header `name,course,score` + 9 baris |

## Where the Data Files Live / Lokasi File Data

EN: Keep `students.txt`, `new_students.txt` and `scores.csv` in the **same folder** as the `.py` files. Both scripts find them with this pattern, so they work no matter which folder your terminal is in:
ID: Simpan `students.txt`, `new_students.txt` dan `scores.csv` di **folder yang sama** dengan file `.py`. Kedua script mencarinya dengan pola ini, jadi tetap jalan dari folder mana pun terminal-mu dibuka:

```python
from pathlib import Path
HERE = Path(__file__).parent          # the folder this .py file is in
data_file = HERE / "students.txt"
```

> [!NOTE]
> EN: Files whose names start with `output_` (e.g. `output_demo.txt`, `output_report.txt`) are **temporary**. The scripts create or overwrite them on every run, and you can delete them any time. They are not part of the lesson; don't commit them. The `.gitignore` file in this folder already makes Git skip them.
>
> ID: File yang namanya diawali `output_` (misalnya `output_demo.txt`, `output_report.txt`) bersifat **sementara**. Script membuat atau menimpanya setiap kali dijalankan, dan boleh kamu hapus kapan saja. File itu bukan bagian dari materi; tidak perlu di-commit. File `.gitignore` di folder ini sudah membuat Git mengabaikannya.

## How to Run / Cara Menjalankan

```bash
python file_handling_basics.py
python file_handling_exercises_unsolved.py
```

EN: The checker at the bottom of the exercise file prints `[TODO]`, `[FAIL]`, `[PASS]` or `[RULE]` for each exercise and your score. It also makes its own test files (`output_check_*`) and deletes them when it finishes.
ID: Checker di bagian bawah file latihan mencetak `[TODO]`, `[FAIL]`, `[PASS]` atau `[RULE]` untuk setiap soal beserta skormu. Checker juga membuat file uji sendiri (`output_check_*`) dan menghapusnya setelah selesai.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Count the lines in a file | Menghitung baris dalam file | `with open()`, `readlines()` |
| 2 | Read names into a list | Membaca nama ke dalam list | loop over a file, `strip()` |
| 3 | Total and average score | Total dan rata-rata nilai | `csv.reader`, `next()` |
| 4 | Students below the passing score | Mahasiswa di bawah nilai lulus | CSV + condition, default parameter |
| 5 | Write a list, read it back | Menulis list lalu membacanya lagi | mode `"w"`, `write()`, `read()` |
| 6 | Add a line to a log | Menambah baris ke log | mode `"a"` |
| 7 | Average per course | Rata-rata per mata kuliah | `csv.DictReader`, dict totals/counts |
| 8 | Save the passed students | Menyimpan mahasiswa yang lulus | `csv.writer`, `newline=""` |
| 9 | Write a summary report (challenge) | Menulis laporan ringkasan (tantangan) | read CSV → write text file |
| 10 | Merge two name files (challenge) | Menggabung dua file nama (tantangan) | no duplicates, keep order |

## Key Takeaways / Poin Penting

- Build file paths with `HERE / "name.txt"` so the script works from any terminal folder.
  Buat path file dengan `HERE / "nama.txt"` supaya script jalan dari folder terminal mana pun.
- Always use `with open(...) as file:`; it closes the file for you.
  Selalu pakai `with open(...) as file:`; file-nya ditutup otomatis.
- `"w"` erases the file first, `"a"` adds to the end, `"r"` only reads.
  `"w"` menghapus isi file dulu, `"a"` menambah di akhir, `"r"` hanya membaca.
- Lines end with `"\n"`: `.strip()` when reading, add `"\n"` yourself when writing.
  Setiap baris diakhiri `"\n"`: pakai `.strip()` saat membaca, tambahkan `"\n"` sendiri saat menulis.
- CSV values are always text: convert with `int()` before calculating, and open CSV files with `newline=""`.
  Nilai CSV selalu berupa teks: ubah dengan `int()` sebelum dihitung, dan buka file CSV dengan `newline=""`.
