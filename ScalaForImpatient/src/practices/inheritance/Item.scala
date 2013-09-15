package practices.inheritance

class Item(var name : String, var price:Double) {
	final override def equals(other:Any) = {
	  val that = other.asInstanceOf[Item]
	  if(that==null) false
	  else name == that.name && price == that.price
	}
}

object Item extends App{
  val item = new Item("Chair",100.00)
  val item2 = new Item("Table",200.00)
  println(item == item2)
  val item3 = item
  println(item == item3)
}