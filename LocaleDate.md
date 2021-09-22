#  Java Date and Time using LocaleDate
Hi guys, kali ini gue mau sharing cara kita menggunakan operasi Date and Time di Java nih guys

Java sendiri tidak memiliki bawaan kelas Date  tapi kita bisa melakukan import kepada package java.time untuk mengakses banyak kelas date dan time yang tersedia.

Sebagai contoh kita bisa menggunakan :

<table>
    <tr>
        <th>Class</th>
        <th>Description</th>
    </tr>
    <tr>
    <td>LocalDate</td>
    <td>Menampilkan Date/tanggal (tahun,bulan,hari) format (yyyy-MM-dd)</td>
    </tr>
    <tr>
        <td>LocalTime</td>
        <td>Menampilkan Time/waktu (jam,menit,detik dan nanodetik) format (HH-mm-ss-ns)</td>
    </tr>
 <tr>
        <td>LocalDateTime</td>
        <td>Menampilkan Date/tanggal dan Time/waktu (tahun,bulan,hari,jam,menit,detik dan nanodetik) format (yyyy-MM-dd-HH-mm-ss-ns)</td>
    </tr>
    <tr>
        <td>DateTimeFormatter</td>
        <td>Mengubah format dari objek date dan time dan menampilkannya sesuai yang di inginkan</td>
    </tr>
</table>


# Implementasi 
Kita akan mengimplementasikan beberapa class diatas sehingga kita dapat memahaminya dengan mudah.

Seperti biasa kalian bisa siapkan satu project java dan buat file LearnLocalDate.java lalu ketikkan kode berikut:

- LocalDate
```java
package org.dimas.learn;

import java.time.LocalDate;

public class LearnLocaleDate {
    public static void main(String[] args) {
//         show current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("date :"+currentDate);
    }
}

```
- Keterangan:
    - Buat objek dari kelas LocalDate dengan nama currentDate 
    - Untuk menampilkan tanggal hari ini atau yang ingin kita panggil sekarang maka kita bisa memanggil LocalDate.now()
    
Output nya seperti berikut :
```
"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=1040:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\project-java\introduce-java\out\production\introduce-java" org.dimas.learn.LearnLocaleDate
date :2021-09-22

Process finished with exit code 0
```
- LocalTime
```java
package org.dimas.learn;

import java.time.LocalDate;
import java.time.LocalTime;

public class LearnLocaleDate {
    public static void main(String[] args) {
//         show current date
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("date :"+currentDate);
        System.out.println("time :"+currentTime);



    }
}
```
- Keterangan:
    - Buat objek dari kelas LocalTime dengan nama currentTime
    - Untuk menampilkan waktu hari ini atau yang ingin kita panggil sekarang maka kita bisa memanggil LocalTime.now()

Output nya seperti berikut :
```
"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=1259:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\project-java\introduce-java\out\production\introduce-java" org.dimas.learn.LearnLocaleDate
date :2021-09-22
time :13:25:06.123

Process finished with exit code 0
```
- LocalDateTime
```java
package org.dimas.learn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LearnLocaleDate {
    public static void main(String[] args) {
//         show current date
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("date :"+currentDate);
        System.out.println("time :"+currentTime);
        System.out.println("datetime : "+currentDateTime);



    }
}

```
- Keterangan:
  - Buat objek dari kelas LocalDateTime dengan nama currentDateTime
  - Untuk menampilkan tanggal dan waktu hari ini atau yang ingin kita panggil sekarang maka kita bisa memanggil LocalDateTime.now()


Output nya seperti berikut :
```
"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=24817:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\project-java\introduce-java\out\production\introduce-java" org.dimas.learn.LearnLocaleDate
date :2021-09-22
time :13:28:47.299
datetime : 2021-09-22T13:28:47.299

Process finished with exit code 0

```
- DateTimeFormatter
```java
package org.dimas.learn;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearnLocaleDate {
    public static void main(String[] args) {
//         show current date
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        String s_currentDateTime = formatter.format(currentDateTime);

        System.out.println("date :"+currentDate);
        System.out.println("time :"+currentTime);
        System.out.println("datetime : "+currentDateTime);
        System.out.println("format current date time : "+s_currentDateTime);



    }
}

```
- Keterangan:
  - Buat objek dari kelas DateTimeFormatter dengan nama formatter
  - isi objek formatter dengan pattern yang kamu inginkan untuk contoh diatas yaitu yyyy-MM-dd HH:mm
  - Buat variable dengan tipe data string untuk menyimpan hasil format dari kelas LocalDateTime ke String dengan nama s_currentDateTime


Output nya seperti berikut :
```
"C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=1256:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\project-java\introduce-java\out\production\introduce-java" org.dimas.learn.LearnLocaleDate
date :2021-09-22
time :13:34:55.404
datetime : 2021-09-22T13:34:55.404
format current date time : 2021-09-22 13:34

Process finished with exit code 0

```
Untuk method pattern() sendiri dapat disesuaikan dengan yangs esuai dengan format tanggal dan waktu di java misal :

<table>
    <tr>
        <th>Value</th>
        <th>Example</th>
    </tr>
    <tr>
    <td>yyyy-MM-dd HH:mm</td>
    <td>1990-01-01 07:45</tr>
    <tr>
        <td>dd-MM-yyyy</td>
        <td>01-01-1990</td>
    </tr>
 <tr>
        <td>E, dd MM yyyy</td>
        <td>Wed, 01 01 1990</td>
    </tr>
<tr>
        <td>dd/MM/yyyy</td>
        <td>01/01/1990</td>
    </tr>
</table>

Oke sekian aja dari gue semoga kalian bisa mudah memahaminya.
thanks guys 
see you next time


