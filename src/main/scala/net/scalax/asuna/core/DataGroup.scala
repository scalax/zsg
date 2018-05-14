package net.scalax.asuna.core

case class DataGroup(
    items: List[Any],
    subs: List[DataGroup]
)
