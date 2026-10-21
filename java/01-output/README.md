# Topic 01 — Output / Topik 01 — Output

EN: Writing my first Java program and printing text to the screen.
ID: Menulis program Java pertama dan menampilkan teks ke layar.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `OutputBasics.java` | Lesson code: program structure, `println` vs `print`, joining text with `+`, escape characters, comments, common mistakes | Kode pembelajaran: struktur program, `println` vs `print`, menggabung teks dengan `+`, karakter escape, komentar, kesalahan umum |
| `OutputExercisesUnsolved.java` | 8 exercises, **unsolved** | 8 soal latihan, **belum dikerjakan** |
| `OutputExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java OutputBasics.java
java OutputExercisesUnsolved.java
```

EN: Requires JDK 11 or newer. Compare your output with the "Expected output" in each exercise.
ID: Butuh JDK 11 ke atas. Bandingkan hasilmu dengan "Expected output" di setiap soal.

> [!IMPORTANT]
> EN: In Java, the **class name must match the file name**. If you save your answers as `OutputExercisesSolved.java`, rename the class inside to `OutputExercisesSolved` too.
>
> ID: Di Java, **nama class harus sama dengan nama file**. Kalau jawabanmu disimpan sebagai `OutputExercisesSolved.java`, ganti juga nama class di dalamnya menjadi `OutputExercisesSolved`.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Print a greeting | Cetak sapaan | `println` |
| 2 | A, B, C separated by ` \| ` | A, B, C dipisah ` \| ` | `+` |
| 3 | Two statements, one line | Dua perintah, satu baris | `print` vs `println` |
| 4 | Two lines in one println | Dua baris dalam satu println | `\n` |
| 5 | Small ID card | Kartu identitas kecil | `\t` |
| 6 | Text with double quotes | Teks berisi kutip ganda | `\"` |
| 7 | Windows folder path | Alamat folder Windows | `\\` |
| 8 | Draw a box (challenge) | Gambar kotak (tantangan) | combining |

## Python vs Java

| | Python | Java |
|---|---|---|
| Print + new line | `print("Hi")` | `System.out.println("Hi");` |
| Print, same line | `print("Hi", end="")` | `System.out.print("Hi");` |
| Join values | `print("A", "B", sep=" \| ")` | `"A" + " \| " + "B"` |
| End of statement | new line | `;` (semicolon / titik koma) |
| Strings | `"Hi"` or `'Hi'` | `"Hi"` only / hanya kutip ganda |

## Key Takeaways / Poin Penting

- Every statement ends with `;`, and Java is case-sensitive (`System`, `println`).
  Setiap perintah diakhiri `;`, dan Java membedakan huruf besar/kecil (`System`, `println`).
- `println` moves to a new line after printing; `print` doesn't.
  `println` pindah baris setelah mencetak; `print` tidak.
- Use `\"` for quotes and `\\` for backslashes inside text.
  Pakai `\"` untuk tanda kutip dan `\\` untuk backslash di dalam teks.
