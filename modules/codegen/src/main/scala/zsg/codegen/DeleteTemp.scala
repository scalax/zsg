package zsg.codegen

import org.apache.commons.io.FileUtils

object DeleteTemp {
  def main(i: Array[String]): Unit = {
    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.root2XDir.toFile)
    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.rootAllDir.toFile)
    FileUtils.deleteDirectory(ZsgCoreCodeGeneration.rootDottyDir.toFile)

    FileUtils.deleteDirectory(ZsgTestKitCodeGeneration.root2XDir.toFile)

    FileUtils.deleteDirectory(ZsgRepCodeGeneration.root2XDir.toFile)
    FileUtils.deleteDirectory(ZsgRepCodeGeneration.rootAllDir.toFile)
    FileUtils.deleteDirectory(ZsgRepCodeGeneration.rootDottyDir.toFile)
  }
}
