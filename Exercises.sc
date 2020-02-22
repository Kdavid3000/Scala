object Exercises {
  
  //Fibonacci
   var a : Int = 0                                //> a  : Int = 0
	 var b : Int = 1                          //> b  : Int = 1
	 var f : Int = 0                          //> f  : Int = 0
	 for (x <- 0 to 10) {
	 println(f)
	 f=b
   b += a
   a=f
  }                                               //> 0
                                                  //| 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34
                                                  //| 55
 //Max functions
def Max( x: Int, y : Int) : Int ={ if(x>=y) return x else return y}
                                                  //> Max: (x: Int, y: Int)Int
import io.StdIn._
Max(4,7)                                          //> res0: Int = 7
def callMax(): Int ={
val  input1 : Int = readInt
val  input2 : Int = readInt
return Max(input1,input2)
}                                                 //> callMax: ()Int

//Question 1
//a)
def Fact(n:Int): Int ={
var y : Int =n
 for (x <- n-1 to 1 by -1) {
y*=x
 }
 
 return y

}                                                 //> Fact: (n: Int)Int
//b)
def CalFac(n:Int) {
for(x<-1 to n){
println(Fact(x+2))
}
}                                                 //> CalFac: (n: Int)Unit
Fact(4)                                           //> res1: Int = 24
CalFac(10)                                        //> 6
                                                  //| 24
                                                  //| 120
                                                  //| 720
                                                  //| 5040
                                                  //| 40320
                                                  //| 362880
                                                  //| 3628800
                                                  //| 39916800
                                                  //| 479001600
                                                  val mylist: List[String] = List("Alice", "John", "Dina", "Valentin")
                                                  //> mylist  : List[String] = List(Alice, John, Dina, Valentin)
println(mylist.head)                              //> Alice
println(mylist.tail)                              //> List(John, Dina, Valentin)
for (name <- mylist) {println(name)}              //> Alice
                                                  //| John
                                                  //| Dina
                                                  //| Valentin
//question 2
//a)
def FactList(n: List[Int]):Int= {
var num:Int=1
    for(i<-n){num*=i}
    return num
}                                                 //> FactList: (n: List[Int])Int
val numlist:List[Int]=List(1,2,3,4,5)             //> numlist  : List[Int] = List(1, 2, 3, 4, 5)

FactList(numlist)                                 //> res2: Int = 120
//b)
def nFactList(n: List[Int]):Int= {

val red = n.reduce((x, y) => x * y)
return red
}                                                 //> nFactList: (n: List[Int])Int
nFactList(numlist)                                //> res3: Int = 120
import scala.collection.mutable.ListBuffer

//c)
def newFact(n:Int): Int={
var numl = new ListBuffer[Int]()
for(x<- 1 to n){
numl+=x
}
val finalist=numl.toList
return nFactList(finalist)
}                                                 //> newFact: (n: Int)Int
newFact(5)                                        //> res4: Int = 120
val x = List.range(1, 46)                         //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
                                                  //| , 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 3
                                                  //| 5, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45)
//question 3
//a)
val byfour = x.filter(_ % 4 == 0).sum             //> byfour  : Int = 264
//b)
val z =x.filter(_%3==0).filter(_<20).map(x=>x*x).sum
                                                  //> z  : Int = 819
  }
  