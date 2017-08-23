package com.example.hoaht.demoanko

/**
 * Person.
 *
 * @author HoaHT
 */
                data class Person(var name: String)



                class Person1(var age: Int){
                    fun abc() {
                        var person = Person("Hoa")
                        person.equals("")
                        person.copy()
                        person.component1()
                        person.hashCode()
                    }
                }