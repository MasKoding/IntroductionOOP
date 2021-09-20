##  Java OOP (Object Oriented Programming)

## Introduction OOP
Pemrograman Berorientasi Object atau disingkat OOP merupakan paradigma pemrograman berdasarkan konsep objek yang berisi attribut atau field serta method atau function.

Dalam paradigma ini semua data dan method dibungkus dalam kelas kelas atau objek objek.

## Definisi
1. Class merupakan blueprint atau prototype dari objek yang akan kita buat. Di dalam class kiat mendeklarasikan properti dan method yang akan digunakan dalam objek kita
2. Object merupakan instance dari class yang memiliki state dan behavior

## Diagram Class

<img alt="alt_text" height="500" src="https://github.com/MasKoding/IntroductionOOP/blob/main/design-oop.png" width="500"/>

## Struktur Project
<pre>
ProjectName
└───org
    └───dimas
        └───learn
                Main.java
                User.java

</pre>

## Implementasi 
1. Buat class User  dengan nama file User.java dan ketikkan kode seperti dibawah ini:
```java
package org.dimas.learn;

public class User {

    private String name;
    private Integer age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


```
- Keterangan :
  - Buat nama class dalam hal ini yaitu User
  - Buat properti atau attribut di dalam class dengan access modifier private artinya properti atau attribut ini hanya boleh di akses oleh kelas user.
  - (Name, Age dan Address) merupakan properti atau attribut
  - Buat method getter dan setter dengan access modifier public
  - Setter adalah fungsi untuk memberi nilai properti atau atribut yang telah di definisikan
  - Getter adalah fungsi untuk mengembalikan nilai kedalam properti atau attribut yang telah kita isi
2. Buat class Main dengan nama file Main.java dan ketikkan kode seeprti berikut :
  ```java
    package org.dimas.learn;

public class Main {

    public static void main(String[] args) {
        // write your code here
//         user1  instance of user
        User user1 = new User();
        user1.setName("John Doe");
        user1.setAge(30);
        user1.setAddress("UK");

//         user2 instance of user
        User user2 = new User();
        user2.setName("James Gosling");
        user2.setAge(40);
        user2.setAddress("USA");


        System.out.println("\t Object USER1");
        System.out.println("Name :"+user1.getName());
        System.out.println("Age : "+user1.getAge());
        System.out.println("Address : "+user1.getAddress());


        System.out.println("\t Object USER2");
        System.out.println("Name :"+user2.getName());
        System.out.println("Age : "+user2.getAge());
        System.out.println("Address : "+user2.getAddress());

    }
}

```
- Keterangan :
    - Class Main memiliki Main method yang digunakan untuk menjalankan aplikasi kita
    - Didalam main method kita bisa panggil class User dan membuat instance nya
    - user1 dan user2 merupakan object dari class user sehingga kita bisa mengakses method yang berada di dalam class user
  
## Running Program
 Jalankan program dengan cara klik tombol start atau `CTRL+ F5` dan output program adalah sebagai berikut:
 
```
  "C:\Program Files\Java\jdk1.8.0_261\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\lib\idea_rt.jar=15086:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.2.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_261\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_261\jre\lib\rt.jar;D:\project-java\introduce-java\out\production\introduce-java" org.dimas.learn.Main
	 Object USER1
Name :John Doe
Age : 30
Address : UK
	 Object USER2
Name :James Gosling
Age : 40
Address : USA

Process finished with exit code 0
```