package s1



import cats._

trait Functor[F[_]] {
  def map[A, B](fa: F[A])(f: A => B): F[B]
}

