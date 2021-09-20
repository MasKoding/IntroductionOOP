##  Java OOP (Object Oriented Programming)

#Introduction OOP
Pemrograman Berorientasi Object atau disingkat OOP merupakan paradigma pemrograman berdasarkan konsep objek yang berisi attribut atau field serta method atau function.

Dalam paradigma ini semua data dan method dibungkus dalam kelas kelas atau objek objek.

## Definisi
1. Class merupakan blueprint atau prototype dari objek yang akan kita buat. Di dalam class kiat mendeklarasikan properti dan method yang akan digunakan dalam objek kita
2. Object merupakan instance dari class yang memiliki state dan behavior

## Diagram Class

<img alt="alt_text" height="500" src="https://github.com/MasKoding/IntroductionOOP/blob/main/design-oop.png" width="500"/>


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
  