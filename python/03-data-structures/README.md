# Topic 03 — Data Structures / Topik 03 — Struktur Data

EN: Learning how to store many values at once with list, tuple, dictionary, and set.
ID: Belajar menyimpan banyak nilai sekaligus dengan list, tuple, dictionary, dan set.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `data_structures_basics.py` | Lesson code: list, tuple, dictionary, nested data, set | Kode pembelajaran: list, tuple, dictionary, data bersarang, set |
| `data_structures_exercises_unsolved.py` | 9 exercises, **unsolved** | 9 soal latihan, **belum dikerjakan** |
| `data_structures_exercises_solved.py` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
python data_structures_basics.py
python data_structures_exercises_unsolved.py
```

EN: Compare your output with the "Expected output" written in each exercise.
ID: Bandingkan hasilmu dengan "Expected output" yang tertulis di setiap soal.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Read a course list | Membaca daftar mata kuliah | index, slicing, `len()` |
| 2 | Edit a shopping list | Mengubah daftar belanja | `append`, `insert`, `remove` |
| 3 | Score statistics | Statistik nilai | `max`, `min`, `sum`, `sorted` |
| 4 | Is the subject offered? | Apakah mata kuliahnya ada? | `in` |
| 5 | Unpack a student tuple | Unpack tuple mahasiswa | tuple unpacking |
| 6 | Update a profile | Memperbarui profil | dict add / update |
| 7 | Safe contact lookup | Mencari kontak dengan aman | `.get()` with default |
| 8 | Semester credits (challenge) | Total SKS semester (tantangan) | list of dicts |
| 9 | Unique attendance (challenge) | Daftar hadir unik (tantangan) | `set`, `sorted`, `join` |

## Key Takeaways / Poin Penting

- Indexes start at `0`; `-1` is the last item; slicing `[a:b]` stops BEFORE `b`.
  Indeks dimulai dari `0`; `-1` adalah item terakhir; slicing `[a:b]` berhenti SEBELUM `b`.
- List = changeable, tuple = fixed, dict = look up by key, set = unique values only.
  List = bisa diubah, tuple = tetap, dict = dicari lewat key, set = hanya nilai unik.
- Use `.get(key, default)` when a key might not exist, so the program doesn't crash.
  Pakai `.get(key, default)` kalau key-nya mungkin tidak ada, supaya program tidak error.
- `.sort()` changes the original list; `sorted()` makes a new one.
  `.sort()` mengubah list aslinya; `sorted()` membuat list baru.
