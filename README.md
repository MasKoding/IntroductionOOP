##  Java OOP (Object Oriented Programming)

#Introduction OOP
Pemrograman Berorientasi Object atau disingkat OOP merupakan paradigma pemrograman berdasarkan konsep objek yang berisi attribut atau field serta method atau function.

Dalam paradigma ini semua data dan method dibungkus dalam kelas kelas atau objek objek.

## Definisi
1. Class merupakan blueprint atau prototype dari objek yang akan kita buat. Di dalam class kiat mendeklarasikan properti dan method yang akan digunakan dalam objek kita
2. Object merupakan instance dari class yang memiliki state dan behavior

## Diagram Class
```plantuml
@startuml

    class User{
        - name : String
        - nik : String
        - jk : String
        - age : Integer
        - address : String

        + setName(name : String) : void
        + setNik(nik: String) : void
        + setJk(jk: String) : void
        + setAge(age : Integer) : void
        + setAddress(address: String) : void

        + getName() : String
        + getNik() : String
        + getJk() : String
        + getAge() : Integer
        + getAddress() : String
    }

    note left of User
             Class User
    end note

    object user1
    user1 : name="dummy"
    user1 : age = 26
    user1 : nik ="32012312121"
    user1 : jk ="laki-laki"
    user1 : address="Jakarta"
    
    object user2
        user2 : name="dummy"
        user2 : age = 26
        user2 : nik ="32012312121"
        user2 : jk ="laki-laki"
        user2 : address="Jakarta"

    User-->user1 : Object
    User-->user2 : Object
@enduml
```
