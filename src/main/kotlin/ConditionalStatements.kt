fun main(args: Array<String>) {
    // IF STATEMENTS
    var age = 16
    if (age <18 ){
        println("You are underage sorry:(")
    }else{
        println("Welcome to the party bitch party at your own risk:)")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight/ (height * height)
    if (bmi <= 18){
        println("Gain something honey")
    }else if (bmi <= 29){
        println("umm.. your overweight")
    }else{
        println("your obese sweetheart ")
    }

    var marks = 70
    if (marks >90){
        println("Your grade is A")
    }else if (marks <90) {
        println("your grade is B ")
    }else{
        println("Invalid marks")
    }

    // WHEN STATEMENTS
    var bettingnumber = 2
    when(bettingnumber) {
        1 -> {
            println("Busted")
        }

        2 -> {
            println("Busted")
        }

        3 -> {
            println("Busted")
        }

        4 -> {
            println("Busted")
        }

        else -> {
            println("Please enter a number from 1 - 4 to bet")
        }
    }
}