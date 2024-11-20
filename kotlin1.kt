import java.util.Scanner

fun main(args: Array<String>) {
    
    // variables 
    
    val title:String = "basic kotlin file"
    var author:String = "William "
    var lngNm = "kotlin"
    
    // Printing & user input
    
    println("title : $title")
    println("author : $author")
    println("language name: $lngNm\n_______________________\n")
    
	print("Enter your name : ")
    var Name:String? = readLine()
    println("entered name is $Name")
    println(Name!!::class.simpleName)
    
    // input using scanner
    /*
    print("\nEnter Facebook id name: ")
    val scanner = Scanner(System.`in`)
    var Fb = scanner.nextLine()
    println("Facebook id : $Fb")
    println(Fb!!::class.simpleName)
    */
    // type custing 
    
    print("\nEnter your roll : ")
    var Roll = readLine()!!.toInt()
    println("entered roll $Roll")
    println(Roll!!::class.simpleName)
    
    // string 
    
    println("\n ____string part____\n")
    var str = "hello"
    for(i in 0..4){
        print(str[i])
    }
    /*
    print(str[0])
    print(str[1])
    print(str[2])
    print(str[3])
    print(str[4])
    */
   println("\nteing concat")
   val st1 ="hello "
   val st2 = "kotlin"
   println("example 1 : " + st1 + st2)
   println("example 2 : " + "hello " + "kotlin")
   
   val rawstr = """this is 👇
   				raw string"""
   println("\n"+rawstr)
                 
   
}
