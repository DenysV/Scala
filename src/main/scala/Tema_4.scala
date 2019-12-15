object Tema_4 {
  class Texto(){
    var text: String = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no " +
      "ha mucho tiempo que vivía un hidalgo de los de lanza en astillero " +
      "adarga antigua, rocín flaco y galgo corredor. Una olla de " +
      "algo más vaca que carnero, salpicón las más noches, duelos y " +
      "quebrantos los sábados, lentejas los viernes, algún palomino de " +
      "añadidura los domingos, consumían las tres partes de su " +
      "hacienda. el resto della concluían sayo de velarte, calzas de velludo " +
      "para las fiestas, con sus pantuflos de lo mesmo, y los días de " +
      "entresemana se honraba con su vellorí de lo más fino."

    def textWords() = text.split(' ') //split text by space in array of words
    def textWordsCapital() = textWords().map(_.capitalize) //rewrite every words of array to capital letter
    def textWordsToList() = textWordsCapital().toList // convert array of words to list
  }

  class Number(longitude: Int){
    def listNumber() = List.range(1, longitude)
  }

  def main(args: Array[String]): Unit = {
    var text: Texto = new Texto()
    var words: List[String] = text.textWordsToList()
    var num: Number = new Number(words.length)
    var numbers: List[Int] = num.listNumber()

    def filter50(dict: Map[String, Int]) = println("\n Words with frequency great than 50:", dict.filter(_._2 > 50)) //find words that have frequency more  than 50
    def filterEven(dict: Map[String, Int]) = println("\n Words with even index:", dict.filter(_._2 % 2 == 0))//find words with even index
    def filterShortWords(dict: Map[String, Int]) = println("\n Words with length smaller than 3:", dict.filter(_._1.length < 3))//find words with length small than 3
    def filterWordsWithE(dict: Map[String, Int]) = println("\n Words than have letter E:", dict.filter(_._1.contains('e')))//find words that have letter 'e'

    val map = (words zip numbers).toMap
    println(map)
    filter50(map)
    filterEven(map)
    filterShortWords(map)
    filterWordsWithE(map)
  }
}
