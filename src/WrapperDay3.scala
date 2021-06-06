

object WrapperDay3 {
  
  def transform (word : String, columns : Int): String = {
    
    if (word.length() <= columns)
    {
      return word
    }
    
    val wrap = word.substring(0, columns) + "\n"
    val remains = word.substring(columns)
  
    return wrap + transform(remains, columns)
    
    
    
  }
  
  
  
  
  def main (Args : Array[String]){
    println("indique la palabra")
    var word = scala.io.StdIn.readLine()
    
    println("indique las separaciones")
    var separations = scala.io.StdIn.readInt()
    
    
    println(transform(word, separations))
    
    
  }
}