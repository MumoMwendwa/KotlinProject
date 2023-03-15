fun main(args: Array<String>) {
    var marks = 69
    var grade = if (marks < 50 ){
        "E"
    }else if (marks < 60){
        "D"
    }else if (marks <70) {
        "C"
    }else if (marks <80){
        "B"
    }else{
        "A"
    }
    println(grade)

    var bettingNumber = 3
    var bettingResult = when(bettingNumber){
        1 ->{
            "Busted"
        }
        2 ->{
            "You won"
        }
        3 ->{
            "Cash out"
        }
        else ->{
            "Enter a number from 1-3 to bet"
        }
    }
    println(bettingResult)
}
