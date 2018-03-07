fun main(args: Array<String>) {
    val sample1 = 0x3A
    var sample2 = 58
    var heartRate = 85
    var deposit = 135002796.0
    var acceleration = 9.800F
    var mass = 14.6F
    var distance = 129.763001
    val lost = true
    val exspencive = true
    var choice = 2
    val integral: Char = '∫'
    val greeting = "Hello"
    var name = "Karen"

    if(sample1 == sample2){
        println("The samples are equal")
    }else{
        println("The samples are not equal")
    }

    if(heartRate >= 80){
        println("Heart Rate is normal")
    }else{
        println("Heart Rate is not normal")
    }

    if(deposit >= 100000000){
        println("You are wealthy")
    }else{
        println("Sorry you are poor")
    }

    var force = mass * acceleration;

    println("Force= $force")

    println("$distance is the distance")

    if(lost == true && exspencive == true){
        println("I am really sorry! I will get the manager")
    }else if(lost == true && exspencive == false){
        println("Here is coupon for 10% off")
    }

    when (choice) {
        1 -> println("you chose 1")
        2 -> println("you chose 2")
        3 -> println("you chose 3")
        else -> {
            print("you chose unknown option")
        }
    }
    println("$integral is an integral")

    for (i in 5..10) println("i = $i")

    var age = 0

    while(age < 6){
        println("age = $age")
        age++
    }

    println("$greeting $name")


}