package com.example.a101assignment2

fun main() {

    //challenge 1

    // Part 1
    val country = "United States"
    var currentCourse = "Mdi 2"

    println("Country: $country")
    println("Current Course: $currentCourse")

    // Part 2
    val birthYear = 2002
    var favoriteFood = "Steak"

    println("Birth Year: $birthYear")
    println("Favorite Food: $favoriteFood")

    favoriteFood = "Pecan Pie Pancakes"
    println("Updated Favorite Food: $favoriteFood")


    //Challenge 2

    val name = "Justin"
    val age = 23
    val isStudent = true
    val height = 6.6
    val favoriteApps = listOf("TikTok", "Instagram", "PrizePicks")

    println("Name: $name")
    println("Age: $age")
    println("Student: $isStudent")
    println("Height: $height ft")
    println("Favorite Apps: $favoriteApps")


    //challenge 3

    val hobby = "Content Creation"
    val goalIncome = 5000
    val city = "North Richland Hills"
    val businessName = "HaulFlex"

    println("My name is $name and I live in $city.")
    println("I enjoy $hobby and want to earn $$goalIncome/month.")
    println("My business is called $businessName.")


    //Challenge 4

    // Positive or negative check
    val testNumber = -5

    if (testNumber >= 0) {
        println("$testNumber is positive")
    } else {
        println("$testNumber is negative")
    }

    // Print 1 to 10
    println("Numbers from 1 to 10:")
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // Loop through subjects
    val subjects = listOf("Math", "Science", "Kotlin", "History")

    println("Subjects:")
    for (subject in subjects) {
        println(subject)
    }


    //challenge 5

    val gpa = 3.2

    // Pass / Fail
    if (gpa >= 2.0) {
        println("Pass")
    } else {
        println("Fail")
    }

    // GPA classification
    when {
        gpa >= 3.5 && gpa <= 4.0 -> println("Grade: A")
        gpa >= 3.0 && gpa < 3.5 -> println("Grade: B")
        gpa >= 2.5 && gpa < 3.0 -> println("Grade: C")
        gpa >= 2.0 && gpa < 2.5 -> println("Grade: D")
        else -> println("Grade: F")
    }
}