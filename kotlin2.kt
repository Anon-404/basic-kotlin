fun main(){
    
    /* conditional / control statements */
    // if , else if , else expression 
    
    val num1 = 10
    val num2 = 309
    val num3 = 200
    
    if(num1 > num2 && num1 > num3){
        println("large number is num1 : $num1")
    } else if(num2 > num3){
        println("large number is num2 : $num2")
    }else{
        println("large number is num3 : $num3")
    }
    
    // when expression 
    
    println("\nWhen expression")
    
    val num = 5
    when(num){
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        6,7 -> println("six or seven")
        
        else -> println("Another number")
    }
    
    // for loop
    
    println("\nfor looo : 1-5")
    for(i in 1..5){
        println("for loop number : $i")
    }
    
    // while loop
    println("\nwhile looo : 1-5")
    var i = 1
    while(i <= 5){
        println("while loop number : $i")
        i++
    }
    /*note infinite loop ♾️ while(true) */
    
    // do while loop
    println("\ndo while looo : 1-5")
    i = 1
    do{
        println("do while loop number : $i")
        i++
    }while(i <= 5)
    /*note infinite loop ♾️ while(true) */
    
    // break & continue 
    
    	/* break keyword */
    println("\n for loop will beeak when i = 6")
    for(i in 1..10){
        if(i == 6){
            println("breaked while $i ")
            break
        }else{
        	println("this is $i")
        }
    }
    
       /* continue keyword */
    println("\n for loop will skip when i = 6")
    for(i in 1..10){
        if(i == 6){
            println("skipped : $i")
            continue 
        }else{
        	println("this is $i")
        }
    }
    
}
