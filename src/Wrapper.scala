object Wrapper {
  
  def transform (text: String, column: Int) : String = 
  {
    if (text.length() <= column){
      return text
    }
    
    val wrapper = text.substring(0,column) + "\n"
    val remains = text.substring(column)
    
    return wrapper + transform(remains, column) 
    
    
  }
  
  
  def main (Args: Array[String]){
    println(transform("hola",2))
     println(transform("hola",3))
      println(transform("hosdasdasdla",6))
    
      
  }
}