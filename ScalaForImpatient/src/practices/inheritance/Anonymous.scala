package practices.inheritance

class Anonymous{
  val anonymous = new Person("Paromita") {
    def sayHello = { println("Hello, I am a anonymous class!") }
    def sayBye = {println("Now Bye!")}
    override def display = { println("Display from anonymous class") }
  }
  anonymous.display
  def useHello(p : Person{def sayHello}){
    p.sayHello    
  }
}

object AnonymousComp extends App{
  val v =  new Anonymous
  v.useHello(v.anonymous)
}