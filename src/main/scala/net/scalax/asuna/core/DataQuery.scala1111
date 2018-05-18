package net.scalax.asuna.core

import scala.language.higherKinds

trait DataPureable[Query[_, _], L] {

  def pure[E, U, C](rep: E)(implicit shape: DataShape[E, U, C, L]): Query[C, U]

}

trait DataMapable[Query[_, _], L] {

  def map[A, B, D, E, F](query: Query[A, B], f: A => D)(implicit shape: DataShape[D, E, F, L]): Query[F, E]

}

trait DataFlatmapable[Query[_, _], L] {

  def flatMap[A, B, D, E](query: Query[A, B], f: A => Query[D, E]): Query[D, E]

}

trait QueryHelper {

  implicit class mapableExt[A, B, L, Query[_, _]](query: Query[A, B])(implicit private val mapable: DataMapable[Query, L]) {
    def map[C, D, E](f: A => C)(implicit shape: DataShape[C, D, E, L]): Query[E, D] = {
      mapable.map(query, f)(shape)
    }
  }

  implicit class flatableExt[A, B, L, Query[_, _]](query: Query[A, B])(implicit private val mapable: DataFlatmapable[Query, L]) {
    def flatMap[C, D](f: A => Query[C, D]): Query[C, D] = {
      mapable.flatMap(query, f)
    }
  }

}