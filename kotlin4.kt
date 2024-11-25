fun main(){
    
    // null safety 
    println("null safety 🛟🦺")
    var variable1:Int? = 10
    var variable2:String? = "hello kitlin"
    
    println("before null variable 1 : $variable1")
    println("before null variable 2 : $variable2")
    
    variable1 = null
    variable2 = null
    
    println("\nafter null variable 1 : $variable1")
    println("after null variable 2 : $variable2")
    
    // array 
    println("\narray part 〽️ ")
    var arr = arrayOf("jawad","william","steven",100,'A')
    
    for(i in 0..4){
    	println("array $i no index value is : ${arr[i]}")
    }
    
    // list
    println("\nlist part")
    
    var lst = listOf("William","Steven","Max","Johnson",50,'A')
    println("items of lst variable are : $lst")
    for(i2 in 0..5){
    	println("list $i2 no index value is : ${lst[i2]}")
    }
    
    // set
    println("\nset part")

	var st = setOf("William", "Steven", "Max", "Johnson", 50, 'A')
	println("Items of st variable are : $st")

	// Convert Set to List for indexed access
	val listFromSet = st.toList()
	for (i3 in listFromSet.indices) {
    	println("list $i3 no index value is : ${listFromSet[i3]}")
	}
    
    // map 🗺️ 
    println("\nmap part🗺️")

	var mp = mapOf(1 to "map1","map2" to 2)
    println("Items of mp variable are : $mp")
    
    println("0 index value of map 🗺️ : "+mp[1])
    println("2 index value of map 🗺️ : "+mp["map2"])
    
}
