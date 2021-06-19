package zsg.codegen

import org.apache.commons.io.FileUtils

object DeleteTemp {
  def main(i: Array[String]): Unit = {
    FileUtils.deleteDirectory(ZsgTestKitCodeGeneration.root2XDir.toFile)
  }
}
