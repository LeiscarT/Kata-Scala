

object WrapperDay2 {
  
  def wrap (word:String, column :Int) : String = {
    if (word.length() <= column)
    {
      return word    
    }
    
      val newWord = word.substring(0,column) + "\n"
      val remains = word.substring(column)
    
    
    return newWord + wrap(remains, column)
    
    
  }
  
  
  
  def main (Args : Array[String]){
    println(wrap("holamundo", 5))
    println(wrap("holuo", 2))
    
    
  }
}