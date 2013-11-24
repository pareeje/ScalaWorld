package collections

object GenericMergeSort {

  def msort[T]( xs : List[T])(lt : (T,T)=>Boolean) : List[T] = {
    val n = xs.length/2
    if( n == 0) xs // only 1 or 0 elements 
    else {
      def merge(xs:List[T],ys:List[T]) : List[T] = {
        (xs,ys) match {
          case (xs, Nil) => xs
          case (Nil, ys) => ys
          case(x::xs1,y::ys1) =>
            if(lt(x,y)) x :: merge(xs1,ys)
            else y :: merge(xs,ys1)
        }
      }
      val (fst,snd) = xs splitAt n
      merge(msort(fst)(lt),msort(snd)(lt))
    }
  }
}