// function without parameters 

fun function1(){
    println("\nthis is function 1")
    println("fuck you Mather fucker 🖕🖕")
}

// function without parameters 

fun function2(n1:Int ,n2:Int){
    
    println("\nthis is function 2")
    print("addition : ${n1+n2}")
    
}

// function with default argument

fun function3(str:String = "No argument passed here😴"){
    
    println("\n\nthis is function 3")
    println(str)
}

// function with named argument

fun function4(){
    
}

//main function 

fun main(){
    
    // calling function1
    function1()
    
    // calling function2
    function2(10,20)
    
    // calling function3 without argument
    function3()
    
    // calling function3 with argument
    function3("fuck you tanju😐")
    
    // Lambda expression
    var lambdafunc = {a:Int,b:Int -> a + b}
    println("\nthis is lambda function")
    println(lambdafunc(10,40))
    
    // anonymous function 
    val add = fun(a:Int,b:Int):Int{
        
        println("\nthis is anonymous function")
        return a + b
    }
    
    println(add(10,90))
    
}
