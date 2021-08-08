package zsg
class TypeHList1[I1] extends TypeHList {
  override type Head = I1
  override type Tail <: TypeHList
}
class TypeHList2[I1, I2] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl1[I1]
  class TypeHListImpl1[I1] extends TypeHList {
    override type Head = I2
    override type Tail <: TypeHList
  }
}
class TypeHList3[I1, I2, I3] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl2[I1, I2]
  class TypeHListImpl2[I1, I2] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl1[I1]
    class TypeHListImpl1[I1] extends TypeHList {
      override type Head = I3
      override type Tail <: TypeHList
    }
  }
}
class TypeHList4[I1, I2, I3, I4] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl3[I1, I2, I3]
  class TypeHListImpl3[I1, I2, I3] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl2[I1, I2]
    class TypeHListImpl2[I1, I2] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl1[I1]
      class TypeHListImpl1[I1] extends TypeHList {
        override type Head = I4
        override type Tail <: TypeHList
      }
    }
  }
}
class TypeHList5[I1, I2, I3, I4, I5] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl4[I1, I2, I3, I4]
  class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl3[I1, I2, I3]
    class TypeHListImpl3[I1, I2, I3] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl2[I1, I2]
      class TypeHListImpl2[I1, I2] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl1[I1]
        class TypeHListImpl1[I1] extends TypeHList {
          override type Head = I5
          override type Tail <: TypeHList
        }
      }
    }
  }
}
class TypeHList6[I1, I2, I3, I4, I5, I6] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
  class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl4[I1, I2, I3, I4]
    class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl3[I1, I2, I3]
      class TypeHListImpl3[I1, I2, I3] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl2[I1, I2]
        class TypeHListImpl2[I1, I2] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl1[I1]
          class TypeHListImpl1[I1] extends TypeHList {
            override type Head = I6
            override type Tail <: TypeHList
          }
        }
      }
    }
  }
}
class TypeHList7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
  class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
    class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl4[I1, I2, I3, I4]
      class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl3[I1, I2, I3]
        class TypeHListImpl3[I1, I2, I3] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl2[I1, I2]
          class TypeHListImpl2[I1, I2] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl1[I1]
            class TypeHListImpl1[I1] extends TypeHList {
              override type Head = I7
              override type Tail <: TypeHList
            }
          }
        }
      }
    }
  }
}
class TypeHList8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
  class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
    class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
      class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl4[I1, I2, I3, I4]
        class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl3[I1, I2, I3]
          class TypeHListImpl3[I1, I2, I3] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl2[I1, I2]
            class TypeHListImpl2[I1, I2] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl1[I1]
              class TypeHListImpl1[I1] extends TypeHList {
                override type Head = I8
                override type Tail <: TypeHList
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
  class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
    class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
      class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
        class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl4[I1, I2, I3, I4]
          class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl3[I1, I2, I3]
            class TypeHListImpl3[I1, I2, I3] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl2[I1, I2]
              class TypeHListImpl2[I1, I2] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl1[I1]
                class TypeHListImpl1[I1] extends TypeHList {
                  override type Head = I9
                  override type Tail <: TypeHList
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
  class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
    class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
      class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
        class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
          class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl4[I1, I2, I3, I4]
            class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl3[I1, I2, I3]
              class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl2[I1, I2]
                class TypeHListImpl2[I1, I2] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl1[I1]
                  class TypeHListImpl1[I1] extends TypeHList {
                    override type Head = I10
                    override type Tail <: TypeHList
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
  class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
    class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
      class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
        class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
          class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
            class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl4[I1, I2, I3, I4]
              class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl3[I1, I2, I3]
                class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl2[I1, I2]
                  class TypeHListImpl2[I1, I2] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl1[I1]
                    class TypeHListImpl1[I1] extends TypeHList {
                      override type Head = I11
                      override type Tail <: TypeHList
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
  class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
    class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
      class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
        class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
          class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
            class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
              class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl3[I1, I2, I3]
                  class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl2[I1, I2]
                    class TypeHListImpl2[I1, I2] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl1[I1]
                      class TypeHListImpl1[I1] extends TypeHList {
                        override type Head = I12
                        override type Tail <: TypeHList
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
  class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
    class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
      class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
        class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
          class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
            class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
              class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                  class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl3[I1, I2, I3]
                    class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl2[I1, I2]
                      class TypeHListImpl2[I1, I2] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl1[I1]
                        class TypeHListImpl1[I1] extends TypeHList {
                          override type Head = I13
                          override type Tail <: TypeHList
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
  class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
    class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
      class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
        class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
          class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
            class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
              class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                  class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                    class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl3[I1, I2, I3]
                      class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl2[I1, I2]
                        class TypeHListImpl2[I1, I2] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl1[I1]
                          class TypeHListImpl1[I1] extends TypeHList {
                            override type Head = I14
                            override type Tail <: TypeHList
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
  class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
    class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
      class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
        class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
          class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
            class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
              class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                  class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                    class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                      class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl3[I1, I2, I3]
                        class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl2[I1, I2]
                          class TypeHListImpl2[I1, I2] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl1[I1]
                            class TypeHListImpl1[I1] extends TypeHList {
                              override type Head = I15
                              override type Tail <: TypeHList
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
  class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
    class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
      class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
        class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
          class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
            class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
              class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                  class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                    class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                      class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                        class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl3[I1, I2, I3]
                          class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl2[I1, I2]
                            class TypeHListImpl2[I1, I2] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl1[I1]
                              class TypeHListImpl1[I1] extends TypeHList {
                                override type Head = I16
                                override type Tail <: TypeHList
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
  class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
    class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
      class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
        class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
          class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
            class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
              class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                  class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                    class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                      class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                        class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                          class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl3[I1, I2, I3]
                            class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl2[I1, I2]
                              class TypeHListImpl2[I1, I2] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl1[I1]
                                class TypeHListImpl1[I1] extends TypeHList {
                                  override type Head = I17
                                  override type Tail <: TypeHList
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
  class TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
    class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
      class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
        class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
          class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
            class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
              class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
                class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                  class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                    class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                      class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                        class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                          class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                            class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl3[I1, I2, I3]
                              class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl2[I1, I2]
                                class TypeHListImpl2[I1, I2] extends TypeHList {
                                  override type Head = I17
                                  override type Tail = TypeHListImpl1[I1]
                                  class TypeHListImpl1[I1] extends TypeHList {
                                    override type Head = I18
                                    override type Tail <: TypeHList
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
  class TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
    class TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
      class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
        class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
          class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
            class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
              class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
                class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
                  class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                    class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                      class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                        class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                          class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                            class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                              class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl3[I1, I2, I3]
                                class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                                  override type Head = I17
                                  override type Tail = TypeHListImpl2[I1, I2]
                                  class TypeHListImpl2[I1, I2] extends TypeHList {
                                    override type Head = I18
                                    override type Tail = TypeHListImpl1[I1]
                                    class TypeHListImpl1[I1] extends TypeHList {
                                      override type Head = I19
                                      override type Tail <: TypeHList
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
  class TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
    class TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
      class TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
        class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
          class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
            class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
              class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
                class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
                  class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
                    class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                      class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                        class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                          class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                            class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                              class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                                class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                                  override type Head = I17
                                  override type Tail = TypeHListImpl3[I1, I2, I3]
                                  class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                                    override type Head = I18
                                    override type Tail = TypeHListImpl2[I1, I2]
                                    class TypeHListImpl2[I1, I2] extends TypeHList {
                                      override type Head = I19
                                      override type Tail = TypeHListImpl1[I1]
                                      class TypeHListImpl1[I1] extends TypeHList {
                                        override type Head = I20
                                        override type Tail <: TypeHList
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
  class TypeHListImpl20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
    class TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
      class TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
        class TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
          class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
            class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
              class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
                class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
                  class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
                    class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
                      class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                        class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                          class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                            class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                              class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                                class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                                  override type Head = I17
                                  override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                                  class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                                    override type Head = I18
                                    override type Tail = TypeHListImpl3[I1, I2, I3]
                                    class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                                      override type Head = I19
                                      override type Tail = TypeHListImpl2[I1, I2]
                                      class TypeHListImpl2[I1, I2] extends TypeHList {
                                        override type Head = I20
                                        override type Tail = TypeHListImpl1[I1]
                                        class TypeHListImpl1[I1] extends TypeHList {
                                          override type Head = I21
                                          override type Tail <: TypeHList
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
class TypeHList22[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21, I22] extends TypeHList {
  override type Head = I1
  override type Tail = TypeHListImpl21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21]
  class TypeHListImpl21[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20, I21] extends TypeHList {
    override type Head = I2
    override type Tail = TypeHListImpl20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20]
    class TypeHListImpl20[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19, I20] extends TypeHList {
      override type Head = I3
      override type Tail = TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19]
      class TypeHListImpl19[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18, I19] extends TypeHList {
        override type Head = I4
        override type Tail = TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18]
        class TypeHListImpl18[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17, I18] extends TypeHList {
          override type Head = I5
          override type Tail = TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17]
          class TypeHListImpl17[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16, I17] extends TypeHList {
            override type Head = I6
            override type Tail = TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16]
            class TypeHListImpl16[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15, I16] extends TypeHList {
              override type Head = I7
              override type Tail = TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15]
              class TypeHListImpl15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15] extends TypeHList {
                override type Head = I8
                override type Tail = TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14]
                class TypeHListImpl14[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14] extends TypeHList {
                  override type Head = I9
                  override type Tail = TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13]
                  class TypeHListImpl13[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13] extends TypeHList {
                    override type Head = I10
                    override type Tail = TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12]
                    class TypeHListImpl12[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12] extends TypeHList {
                      override type Head = I11
                      override type Tail = TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11]
                      class TypeHListImpl11[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11] extends TypeHList {
                        override type Head = I12
                        override type Tail = TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10]
                        class TypeHListImpl10[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10] extends TypeHList {
                          override type Head = I13
                          override type Tail = TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9]
                          class TypeHListImpl9[I1, I2, I3, I4, I5, I6, I7, I8, I9] extends TypeHList {
                            override type Head = I14
                            override type Tail = TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8]
                            class TypeHListImpl8[I1, I2, I3, I4, I5, I6, I7, I8] extends TypeHList {
                              override type Head = I15
                              override type Tail = TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7]
                              class TypeHListImpl7[I1, I2, I3, I4, I5, I6, I7] extends TypeHList {
                                override type Head = I16
                                override type Tail = TypeHListImpl6[I1, I2, I3, I4, I5, I6]
                                class TypeHListImpl6[I1, I2, I3, I4, I5, I6] extends TypeHList {
                                  override type Head = I17
                                  override type Tail = TypeHListImpl5[I1, I2, I3, I4, I5]
                                  class TypeHListImpl5[I1, I2, I3, I4, I5] extends TypeHList {
                                    override type Head = I18
                                    override type Tail = TypeHListImpl4[I1, I2, I3, I4]
                                    class TypeHListImpl4[I1, I2, I3, I4] extends TypeHList {
                                      override type Head = I19
                                      override type Tail = TypeHListImpl3[I1, I2, I3]
                                      class TypeHListImpl3[I1, I2, I3] extends TypeHList {
                                        override type Head = I20
                                        override type Tail = TypeHListImpl2[I1, I2]
                                        class TypeHListImpl2[I1, I2] extends TypeHList {
                                          override type Head = I21
                                          override type Tail = TypeHListImpl1[I1]
                                          class TypeHListImpl1[I1] extends TypeHList {
                                            override type Head = I22
                                            override type Tail <: TypeHList
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
