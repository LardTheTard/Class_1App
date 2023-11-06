fun main(args: Array<String>) {
    
    // typeTest()
    typeConvertionTest()
    
}

fun typeTest()
{
	var a: Byte = 2
	var b: Short = 2
	var c = 2
	var d = 2L         //
	var e = 2f        // or 2F
	var f = 2.0
    c =3
	
	println(" a => $a \n b => $b \n c => $c \n d => $d \n e => $e \n f => $f")
	
	var g = 0x0F            //hex
	var h = 0b00001011      //binary
	var k = 123             //decimal
	
	println(" g => $g \n h => $h \n k => $k");   
	
	var isNum: Boolean
	isNum = false
    isNum = true
	println("isNum => $isNum")
	
	var char1: Char
	char1 = 'a'
	
	val str = "kotlin"
	println("str => $str")
}

fun typeConvertionTest()
{
	var numA = 100000
	println(numA.toByte())
	println(numA.toShort())
	println(numA.toInt())
	println(numA.toLong())
	println(numA.toFloat())
	println(numA.toDouble())
	println(numA.toChar())
	println(numA.toString())
}

fun logicalOperatorTest()
{
	var a: Boolean = false
	var b: Boolean = true
	var result: Boolean

	if (a || b){
		result = a || b
		println("a || b => $result")
	}

	if (a && b){
		result = a && b
		println("a && b => $result")
	}
	result = !a
	println("!a => $result")

	result = !b
	println("!b => $result")
}

fun arrayTest()
{
	var arr1 = arrayOf(1,2,3,4,5) 
	for (v in arr1){
		print(v)
		print("\t")
	}	
	var arr3 = arrayOfNulls<Int>(3)
	//arr3[0]、arr3[1]、arr3[2]are null
	for(v in arr3){
		print(v)
		print("\t")
	}
	println()
	//assign arr3 values
	arr3[0] = 10
	arr3[1] = 20
	arr3[2] = 30

	for(v in arr3){
		print(v)
		print("\t")
	}
	println()
    
	var arr4 = Array(5,{index -> (index * 2).toString() })
	for (v in arr4){
		print(v)
		print("\t")	
	}
	println()

	var intArr: IntArray = intArrayOf(1,2,3,4,5)
	for (number in intArr){
		print(number)
		print("\t")
	}
	
	//ByteArray
	//ShortArray
	//IntArray 
	//LongArray
	//BooleanArray
	//CharArray
	//FloatArray
	//DoubleArray
}