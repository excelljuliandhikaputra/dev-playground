# Topic 04 — Conditionals / Topik 04 — Percabangan (Kondisi)

EN: Learning how a Java program makes decisions with `if`, `else if`, `switch`, and the ternary operator.
ID: Belajar cara program Java mengambil keputusan dengan `if`, `else if`, `switch`, dan operator ternary.

## Files / File

| File | Description (EN) | Deskripsi (ID) |
|------|-------------------|----------------|
| `ConditionalsBasics.java` | Lesson code: `if`/`else`, comparison operators, `else if` chain, `&& \|\| !`, nested `if`, `.equals()` vs `==`, `equalsIgnoreCase`, classic and arrow `switch`, ternary `? :`, common mistakes | Kode pembelajaran: `if`/`else`, operator perbandingan, rantai `else if`, `&& \|\| !`, `if` bersarang, `.equals()` vs `==`, `equalsIgnoreCase`, `switch` klasik dan panah, ternary `? :`, kesalahan umum |
| `ConditionalsExercisesUnsolved.java` | 10 exercises, **unsolved** | 10 soal latihan, **belum dikerjakan** |
| `ConditionalsExercisesSolved.java` | My own solutions | Jawaban buatan saya sendiri |

## How to Run / Cara Menjalankan

```bash
java ConditionalsBasics.java
java ConditionalsExercisesUnsolved.java
```

EN: Compare your output with the "Expected output" in each exercise. Some exercises also list "More checks": change the given values to those and run again.
ID: Bandingkan hasilmu dengan "Expected output" di setiap soal. Beberapa soal juga punya "More checks": ganti nilai yang diberikan dengan nilai tersebut lalu jalankan lagi.

> [!IMPORTANT]
> EN: The class name must match the file name. When saving as `ConditionalsExercisesSolved.java`, rename the class too.
>
> ID: Nama class harus sama dengan nama file. Saat disimpan sebagai `ConditionalsExercisesSolved.java`, ganti juga nama class-nya.

## Exercises / Daftar Soal

| # | Task (EN) | Tugas (ID) | Concept / Konsep |
|---|-----------|------------|------------------|
| 1 | Pass or fail | Lulus atau tidak | `if` / `else`, `>=` |
| 2 | Even or odd | Genap atau ganjil | `%`, `==` |
| 3 | UNAIR letter grade | Huruf mutu UNAIR | `else if` chain |
| 4 | Highest of three without `Math.max` | Terbesar dari tiga tanpa `Math.max` | `if` / `else if`, `&&` |
| 5 | Login check | Cek login | `.equals()`, `equalsIgnoreCase()`, `&&` |
| 6 | Day number to day name | Nomor hari ke nama hari | `switch` |
| 7 | Festival ticket price | Harga tiket festival | `else if` chain, nested `if` |
| 8 | "1 credit" vs "3 credits" | "1 credit" vs "3 credits" | ternary `? :` |
| 9 | Leap year (challenge) | Tahun kabisat (tantangan) | `&&`, `\|\|`, `%`, `( )` |
| 10 | Scholarship eligibility (challenge) | Syarat beasiswa (tantangan) | `&&`, `\|\|`, `!`, `( )` |

## Python vs Java

| | Python | Java |
|---|---|---|
| if / else | `if score >= 65:` + indentation | `if (score >= 65) { ... }` |
| Else if | `elif` | `else if` |
| Logic | `and` / `or` / `not` | `&&` / `\|\|` / `!` |
| Range check | `65 <= score <= 100` | `score >= 65 && score <= 100` |
| Compare text | `name == "Excell"` | `name.equals("Excell")` (never `==`) |
| Ignore case | `a.lower() == b.lower()` | `a.equalsIgnoreCase(b)` |
| Many fixed cases | `match day:` / `case 1:` (3.10+) | `switch (day) { case 1 -> ... }` |
| One-line choice | `"PASSED" if ok else "FAILED"` | `ok ? "PASSED" : "FAILED"` |

## Key Takeaways / Poin Penting

- In an `else if` chain only the FIRST true block runs, so put the conditions in the right order.
  Di rantai `else if` hanya blok PERTAMA yang true yang dijalankan, jadi urutkan kondisinya dengan benar.
- Compare Strings with `.equals()` or `.equalsIgnoreCase()`, never with `==`.
  Bandingkan String dengan `.equals()` atau `.equalsIgnoreCase()`, jangan pernah dengan `==`.
- A classic `switch` needs `break` after each case; the arrow form (`->`) doesn't.
  `switch` klasik butuh `break` di setiap case; bentuk panah (`->`) tidak perlu.
- Use `( )` when mixing `&&` and `||` so the condition means what you intend.
  Pakai `( )` saat mencampur `&&` dan `||` supaya kondisinya sesuai maksudmu.
- Always use `{ }` and never put `;` right after `if (...)`.
  Selalu pakai `{ }` dan jangan pernah menaruh `;` tepat setelah `if (...)`.
