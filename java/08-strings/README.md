# Topic 08 — Strings / Topik 08 — String

EN: Learning how to search, cut, clean, compare, split, build and format text in Java.
ID: Belajar mencari, memotong, merapikan, membandingkan, memecah, menyusun dan memformat teks di Java.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `StringsBasics.java` | Lesson code: immutability, `indexOf`/`contains`/`startsWith`/`endsWith`, `substring`, `trim`/`replace`/`isEmpty`/`isBlank`, `equals`/`compareTo`, `split`/`String.join`, `toCharArray` + `Character.isDigit`, `StringBuilder`, `String.format` alignment | Kode pembelajaran: immutability, `indexOf`/`contains`/`startsWith`/`endsWith`, `substring`, `trim`/`replace`/`isEmpty`/`isBlank`, `equals`/`compareTo`, `split`/`String.join`, `toCharArray` + `Character.isDigit`, `StringBuilder`, perataan `String.format` |
| `StringsExercisesUnsolved.java` | 10 method exercises, **unsolved**, with an automatic checker | 10 soal method, **belum dikerjakan**, dengan checker otomatis |
| `StringsExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java StringsBasics.java
java StringsExercisesUnsolved.java
```

EN: The checker at the bottom prints `[TODO]`, `[FAIL]` or `[PASS]` for every exercise, plus your score. String results are shown in quotes so you can spot extra spaces.
ID: Checker di bagian bawah mencetak `[TODO]`, `[FAIL]` atau `[PASS]` untuk setiap soal, beserta skormu. Hasil String ditampilkan dalam tanda kutip supaya spasi berlebih kelihatan.

> [!IMPORTANT]
> EN: In Java, the **class name must match the file name**. If you save your answers as `StringsExercisesSolved.java`, rename the class inside to `StringsExercisesSolved` too.
>
> ID: Di Java, **nama class harus sama dengan nama file**. Kalau jawabanmu disimpan sebagai `StringsExercisesSolved.java`, ganti juga nama class di dalamnya menjadi `StringsExercisesSolved`.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Count words (extra spaces) | Hitung kata (spasi berlebih) | `trim`, `split`, `isEmpty` |
| 2 | Initials of a name | Inisial nama | `split`, `substring`, `StringBuilder` |
| 3 | Palindrome check | Cek palindrom | `replace`, `toLowerCase`, `reverse` |
| 4 | Censor a word | Sensor sebuah kata | `replace`, building `***` |
| 5 | Domain of an email | Domain dari email | `indexOf`, `substring`, `-1` |
| 6 | Valid student ID (NIM) | NIM yang valid | `length`, `toCharArray`, `Character.isDigit` |
| 7 | Title Case | Huruf Awal Kapital | `split`, `substring`, `String.join` |
| 8 | Sort two names | Urutkan dua nama | `compareTo`, ignore case |
| 9 | Compress `aaabbc` → `a3b2c1` (challenge) | Kompres `aaabbc` → `a3b2c1` (tantangan) | `charAt`, counter, `StringBuilder` |
| 10 | Receipt line (challenge) | Baris struk belanja (tantangan) | `String.format` widths, `substring` |

## Python vs Java

| | Python | Java |
|---|---|---|
| Slice | `s[2:5]`, `s[2:]` | `s.substring(2, 5)`, `s.substring(2)` |
| Find | `s.find("@")` → `-1` | `s.indexOf("@")` → `-1` |
| Contains | `"x" in s` | `s.contains("x")` |
| Strip spaces | `s.strip()` | `s.trim()` |
| Split on spaces | `s.split()` (skips extra spaces) | `s.trim().split(" ")` (extra spaces → empty pieces) |
| Join | `", ".join(items)` | `String.join(", ", items)` |
| Reverse | `s[::-1]` | `new StringBuilder(s).reverse().toString()` |
| Alphabetical order | `a < b` | `a.compareTo(b) < 0` |
| Is it a digit? | `c.isdigit()` | `Character.isDigit(c)` |
| Align text | `f"{name:<12}{qty:>3}"` | `String.format("%-12s%3d", name, qty)` |

## Key Takeaways / Poin Penting

- Strings never change: methods return a NEW String, so store the result.
  String tidak pernah berubah: method mengembalikan String BARU, jadi simpan hasilnya.
- `substring(start, end)` stops BEFORE `end`; `indexOf` gives `-1` when nothing is found.
  `substring(start, end)` berhenti SEBELUM `end`; `indexOf` memberi `-1` kalau tidak ketemu.
- `split(" ")` makes empty pieces for extra spaces: `trim()` first and skip the empty ones.
  `split(" ")` membuat potongan kosong untuk spasi berlebih: `trim()` dulu dan lewati yang kosong.
- Compare text with `equals`/`compareTo`, never `==` or `<`. Lowercase both sides to ignore case.
  Bandingkan teks dengan `equals`/`compareTo`, jangan `==` atau `<`. Jadikan huruf kecil dulu untuk mengabaikan besar/kecil.
- Build text in a loop with `StringBuilder`, and line it up with `String.format` widths.
  Susun teks di dalam loop dengan `StringBuilder`, dan rapikan dengan lebar di `String.format`.
