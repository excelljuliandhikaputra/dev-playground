# Topic 06 — Arrays & ArrayList / Topik 06 — Array & ArrayList

EN: Learning how to store many values in one variable with fixed-size arrays and growable ArrayLists.
ID: Belajar menyimpan banyak nilai dalam satu variabel dengan array (ukuran tetap) dan ArrayList (bisa bertambah).

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `ArraysBasics.java` | Lesson code: creating arrays, index and `.length`, `for` and for-each, sum/max/count/search patterns, `Arrays.toString`, `Arrays.sort`, copying, 2D arrays, `ArrayList`, wrapper types | Kode pembelajaran: membuat array, indeks dan `.length`, `for` dan for-each, pola total/maksimum/menghitung/mencari, `Arrays.toString`, `Arrays.sort`, menyalin array, array 2D, `ArrayList`, tipe wrapper |
| `ArraysExercisesUnsolved.java` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `ArraysExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java ArraysBasics.java
java ArraysExercisesUnsolved.java
```

EN: Compare your output with the "Expected output" in each exercise. Then change the given data and run again to make sure nothing is hardcoded.
ID: Bandingkan hasilmu dengan "Expected output" di setiap soal. Lalu ganti data yang diberikan dan jalankan lagi untuk memastikan tidak ada yang di-hardcode.

> [!IMPORTANT]
> EN: In Java, the **class name must match the file name**. If you save your answers as `ArraysExercisesSolved.java`, rename the class inside to `ArraysExercisesSolved` too.
>
> ID: Di Java, **nama class harus sama dengan nama file**. Kalau jawabanmu disimpan sebagai `ArraysExercisesSolved.java`, ganti juga nama class di dalamnya menjadi `ArraysExercisesSolved`.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Total and average of exam scores | Total dan rata-rata nilai ujian | accumulator, `.length`, `printf` |
| 2 | Highest and lowest quiz score | Nilai kuis tertinggi dan terendah | loop + `if` (no `Arrays.sort`) |
| 3 | Count passing scores | Hitung nilai yang lulus | counter, `final` |
| 4 | Sort prices | Urutkan harga | `Arrays.sort`, `Arrays.toString`, last index |
| 5 | Search courses | Cari mata kuliah | nested loop, `.equals()`, `-1` = not found |
| 6 | Reverse into a new array | Balik urutan ke array baru | `new String[n]`, index `length - 1 - i` |
| 7 | Shopping list | Daftar belanja | `ArrayList` `add`/`remove`/`set`/`size`/`contains` |
| 8 | Student score table | Tabel nilai mahasiswa | 2D array, nested loop, `printf` |
| 9 | Remove duplicates (challenge) | Hapus nama dobel (tantangan) | `ArrayList` + `contains` |
| 10 | Grade frequency (challenge) | Frekuensi grade (tantangan) | `char[]`, counter array, max |

## Python vs Java

| | Python | Java |
|---|---|---|
| Fixed-size list | (no direct equivalent) | `int[] scores = {78, 92};` |
| Growable list | `items = []` | `ArrayList<String> items = new ArrayList<>();` |
| Mixed types | `[1, "a", True]` is OK | one type only / hanya satu tipe |
| Size | `len(items)` | `scores.length` (array) / `items.size()` (ArrayList) |
| Read an item | `items[0]` | `scores[0]` (array) / `items.get(0)` (ArrayList) |
| Last item | `items[-1]` | `scores[scores.length - 1]` |
| Add | `items.append("x")` | `items.add("x")` |
| Is it inside? | `"x" in items` | `items.contains("x")` (array: use a loop / pakai loop) |
| Print | `print(items)` | `Arrays.toString(scores)` / `System.out.println(items)` |
| Sort | `items.sort()` | `Arrays.sort(scores)` |
| Loop | `for x in items:` | `for (int x : scores)` |
| List of numbers | `[1, 2, 3]` | `ArrayList<Integer>` (not `<int>`) |

## Key Takeaways / Poin Penting

- Array indexes go from `0` to `length - 1`; going past that crashes the program.
  Indeks array dari `0` sampai `length - 1`; lewat dari itu programnya crash.
- Arrays use `.length` and `[i]`; ArrayLists use `.size()` and `.get(i)`.
  Array memakai `.length` dan `[i]`; ArrayList memakai `.size()` dan `.get(i)`.
- Print arrays with `Arrays.toString(...)`, and compare Strings with `.equals()`, not `==`.
  Cetak array dengan `Arrays.toString(...)`, dan bandingkan String dengan `.equals()`, bukan `==`.
- `=` doesn't copy an array: both names point to the same array. Make a new array to copy.
  `=` tidak menyalin array: kedua nama menunjuk ke array yang sama. Buat array baru untuk menyalin.
- `ArrayList` needs wrapper types: `Integer`, `Double`, not `int`, `double`.
  `ArrayList` butuh tipe wrapper: `Integer`, `Double`, bukan `int`, `double`.
