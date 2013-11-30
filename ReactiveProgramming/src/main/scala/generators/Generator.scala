package generators

trait Generator[+T] {

  self => //alias for this
  def generate: T

  def map[S](f: T => S): Generator[S] = new Generator[S] {
    def generate = { println("Map generate"); f(self.generate) }
  }

  def flatMap[S](f: T => Generator[S]): Generator[S] = new Generator[S] {
    def generate : S = f(self.generate).generate
  }
}

